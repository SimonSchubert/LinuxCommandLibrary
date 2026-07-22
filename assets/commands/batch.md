# TAGLINE

Execute commands when system load permits

# TLDR

Enter commands **interactively**, then press Ctrl-D to queue them

```batch```

Queue a **command** read from stdin

```echo "./backup.sh" | batch```

Queue commands from a **file**

```batch -f [path/to/script.sh]```

Send **mail** when the job finishes, even with no output

```echo "./backup.sh" | batch -m```

# SYNOPSIS

**batch** [**-f** _file_] [**-m**] [**-V**] [**-q** _queue_]

# DESCRIPTION

**batch** executes commands when system load levels permit. It queues jobs to run once the system load average drops below **1.5** (or the value specified when **atd** was started with **-l**), making it useful for scheduling non-urgent or resource-intensive tasks during low-usage periods.

Unlike **at**, which runs commands at a specific time, **batch** waits for favorable system conditions and runs jobs as soon as they are met. **batch** is equivalent to `at -q b -m now`. Commands are read from standard input or from the file given with **-f**, and any output is mailed to the user upon completion. The **atd** daemon must be running to process queued jobs.

# PARAMETERS

**-f** _file_
> Read the job from _file_ rather than from standard input.

**-m**
> Send mail to the user when the job has completed, even if there was no output.

**-q** _queue_
> Use the specified queue (a single letter). batch defaults to queue **b**.

**-V**
> Print the version number to standard error and exit.

When no **-f** file is given, commands are read from standard input. Press Ctrl-D to end input when entering commands interactively.

# CAVEATS

The **atd** daemon must be running for batch to work. Results are sent to the user's mail. The load-average threshold defaults to 1.5 and can be changed by starting **atd** with the **-l** option.

# HISTORY

**batch** is part of the **at** package, providing job scheduling utilities for Unix systems.

# INSTALL

```apt: sudo apt install at```

```dnf: sudo dnf install at```

```pacman: sudo pacman -S at```

```apk: sudo apk add at```

```zypper: sudo zypper install at```

```nix: nix profile install nixpkgs#at```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[at](/man/at)(1), [atq](/man/atq)(1), [atrm](/man/atrm)(1), [cron](/man/cron)(1), [crontab](/man/crontab)(1)

# RESOURCES

```[Documentation](https://manpages.debian.org/bookworm/at/batch.1.en.html)```

<!-- verified: 2026-06-19 -->
