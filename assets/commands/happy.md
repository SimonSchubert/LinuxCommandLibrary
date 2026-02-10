# TAGLINE

parser generator for Haskell, similar to yacc for C

# TLDR

**Generate parser from grammar**

```happy [grammar.y] -o [Parser.hs]```

**Generate with info file**

```happy -i [grammar.y]```

**Show version**

```happy --version```

**Generate with GHC extensions**

```happy -g [grammar.y]```

# SYNOPSIS

**happy** [_options_] _file_

# PARAMETERS

_FILE_
> Grammar file (.y).

**-o** _FILE_
> Output file name.

**-i**
> Generate info file.

**-g**
> Use GHC extensions.

**-a**
> Generate array-based parser.

**-c**
> Generate GHC parser.

**--help**
> Display help information.

# DESCRIPTION

**Happy** is a parser generator for Haskell, similar to yacc for C. It takes a grammar specification and produces a Haskell parser module.

The tool generates LALR parsers from BNF-like grammars. It integrates with Alex lexer generator for complete parsing solutions.

# CAVEATS

Haskell specific. Learning curve for grammar syntax. Debugging shift/reduce conflicts.

# HISTORY

Happy was created for **Haskell** as an equivalent to yacc/bison, widely used in Haskell compilers and tools like GHC.

# SEE ALSO

[alex](/man/alex)(1), [ghc](/man/ghc)(1), [yacc](/man/yacc)(1)
