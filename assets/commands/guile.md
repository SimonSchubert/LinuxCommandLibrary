# TAGLINE

GNU Ubiquitous Intelligent Language for Extensions

# TLDR

**Start interactive REPL**

```guile```

**Run a script file**

```guile -s [script.scm]```

**Evaluate an expression and exit**

```guile -c "(display \"Hello\")"```

**Load a file then enter interactive REPL**

```guile -l [library.scm] --```

**Run a script with a specific entry point function**

```guile -e [main] -s [script.scm] [args]```

**Add a directory to the module load path**

```guile -L [/path/to/modules] -s [script.scm]```

**Load SRFI extensions**

```guile --use-srfi=[1,13] -s [script.scm]```

**Start with debugging VM enabled**

```guile --debug [script.scm]```

# SYNOPSIS

**guile** [_-L directory_] [_-l file_] [_-e function_] [_\\_] [_-c expr_] [_-s script_] [_--_] [_script_] [_args_]

# PARAMETERS

**-s** _SCRIPT_
> Load Scheme source from SCRIPT and execute as a script.

**-c** _EXPR_
> Evaluate EXPR as a Scheme expression and exit.

**-l** _FILE_
> Load Scheme source code from FILE.

**-e** _FUNCTION_
> After reading script, apply FUNCTION to command-line arguments.

**-L** _DIRECTORY_
> Add DIRECTORY to the front of Guile's module load path.

**-x** _EXTENSION_
> Add EXTENSION to the Guile load extension list.

**-ds**
> Carry out -s SCRIPT at this point in the option sequence (used with -l).

**--**
> Stop argument processing and start Guile in interactive mode.

**\\**
> Meta switch for working around limitations in #! scripts.

**--debug**
> Start with the debugging VM (default in interactive mode).

**--no-debug**
> Start without the debugging VM.

**--auto-compile**
> Compile source files automatically (default).

**--no-auto-compile**
> Disable automatic source file compilation.

**--listen**[=_P_]
> Listen on port or socket P for remote REPL connections.

**--use-srfi=**_N,M,..._
> Load SRFI extensions N, M, etc.

**-q**
> Suppress loading the user's initialization file in interactive mode.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**Guile** is the GNU Ubiquitous Intelligent Language for Extensions. It implements the R5RS and R6RS Scheme standards and is used for scripting and extending applications.

Guile provides full Scheme functionality plus extensions for practical programming including a module system, POSIX interfaces, networking, and SRFI support. It is designed to be embeddable in C/C++ applications as GNU's official extension language. Source files are automatically compiled to bytecode for faster execution.

# CAVEATS

Scheme syntax differs from other Lisps. Extension libraries and APIs may vary between Guile 2.x and 3.x. The GUILE_LOAD_PATH and GUILE_LOAD_COMPILED_PATH environment variables control module search paths.

# HISTORY

Guile was created by the **GNU Project** as its official extension language, first released in **1993**.

# SEE ALSO

[scheme](/man/scheme)(1), [racket](/man/racket)(1), [clisp](/man/clisp)(1), [emacs](/man/emacs)(1)
