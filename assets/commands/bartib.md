# TAGLINE

Simple command-line time tracker with plain-text logs

# TLDR

**Start** tracking a task with optional project

```bartib start -d "[description]" -p "[project]"```

**Stop** the current activity

```bartib stop```

**Show** currently running activity

```bartib current```

**List** today's activities

```bartib list --today```

**Report** time spent today

```bartib report --today```

**Continue** the last task

```bartib continue```

# SYNOPSIS

**bartib** *command* [*options*]

# DESCRIPTION

**bartib** is a lightweight time-tracking CLI written in Rust. Activities are stored in a plain-text log file (path via **BARTIB_FILE** or configuration), making the data easy to edit, backup, and version. Subcommands cover starting/stopping tasks, continuing previous work, listing history, and generating reports filtered by day, project, or date range.

Ideal for freelancers and developers who want terminal-native tracking without a heavy GUI or cloud service.

# PARAMETERS

**start** **-d** *description* [**-p** *project*]

> Begin a new activity.

**stop**

> Stop the running activity.

**continue** [*number*]

> Resume a previous activity (optionally by list index).

**current**

> Show the currently running activity.

**list** [**--today**] [**--yesterday**] [**--date** *date*] [**--project** *name*]

> List logged activities with filters.

**report** [same filters as **list**]

> Summarize time spent.

**edit** / **cancel** / **change**

> Correct or cancel entries (see **bartib --help**).

**projects**

> List known project names.

Set **BARTIB_FILE** to choose the log path (default is under the home directory).

# CAVEATS

All state lives in a local file—back it up if you depend on the history. Concurrent writers from multiple machines need external sync. Precision is wall-clock based; it is not a sampling profiler.

# INSTALL

```aur: yay -S bartib```

```brew: brew install bartib```

```nix: nix profile install nixpkgs#bartib```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[timew](/man/timew)(1), [watson](/man/watson)(1), [timetrap](/man/timetrap)(1)

# RESOURCES

```[Source code](https://github.com/nikolassv/bartib)```

<!-- verified: 2026-07-19 -->
