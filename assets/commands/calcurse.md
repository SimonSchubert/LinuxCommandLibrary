# TAGLINE

Text-based calendar and scheduling application

# TLDR

Start calcurse in **interactive mode**

```calcurse```

Print **appointments and events** for today

```calcurse -a```

Print **todo list**

```calcurse -t```

Print **next upcoming appointment**

```calcurse -n```

Print appointments for a **specific date**

```calcurse -d [MM/DD/YYYY]```

Print appointments for the **next N days**

```calcurse -r [7]```

**Import** an iCal file

```calcurse -i [calendar.ics]```

**Export** data to iCal format

```calcurse -x ical > [calendar.ics]```

# SYNOPSIS

**calcurse** [_options_]

# DESCRIPTION

**calcurse** is a text-based calendar and scheduling application. It provides a curses-based interface for managing appointments, todos, and notes with support for CalDAV synchronization.

The interactive interface shows a monthly calendar, appointments list, and todo list simultaneously.

# PARAMETERS

**-a, --appointment**
> Print appointments and events for today and exit

**-t, --todo**
> Print todo list and exit

**-d** _date_
> Print appointments for specified date

**-n, --next**
> Print next appointment

**-r, --range** _days_
> Print appointments within range of days

**-i** _file_
> Import iCal (.ics) data from file

**-x** _format_
> Export data (ical or pcal format)

**-c** _file_
> Use alternate calendar file

**-D, --directory** _dir_
> Use alternate data directory

# SUBCOMMANDS

**calcurse-caldav**
> Synchronize with CalDAV server

# CONFIGURATION

**~/.calcurse/conf**
> Main configuration file for display settings, key bindings, and general options

# CAVEATS

CalDAV synchronization requires configuration in ~/.calcurse/caldav/config. First sync should specify initialization mode to resolve conflicts.

# SEE ALSO

[cal](/man/cal)(1), [task](/man/task)(1), [remind](/man/remind)(1)
