# TLDR

Execute commands **interactively**

```batch```

Execute **command** from stdin

```echo "./backup.sh" | batch```

# SYNOPSIS

**batch** [_OPTIONS_]

# DESCRIPTION

**batch** executes commands when system load levels permit. Unlike at, batch queues jobs to run when the system load average drops below a threshold (typically 1.5), making it useful for running non-urgent tasks.

# PARAMETERS

Commands are read from standard input. Press Ctrl+D to end input when entering commands interactively.

# CAVEATS

The atd daemon must be running for batch to work. Results are sent to the user's mail. The load average threshold can be configured when starting atd.

# HISTORY

**batch** is part of the **at** package, providing job scheduling utilities for Unix systems.

# SEE ALSO

[at](/man/at)(1), [atq](/man/atq)(1), [atrm](/man/atrm)(1)
