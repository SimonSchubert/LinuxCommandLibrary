# TLDR

**Show calendar**

```khal```

**List events**

```khal list```

**Add event**

```khal new [2024-01-15] [10:00] [11:00] [Meeting]```

**Interactive mode**

```khal interactive```

**Import ICS file**

```khal import [event.ics]```

**Show specific date**

```khal list [2024-01-15]```

# SYNOPSIS

**khal** [_options_] _command_

# PARAMETERS

**list** [_DATE_]
> List events.

**new** _DATE_ _START_ _END_ _SUMMARY_
> Create event.

**interactive**
> Interactive TUI mode.

**import** _FILE_
> Import ICS file.

**printcalendars**
> List calendars.

**--help**
> Display help information.

# DESCRIPTION

**khal** is a terminal calendar application. It reads and writes CalDAV calendars through vdirsyncer.

The tool provides both command-line and interactive interfaces. It supports multiple calendars and recurring events.

khal is CLI calendar application.

# CAVEATS

Requires vdirsyncer for sync. Python-based. Configuration file needed.

# HISTORY

khal was created as a terminal-based calendar client compatible with CalDAV through the vdirsyncer ecosystem.

# SEE ALSO

[vdirsyncer](/man/vdirsyncer)(1), [todoman](/man/todoman)(1), [calcurse](/man/calcurse)(1)
