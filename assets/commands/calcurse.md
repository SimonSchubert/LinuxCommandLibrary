# TLDR

Start calcurse in **interactive mode**

```calcurse```

Print **appointments and events** for today

```calcurse -a```

**Sync** keeping remote objects (removes local)

```calcurse-caldav --init=keep-remote```

**Sync** keeping local objects (removes remote)

```calcurse-caldav --init=keep-local```

**Two-way sync** local and remote

```calcurse-caldav --init=two-way```

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
> Print appointments within range

**-c** _file_
> Use alternate configuration file

# SUBCOMMANDS

**calcurse-caldav**
> Synchronize with CalDAV server

# CAVEATS

CalDAV synchronization requires configuration in ~/.calcurse/caldav/config. First sync should specify initialization mode to resolve conflicts.

# SEE ALSO

[cal](/man/cal)(1), [task](/man/task)(1), [remind](/man/remind)(1)
