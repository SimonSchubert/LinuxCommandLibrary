# TAGLINE

parser generator for Haskell, similar to yacc for C

# TLDR

**Generate parser from grammar file**

```happy [grammar.y] -o [Parser.hs]```

**Generate with info file for debugging**

```happy -i [grammar.y]```

**Generate with GHC extensions for faster code**

```happy -g [grammar.y]```

**Generate array-based parser with GHC string encoding**

```happy -ag [grammar.y]```

**Generate parser with debugging output at runtime**

```happy -d [grammar.y]```

**Generate GLR parser**

```happy -l [grammar.y]```

# SYNOPSIS

**happy** [_options_] _file_

# PARAMETERS

_FILE_
> Grammar file (.y).

**-o** _FILE_
> Output file name. Defaults to FILE.hs.

**-i** [_FILE_]
> Generate info file with grammar details, parser states, and conflicts.

**-g**, **--ghc**
> Use GHC-specific extensions for faster parsers.

**-a**, **--array**
> Generate array-based parser (smaller but slower). Combined with -g, arrays are encoded as strings for faster performance.

**-c**, **--coerce**
> Use GHC's unsafeCoerce# for smaller, faster parsers. May crash at runtime if grammar has type errors.

**-d**, **--debug**
> Generate a parser that prints shift/reduce debugging info to stderr.

**-l**, **--glr**
> Generate a GLR parser instead of LALR(1).

**-t** _DIR_, **--template=**_DIR_
> Directory for template files.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Print version information.

# DESCRIPTION

**Happy** is a parser generator for Haskell, similar to yacc for C. It takes a grammar specification and produces a Haskell parser module.

The tool generates LALR parsers from BNF-like grammars and can also produce GLR parsers. It integrates with the Alex lexer generator for complete parsing solutions.

# CAVEATS

Haskell specific. Learning curve for grammar syntax. Debugging shift/reduce conflicts.

# HISTORY

Happy was created for **Haskell** as an equivalent to yacc/bison, widely used in Haskell compilers and tools like GHC.

# SEE ALSO

[alex](/man/alex)(1), [ghc](/man/ghc)(1), [yacc](/man/yacc)(1), [bison](/man/bison)(1)
