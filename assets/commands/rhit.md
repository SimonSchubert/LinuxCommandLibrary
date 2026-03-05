# TAGLINE

Nginx log explorer for the terminal

# TLDR

**Analyze default nginx log files**

```rhit```

**Filter logs from a specific date onward**

```rhit -d '[2024-01-15]..'```

**Measure by bytes transferred**

```rhit -m bytes [/var/log/nginx/access.log]```

# SYNOPSIS

**rhit** [_options_] [_logfile_...]

# PARAMETERS

**-d** _DATE_RANGE_
> Filter logs by date range (e.g., '2024-01-15..', '..2024-02-01').

**-m** _METRIC_
> Measure by the given metric: hits or bytes.

# DESCRIPTION

**rhit** reads nginx log files from their standard locations (including gzipped logs), analyzes them, and displays results in formatted tables in the terminal. It supports filtering by date, measuring by hits or bytes, and viewing popular or unpopular IP addresses.

# HISTORY

**rhit** was created by **Canop** (Denys Seguret) and is written in **Rust**.

# SEE ALSO

[goaccess](/man/goaccess)(1), [ngxtop](/man/ngxtop)(1), [broot](/man/broot)(1)
