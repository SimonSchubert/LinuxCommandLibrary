# TAGLINE

X11 analog and digital clock display

# TLDR

Display **analog** clock

```xclock```

Display **digital** clock (24-hour brief)

```xclock -digital -brief```

Digital with **custom format**

```xclock -digital -strftime [format]```

Digital with **seconds** update

```xclock -digital -strftime '%H:%M:%S' -update 1```

**12-hour** digital clock

```xclock -digital -twelve -brief```

# SYNOPSIS

**xclock** [_OPTIONS_]

# PARAMETERS

**-digital**
> Display digital clock instead of analog

**-brief**
> Show only hours and minutes

**-twelve**
> Use 12-hour format

**-strftime** _FORMAT_
> Custom time format (see strftime)

**-update** _SECONDS_
> Update interval

# DESCRIPTION

**xclock** displays the time in analog or digital form in an X11 window. It can show various time formats and update at configurable intervals.

The analog display shows a traditional clock face. Digital mode supports strftime formatting for custom displays.

# CAVEATS

X11 only. Requires X server running. Part of X.Org utilities.

# SEE ALSO

[date](/man/date)(1), [strftime](/man/strftime)(3)
