# TLDR

**Show current month**

```gcal```

**Show specific month**

```gcal [3] [2024]```

**Show entire year**

```gcal [2024]```

**Show with week numbers**

```gcal -K```

**Show holidays**

```gcal -q [US]```

**Show 3 months centered on current**

```gcal .```

# SYNOPSIS

**gcal** [_options_] [_date_]

# PARAMETERS

**-K**
> Show week numbers.

**-q** _country_
> Show country holidays.

**-b** _number_
> Months before current.

**-a** _number_
> Months after current.

**-s** _day_
> Start of week (0=Sunday).

**--today**
> Highlight today.

# DESCRIPTION

**gcal** displays calendars with extensive formatting options. Supports holiday calculations, astronomical data, and various calendar systems. More feature-rich than cal.

# SEE ALSO

[cal](/man/cal)(1), [ncal](/man/ncal)(1)

