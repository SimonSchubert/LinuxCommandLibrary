# TLDR

**Attach** process to current terminal

```reptyr [pid]```

Attach by **process name**

```reptyr $(pidof [htop])```

# SYNOPSIS

**reptyr** [**-s**] [**-T**] _pid_

# PARAMETERS

**-s**
> Attach via script method (more compatible)

**-T**
> Attach process and its children

**-l**
> List PIDs that can be attached

**-v**
> Verbose output

**pid**
> Process ID to attach

# DESCRIPTION

**reptyr** moves a running process to a new terminal. This is invaluable when you start a long-running command in a regular terminal and later realize it should be in screen or tmux.

The tool uses ptrace to reparent the process's controlling terminal, allowing it to receive input from and send output to the new terminal.

# CAVEATS

Requires ptrace capability (may need root or sysctl adjustment). Some processes may not work due to terminal state. Background the process first with Ctrl+Z and bg. Process must be owned by current user.

# HISTORY

**reptyr** was created by **Nelson Elhage** to solve the common problem of wanting to move a running process to a different terminal or screen session without restarting it.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1), [nohup](/man/nohup)(1), [disown](/man/disown)(1)
