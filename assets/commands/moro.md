# TAGLINE

command-line work hours tracker

# TLDR

**Clock in (start work timer)**

```moro hi```

**Clock in at a specific time**

```moro hi [09:30]```

**Clock out (stop work timer)**

```moro bye```

**Set break time in minutes**

```moro break [30]```

**Show today's work report**

```moro report```

**Show report for all days**

```moro report --all```

**Set default break time**

```moro config --break [45]```

**Clear all recorded data**

```moro clear```

# SYNOPSIS

**moro** [_command_] [_options_]

# PARAMETERS

**hi** [_HH:MM_]
> Clock in. Optionally specify a past start time.

**bye** [_HH:MM_]
> Clock out. Optionally specify a past end time.

**break** _MINUTES_
> Set break time in minutes.

**report** [**--all**]
> Display work report. Use --all to show all days.

**config** **--break** _MINUTES_
> Set default break time.

**clear**
> Clear all recorded data.

**--help**
> Display help information.

# DESCRIPTION

**moro** is a command-line work hours tracker. It records clock in/out times and calculates total work hours minus breaks.

The formula is: (clock out time) - (clock in time) - (breaks) = work hours. Default break is 30 minutes.

# CAVEATS

Node.js based. Simple flat file storage. Local machine tracking only. The project is deprecated; the released npm version is considered the only stable version.

# HISTORY

moro was created as a **simple time tracker** for developers who work from the terminal.

# SEE ALSO

[timew](/man/timew)(1), [watson](/man/watson)(1)

