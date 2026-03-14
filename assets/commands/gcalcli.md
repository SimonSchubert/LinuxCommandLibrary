# TAGLINE

command-line interface for Google Calendar

# TLDR

**Show agenda** for the next 5 days

```gcalcli agenda```

**List calendars**

```gcalcli list```

**Show weekly calendar view**

```gcalcli calw```

**Show monthly calendar view**

```gcalcli calm```

**Add event** with details

```gcalcli add --title "[title]" --when "[tomorrow 2pm]" --duration [60] --where "[location]"```

**Quick add event** using natural language

```gcalcli quick "[Meeting tomorrow at 3pm]"```

**Search events**

```gcalcli search "[query]"```

**Import events** from an ICS file

```gcalcli import [path/to/events.ics]```

**Delete event**

```gcalcli delete "[event title]"```

# SYNOPSIS

**gcalcli** [_options_] _command_ [_args_]

# SUBCOMMANDS

**agenda**
> Show upcoming events.

**list**
> List calendars.

**calw**
> Weekly calendar view.

**calm**
> Monthly calendar view.

**add**
> Add an event.

**quick**
> Quick add event.

**search**
> Search events.

**delete**
> Delete an event.

**edit**
> Edit an event.

**import**
> Import events from an ics/vcal file.

**remind**
> Execute a command if event occurs within a specified time.

# PARAMETERS

**--calendar** _name_
> Specify calendar.

**--title** _text_
> Event title.

**--when** _time_
> Event start time.

**--duration** _minutes_
> Event duration.

**--where** _location_
> Event location.

**--lineart** _type_
> Line art style: fancy, unicode, or ascii.

**--nocache**
> Execute command without using cache.

**--locale** _LOCALE_
> Set locale for date/time output.

**--refresh**
> Delete and refresh cached data.

# CONFIGURATION

**~/.gcalclirc**
> Configuration file with commonly-used CLI options, one per line. Can also use @file syntax to load options from any file.

**~/.gcalcli_oauth**
> OAuth 2.0 credentials for Google Calendar API access.

# DESCRIPTION

**gcalcli** is a command-line interface for Google Calendar that enables terminal-based calendar management without opening a web browser. It authenticates via OAuth 2.0 and provides full access to your Google Calendar data.

The tool supports both viewing operations like agenda and calendar displays, and modification operations including creating, editing, and deleting events. Quick add functionality allows natural language event creation, while the structured add command provides precise control over event details.

gcalcli is particularly useful for terminal-centric workflows, automation scripts, and integration with other command-line tools. It can display calendar data in various formats and supports working with multiple calendars simultaneously.

# SEE ALSO

[gcal](/man/gcal)(1), [calcurse](/man/calcurse)(1)

