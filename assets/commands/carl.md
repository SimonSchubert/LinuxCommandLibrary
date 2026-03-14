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

**Display** previous, current, and next month

```carl -3```

**Display** with agenda listing events

```carl -a```

**Display** Julian day numbers

```carl -j```

# SYNOPSIS

**carl** [_options_]

# PARAMETERS

**-m** _MONTH_
> Display a specific month (1-12).

**-y** _YEAR_
> Display a specific year.

**-w**
> Show ISO week numbers.

**-1, --one**
> Display single month output (default).

**-3, --three**
> Display previous, current, and next month.

**-n, --months** _NUMBER_
> Display current and following months.

**-s, --sunday**
> Display Sunday as first day of week.

**-j, --julian**
> Display Julian dates (days numbered from January 1).

**-a, --agenda**
> Display event agenda below the calendar.

**--theme** _THEME_
> Set the color theme.

**--themestyletype** _TYPE_
> Use "dark" or "light" background theme styles.

# DESCRIPTION

**carl** is a command-line calendar tool written in Rust that displays colorful, formatted calendars in the terminal. It tries to mimic various cal(1) implementations but adds enhanced features like colors and iCal support. The output uses colors and formatting for improved readability compared to the traditional **cal** command.

Carl can display single months, multiple months, full years, and highlight the current date. iCal files are configured via a config file (config.toml) using `[[ical]]` sections, and event dates are highlighted in the calendar view. The `--agenda` flag lists event summaries below the calendar.

# CAVEATS

iCal support covers basic events but may not handle all recurrence rules or complex calendar features. Color output requires a terminal with ANSI color support.

# SEE ALSO

[cal](/man/cal)(1), [calcurse](/man/calcurse)(1), [calcure](/man/calcure)(1)
