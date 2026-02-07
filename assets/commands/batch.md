# TAGLINE

Execute commands when system load permits

# TLDR

Execute commands **interactively**

```batch```

Execute **command** from stdin

```echo "./backup.sh" | batch```

# SYNOPSIS

**batch** [_OPTIONS_]

# DESCRIPTION

**batch** executes commands when system load levels permit. It queues jobs to run when the system load average drops below a configurable threshold (default 1.5), making it useful for scheduling non-urgent or resource-intensive tasks during low-usage periods.

Unlike `at` which runs commands at a specific time, `batch` waits for favorable system conditions. Commands are read from standard input, and output is mailed to the user upon completion. The `atd` daemon must be running to process queued jobs.

# PARAMETERS

Commands are read from standard input. Press Ctrl+D to end input when entering commands interactively.

# CAVEATS

The atd daemon must be running for batch to work. Results are sent to the user's mail. The load average threshold can be configured when starting atd.

# HISTORY

**batch** is part of the **at** package, providing job scheduling utilities for Unix systems.

# SEE ALSO

[at](/man/at)(1), [atq](/man/atq)(1), [atrm](/man/atrm)(1)
