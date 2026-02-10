# TAGLINE

command-line work hours tracker

# TLDR

**Start work timer**

```moro```

**Stop work timer**

```moro stop```

**Set break time**

```moro break [30]```

**Check status**

```moro status```

**Set work duration**

```moro config --work-day-hours [8]```

**Show report**

```moro report```

**Clear data**

```moro clear```

# SYNOPSIS

**moro** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Action to perform.

**stop**
> Stop the work timer.

**break** _MINUTES_
> Record break time.

**status**
> Show current status.

**report**
> Display work report.

**clear**
> Clear recorded data.

**--help**
> Display help information.

# DESCRIPTION

**moro** is a command-line work hours tracker. It records work time in a simple way.

The tool tracks start and end times. Calculates total work hours and breaks.

# CAVEATS

Node.js based. Simple flat file storage. Local machine tracking only.

# HISTORY

moro was created as a **simple time tracker** for developers who work from the terminal.

# SEE ALSO

[timew](/man/timew)(1), [watson](/man/watson)(1), [timewarrior](/man/timewarrior)(1)

