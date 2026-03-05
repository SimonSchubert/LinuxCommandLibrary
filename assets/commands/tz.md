# TAGLINE

Interactive terminal-based time zone helper

# TLDR

**Display configured time zones**

```tz```

**Display specific zones with labels**

```TZ_LIST="Europe/Paris,EMEA;US/Central,US" tz```

**Show a specific timezone**

```tz "[America/New_York]"```

# SYNOPSIS

**tz** [_options_]

# DESCRIPTION

**tz** is an interactive TUI program that displays time across multiple time zones of your choosing. It uses standard tz database names and can be configured via the **TZ_LIST** environment variable, a config file, or command arguments. Useful for scheduling across distributed teams.

# HISTORY

**tz** was created by **Arnaud Berthomier** (oz) and is written in **Go**.

# SEE ALSO

[timedatectl](/man/timedatectl)(1), [date](/man/date)(1), [tzupdate](/man/tzupdate)(1)
