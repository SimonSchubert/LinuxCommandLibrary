# TAGLINE

Scheme programming language interpreter

# TLDR

**Start REPL**

```scheme```

**Load a file, then enter the REPL** (Chez Scheme)

```scheme [file.ss]```

**Run a script** (Chez Scheme)

```scheme --script [file.ss]```

**Run an R6RS top-level program** (Chez Scheme)

```scheme --program [file.sps]```

**Start without the greeting** (Chez Scheme)

```scheme -q```

**Load a file** (MIT/GNU Scheme)

```scheme --load [file.scm]```

**Evaluate an expression** (MIT/GNU Scheme)

```scheme --eval "[(display (+ 1 2))]"```

# SYNOPSIS

**scheme** [_options_] [_file_ ...]

# PARAMETERS

**--script** _FILE_
> Chez: run FILE as a Scheme shell script.

**--program** _FILE_
> Chez: run FILE as an R6RS top-level program.

**-q**, **--quiet**
> Chez: suppress greeting and prompt.

**--load** _FILE_ ...
> MIT: load the listed files.

**--eval** _EXPR_ ...
> MIT: evaluate the listed expressions.

**--no-init-file**
> MIT: ignore ~/.scheme.init.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**scheme** is an interpreter for the Scheme programming language, a minimalist dialect of Lisp emphasizing functional programming, lexical scoping, and first-class procedures. It provides both an interactive REPL for experimentation and the ability to run Scheme source files directly.

Scheme's design follows the RnRS language standards (R5RS, R6RS, R7RS), providing a small but powerful core with features like proper tail recursion, continuations, and hygienic macros. The interactive REPL allows evaluating expressions immediately, making it well-suited for learning, prototyping, and exploring algorithms.

The **scheme** command may refer to different implementations depending on the system, most commonly Chez Scheme or MIT/GNU Scheme. Their command-line options differ, and each implementation offers its own extensions beyond the standard, so behavior and available libraries may vary.

# CAVEATS

Options are implementation-specific: check which Scheme provides the command. Other implementations use their own name, such as guile or mit-scheme.

# HISTORY

**Scheme** was designed by **Guy Steele** and **Gerald Sussman** in 1975. Various implementations provide the scheme command.

# SEE ALSO

[guile](/man/guile)(1), [racket](/man/racket)(1), [clisp](/man/clisp)(1)

# RESOURCES

```[Source code](https://github.com/cisco/ChezScheme)```

```[Homepage](https://www.gnu.org/software/mit-scheme/)```

```[Documentation](https://cisco.github.io/ChezScheme/)```

<!-- verified: 2026-11-08 -->
