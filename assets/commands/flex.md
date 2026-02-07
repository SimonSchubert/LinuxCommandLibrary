# TAGLINE

fast lexical analyzer generator

# TLDR

**Generate** an analyzer from a Lex file (output: lex.yy.c)

```flex [analyzer.l]```

**Specify the output file**

```flex -o [analyzer.c] [analyzer.l]```

Write analyzer to **stdout**

```flex -t [analyzer.l]```

Generate a **batch scanner** instead of interactive

```flex -B [analyzer.l]```

Generate **case-insensitive** scanner

```flex -i [analyzer.l]```

Generate scanner with **debugging** enabled

```flex -d [analyzer.l]```

**Compile** the generated C file

```cc lex.yy.c -o [executable] -lfl```

# SYNOPSIS

**flex** [_options_] [_file..._]

# PARAMETERS

**-o, --outfile** _file_
> Write generated scanner to specified file

**-t, --stdout**
> Write scanner to stdout instead of file

**-B, --batch**
> Generate batch scanner (optimized for throughput)

**-I, --interactive**
> Generate interactive scanner (default)

**-i, --case-insensitive**
> Generate case-insensitive scanner

**-d, --debug**
> Enable debug mode in generated scanner

**-b, --backup**
> Generate backup information file (lex.backup)

**-p, --perf-report**
> Generate performance report to stderr

**-v, --verbose**
> Print scanner statistics to stderr

**-f, --full**
> Generate fast, large scanner (no table compression)

**-F, --fast**
> Generate fast scanner with table compression

**--header-file** _file_
> Generate C header file

**-+, --c++**
> Generate C++ scanner class

**--yylineno**
> Track line numbers in generated scanner

# DESCRIPTION

**Flex** (fast lexical analyzer generator) generates programs that perform pattern-matching on text. Given a specification file describing patterns and actions (typically with **.l** extension), flex generates C source code implementing a lexical analyzer.

The generated scanner reads input, matches it against patterns defined in the specification, and executes associated actions. This is commonly used to build tokenizers for compilers and interpreters, working alongside parser generators like **bison** or **yacc**.

By default, flex generates output to **lex.yy.c**. The generated code requires linking with **-lfl** (flex library) or defining **yywrap()** to return 1.

# CAVEATS

The generated scanner depends on the flex runtime library (**-lfl**) unless **%option noyywrap** is specified. Large pattern sets may produce sizable table-driven scanners; use compression options (**-Ce**, **-Cm**) to reduce size at some performance cost. The default interactive mode adds buffering overhead; use **-B** for batch processing.

# HISTORY

Flex was written by Vern Paxson around **1987** as a free, open-source replacement for the original **lex** utility from AT&T Unix (created by Mike Lesk and Eric Schmidt in the mid-1970s). The name stands for "fast lexical analyzer generator." Flex became the standard lex implementation on most Unix-like systems and continues to be maintained on GitHub.

# SEE ALSO

[bison](/man/bison)(1), [yacc](/man/yacc)(1), [gcc](/man/gcc)(1), [cc](/man/cc)(1)
