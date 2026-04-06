# TAGLINE

Embeddable Common Lisp interpreter

# TLDR

**Start ECL REPL**

```ecl```

**Load and execute a file**

```ecl -load [file.lisp]```

**Evaluate expression**

```ecl -eval "(print \"Hello\")"```

**Compile file to shared library**

```ecl -compile [file.lisp]```

**Run script and exit**

```ecl -shell [script.lisp]```

**Start without initialization**

```ecl -norc```

# SYNOPSIS

**ecl** [_options_] [_args_]

# PARAMETERS

**-load** _file_
> Load Lisp file.

**-eval** _expr_
> Evaluate expression.

**-compile** _file_
> Translate file to C and compile to a shared library (.fas).

**-o** _ofile_
> Name the compiled shared library output file.

**-c** _cfile_
> Name the intermediary C file and keep it after compilation.

**-h** _hfile_
> Name the intermediary C header file and keep it after compilation.

**-data** [_datafile_]
> Dump compiler data into datafile.

**-s**
> Produce a linkable object file instead of a shared library.

**-shell** _script_
> Run as script, then exit.

**-norc**
> Don't load init file (~/.eclrc).

**-dir** _directory_
> Use directory as system directory.

**-q**
> Reduce compiler output verbosity.

# CONFIGURATION

**~/.eclrc**
> Initialization file loaded on startup containing Lisp expressions for customization.

# DESCRIPTION

**ECL** (Embeddable Common Lisp) is an implementation of Common Lisp designed to be embedded in other applications. It compiles Lisp to C, enabling integration with C libraries and native code generation.

ECL supports the full ANSI Common Lisp standard with extensions for threading, FFI (Foreign Function Interface), and embedding. It can produce standalone executables and shared libraries.

# REPL COMMANDS

```
(quit)           ; Exit ECL
(load "file")    ; Load Lisp file
(compile-file "f"); Compile to object
(require :asdf)  ; Load ASDF
```

# CAVEATS

Compiling to C adds complexity. Some libraries may need adaptation for ECL. Debugging compiled code is harder than interpreted. Threading behavior may differ from other implementations.

# HISTORY

ECL was originally developed at **IRCAM** (Paris) in the **1980s** as **KCL** (Kyoto Common Lisp). It was forked and developed as **ECL** by **Giuseppe Attardi** and later maintained by the community. The focus on embeddability distinguishes it from other Common Lisp implementations.

# SEE ALSO

[sbcl](/man/sbcl)(1), [clisp](/man/clisp)(1)
