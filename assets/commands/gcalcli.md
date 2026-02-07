# TAGLINE

command-line interface for Google Calendar

# TLDR

**Show agenda**

```gcalcli agenda```

**List calendars**

```gcalcli list```

**Show calendar view**

```gcalcli calw```

**Show month view**

```gcalcli calm```

**Add event**

```gcalcli add --title "[title]" --when "[tomorrow 2pm]" --duration [60]```

**Quick add event**

```gcalcli quick "[Meeting tomorrow at 3pm]"```

**Search events**

```gcalcli search "[query]"```

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

# PARAMETERS

**--calendar** _name_
> Specify calendar.

**--title** _text_
> Event title.

**--when** _time_
> Event start time.

**--duration** _minutes_
> Event duration.

# CONFIGURATION

**~/.gcalclirc**
> Main configuration file containing OAuth credentials, calendar settings, and display preferences.

**~/.gcalcli_oauth**
> OAuth 2.0 credentials for Google Calendar API access.

# DESCRIPTION

**gcalcli** is a command-line interface for Google Calendar that enables terminal-based calendar management without opening a web browser. It authenticates via OAuth 2.0 and provides full access to your Google Calendar data.

The tool supports both viewing operations like agenda and calendar displays, and modification operations including creating, editing, and deleting events. Quick add functionality allows natural language event creation, while the structured add command provides precise control over event details.

gcalcli is particularly useful for terminal-centric workflows, automation scripts, and integration with other command-line tools. It can display calendar data in various formats and supports working with multiple calendars simultaneously.

# SEE ALSO

[gcal](/man/gcal)(1), [calcurse](/man/calcurse)(1)

