# TLDR

**Start ECL REPL**

```ecl```

**Load and execute a file**

```ecl -load [file.lisp]```

**Evaluate expression**

```ecl -eval "[(print \"Hello\")]"```

**Compile file to binary**

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
> Compile file.

**-shell** _script_
> Run as script, then exit.

**-norc**
> Don't load init file.

**-dir** _directory_
> Add directory to load path.

**-q**, **-quiet**
> Suppress startup messages.

**--help**
> Display help.

# DESCRIPTION

**ECL** (Embeddable Common Lisp) is an implementation of Common Lisp designed to be embedded in other applications. It compiles Lisp to C, enabling integration with C libraries and native code generation.

ECL supports the full ANSI Common Lisp standard with extensions for threading, FFI (Foreign Function Interface), and embedding. It can produce standalone executables and shared libraries.

# REPL COMMANDS

```
(quit)           ; Exit ECL
(load "file")    ; Load Lisp file
(compile-file)   ; Compile to object
(require :asdf)  ; Load ASDF
```

# CAVEATS

Compiling to C adds complexity. Some libraries may need adaptation for ECL. Debugging compiled code is harder than interpreted. Threading behavior may differ from other implementations.

# HISTORY

ECL was originally developed at **IRCAM** (Paris) in the **1980s** as **KCL** (Kyoto Common Lisp). It was forked and developed as **ECL** by **Giuseppe Attardi** and later maintained by the community. The focus on embeddability distinguishes it from other Common Lisp implementations.

# SEE ALSO

[sbcl](/man/sbcl)(1), [clisp](/man/clisp)(1), [ccl](/man/ccl)(1), [lisp](/man/lisp)(1)
