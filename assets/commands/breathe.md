# TAGLINE

Paced resonance breathing pacer for the terminal

# TLDR

**Start a session** with an automatic time-of-day preset

```breathe```

**Use a named preset** (morning, midday, evening, night)

```breathe --preset night```

**Use goal words** for a quick 3-minute calming session (4-6 ratio)

```breathe quick calm```

**Run a 5-minute custom session** with a 4 second inhale and 6 second exhale

```breathe --duration 5 --ratio 4-6```

**Silent mode**, no audio cues and no startup warnings

```breathe --no-sound --quiet```

**Skip logging** the current session to the CSV log

```breathe --no-log```

**List built-in presets** and goal words

```breathe --list-presets```

**Print the log file path** and exit

```breathe --log```

**Show safety information** and exit

```breathe --safety```

# SYNOPSIS

**breathe** [_-p preset_] [_-d minutes_] [_-r in-ex_] [_-n_] [_--sound-player cmd_] [_-q_] [_--no-log_] [_--log_] [_--safety_] [_--list-presets_] [_-v_]

**breathe** [_quick_|_long_] [_train_|_calm_|_sleep_]

# PARAMETERS

**-p**, **--preset** _NAME_
> Use a named preset. Valid values: **morning**, **midday**, **evening**, **night**.

**-d**, **--duration** _MINUTES_
> Session length in minutes (1 to 60, rounded up to complete breath cycles). Default 10.

**-r**, **--ratio** _IN-EX_
> Inhale and exhale timing in seconds, written as _IN-EX_ (for example **5-5** or **4-6**). Each phase 3 to 10 seconds, total cycle at least 8 seconds. Default 5-5.

**-n**, **--no-sound**
> Disable audio cues.

**--sound-player** _CMD_
> Linux audio player command (auto-detected from **paplay**, **pw-play**, **aplay**, **ffplay**, **cvlc**).

**-q**, **--quiet**
> Suppress startup warnings.

**--no-log**
> Do not append this session to the CSV log.

**--log**
> Print the log file path and exit.

**--safety**
> Display safety information about paced breathing and exit.

**--list-presets**
> Show the built-in presets and goal words, then exit.

**-v**, **--version**
> Display the version number.

# PRESETS

All presets target 6 breaths per minute. Without arguments, the preset is chosen by time of day.

**morning** (06:00 to 11:59)
> 10 minutes, 5 second inhale, 5 second exhale.

**midday** (12:00 to 16:59)
> 20 minutes, 4 second inhale, 6 second exhale.

**evening** (17:00 to 21:59)
> 15 minutes, 4 second inhale, 6 second exhale.

**night** (22:00 to 05:59)
> 20 minutes, 3 second inhale, 7 second exhale.

# GOAL WORDS

Order-free shorthand; each word sets one axis and cannot be combined with flags.

**quick**, **long**
> Duration of 3 or 20 minutes.

**train**, **calm**, **sleep**
> Ratio of 5-5, 4-6 or 3-7.

# DESCRIPTION

**breathe** is a single-file Python terminal application that guides the user through paced resonance breathing exercises, targeting about 6 breaths per minute as a vagal-tone training rhythm. It draws a moving bar pacer using direct ANSI escape codes (no curses), plays optional audio cues, and logs each completed session to a CSV file.

When run without arguments, **breathe** picks a preset based on the time of day. The **--preset**, **--duration**, and **--ratio** flags override the defaults so the user can configure session length and inhale-to-exhale ratio independently.

# RUNTIME CONTROLS

**space**
> Pause and resume the current session (resume restarts at the inhale).

**s**
> Toggle audio cues on or off.

**q**, **Ctrl+C**
> Quit immediately; the terminal is always restored.

# CONFIGURATION

**~/.breathe_log.csv**
> Session log written after every completed session. Columns: date, time, preset, ratio, target duration, actual duration, breath count, completion percentage, and status.

**BREATHE_SOUND_PLAYER**, **BREATHE_SOUND_INHALE**, **BREATHE_SOUND_EXHALE**
> Override the Linux audio player and the inhale/exhale cue files (default: freedesktop **message.oga** and **complete.oga**).

# CAVEATS

macOS is the primary platform (audio via **afplay**); Linux and Windows are community-tested only, and fall back to the terminal bell when no player or sound file is found. Breath holds (e.g. **4-7-8**) and cycles faster than 7.5 breaths per minute are rejected by design. Paced breathing is a wellness exercise, not a medical treatment. Stop immediately on light-headedness, palpitations, or tingling in the hands or face; see **--safety** for the full screen.

# HISTORY

**breathe** was written by **Marek Kowalczyk** and released in 2026 as an MIT-licensed, single-file Python tool with no dependencies beyond the standard library. It is distributed on PyPI as **breathe-cli** and through a Homebrew tap, and can also be run directly as **breathe.py**. It is unrelated to the Sphinx extension of the same name.

# SEE ALSO

[python](/man/python)(1), [sleep](/man/sleep)(1), [watch](/man/watch)(1)

# RESOURCES

```[Source code](https://github.com/marekkowalczyk/breathe-cli)```

```[Homepage](https://marekkowalczyk.github.io/breathe-cli/)```

<!-- verified: 2026-11-23 -->
