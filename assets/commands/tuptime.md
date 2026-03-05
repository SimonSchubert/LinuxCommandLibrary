# TAGLINE

Historical and statistical system uptime/downtime reporter

# TLDR

**Show uptime/downtime summary**

```tuptime```

**List all startup/shutdown events**

```tuptime -l```

**Output in CSV format**

```tuptime --csv```

# SYNOPSIS

**tuptime** [_options_]

# DESCRIPTION

**tuptime** reports historical and statistical real time of the system, keeping data between restarts. It tracks all startups and shutdowns in a SQLite database, calculates uptime and downtime percentages, records used kernels, and identifies the largest, shortest, and average up/downtime periods.

# HISTORY

**tuptime** was created by **Ricardo Fraile** (rfmoz) and is written in **Python**.

# SEE ALSO

[uptime](/man/uptime)(1), [last](/man/last)(1), [systemd-analyze](/man/systemd-analyze)(1)
