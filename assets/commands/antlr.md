# TAGLINE

Generate parsers from grammar files

# TLDR

**Generate parser** from a grammar file (default: Java)

```antlr4 [Grammar.g4]```

**Generate parser** for a specific language

```antlr4 -Dlanguage=[Python3] [Grammar.g4]```

**Generate parser with visitor** classes

```antlr4 -visitor [Grammar.g4]```

**Specify output directory** for generated files

```antlr4 -o [output/dir] [Grammar.g4]```

**Generate parser** with a specific package name

```antlr4 -package [com.example.parser] [Grammar.g4]```

**Generate both listener and visitor**

```antlr4 -listener -visitor [Grammar.g4]```

**Generate parser** with imported grammar search path

```antlr4 -lib [path/to/imports] [Grammar.g4]```

# SYNOPSIS

**antlr4** [_options_] _grammar-file_...

# PARAMETERS

**-o** _directory_
> Output directory for generated files (default: current directory)

**-lib** _directory_
> Location to search for imported grammars and token files

**-Dlanguage=**_lang_
> Target language: Java, Python3, CSharp, JavaScript, Go, Cpp, Swift

**-package** _name_
> Package or namespace for generated code

**-listener**
> Generate parse tree listener classes (default)

**-no-listener**
> Do not generate parse tree listener

**-visitor**
> Generate parse tree visitor classes

**-no-visitor**
> Do not generate parse tree visitor (default)

**-encoding** _name_
> Grammar file encoding (default: UTF-8)

**-atn**
> Generate DOT graph files for ATN visualization

**-depend**
> Generate file dependency information

**-message-format** _format_
> Output message format: antlr, gnu, vs2005

**-long-messages**
> Show detailed exception information for errors

**-Werror**
> Treat warnings as errors

**-Xlog**
> Create detailed log file (antlr-timestamp.log)

# DESCRIPTION

**ANTLR** (ANother Tool for Language Recognition) is a parser generator that creates lexers, parsers, and tree walkers from grammar files. It generates code that can read, process, and translate structured text or binary data.

ANTLR grammars use an extended BNF notation with semantic actions. The tool processes **.g4** grammar files and generates source code for the target language. Generated parsers build parse trees that can be traversed using listener or visitor patterns.

The grammar defines both lexical rules (tokens) and parser rules. ANTLR handles left-recursive rules automatically and supports features like semantic predicates, actions, and grammar imports. The generated parser uses an adaptive LL(*) parsing algorithm called ALL(*).

Common workflow: write a grammar file, run antlr4 to generate code, compile the generated code with your application, and use the parser to process input text.

# CAVEATS

Requires Java Runtime Environment to execute. The **antlr4** command is typically an alias or wrapper script; the actual tool runs as a Java JAR file. Generated code requires the ANTLR runtime library for the target language. Large or ambiguous grammars may result in slow parsers.

# HISTORY

ANTLR was created by **Terence Parr** at the University of San Francisco starting in **1989**. ANTLR4, released in **2013**, introduced the ALL(*) parsing algorithm that handles more grammar constructs than previous LL(k) versions. The tool is widely used for building languages, data formats, and domain-specific languages in both academic and commercial settings.

# SEE ALSO

[bison](/man/bison)(1), [flex](/man/flex)(1), [yacc](/man/yacc)(1), [lex](/man/lex)(1)
