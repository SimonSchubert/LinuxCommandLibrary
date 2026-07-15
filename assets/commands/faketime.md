# TAGLINE

system time manipulation for testing

# TLDR

Fake time to **this evening**

```faketime '[today 23:30]' [date]```

Open shell with **yesterday** as current date

```faketime '[yesterday]' [bash]```

Simulate how program would act **next Friday**

```faketime '[next Friday 1 am]' [path/to/program]```

# SYNOPSIS

**faketime** [_options_] _timestamp_ _command_

# DESCRIPTION

**faketime** runs a command with a fake system time by intercepting time-related system calls. It uses LD_PRELOAD to wrap functions like time(), gettimeofday(), and clock_gettime(), returning a user-specified time instead of the real system time.

This is useful for testing time-dependent software, debugging date-related bugs, simulating future or past conditions, and testing expiration or scheduling logic. The timestamp accepts absolute dates ("YYYY-MM-DD hh:mm:ss") as well as natural-language and relative descriptions parsed via GNU date.

Giving an absolute timestamp freezes the clock at that instant: repeated time queries return the same value. The advanced format (**-f**) instead lets time advance, run faster or slower, or step forward on each call.

# PARAMETERS

_timestamp_
> Time specification (absolute date, natural language, or, with -f, an advanced offset/speed spec).

_command_
> Command to run with the faked time.

**-f**
> Use the advanced timestamp specification format (offsets, per-call increments, and clock-speed multipliers).

**-m**
> Use the multi-threading variant of libfaketime.

**--exclude-monotonic**
> Do not fake CLOCK_MONOTONIC queries.

**--date-prog** _path_
> Use an alternate GNU date-compatible program to parse the timestamp.

# CAVEATS

Uses LD_PRELOAD, so it may not work with statically linked binaries or setuid programs. To freeze time, give an absolute timestamp; to let it advance or scale, use the -f advanced format.

# SEE ALSO

[date](/man/date)(1), [timedatectl](/man/timedatectl)(1)

# RESOURCES

```[Source code](https://github.com/wolfcw/libfaketime)```

<!-- verified: 2026-07-15 -->
