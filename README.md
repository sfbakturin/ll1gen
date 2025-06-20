# $LL(1)$ generator

Simple parser generator with $LL(1)$ grammar. Example of a grammar description file:

```grammar
grammar HelloWorld;

start is helloworld;

HELLO : 'hello';
WORLD : 'world';
SEMICOLON : ';';

helloworld : HELLO WORLD SEMICOLON;
```

Top-down parsing. Supports synthesized and inherited attributes.

## How-to-build

***Required***: JDK 17.0.9 (minimum required version), Maven 3.6.3 (minimum required version), ANTLR4 4.13.2 (tested with 4.13.2, download jar locally)

Create some required directories for ANTLR4 generation:

```bash
mkdir -pv src/main/java/sfbakturin/ll1gen/antlr/
```

Assuming that the file `antlr-4.13.2-complete.jar` is downloaded and is located in the root, generate a lexer and parser to parse the grammar description file:

```bash
java -jar antlr-4.13.2-complete.jar \
  src/main/resources/Grammar.g4 \
  -o src/main/java/sfbakturin/ll1gen/antlr/ \
  -package sfbakturin.ll1gen.antlr \
  -visitor \
  -no-listener \
  -Xexact-output-dir
```

Build and run tests:

```bash
mvn test
```
