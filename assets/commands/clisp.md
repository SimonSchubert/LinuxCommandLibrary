# TAGLINE

ANSI Common Lisp implementation

# TLDR

**Start interactive REPL**

```clisp```

**Run a Lisp file**

```clisp [script.lisp]```

**Evaluate an expression**

```clisp -x "(print \"Hello World\")"```

**Load file and enter REPL**

```clisp -i [script.lisp]```

**Compile a file to bytecode**

```clisp -c [source.lisp]```

**Run without startup messages**

```clisp -q```

**Set memory limits**

```clisp -m [100MB]```

# SYNOPSIS

**clisp** [_options_] [_files_]

# PARAMETERS

**-c** _file_
> Compile file to bytecode (.fas).

**-x** _expression_
> Execute expression and exit.

**-i** _file_
> Load file before entering REPL.

**-o** _file_
> Output file for compilation.

**-q**, **--quiet**
> Suppress banner and startup messages.

**-m** _size_
> Set memory size limit.

**-M** _file_
> Use memory image file.

**-modern**
> Use modern (lowercase) symbol case.

**-ansi**
> ANSI Common Lisp mode.

**--help**
> Display help.

**--version**
> Display version information.

# DESCRIPTION

**CLISP** is an implementation of ANSI Common Lisp, providing an interactive development environment and compiler. It features a bytecode compiler, interpreter, debugger, and CLOS (Common Lisp Object System) support.

The REPL (Read-Eval-Print Loop) provides interactive Lisp development with readline support, history, and completion. Files can be loaded, compiled to bytecode for faster execution, or combined into standalone executables.

CLISP includes extensive standard library support, foreign function interface (FFI) for calling C code, socket and networking functions, and internationalization support including Unicode.

# CAVEATS

Bytecode is not portable across different CLISP versions or platforms. Some Common Lisp libraries may have compatibility issues. Performance is generally slower than compiled implementations like SBCL. The FFI syntax differs from other Lisp implementations.

# HISTORY

CLISP was originally developed by **Bruno Haible** and **Michael Stoll** starting in **1987** at the University of Karlsruhe in Germany. It was designed to be portable and memory-efficient. The project has been maintained by various contributors over the decades and remains one of the most portable Common Lisp implementations, running on many platforms including Unix, Windows, and embedded systems.

# SEE ALSO

[sbcl](/man/sbcl)(1), [ecl](/man/ecl)(1), [ccl](/man/ccl)(1), [quicklisp](/man/quicklisp)(1)
