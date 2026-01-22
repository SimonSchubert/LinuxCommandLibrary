# TLDR

**Schedule command**

```in [2h] [command]```

**Run at specific time**

```in [14:30] [command]```

**Schedule with minutes**

```in [30m] [command]```

**Run tomorrow**

```in [1d] [command]```

# SYNOPSIS

**in** _time_ _command_

# PARAMETERS

_TIME_
> Time specification (e.g., 2h, 30m, 1d, 14:30).

_COMMAND_
> Command to execute.

**h**
> Hours suffix.

**m**
> Minutes suffix.

**d**
> Days suffix.

# DESCRIPTION

**in** is a simple command scheduler that runs commands after a specified delay. It provides an alternative to at with simpler time syntax.

The tool backgrounds the sleep and command execution. Output is typically mailed or discarded.

in schedules commands with delay.

# CAVEATS

Shell-dependent implementation. Not POSIX standard. Consider at for portability.

# HISTORY

in is a simplified scheduling utility found in some shell environments as an alias or script wrapper around sleep and command execution.

# SEE ALSO

[at](/man/at)(1), [sleep](/man/sleep)(1), [cron](/man/cron)(8), [batch](/man/batch)(1)
