# TAGLINE

POSIX-compliant command interpreter

# TLDR

**Start an interactive shell**

```sh```

**Execute a script**

```sh [script.sh]```

**Execute commands from a string**

```sh -c "[command1; command2]"```

**Execute script with verbose output** (show commands)

```sh -x [script.sh]```

**Check syntax without executing**

```sh -n [script.sh]```

**Read commands from stdin**

```echo "echo hello" | sh```

# SYNOPSIS

**sh** [**-cefinvx**] [_script_ [_argument_...]]

# PARAMETERS

**-c** _string_
> Execute commands from string

**-e**
> Exit immediately if a command exits with non-zero status

**-f**
> Disable filename globbing (wildcard expansion)

**-i**
> Interactive shell

**-n**
> Read commands but do not execute (syntax check)

**-v**
> Print shell input lines as they are read

**-x**
> Print commands and arguments as they are executed

**-u**
> Treat unset variables as an error

**+**_option_
> Turn off option

# DESCRIPTION

**sh** is the POSIX-compliant command interpreter (shell). It provides the standard shell scripting environment and is guaranteed to be available on all Unix-like systems.

On many Linux systems, **/bin/sh** is a symbolic link to another shell (dash, bash, etc.) running in POSIX-compatibility mode. This provides both compatibility and performance benefits.

Shell scripts beginning with **#!/bin/sh** use POSIX sh, ensuring maximum portability. Scripts needing bash-specific features should use **#!/bin/bash** instead.

The shell reads commands from standard input, a file, or the **-c** argument. It supports variables, control flow (if, while, for, case), functions, pipelines, and I/O redirection.

# POSIX FEATURES

**Variables**: NAME=value, $NAME, ${NAME}
**Quoting**: 'literal', "interpolated", \escape
**Conditionals**: if-then-elif-else-fi, case-esac
**Loops**: while-do-done, for-in-do-done, until-do-done
**Functions**: name() { commands; }
**Tests**: [ condition ], test condition
**Arithmetic**: $((expression))

# CONFIGURATION

**~/.profile**
> Per-user login shell initialization file, executed for login shells.

**/etc/profile**
> System-wide login shell initialization file, executed before ~/.profile.

**ENV**
> Environment variable pointing to a file executed at interactive shell startup.

# CAVEATS

POSIX sh lacks many bash features: arrays, [[ ]], brace expansion, process substitution, many string manipulations. Write portable scripts or explicitly require bash.

The **-e** option can cause unexpected exits. Commands in conditions (if, while) or with || / && don't trigger exit on failure.

Different systems link /bin/sh to different implementations (dash, bash, ksh). Test scripts on target systems or use explicit interpreters.

# SEE ALSO

[bash](/man/bash)(1), [dash](/man/dash)(1), [zsh](/man/zsh)(1), [ksh](/man/ksh)(1), [csh](/man/csh)(1)
