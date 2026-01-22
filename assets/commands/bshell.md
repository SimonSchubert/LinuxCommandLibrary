# TLDR

**Start an interactive Bourne shell**

```bshell```

**Execute a shell script**

```bshell [path/to/script.sh]```

**Execute a command**

```bshell -c "[command]"```

**Run in debug mode showing executed commands**

```bshell -x [path/to/script.sh]```

**Run as a restricted shell**

```bshell -r```

# SYNOPSIS

**bshell** [**-ruvx**] [**-c** _command_] [_script_] [_arguments..._]

# DESCRIPTION

**bshell** is a Bourne Shell interpreter from the Schily-Tools collection, providing a traditional POSIX-compatible shell environment. It executes commands read from standard input, command strings, or script files.

The Bourne Shell is the original Unix shell written by Stephen Bourne at Bell Labs. This implementation maintains compatibility with the classic shell behavior while running on modern systems.

# PARAMETERS

**-c** _command_
> Execute the specified command string

**-r**
> Start as a restricted shell, limiting certain operations for security

**-u**
> Treat unset variables as errors and exit

**-v**
> Print shell input lines as they are read (verbose mode)

**-x**
> Print commands and arguments as they are executed (debug mode)

# CAVEATS

The **bshell** command is part of the Schily-Tools package and may not be installed by default on most Linux distributions. Most systems use **bash** or **dash** as **/bin/sh** for Bourne shell compatibility.

# HISTORY

The original Bourne Shell was developed by **Stephen Bourne** at Bell Labs and first appeared in **Version 7 Unix in 1979**. It replaced the Thompson shell and became the foundation for subsequent shells including **ksh**, **bash**, and **zsh**. The Schily-Tools implementation by Jörg Schilling provides a modern port of the classic Bourne Shell.

# SEE ALSO

[sh](/man/sh)(1), [bash](/man/bash)(1), [dash](/man/dash)(1), [ksh](/man/ksh)(1)
