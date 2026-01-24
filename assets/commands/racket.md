# TLDR

**Start REPL**

```racket```

**Run script**

```racket [script.rkt]```

**Evaluate expression**

```racket -e "(+ 1 2 3)"```

**Run with specific language**

```racket -l [typed/racket] [script.rkt]```

**Interactive with file**

```racket -it [script.rkt]```

**Compile to bytecode**

```raco make [script.rkt]```

**Create executable**

```raco exe [script.rkt]```

# SYNOPSIS

**racket** [_-e expr_] [_-l lang_] [_-it_] [_options_] [_file_] [_args_]

# PARAMETERS

**-e** _EXPR_
> Evaluate expression.

**-l** _LANG_
> Use language.

**-f** _FILE_
> Load file.

**-t** _FILE_
> Require file.

**-i**
> Interactive mode.

**-it** _FILE_
> Load and interact.

**-I** _LANG_
> Set language and interact.

**-m**, **--main**
> Run main submodule.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

**--**
> End options.

# DESCRIPTION

**racket** is the main implementation of Racket, a general-purpose programming language in the Lisp/Scheme family.

The language emphasizes language-oriented programming. The #lang directive at file start selects the language: racket, typed/racket, scribble, and many others.

The REPL provides interactive development. Tab completion, history, and inline documentation support exploratory programming.

raco is the Racket command tool for package management, compilation, documentation, and other tasks. It extends Racket's capabilities.

Typed Racket adds optional static typing. Type annotations catch errors at compile time while maintaining Racket's expressiveness.

The DrRacket IDE provides a graphical environment with debugging, profiling, and educational features.

# CAVEATS

Different from standard Scheme in some areas. Package system requires network access. Large standard distribution.

# HISTORY

**Racket** evolved from **PLT Scheme**, which began at **Rice University** in **1995**. The name changed to Racket in **2010** to reflect its evolution beyond Scheme. It's widely used in programming language research and education.

# SEE ALSO

[raco](/man/raco)(1), [drracket](/man/drracket)(1), [scheme](/man/scheme)(1), [guile](/man/guile)(1)
