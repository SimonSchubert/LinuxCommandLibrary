# TAGLINE

Simple tool for managing running background jobs

# TLDR

**Start a tracked background job**

```rum [my_long_script.sh]```

**List all tracked runs**

```rum --list```

**Show the output log of a run**

```rum --log [id]```

**Follow the live output of a running job**

```rum --log --follow [id]```

**Remove a tracked run by ID**

```rum --remove [id]```

# SYNOPSIS

**rum** [_options_] [_command_...]

# PARAMETERS

**--list**
> List all tracked background runs with their status.

**--log** _ID_
> Show the output log of a tracked run.

**--follow**
> Used with --log to follow output in real time (similar to tail -f).

**--remove** _ID_
> Remove a tracked run by its ID.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**rum** lets you run and manage long-running background processes. You prefix any command with **rum** to start tracking it. Each run gets a unique ID for management. Output is captured and can be viewed later with --log, making it lighter than screen or tmux for simple job tracking, especially useful over SSH sessions that may disconnect.

# HISTORY

**rum** was created by **Daniel Csillag** (dccsillag) and is written in **Rust**.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1), [nohup](/man/nohup)(1), [disown](/man/disown)(1)
