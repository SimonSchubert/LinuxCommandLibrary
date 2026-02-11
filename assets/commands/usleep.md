# TAGLINE

Pause execution for microseconds

# TLDR

**Sleep microseconds**

```usleep [1000000]```

**Sleep 100ms**

```usleep [100000]```

**Sleep 1ms**

```usleep [1000]```

# SYNOPSIS

**usleep** _microseconds_

# PARAMETERS

_microseconds_
> Time to sleep.

# DESCRIPTION

**usleep** pauses execution for a specified number of microseconds (millionths of a second). It provides finer timing granularity than the standard **sleep** command, which traditionally only accepted whole seconds.

The command takes a single argument representing the number of microseconds to pause. For example, usleep 500000 pauses for half a second, and usleep 1000 pauses for one millisecond.

On modern Linux systems, usleep is largely obsolete because GNU **sleep** accepts fractional seconds (e.g., sleep 0.5). The usleep command was historically provided by the initscripts package and may not be available on all distributions.

# CAVEATS

Deprecated on many systems. Use sleep instead. Not in all distros.

# HISTORY

**usleep** was provided by initscripts package for microsecond sleep. Modern sleep accepts fractional seconds.

# SEE ALSO

[sleep](/man/sleep)(1), [nanosleep](/man/nanosleep)(2)
