# TLDR

**Start** ash shell

```ash```

**Execute** a command

```ash -c "[command]"```

Run **script**

```ash [script.sh]```

# SYNOPSIS

**ash** [_-c command_] [_script_] [_arguments_]

# DESCRIPTION

**ash** (Almquist Shell) is a lightweight POSIX-compliant shell. It's smaller and faster than bash, making it suitable for embedded systems and as /bin/sh on minimal systems.

Many systems use dash (Debian Almquist Shell) as their ash implementation. BusyBox also includes an ash implementation.

# PARAMETERS

**-c** _command_
> Execute command string

**-i**
> Interactive mode

**-l**
> Login shell

**-s**
> Read commands from stdin

# CAVEATS

Less feature-rich than bash; no arrays, extended globbing, or many bashisms. Scripts should use POSIX syntax only. Good for speed, not convenience.

# HISTORY

**ash** was written by Kenneth Almquist for BSD Unix in **1989** as a POSIX-compliant replacement for the Bourne shell. It has been forked into dash and is used in BusyBox.

# SEE ALSO

[dash](/man/dash)(1), [bash](/man/bash)(1), [sh](/man/sh)(1), [busybox](/man/busybox)(1)
