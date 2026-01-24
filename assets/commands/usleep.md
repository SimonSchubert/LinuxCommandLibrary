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

**usleep** sleeps in microseconds. It pauses execution.

Microsecond precision. Fine timing.

Script delays. Short pauses.

Simple interface. One argument.

Legacy command. Use sleep with decimals.

# CAVEATS

Deprecated on many systems. Use sleep instead. Not in all distros.

# HISTORY

**usleep** was provided by initscripts package for microsecond sleep. Modern sleep accepts fractional seconds.

# SEE ALSO

[sleep](/man/sleep)(1), [nanosleep](/man/nanosleep)(2)
