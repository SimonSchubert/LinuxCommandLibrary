# TAGLINE

Scheme programming language interpreter

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

**scheme** is an interpreter for the Scheme programming language, a minimalist dialect of Lisp emphasizing functional programming, lexical scoping, and first-class procedures. It provides both an interactive REPL for experimentation and the ability to run Scheme source files directly.

Scheme's design follows the R5RS and R7RS language standards, providing a small but powerful core with features like proper tail recursion, continuations, and hygienic macros. The interactive REPL allows evaluating expressions immediately, making it well-suited for learning, prototyping, and exploring algorithms.

The **scheme** command may refer to different implementations depending on the system, including MIT/GNU Scheme, Chez Scheme, or GNU Guile. Each implementation offers its own extensions beyond the standard, so behavior and available libraries may vary.

# CAVEATS

Implementation varies. Name may differ (guile, mit-scheme). Portability concerns.

# HISTORY

**Scheme** was designed by **Guy Steele** and **Gerald Sussman** in 1975. Various implementations provide the scheme command.

# SEE ALSO

[guile](/man/guile)(1), [racket](/man/racket)(1), [clisp](/man/clisp)(1)
