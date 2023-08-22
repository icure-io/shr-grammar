# The Standard Health Record (SHR)

The Standard Health Record Initiative is working to create a single, high-quality health record for every individual in the United States.  For more information, see [standardhealthrecord.org](http://standardhealthrecord.org/).


This GitHub repository provides a custom [ANTLR4](http://www.antlr.org/) grammar for the SHR SIMPL format used to represent namespaces, elements, valuesets, and mappings.  The custom grammar continues to evolve and is subject to change.

# Project Structure

    ├── build            # contains build artifacts (temporary)
    ├── gradle           # contains files needed by the gradle wrapper build system
    └── src
        ├── generated    # contains ANTLR-generated Java parser/lexer code
        ├── main
        │   ├── antlr    # contains ANTLR .g4 files defining the SHR spec grammar
        │   └── java     # contains simple utility for parsing an SHR spec definition
        └── test

# Building the Project

Building this project will compile the SHR lexer and parser grammars into Java lexer\parser libraries and a simple application that can create the parse tree for a given SHR definition file.

This project uses the [Gradle](http://www.gradle.org/) build system.  A gradle wrapper, which automatically downloads and uses an instance of gradle, is provided for convenience.  To build the project, install the [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (a.k.a. JDK 1.8), clone this repository, then execute this command from within this directory:

    ./gradlew build

To clean up the build artifacts:

    ./gradlew clean

# Generating the Javascript Parser Files

By default, this project generates Java classes for parsing SHR text files.  This project can also generate Javascript classes and functions for parsing SHR text.  To create the Javascript parsers, execute the following command from within this directory:

    ./gradlew generateAntlrJSGrammarSource

This will generate the javascript into the _build/javascript/parsers_ folder.  To generate it into a different location use the `shr.js.parsers.dir` project property, as demonstrated below:

    ./gradlew -Pshr.js.parsers.dir=../shr-text-import/lib/parsers generateAntlrJSGrammarSource


# Parsing SHR Text Files

The `ParseTool` application is a simple tool that parses an SHR file or a folder of SHR files.  The `ParseTool` will print out all syntactical errors where files don't conform to the ANLTR SHR specification.  This is useful during the development of SHR text files to ensure they are syntactically valid.  It does _not_, however, ensure correctness of references between elements, valid valuesets or codes, etc.

To execute the parse tree on an arbitrary SHR folder or definition file, you must first use gradle to generate a script:

    ./gradlew installDist

Then execute the generated script, passing in a path to an SHR folder or definition file:

    ./build/install/shr-grammar/bin/shr-grammar ../shr_spec/spec
