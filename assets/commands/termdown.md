# TAGLINE

Terminal countdown timer and stopwatch

# TLDR

**Countdown timer**

```termdown [5m]```

**Countdown to time**

```termdown [14:30]```

**With title**

```termdown -t "[Break time]" [10m]```

**Blink at end**

```termdown -b [5m]```

**Play sound at end**

```termdown -v [alarm.wav] [5m]```

**Critical time warning**

```termdown -c [30] [5m]```

# SYNOPSIS

**termdown** [_-t title_] [_-b_] [_-v file_] [_options_] _time_

# PARAMETERS

**-t** _TITLE_
> Title text.

**-b**
> Blink at zero.

**-v** _FILE_
> Sound file.

**-c** _SEC_
> Critical threshold.

**-f** _FONT_
> Figlet font.

**-s**
> Stopwatch mode.

# DESCRIPTION

**termdown** displays countdown timers and stopwatches in the terminal using large figlet-style text for high visibility. It accepts time in various formats including seconds, minutes (e.g., **5m**), hours (e.g., **1h30m**), or a specific target time (e.g., **14:30**).

The timer can play a sound file when it reaches zero, blink the display, and show a custom title. A critical threshold option changes the display color when time is running low. The **-s** flag switches to stopwatch mode, counting upward instead of down.

# CAVEATS

Terminal display only. Figlet fonts optional. No background running.

# HISTORY

**termdown** was created as a terminal countdown timer with large figlet-style display for visibility.

# SEE ALSO

[timer](/man/timer)(1), [figlet](/man/figlet)(1), [watch](/man/watch)(1)
