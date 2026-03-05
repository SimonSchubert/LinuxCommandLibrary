# TAGLINE

Simple tool for managing running background jobs

# TLDR

**Start a tracked background job**

```rum [my_long_script.sh]```

**List all tracked runs**

```rum --list```

**Remove a tracked run by ID**

```rum --remove [id]```

# SYNOPSIS

**rum** [_options_] [_command_...]

# PARAMETERS

**--list**
> List all tracked background runs.

**--remove** _ID_
> Remove a tracked run by its ID.

# DESCRIPTION

**rum** lets you run and manage long-running background processes. You prefix any command with **rum** to start tracking it. Each run gets a unique ID for management. It is lighter than screen or tmux for simple job tracking, especially useful over SSH.

# HISTORY

**rum** was created by **Daniel Csillag** (dccsillag) and is written in **Rust**.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1), [nohup](/man/nohup)(1)
