# TAGLINE

ALGOL-style Standard Lisp dialect used by REDUCE

# TLDR

**Start an interactive RLISP session**

```rlisp```

**Load and execute an RLISP source file**

```rlisp < [program.red]```

**Use a custom heap size (in megabytes)**

```rlisp -K [256]```

**Suppress banner and garbage-collector chatter**

```rlisp -q```

**Set a Lisp variable from the command line**

```rlisp -D [name]=[value]```

# SYNOPSIS

**rlisp** [_options_] [_file_]

# PARAMETERS

**--help**
> Show help text and exit.

**--version**
> Show version information.

**-v**
> Print extended startup banner; verbose mode.

**-q**
> Quiet mode: suppress echo and garbage-collector messages.

**-w**
> Force console (non-windowed) operation.

**--nogui**
> Force a console-style application.

**-K** _nnn_
> Set heap size in megabytes; the heap will not grow beyond _nnn_.

**-K** _nnn_**/**_ss_
> Set heap size and Lisp stack pages.

**-i** _file_
> Add a read-only image file to the search path.

**-o** _file_
> Set the output image file used by **faslout**.

**-D** _name_**=**_value_
> Pre-bind a Lisp variable from the command line.

**-l** _file_
> Redirect standard output to _file_.

**-r** _n_**,**_m_
> Seed the random number generator for reproducible runs.

**-z**
> Bootstrap mode: start without an image file.

# DESCRIPTION

**RLISP** is an ALGOL-like surface syntax for **Standard Lisp**, used internally by the **REDUCE** computer algebra system. It provides Lisp semantics — symbolic expressions, lists, atoms, recursion — but with a more readable infix and keyword syntax (**begin**/**end**, **if**/**then**/**else**, **for**, **while**) instead of S-expressions.

When invoked, **rlisp** starts an interactive read-eval-print loop. Statements are terminated by a semicolon (**;**) for normal output, or by a dollar sign (**$**) to suppress the printed result. From inside REDUCE you can switch to RLISP/symbolic mode with **symbolic;** and back with **algebraic;**.

The binary is part of REDUCE and is normally built on top of either **CSL** (Codemist Standard Lisp) or **PSL** (Portable Standard Lisp); the available command-line options reflect the underlying Lisp engine.

# CAVEATS

Statements must end with **;** or **$** — pressing **Return** alone does not execute. Variable and function names are case-insensitive (folded to upper case). On modern systems RLISP is mainly encountered as part of REDUCE: standalone use is uncommon outside the REDUCE source tree.

# HISTORY

RLISP was developed in the early **1970s** at the **University of Utah** (Anthony Hearn, Martin Griss, and others) as the implementation language for **REDUCE**, the symbolic computation system first released in **1968**. RLISP '88 added structured programming features. REDUCE became free and open-source software in **2008** under the BSD licence and continues to ship with RLISP as both its implementation and its symbolic programming language.

# SEE ALSO

[reduce](/man/reduce)(1), [csl](/man/csl)(1), [psl](/man/psl)(1), [maxima](/man/maxima)(1)
