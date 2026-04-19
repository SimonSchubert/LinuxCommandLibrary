# TAGLINE

reminds you when to leave

# TLDR

**Leave in 30 minutes**

```leave +30```

**Leave at specific time** (HHMM, 12 or 24 hour clock)

```leave [1730]```

**Interactive mode** (prompts "When do you have to leave?")

```leave```

**Cancel leave reminder**

```kill $(pgrep leave)```

# SYNOPSIS

**leave** [[+]_hhmm_]

# PARAMETERS

_hhmm_
> Time of day when you need to leave. Times are interpreted on a 12-hour clock and assumed to be within the next 12 hours.

**+**_hhmm_
> Relative time; leave goes off in _hh_ hours and _mm_ minutes from now.

# DESCRIPTION

**leave** waits until the specified time and then reminds you to leave. You are reminded 5 minutes and 1 minute before the actual time, at the time itself, and every minute thereafter. It forks and runs in the background, and exits automatically when you log off.

If no argument is given, **leave** prompts with "When do you have to leave?"; an empty reply causes it to exit.

# CAVEATS

Classic BSD utility available on macOS and most *BSD systems; on Linux it is typically not installed by default. There is no option to cancel a running reminder short of killing the background process.

# HISTORY

leave originated in **BSD Unix** as a simple reminder utility for terminal users.

# HISTORY

leave originated in **BSD Unix** as a simple reminder utility for terminal users.

# SEE ALSO

[at](/man/at)(1), [calendar](/man/calendar)(1), [sleep](/man/sleep)(1)
