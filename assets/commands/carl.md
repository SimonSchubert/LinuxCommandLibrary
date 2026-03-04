# TAGLINE

Command-line calendar with color and iCal support

# TLDR

**Display** the current month

```carl```

**Display** a specific month and year

```carl -m [3] -y [2024]```

**Display** the entire year

```carl -y [2024]```

**Display** with week numbers

```carl -w```

**Load** events from an iCal file

```carl --ical [path/to/calendar.ics]```

# SYNOPSIS

**carl** [_options_]

# PARAMETERS

**-m** _MONTH_
> Display a specific month (1-12).

**-y** _YEAR_
> Display a specific year.

**-w**
> Show ISO week numbers.

**--ical** _FILE_
> Load events from an iCal (.ics) file.

**--theme** _THEME_
> Set the color theme.

# DESCRIPTION

**carl** is a command-line calendar tool that displays colorful, formatted calendars in the terminal. It supports loading and displaying events from **iCal** (.ics) files, highlighting dates with events. The output uses colors and formatting for improved readability compared to the traditional **cal** command.

Carl can display single months, full years, and highlight the current date. When iCal files are loaded, event dates are marked in the calendar view.

# CAVEATS

iCal support covers basic events but may not handle all recurrence rules or complex calendar features. Color output requires a terminal with ANSI color support.

# SEE ALSO

[cal](/man/cal)(1), [calcurse](/man/calcurse)(1), [calcure](/man/calcure)(1)
