# TAGLINE

Korn shell, combining features of sh and csh

# TLDR

**Start Korn shell**

```ksh```

**Run a script**

```ksh [script.ksh]```

**Run a command string**

```ksh -c "[command]"```

**Start a login shell**

```ksh -l```

**Start a restricted shell**

```ksh -r```

**Enable POSIX compliance mode**

```ksh -o posix```

**Enable vi-style line editing**

```ksh -o vi```

# SYNOPSIS

**ksh** [_options_] [_script_] [_args_...]

# PARAMETERS

_SCRIPT_
> Script file to execute.

**-c** _CMD_
> Execute command string.

**-l**
> Login shell (reads profile files).

**-r**
> Restricted shell (limits operations like cd and path changes).

**-s**
> Read commands from standard input.

**-o** _OPTION_
> Set shell option (e.g., vi, emacs, posix, noclobber, errexit).

**+o** _OPTION_
> Unset shell option.

**-i**
> Force interactive shell mode.

**-n**
> Read commands but do not execute them (syntax check).

**-x**
> Print commands and arguments as they are executed (trace mode).

**-e**
> Exit immediately if a command exits with non-zero status.

**-v**
> Print shell input lines as they are read.

**--help**
> Display help information.

# DESCRIPTION

**ksh** is the Korn shell, combining features of the Bourne shell (sh) and C shell (csh). It provides advanced scripting capabilities with interactive command-line editing, command history, job control, and aliases.

The shell supports both vi and emacs editing modes, associative and indexed arrays, arithmetic evaluation, coprocesses, and pattern matching. ksh93 is the most widely used version; ksh2020 is a more recent release.

# CAVEATS

Multiple implementations exist (ksh88, ksh93, mksh, pdksh). Behavior may differ subtly between implementations and from bash. POSIX compatible when invoked with `-o posix`.

# HISTORY

The Korn shell was created by **David Korn** at **Bell Labs** in the early **1980s**, influencing many modern shells including bash and zsh.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [zsh](/man/zsh)(1), [tcsh](/man/tcsh)(1)
