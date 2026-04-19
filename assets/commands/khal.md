# TAGLINE

terminal calendar application

# TLDR

**Show calendar**

```khal```

**List events**

```khal list```

**Add event** (START END SUMMARY)

```khal new [2024-01-15] [10:00] [11:00] [Meeting]```

**Add event interactively**

```khal new -i```

**Search events**

```khal search [keyword]```

**Interactive TUI**

```khal interactive```

**Import ICS file**

```khal import [event.ics]```

**Show events for a date range**

```khal list [2024-01-15] [7d]```

# SYNOPSIS

**khal** [_options_] _command_

# PARAMETERS

**list** [_START_] [_END_|_DELTA_]
> List events for a date range.

**at** _DATETIME_
> Show events at a specific datetime.

**calendar** [_START_] [_END_]
> Display a calendar (cal-like) view with events.

**new** _START_ [_END_|_DELTA_] [_TIMEZONE_] _SUMMARY_ [:: _DESCRIPTION_]
> Create a new event. Use **-i** for interactive entry.

**search** _STRING_
> Search events matching the given string.

**edit** _STRING_
> Interactively edit or delete matching events.

**import** _FILE_
> Import an ICS file.

**printcalendars**
> List configured calendars.

**printformats**
> Display date/time format samples.

**configure**
> Run the initial configuration wizard.

**-a** _CALENDAR_ / **-d** _CALENDAR_
> Include (**-a**) or exclude (**-d**) a calendar.

**--help**
> Display help information.

# DESCRIPTION

**khal** is a terminal calendar application. It reads and writes CalDAV calendars through vdirsyncer.

The tool provides both command-line and interactive interfaces. It supports multiple calendars and recurring events.

# CAVEATS

Requires vdirsyncer for sync. Python-based. Configuration file needed.

# HISTORY

khal was created as a terminal-based calendar client compatible with CalDAV through the vdirsyncer ecosystem.

# SEE ALSO

[vdirsyncer](/man/vdirsyncer)(1), [todoman](/man/todoman)(1), [calcurse](/man/calcurse)(1)
