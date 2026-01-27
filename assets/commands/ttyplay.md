# TLDR

**Play a recorded session**

```ttyplay [recording.tty]```

**Play at double speed**

```ttyplay -s [2] [recording.tty]```

**Play at half speed**

```ttyplay -s [0.5] [recording.tty]```

**Play without timing delays**

```ttyplay -n [recording.tty]```

**Watch live session from another user**

```ttyplay -p [/path/to/recording.tty]```

# SYNOPSIS

**ttyplay** [_options_] _file_

# PARAMETERS

**-s** _speed_
> Multiply playback speed by factor (default 1).

**-n**
> No-wait mode; ignore timing information.

**-p**
> Peek mode; watch file as it grows (live viewing).

# PLAYBACK CONTROLS

**+** or **f**: Double playback speed.

**-** or **s**: Halve playback speed.

**0**: Pause playback.

**1**: Reset to normal speed.

**Space** or any key: Skip to next input event.

# DESCRIPTION

**ttyplay** replays terminal sessions recorded by ttyrec. It reproduces the exact output with original timing, showing commands, output, and user interactions as they occurred during recording.

The player preserves timing information with microsecond accuracy, making it useful for demonstrations, tutorials, and sharing terminal workflows. Speed controls allow faster review or slower examination of complex sequences.

Peek mode enables live viewing of ongoing recordings, functioning like a read-only terminal sharing system. This is useful for monitoring or demonstrating terminal sessions in real time.

# CAVEATS

Terminal size should match original recording for proper display. Playback assumes compatible terminal capabilities. Very long pauses in original session are preserved unless speed is adjusted. Colors depend on terminal settings.

# HISTORY

**ttyplay** was developed alongside ttyrec as a derivative of the BSD script command with enhanced timing precision. It became popular in the NetHack and roguelike gaming communities for sharing gameplay sessions, where precise timing adds to the viewing experience.

# SEE ALSO

[ttyrec](/man/ttyrec)(1), [ttytime](/man/ttytime)(1), [script](/man/script)(1), [asciinema](/man/asciinema)(1)
