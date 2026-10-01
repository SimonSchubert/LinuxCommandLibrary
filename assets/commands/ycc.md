# TAGLINE

LALR(1) parser generator with an integrated lexer and AST walker

# TLDR

**Generate** a parser header and source from a grammar file

```ycc -f [grammar.y]```

Generate an **amalgamated** parser (single `.cpp` with `main()`)

```ycc -c ascii -f [hello.y] -a```

Read the grammar from a **string** instead of a file

```ycc -s '[start := ID; ID := "[A-Za-z]+";]' -n [out]```

Write generated files into a **directory** with a custom basename

```ycc -f [grammar.y] -d [build/] -n [parser]```

Print **Yantra's version**

```ycc -v```

Write the processing **log** to the console instead of a `.log` file

```ycc -f [grammar.y] -l -```

Dump parsed grammar and state tables to a **markdown** file

```ycc -f [grammar.y] -g [grammar.md]```

Enable extra **generator logging**

```ycc -f [grammar.y] -j [+generator]```

# SYNOPSIS

**ycc** [**-c** _utf8_|_ascii_] [**-f** _file_ | **-s** _string_] [**-d** _dir_] [**-n** _name_] [**-a**] [**-m**] [**-r**] [**-l** _logname_] [**-j** _logsrc_] [**-g** _gfilename_] [**-v**]

# DESCRIPTION

**ycc** is the command-line compiler for **Yantra**, an LALR(1) parser generator written in C++. It reads a grammar (typically a `.y` file), builds an integrated lexer and parser, and emits C++ sources. With **-a**, it writes a single amalgamated `.cpp` file that includes a `main()` so the result can be compiled into a standalone program. Without **-a**, it writes separate `.hpp` and `.cpp` files meant to be dropped into an existing project.

Unlike yacc, bison, and Lemon, Yantra does not run semantic actions as each rule reduces. The generated parser first builds a full AST, then walks it top-down and runs the grammar's actions during that walk. A parent rule can therefore act before its children are visited, and a grammar can define more than one walker (for example one that emits C++ and another that emits Java from the same parse).

Terminals are uppercase; non-terminals start with a lowercase letter. Lexer tokens are regular expressions in the grammar itself (there is no separate lexer generator). A trailing `!` on a token, as in `WS := "\s"!`, discards that token. Semantic actions live in `%{ ... %}` blocks. The grammar syntax is inspired by SQLite's Lemon parser generator.

Every invocation also writes a `.log` file of processing tables unless **-l** redirects it. **-g** optionally writes a markdown dump of the parsed grammar and state tables. Generated parsers require a C++23 compiler.

# PARAMETERS

**-c** _utf8_|_ascii_
> Character set of the grammar. **utf8** enables Unicode (default). **ascii** disables it.

**-f** _filename_
> Read the grammar from _filename_. Only one of **-f** or **-s** is allowed.

**-s** _string_
> Read the grammar from _string_ on the command line. Output basename defaults to **out** unless **-n** is given.

**-d** _dir_
> Output directory (default: `./`).

**-n** _oname_
> Output basename. Writes _oname_`.cpp` and, without **-a**, _oname_`.hpp`. Defaults to the grammar file's stem.

**-a**
> Generate an amalgamated file that includes `main()`, which can be compiled into an executable.

**-m**
> Print console progress messages (parse, process, generate).

**-v**, **--version**
> Print the Yantra version and exit.

**-r**
> Do not emit `#line` directives in generated code.

**-l** _logname_
> Write the processing log to _logname_. Use **-** for the console. Default: _oname_`.log` in the output directory.

**-j** _logsrc_
> Enable a log source. Accepted values: **+lexer**, **+parser**, **+generator**, **+walker**.

**-g** _gfilename_
> Write a markdown dump of the parsed grammar and state tables to _gfilename_.

# GENERATED PARSER

An amalgamated parser built with **-a** accepts its own flags at run time. **-s** _string_ feeds input from the command line, **-f** _file_ reads a file, **-i** reads interactively from the console, and **-t1** prints the parsed AST. Compile the generated `.cpp` with a C++23 compiler, for example `g++ --std=c++23 -o hello hello.cpp`.

# CAVEATS

Yantra is pre-1.0. It generates C++ only. There is no incremental reparse and no error recovery: a lexer or syntax error stops parsing at that point. `%namespace` accepts a single identifier, not a `::` path. **-f** and **-s** cannot be combined. The tool is a native C++ executable with no runtime dependencies beyond the C++ standard library, but building it and compiling generated parsers needs CMake and a C++23 compiler.

# HISTORY

**Yantra** (Sanskrit for *machine*, as in state machine) is written by **Renji Panicker** and first appeared on GitHub in **2025**. It is licensed under the MIT License. Lemon, from SQLite, is the stated inspiration for the grammar syntax.

# SEE ALSO

[bison](/man/bison)(1), [yacc](/man/yacc)(1), [lex](/man/lex)(1), [flex](/man/flex)(1), [antlr](/man/antlr)(1), [g++](/man/g++)(1), [clang++](/man/clang++)(1), [cmake](/man/cmake)(1)

# RESOURCES

```[Source code](https://github.com/TantrixAuto/yantra)```

```[Documentation](https://github.com/TantrixAuto/yantra/tree/main/docs)```

<!-- verified: 2026-10-01 -->
