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

# DESCRIPTION

**gcalcli** provides command-line access to Google Calendar. View, create, edit, and delete events from the terminal.

# SEE ALSO

[gcal](/man/gcal)(1), [calcurse](/man/calcurse)(1)

