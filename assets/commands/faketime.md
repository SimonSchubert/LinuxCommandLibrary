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

**faketime** runs a command with a fake system time by intercepting time-related system calls. Useful for testing time-dependent software, debugging, and simulating future or past conditions.

Uses LD_PRELOAD to intercept calls without modifying the actual system time.

# PARAMETERS

_timestamp_
> Time specification (natural language or specific date)

_command_
> Command to run with faked time

**-f**
> Freeze time (don't advance)

# DESCRIPTION

**faketime** runs a command with a fake system time by intercepting time-related system calls. It uses LD_PRELOAD to wrap system calls like time(), gettimeofday(), and clock_gettime(), returning user-specified times instead of actual system time.

This is useful for testing time-dependent software behavior, debugging date-related bugs, simulating future or past conditions, and testing expiration or scheduling logic. The tool accepts both absolute timestamps and relative offsets using natural language.

The freeze option (-f) prevents time from advancing, useful for testing code that expects a specific moment rather than progressing time.

# CAVEATS

Uses LD_PRELOAD so may not work with statically linked binaries or setuid programs. Time format is flexible and accepts natural language descriptions.

# SEE ALSO

[date](/man/date)(1), [timedatectl](/man/timedatectl)(1)
