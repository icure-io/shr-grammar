package org.mitre.shr.antlr;

import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
* A simple wrapper around the ANTLR4 parser that will print parse errors to the console.
*/
public class ParseTool {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Must provide exactly one path to a folder or file");
        }

        parsePath(Paths.get(args[0]));
    }

    private static void parsePath(Path path) {
        if (path.toFile().isDirectory()) {
            parseDirectory(path);
        } else {
            parseFile(path);
        }
    }

    private static void parseDirectory(Path path) {
        try {
            Files.walk(path).sorted().forEach(ParseTool::parseFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseFile(Path path) {
        if (path.toFile().isDirectory()) {
            return;
        }

        System.out.printf("\nParsing %s\n", path.toString());
        if (!path.toString().endsWith(".txt")) {
            System.out.println("SKIPPED: Only .txt files supported.");
            return;
        }

        try {
            InputStream is = Files.newInputStream(path, StandardOpenOption.READ);
            ANTLRInputStream input = new ANTLRInputStream(is);
            Lexer lexer = getLexer(path.toString(), input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            Parser parser = getParser(path.toString(), tokens);
            parser.setBuildParseTree(true);
            ParserRuleContext tree;
            if (parser instanceof SHRDataElementParser) {
                tree = ((SHRDataElementParser) parser).doc();
            } else if (parser instanceof SHRValueSetParser) {
                tree = ((SHRValueSetParser) parser).doc();
            } else if (parser instanceof SHRMapParser) {
                tree = ((SHRMapParser) parser).doc();
            } else if (parser instanceof SHRContentProfileParser) {
                tree = ((SHRContentProfileParser) parser).doc();
            } else {
                throw new RuntimeException("Unrecognized Parser");
            }
            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Lexer getLexer(String path, ANTLRInputStream input) {
        if (path.endsWith("-vs.txt")) {
            return new SHRValueSetLexer(input);
        } else if (path.matches(".+-map(-(.+))?\\.txt")) {
            return new SHRMapLexer(input);
        } else if (path.endsWith("-cp.txt")) {
            return new SHRContentProfileLexer(input);
        }
        return new SHRDataElementLexer(input);
    }

    public static Parser getParser(String path, CommonTokenStream tokens) {
        if (path.endsWith("-vs.txt")) {
            return new SHRValueSetParser(tokens);
        } else if (path.matches(".+-map(-(.+))?\\.txt")) {
            return new SHRMapParser(tokens);
        } else if (path.endsWith("-cp.txt")) {
            return new SHRContentProfileParser(tokens);
        }
        return new SHRDataElementParser(tokens);
    }
}
