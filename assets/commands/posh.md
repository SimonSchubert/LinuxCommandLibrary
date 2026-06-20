# TAGLINE

Policy-compliant POSIX shell

# TLDR

**Start an interactive** posh session

```posh```

**Execute** a shell script

```posh [script.sh]```

**Run a command** string and exit

```posh -c "[command]"```

**Syntax-check** a script without executing it

```posh -n [script.sh]```

**Read commands** from standard input

```echo "[commands]" | posh -s```

# SYNOPSIS

**posh** [_+-aCefilnuvx_] [_+-o option_] [_[-c command-string [command-name] | -s | file] [argument...]_]

# PARAMETERS

**-c** _command_
> Execute commands from the given string

**-i**
> Force interactive mode and enable job control

**-l**
> Behave as a login shell, reading profile files

**-n**
> Read commands but do not execute (syntax check only)

**-s**
> Read commands from standard input; treat remaining arguments as positional parameters

**-p**
> Privileged mode: read `/etc/suid_profile` instead of the user profile

**-e**
> Exit immediately if a command exits with a non-zero status

**-u**
> Treat unset variables as an error when substituting

**-v**
> Print input lines to stderr as they are read

**-x**
> Print each command and its arguments to stderr before execution (trace mode)

**-a**
> Export all variables that are assigned or modified

# DESCRIPTION

**posh** (Policy-compliant Ordinary SHell) is a reimplementation of the Bourne shell derived from pdksh, designed to comply strictly with the POSIX/SUSv3 specification and Debian policy. It intentionally excludes extensions beyond the POSIX standard, making it useful for testing script portability.

Scripts that run correctly under posh are more likely to be portable across different Unix-like environments. Running a script under posh acts as a conformance check: if bash-specific features are used, posh will reject them, revealing portability issues before deployment on a minimal system.

Posh supports standard shell features including parameter substitution, command substitution, arithmetic expressions, pipelines, file globbing, here-documents, and job control in interactive sessions.

# CAVEATS

Posh deliberately omits many common bash extensions: arrays, process substitution (`<()`), `[[ ]]` compound tests, `local` declarations, and various other bashisms. Scripts relying on these features must be rewritten for posh compatibility. The shell is not intended as a daily interactive shell but as a portability testing tool.

# HISTORY

**posh** was created by Clint Adams for the **Debian** project to provide a shell strictly conforming to POSIX and the Debian Policy Manual requirements. It is derived from **pdksh** (Public Domain Korn Shell), originally written by Eric Gisin in the 1980s as a free Korn shell implementation.

# SEE ALSO

[sh](/man/sh)(1), [bash](/man/bash)(1), [dash](/man/dash)(1), [ksh](/man/ksh)(1)

# RESOURCES

```[Homepage](https://packages.debian.org/posh)```

<!-- verified: 2026-06-20 -->
