# TLDR

**Leave in 30 minutes**

```leave +30```

**Leave at specific time**

```leave [1730]```

**Leave at time with message**

```leave [1700]```

**Cancel leave reminder**

```kill $(pgrep leave)```

# SYNOPSIS

**leave** [[+]_time_]

# PARAMETERS

_TIME_
> Time to leave (HHMM format).

**+**_MINUTES_
> Leave in N minutes.

# DESCRIPTION

**leave** reminds you when to leave. It displays warnings as the time approaches.

The tool runs in the background and prints reminders. Useful for meetings and appointments.

leave reminds when to depart.

# CAVEATS

BSD utility. Simple notification. Background process.

# HISTORY

leave originated in **BSD Unix** as a simple reminder utility for terminal users.

# SEE ALSO

[at](/man/at)(1), [calendar](/man/calendar)(1), [sleep](/man/sleep)(1)
