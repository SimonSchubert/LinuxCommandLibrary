# TLDR

**Start interactive REPL**

```guile```

**Run script**

```guile [script.scm]```

**Evaluate expression**

```guile -c "(display \"Hello\")"```

**Load file then REPL**

```guile -l [library.scm]```

**Debug mode**

```guile --debug [script.scm]```

# SYNOPSIS

**guile** [_options_] [_file_] [_args_]

# PARAMETERS

_FILE_
> Scheme script to run.

_ARGS_
> Arguments to script.

**-c** _EXPR_
> Evaluate expression.

**-l** _FILE_
> Load file before running.

**-e** _FUNC_
> Entry point function.

**--debug**
> Enable debugging.

**-q**
> Quiet startup.

**--help**
> Display help information.

# DESCRIPTION

**Guile** is the GNU Ubiquitous Intelligent Language for Extensions. It's a Scheme implementation used for scripting and extending applications.

Guile provides full Scheme functionality plus extensions for practical programming. It's designed to be embeddable in C/C++ applications.

Guile is GNU's Scheme interpreter.

# CAVEATS

Scheme syntax differs from other Lisps. Extension libraries vary by version. Steep learning curve.

# HISTORY

Guile was created by the **GNU Project** as its official extension language, first released in **1993**.

# SEE ALSO

[scheme](/man/scheme)(1), [racket](/man/racket)(1), [chicken](/man/chicken)(1)
