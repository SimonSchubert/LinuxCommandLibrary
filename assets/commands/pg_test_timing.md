# TAGLINE

measures timing overhead on the system

# TLDR

**Test timing overhead** with the default **3-second** duration

```pg_test_timing```

**Test for a specific** duration in **seconds**

```pg_test_timing -d [seconds]```

**Display version** information

```pg_test_timing -V```

# SYNOPSIS

**pg_test_timing** [_option_...]

# PARAMETERS

**-d** _duration_, **--duration=**_duration_
> Specifies the test duration in seconds. Longer durations give slightly better accuracy and are more likely to discover problems with the system clock moving backwards. Default is 3 seconds.

**-V**, **--version**
> Print the pg_test_timing version and exit.

**-?**, **--help**
> Show help about pg_test_timing command line arguments and exit.

# DESCRIPTION

**pg_test_timing** is a tool to measure the timing overhead on your system and confirm that the system time never moves backwards. It repeatedly calls the system clock timing function and reports the average overhead per call, plus a histogram of call durations.

Systems that are slow to collect timing data can give less accurate **EXPLAIN ANALYZE** results. Good results show most (>90%) individual timing calls taking less than one microsecond, with average per-loop overhead below 100 nanoseconds. Low overhead enables **track_io_timing** without significant performance impact.

# SEE ALSO

[pg_test_fsync](/man/pg_test_fsync)(1), [postgres](/man/postgres)(1)

