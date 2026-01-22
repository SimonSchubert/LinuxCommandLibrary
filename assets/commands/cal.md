# TLDR

Display calendar for the **current month**

```cal```

Display **3 months** spanning the current date

```cal -3```

Display the **whole year**

```cal -y```

Display the **next twelve months**

```cal -Y```

Use **Monday** as the first day of the week

```cal -m```

Display a calendar for a **specific year**

```cal [year]```

Display a calendar for a **specific month and year**

```cal [month] [year]```

# SYNOPSIS

**cal** [_options_] [[_month_] _year_]

# DESCRIPTION

**cal** displays a calendar in the terminal with the current day highlighted. It can show single months, multiple months, or entire years.

By default, Sunday is shown as the first day of the week. Use **-m** to start weeks on Monday.

# PARAMETERS

**-3, --three**
> Display previous, current, and next month

**-y, --year**
> Display calendar for the current year

**-Y, --twelve**
> Display the next twelve months

**-m, --monday**
> Use Monday as the first day of the week

**-s, --sunday**
> Use Sunday as the first day of the week (default)

**-j, --julian**
> Display Julian days (day of year)

**-n** _num_
> Display _num_ months starting from current

# SEE ALSO

[ncal](/man/ncal)(1), [date](/man/date)(1), [calcurse](/man/calcurse)(1)
