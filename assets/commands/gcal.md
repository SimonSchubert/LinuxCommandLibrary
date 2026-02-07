# TAGLINE

advanced calendar with holiday calculations

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

**gcal** is a feature-rich calendar program that goes far beyond simple date display. Unlike the standard cal utility, gcal supports extensive customization including week numbering, configurable week start days, and multi-month displays.

One of gcal's most powerful features is its holiday calculation capability, which can display holidays for various countries and religious traditions. The program also supports astronomical data, eternal holiday lists, and various international calendar systems.

gcal is highly scriptable and can be used for complex date calculations, making it valuable for both interactive use and automation tasks that require sophisticated calendar operations.

# SEE ALSO

[cal](/man/cal)(1), [ncal](/man/ncal)(1)

