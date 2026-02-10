# TAGLINE

korn shell, combining features of sh and csh

# TLDR

**Start Korn shell**

```ksh```

**Run script**

```ksh [script.ksh]```

**Run command**

```ksh -c "[command]"```

**Login shell**

```ksh -l```

**Restricted shell**

```ksh -r```

**POSIX mode**

```ksh -o posix```

# SYNOPSIS

**ksh** [_options_] [_script_] [_args_...]

# PARAMETERS

_SCRIPT_
> Script file to execute.

**-c** _CMD_
> Execute command string.

**-l**
> Login shell.

**-r**
> Restricted shell.

**-o** _OPTION_
> Set shell option.

**-i**
> Interactive shell.

**--help**
> Display help information.

# DESCRIPTION

**ksh** is the Korn shell, combining features of sh and csh. It provides advanced scripting with interactive editing.

The shell supports command history, job control, and aliases. ksh93 is the most common version.

# CAVEATS

Multiple implementations exist. Different from bash in subtle ways. POSIX compatible.

# HISTORY

The Korn shell was created by **David Korn** at Bell Labs in the 1980s, influencing many modern shells.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [zsh](/man/zsh)(1), [tcsh](/man/tcsh)(1)
