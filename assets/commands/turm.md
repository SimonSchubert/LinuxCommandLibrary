# TAGLINE

TUI for the Slurm workload manager

# TLDR

**Launch the Slurm job TUI**

```turm```

**Show only your jobs**

```turm -u $USER```

**Filter by partition**

```turm --partition [gpu]```

# SYNOPSIS

**turm** [_squeue-options_]

# DESCRIPTION

**turm** provides a convenient terminal user interface for managing Slurm cluster jobs. It parses the output of squeue to display job information, updates the queue every two seconds, and displays log files with inotify-based live updates. It accepts the same options as squeue.

# HISTORY

**turm** was created by **Karim Abou Zeid** (kabouzeid) and is written in **Python**.

# SEE ALSO

[squeue](/man/squeue)(1), [scontrol](/man/scontrol)(1), [sacct](/man/sacct)(1)
