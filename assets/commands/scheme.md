# TLDR

**Start REPL**

```scheme```

**Run file**

```scheme [file.scm]```

**Evaluate expression**

```scheme -e "[(+ 1 2)]"```

**Load file then REPL**

```scheme -l [file.scm]```

**Quiet mode**

```scheme -q```

# SYNOPSIS

**scheme** [_-e expr_] [_-l file_] [_options_] [_file_]

# PARAMETERS

**-e** _EXPR_
> Evaluate expression.

**-l** _FILE_
> Load file.

**-q**
> Quiet startup.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**scheme** runs Scheme programs. It provides a Lisp dialect.

Interactive REPL. Experiment with code.

Functional programming language. First-class functions.

R5RS/R7RS compatible. Standard Scheme.

Various implementations exist. MIT Scheme, Chez, Guile.

# CAVEATS

Implementation varies. Name may differ (guile, mit-scheme). Portability concerns.

# HISTORY

**Scheme** was designed by **Guy Steele** and **Gerald Sussman** in 1975. Various implementations provide the scheme command.

# SEE ALSO

[guile](/man/guile)(1), [racket](/man/racket)(1), [clisp](/man/clisp)(1)
