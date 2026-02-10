# TAGLINE

runs a command immune to hangups

# TLDR

**Run command immune to hangups**

```nohup [command] &```

**Run with output to file**

```nohup [command] > [output.log] 2>&1 &```

**Run script in background**

```nohup [./script.sh] &```

**Run with custom output**

```nohup [command] > [custom.out] &```

# SYNOPSIS

**nohup** _command_ [_arguments_]

# PARAMETERS

_COMMAND_
> Command to run.

_ARGUMENTS_
> Command arguments.

**--help**
> Display help information.

# DESCRIPTION

**nohup** runs a command immune to hangups. Process continues after logout.

The tool detaches from terminal. Output goes to nohup.out by default.

# CAVEATS

Combine with & for background. Output to nohup.out. Signal handling modified.

# HISTORY

nohup is a classic **Unix** command for running processes that survive terminal disconnection.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1), [disown](/man/disown)(1)

