# TLDR

**Start DrRacket IDE**

```drracket```

**Open a file**

```drracket [file.rkt]```

**Open multiple files**

```drracket [file1.rkt] [file2.rkt]```

**Run Racket script directly**

```racket [script.rkt]```

# SYNOPSIS

**drracket** [_options_] [_file_...]

# PARAMETERS

**-h**, **--help**
> Display help information.

**--version**
> Show version.

_file_
> Racket source file to open.

# DESCRIPTION

**DrRacket** is the integrated development environment for the Racket programming language. It provides a graphical editor with syntax highlighting, a REPL (Read-Eval-Print Loop), debugging tools, and educational features.

The IDE supports multiple Racket dialects through language declarations. It includes features like check syntax (highlighting variable bindings), macro stepper, and integrated documentation. DrRacket is particularly popular for teaching programming.

# FEATURES

- Syntax highlighting and auto-indentation
- Interactive REPL with definitions window
- Check syntax with binding arrows
- Macro expansion stepper
- Integrated help and documentation
- Multiple language levels for education

# CAVEATS

Requires Racket installation. GUI-based; for command-line Racket, use the **racket** command. May be slower than text editors for large files. Educational language levels restrict available features intentionally.

# HISTORY

DrRacket evolved from **DrScheme**, created at **Rice University** in the **1990s** by the PLT group. It was designed for teaching programming and developing the Racket language (formerly PLT Scheme). The IDE has been central to Racket's educational mission and language development.

# SEE ALSO

[racket](/man/racket)(1), [raco](/man/raco)(1), [guile](/man/guile)(1), [sbcl](/man/sbcl)(1)
