# TAGLINE

integrated development environment for Racket

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

DrRacket is a GUI application and ships with Racket's full distribution, not the minimal one; a `racket-minimal` install has no DrRacket at all. For non-interactive work use **racket** to run a program and **raco** to compile, test, and package it.

The **language level** is set by the `#lang` line at the top of the file, not by the IDE, and this catches out beginners following a textbook: a file starting `#lang htdp/bsl` is deliberately restricted to a teaching subset, and most of Racket will appear not to exist until the line is changed. The *Beginning Student* levels also produce error messages tuned for novices rather than accurate ones.

It is not a general-purpose editor. Large files feel sluggish, and there is no reason to fight it when Emacs, Vim, and VS Code all have competent Racket modes; DrRacket earns its place through Check Syntax, the macro stepper, and the debugger, which are genuinely hard to replicate elsewhere.

# HISTORY

DrRacket began as **DrScheme**, built by the **PLT** group under Matthias Felleisen, starting at Rice University in the mid-**1990s** and continuing at Northeastern. It was designed hand in hand with *How to Design Programs*, and its defining idea was the **language level**: a beginner's mistakes should produce an error about what they wrote, not an obscure message from deep inside a language they have not been taught yet. That idea drove the graded student languages, and much of Racket's later work on `#lang` as a general mechanism for defining new languages grew out of it.

It was renamed DrRacket in **2010** when PLT Scheme became Racket, the project having long outgrown any reasonable claim to being a Scheme.

# SEE ALSO

[racket](/man/racket)(1), [raco](/man/raco)(1), [guile](/man/guile)(1), [sbcl](/man/sbcl)(1)

# RESOURCES

```[Source code](https://github.com/racket/racket)```

```[Homepage](https://racket-lang.org)```

```[Documentation](https://docs.racket-lang.org/drracket/index.html)```

<!-- verified: 2026-07-14 -->

