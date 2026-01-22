# TLDR

**Run** a program in a new session

```setsid [program]```

**Run** a program in a new session discarding output and errors

```setsid [program] > /dev/null 2>&1```

**Run** a program creating a new process (fork)

```setsid -f [program]```

**Return** the exit code of the program as setsid's exit code

```setsid -w [program]```

**Run** a program with the current terminal as the controlling terminal

```setsid -c [program]```

# SYNOPSIS

**setsid** [_options_] _program_ [_arguments_]

# PARAMETERS

**-c, --ctty**
> Set the controlling terminal to the current one

**-f, --fork**
> Always fork, creating a new process

**-w, --wait**
> Wait for the program to exit and return its exit status

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# DESCRIPTION

**setsid** runs a program in a new session. A session is a collection of process groups, and a new session has no controlling terminal by default. The calling process becomes the session leader.

This is commonly used to detach programs from the terminal, run daemons, or ensure a process continues running after logout. When combined with output redirection, it effectively backgrounds a process independently.

# CAVEATS

If the calling process is already a session leader, setsid will fail unless **-f** is used. The new session has no controlling terminal unless **-c** is specified. Part of the util-linux package.

# SEE ALSO

[nohup](/man/nohup)(1), [disown](/man/disown)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1), [setsid](/man/setsid)(2)
