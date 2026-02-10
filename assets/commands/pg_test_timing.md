# TAGLINE

measures timing overhead on the system

# TLDR

**Test timing overhead**

```pg_test_timing```

**Test for specific duration**

```pg_test_timing -d [seconds]```

# SYNOPSIS

**pg_test_timing** [_options_]

# PARAMETERS

**-d**, **--duration** _seconds_
> Test duration.

# DESCRIPTION

**pg_test_timing** measures timing overhead on the system. Tests clock_gettime() performance. Low overhead enables track_io_timing without significant impact.

# SEE ALSO

[pg_test_fsync](/man/pg_test_fsync)(1), [postgres](/man/postgres)(1)

