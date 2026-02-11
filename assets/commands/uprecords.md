# TLDR

# TAGLINE

Display historical system uptime records

# TLDR

Display **top 10** uptime records

```uprecords```

Show **top N** records

```uprecords -m [25]```

Show **downtime** between reboots

```uprecords -d```

Show **recent** reboots

```uprecords -B```

**Full** output without truncation

```uprecords -w```

# SYNOPSIS

**uprecords** [_OPTIONS_]

# PARAMETERS

**-m** _N_
> Display top N records

**-d**
> Show downtime between reboots instead of kernel version

**-B**
> Show most recent reboots

**-w**
> Don't truncate output

**-a**
> Show all records

# DESCRIPTION

**uprecords** displays a summary of historical uptime records. It tracks system uptime across reboots and shows statistics about the longest running periods.

The tool requires the uptimed daemon to be running to collect uptime data.

# CAVEATS

Requires uptimed daemon running. Historical data depends on how long uptimed has been active. New installations have no historical data.

# SEE ALSO

[uptime](/man/uptime)(1), [uptimed](/man/uptimed)(8)
