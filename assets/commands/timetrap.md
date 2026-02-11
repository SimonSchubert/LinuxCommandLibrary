# TAGLINE

Simple command-line time tracking

# TLDR

**Start timer**

```timetrap in "[task description]"```

**Stop timer**

```timetrap out```

**Show current**

```timetrap now```

**Display today**

```timetrap display```

**Switch sheet**

```timetrap sheet [project]```

**List sheets**

```timetrap list```

**Edit entry**

```timetrap edit```

# SYNOPSIS

**timetrap** _command_ [_options_] [_args_]

# PARAMETERS

**in**
> Start tracking.

**out**
> Stop tracking.

**now**
> Current status.

**display**
> Show entries.

**sheet**
> Switch timesheet.

**list**
> List sheets.

**edit**
> Edit entries.

# DESCRIPTION

**timetrap** is a simple command-line time tracking tool that uses a clock in/out model. You start a timer with **in** and stop it with **out**, and entries are stored in a local SQLite database for reliable, portable storage.

Time entries are organized into sheets, which act as separate timesheets for different projects or clients. Switching between sheets with the **sheet** command makes it easy to track time across multiple activities without mixing entries.

The **display** command shows logged entries with calculated durations, and reporting features provide time summaries for billing or review. Entries can be edited after the fact to correct mistakes or add notes.

# CAVEATS

Ruby required. Command-line only. Manual entry.

# HISTORY

**timetrap** was created as a simple command-line time tracking tool using SQLite for storage.

# SEE ALSO

[watson](/man/watson)(1), [timew](/man/timew)(1), [tog](/man/tog)(1)
