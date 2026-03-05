# TAGLINE

Run multiple commands in parallel with separate output

# TLDR

**Run commands defined in mprocs.yaml**

```mprocs```

**Run specific commands**

```mprocs "[command1]" "[command2]"```

**Use a specific config file**

```mprocs --config [path/to/config.yaml]```

# SYNOPSIS

**mprocs** [_options_] [_commands_...]

# DESCRIPTION

**mprocs** runs multiple commands in parallel and shows the output of each command separately in a TUI. It is designed for running commands you keep re-running during development, such as compilers, test runners, and dev servers.

Each process runs in its own window and you can interact with processes directly (including using editors like vim inside mprocs). Unlike tmux, when mprocs ends, so do all processes it manages.

# CONFIGURATION

**~/.config/mprocs/mprocs.yaml**
> Global configuration for key bindings and defaults.

**mprocs.yaml**
> Local project configuration defining processes to run.

# CAVEATS

Processes are terminated when mprocs exits. Not intended as a replacement for tmux or screen for long-lived sessions.

# HISTORY

**mprocs** was created by **pvolok** and is written in **Rust**.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [concurrently](/man/concurrently)(1)
