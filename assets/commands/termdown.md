# TAGLINE

Terminal countdown timer and stopwatch

# TLDR

**Countdown timer**

```termdown [5m]```

**Countdown to time**

```termdown [14:30]```

**With title displayed above the timer**

```termdown -T "[Break time]" [10m]```

**Blink at end**

```termdown -b [5m]```

**Spoken countdown using text-to-speech**

```termdown -v [Alex] [5m]```

**Critical time warning (last N seconds in red)**

```termdown -c [10] [5m]```

**Stopwatch mode (count up, no time argument)**

```termdown```

**Use alternate colon-separated format**

```termdown -a [5m]```

# SYNOPSIS

**termdown** [_-t text_] [_-b_] [_-v voice_] [_options_] _time_

# PARAMETERS

**-t** _TEXT_, **--text** _TEXT_
> Text to display at end of countdown.

**-b**
> Blink at zero.

**-v** _VOICE_, **--voice** _VOICE_
> Spoken countdown using text-to-speech (requires espeak on Linux or say on macOS).

**-c** _SEC_, **--critical** _SEC_
> Draw final N seconds in red and announce individually with --voice (defaults to 3).

**-f** _FONT_, **--font** _FONT_
> Figlet font name or path to OTF/TTF file.

**-s**, **--no-seconds**
> Don't show seconds until critical threshold.

**-a**, **--alt-format**
> Use colon-separated time format.

**-B**, **--no-bell**
> Don't ring terminal bell at end of countdown.

**-T** _TITLE_, **--title** _TITLE_
> Text to display on top of countdown/stopwatch.

**-q** _N_, **--quit-after** _N_
> Quit N seconds after countdown reaches zero.

**-o** _PATH_, **--outfile** _PATH_
> File to write current remaining/elapsed time to.

**--exec-cmd** _CMD_
> Run CMD every second during countdown.

**--no-figlet**
> Don't use ASCII art for display.

# DESCRIPTION

**termdown** displays countdown timers and stopwatches in the terminal using large figlet-style text for high visibility. It accepts time in various formats including seconds, minutes (e.g., **5m**), hours (e.g., **1h30m**), or a specific target time (e.g., **14:30**).

The timer can use text-to-speech (via espeak or macOS say) for spoken countdown, blink the display, and show a custom title. A critical threshold option changes the display color when time is running low. If no TIME is given, it operates in stopwatch mode and counts upward.

# CAVEATS

Terminal display only. Figlet fonts are optional but recommended for large visible text. The --voice option requires espeak on Linux or say on macOS.

# HISTORY

**termdown** was created as a terminal countdown timer with large figlet-style display for visibility.

# SEE ALSO

[figlet](/man/figlet)(1), [watch](/man/watch)(1), [sleep](/man/sleep)(1)
