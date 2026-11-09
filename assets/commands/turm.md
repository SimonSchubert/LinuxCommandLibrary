# TAGLINE

TUI for the Slurm workload manager

# TLDR

**Launch the Slurm job TUI**

```turm```

**Show only your jobs**

```turm --me```

**Show a specific user's jobs**

```turm -u [username]```

**Filter by partition**

```turm --partition [gpu]```

**Show all your jobs** including finished ones, newest first

```turm --me --sort=-i --states=ALL```

**Use a custom pager** for log files

```turm --pager "[bat]"```

**Enable shell completion** for bash

```eval "$(turm completion bash)"```

# SYNOPSIS

**turm** [_options_] [_squeue-options_]

**turm** **completion** _shell_

# PARAMETERS

**--slurm-refresh** _SECONDS_
> Refresh rate for the job watcher (default: 2).

**--file-refresh** _SECONDS_
> Refresh rate for the file watcher (default: 2).

**--jobs-width** _COLS|PERCENT%_
> Initial Jobs pane width (default: 33%, 0 hides it).

**--jobs-columns** _COLUMNS_
> Comma-separated job list columns (default: state,id,partition,user,time,name).

**--details-height** _LINES_
> Initial Details pane height in lines, 0 to 6 (default: 6, 0 hides it).

**--pager** _COMMAND_
> Log viewer command, used when pressing **p**. Falls back to **TURM_PAGER**, **PAGER**, then less.

**--me**, **-u** _USER_, **-p** _PARTITION_, **-t** _STATES_, **-S** _FIELDS_, ...
> Filtering and sorting options are passed through to squeue.

# DESCRIPTION

**turm** provides a convenient terminal user interface for managing Slurm cluster jobs. It parses the output of squeue to display job information, updates the queue every two seconds, and displays log files with inotify-based live updates. It accepts the same options as squeue.

# CAVEATS

On queues with many jobs, filter by user to reduce load on the Slurm controller. Inotify does not work on remote file systems such as NFS, so turm also polls log files every two seconds.

# HISTORY

**turm** was created by **Karim Knaebel** (karimknaebel) and is written in **Rust**.

# SEE ALSO

[squeue](/man/squeue)(1), [scontrol](/man/scontrol)(1), [sacct](/man/sacct)(1), [scancel](/man/scancel)(1)

# RESOURCES

```[Source code](https://github.com/karimknaebel/turm)```

<!-- verified: 2026-11-09 -->
