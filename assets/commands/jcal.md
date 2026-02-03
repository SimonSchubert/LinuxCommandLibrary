# TLDR

**Display current month**

```jcal```

**Display three months**

```jcal -3```

**Display specific year**

```jcal [1402]```

**Display specific month and year**

```jcal [1402] [5]```

**Display full year**

```jcal -y [1402]```

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
> Display Julian days.

# DESCRIPTION

**jcal** displays a calendar in the Jalali (Persian) format, similar to Unix **cal** for Gregorian calendars. The Jalali calendar is a solar calendar used in Iran and Afghanistan. Part of the jcal/libjalali package. Current day is highlighted.

# SEE ALSO

[jdate](/man/jdate)(1), [cal](/man/cal)(1)

