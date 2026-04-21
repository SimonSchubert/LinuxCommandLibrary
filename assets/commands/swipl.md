# TAGLINE

SWI-Prolog logic programming interpreter

# TLDR

**Start interactive**

```swipl```

**Load file**

```swipl [program.pl]```

**Run goal and exit**

```swipl -g "[goal]" -t halt [program.pl]```

**Query from command line**

```swipl -g "[member(X,[1,2,3]),writeln(X)]" -t halt```

**Compile to standalone**

```swipl -o [output] -c [program.pl]```

# SYNOPSIS

**swipl** [_-g goal_] [_-t goal_] [_-o output_] [_options_] [_files_]

# PARAMETERS

**-g** _GOAL_
> Goal executed before entering the interactive top level. May appear multiple times.

**-t** _GOAL_
> Use goal as the interactive top level instead of the default prolog/0 (commonly **halt** for scripts).

**-o** _FILE_
> Specify the output file when used with **-c**.

**-c** _FILES_
> Compile files into an intermediate code (saved state) file.

**-s** _FILE_
> Load file as a script after initialization.

**-f** _FILE_
> Use file as the initialization file instead of the default **init.pl**. Use **-f none** to skip init.

**-l** _FILE_
> Load file (compatibility with other Prolog systems).

**-x** _BOOTFILE_
> Boot from an alternative saved state.

**-O**
> Enable optimized compilation.

**-D** _NAME_[=_VALUE_]
> Set a Prolog flag.

**--stack-limit=**_SIZE_
> Limit combined Prolog stack size (suffix b, k, m, g).

**-q**, **--quiet**
> Suppress informational messages and startup banner.

**--version**
> Print version and architecture.

**--help**
> Print brief help summary.

# DESCRIPTION

**swipl** is the interpreter and compiler for SWI-Prolog, one of the most comprehensive and widely used Prolog implementations. It provides an interactive REPL for querying facts and rules, loading Prolog source files, and compiling standalone executables.

SWI-Prolog includes an extensive standard library with support for constraint logic programming (CLP), definite clause grammars, multi-threading, HTTP server framework, and interfaces to databases and other languages. It supports both interactive development and deployment as compiled applications.

The system can execute goals from the command line, load source files, and create standalone executables using the -c flag. It is widely used in academic research, natural language processing, and knowledge representation systems.

# CAVEATS

Prolog syntax unique. Logic programming paradigm. Learning curve.

# HISTORY

**SWI-Prolog** was started by **Jan Wielemaker** in 1987. It's one of the most widely used Prolog implementations.

# SEE ALSO

[gprolog](/man/gprolog)(1), [sicstus](/man/sicstus)(1), [yap](/man/yap)(1)
