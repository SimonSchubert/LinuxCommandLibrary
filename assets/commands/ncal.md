# TAGLINE

displays a calendar in a vertical format where weeks run down the screen

# TLDR

This command is an alias of **cal** with vertical calendar layout.

Display **current month** calendar

```ncal```

Display calendar for **specific month and year**

```ncal [month] [year]```

Display **entire year** calendar

```ncal -y [year]```

# SYNOPSIS

**ncal** [**-y**] [**-3**] [**-1**] [**-A** _months_] [**-B** _months_] [[_month_] _year_]

# PARAMETERS

**-y**
> Display entire year.

**-3**
> Display previous, current, and next month.

**-1**
> Display only current month.

**-A** _months_
> Display months after current.

**-B** _months_
> Display months before current.

**-h**
> Turn off highlighting of today.

**-M**
> Weeks start on Monday.

**-S**
> Weeks start on Sunday.

**-b**
> Use horizontal layout (like cal).

# DESCRIPTION

**ncal** displays a calendar in a vertical format where weeks run down the screen. It is an alternative interface to the **cal** command, which displays calendars horizontally.

The vertical format is useful for terminals with limited width or when comparing dates across weeks. Both ncal and cal are typically provided by the same package on most systems.

# CAVEATS

Available on BSD-derived systems. Some Linux distributions may not include ncal or may alias it to cal. The **-b** flag switches to the traditional horizontal cal layout.

# SEE ALSO

[cal](/man/cal)(1)
