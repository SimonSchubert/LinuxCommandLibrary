# TAGLINE

Paced resonance breathing pacer for the terminal

# TLDR

**Start a session** with an automatic time-of-day preset

```breathe```

**Use a named preset** (balanced, calm, extended)

```breathe --preset calm```

**Run a 5-minute custom session** with a 4 second inhale and 6 second exhale

```breathe --duration 5 --ratio 4-6```

**Silent mode**, no audio cues and no startup warnings

```breathe --no-sound --quiet```

**Skip logging** the current session to the CSV log

```breathe --no-log```

**List all built-in presets**

```breathe --list-presets```

**Print the log file path** and exit

```breathe --log```

**Show safety information** before starting

```breathe --safety```

# SYNOPSIS

**breathe** [_-p preset_] [_-d minutes_] [_-r in-ex_] [_-n_] [_-q_] [_--no-log_] [_--log_] [_--safety_] [_--list-presets_] [_--version_]

# PARAMETERS

**-p**, **--preset** _NAME_
> Use a named preset. Valid values: **balanced**, **calm**, **extended**.

**-d**, **--duration** _MINUTES_
> Session length in minutes (1 to 60).

**-r**, **--ratio** _IN-EX_
> Inhale and exhale timing in seconds, written as _IN-EX_ (for example **5-5** or **4-6**).

**-n**, **--no-sound**
> Disable audio cues.

**-q**, **--quiet**
> Suppress startup warnings.

**--no-log**
> Do not append this session to the CSV log.

**--log**
> Print the log file path and exit.

**--safety**
> Display safety information about paced breathing and exit.

**--list-presets**
> Show the table of built-in presets and exit.

**--version**
> Display the version number.

# PRESETS

**balanced**
> 10 minutes, 5 second inhale, 5 second exhale (6 breaths per minute).

**calm**
> 15 minutes, 4 second inhale, 6 second exhale (6 breaths per minute).

**extended**
> 20 minutes, 4 second inhale, 6 second exhale (6 breaths per minute).

# DESCRIPTION

**breathe** is a single-file Python terminal application that guides the user through paced resonance breathing exercises, targeting about 6 breaths per minute as a vagal-tone training rhythm. It draws a moving bar pacer using direct ANSI escape codes (no curses), plays optional audio cues, and logs each completed session to a CSV file.

When run without arguments, **breathe** picks a preset based on the time of day. The **--preset**, **--duration**, and **--ratio** flags override the defaults so the user can configure session length and inhale-to-exhale ratio independently.

# RUNTIME CONTROLS

**space**
> Pause and resume the current session.

**s**
> Toggle audio cues on or off.

**q**, **Ctrl+C**
> Quit the current session.

# CONFIGURATION

**~/.breathe_log.csv**
> Session log written after every completed session. Columns: date, time, preset, ratio, target duration, actual duration, breath count, completion percentage, and status.

# CAVEATS

Paced breathing is a wellness exercise, not a medical treatment. The bundled **--safety** screen warns against use while driving, operating machinery, or when light-headed. Audio cues require a working terminal bell or system audio; on minimal terminals **--no-sound** may be the only sensible mode.

# HISTORY

**breathe** was written by **Marek Kowalczyk** and released in 2026 as an MIT-licensed, single-file Python tool. It is distributed through PyPI and a Homebrew tap, and can also be run directly as **breathe.py**.

# SEE ALSO

[python](/man/python)(1), [sleep](/man/sleep)(1), [watch](/man/watch)(1)
