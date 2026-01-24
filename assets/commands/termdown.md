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

**termdown** shows countdown timers. It runs in terminal.

Large figlet display. Easy to see.

Multiple time formats. Minutes, seconds, time.

Sound support. Alert when done.

Stopwatch mode. Count up.

# CAVEATS

Terminal display only. Figlet fonts optional. No background running.

# HISTORY

**termdown** was created as a terminal countdown timer with large figlet-style display for visibility.

# SEE ALSO

[timer](/man/timer)(1), [figlet](/man/figlet)(1), [watch](/man/watch)(1)
