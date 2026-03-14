# TAGLINE

displays a calendar in the Jalali format, similar to Unix **cal**

# TLDR

**Display current month**

```jcal```

**Display three months**

```jcal -3```

**Display specific year**

```jcal [1402]```

**Display specific month and year**

```jcal [5] [1402]```

**Display full year**

```jcal -y```

**Display with Farsi numbers and names**

```jcal -p```

**Display with English weekday names**

```jcal -e```

# SYNOPSIS

**jcal** [_options_] [[_month_] _year_]

# PARAMETERS

**-1**
> Display single month (default).

**-3**
> Display previous, current, and next month.

**-y**
> Display entire year.

**-j**
> Display Julian days (days numbered from Farvardin 1).

**-p**
> Display Farsi numbers and names.

**-P**
> Display year based on Pahlavi epoch.

**-e**
> Display English names for weekdays.

**-V**
> Display version.

# DESCRIPTION

**jcal** displays a calendar in the Jalali (Persian) format, similar to Unix **cal** for Gregorian calendars. The Jalali calendar is a solar calendar used in Iran and Afghanistan. Part of the jcal/libjalali package. Current day is highlighted.

A single parameter specifies the year (1-9999). Two parameters denote the month (1-12) and year. The year must be fully specified: "jcal 90" will not display a calendar for 1390.

# SEE ALSO

[cal](/man/cal)(1)

