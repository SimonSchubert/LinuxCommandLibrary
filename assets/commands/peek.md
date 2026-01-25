# TLDR

**Start recording**

```peek```

**Record specific window**

```peek --window```

**Record to specific format**

```peek --format [gif|mp4|webm]```

**Record to file**

```peek -o [output.gif]```

# SYNOPSIS

**peek** [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file path.

**--format** _format_
> Output format (gif, mp4, webm, apng).

**--window**
> Select window to record.

**--fullscreen**
> Record full screen.

**--delay** _seconds_
> Delay before recording.

# DESCRIPTION

**peek** is a simple animated GIF screen recorder for Linux. It provides an easy-to-use interface for creating screen recordings, particularly useful for documentation and bug reports.

# EXAMPLES

```bash
# Start peek GUI
peek

# Record as MP4
peek --format mp4

# Record with delay
peek --delay 3 -o demo.gif
```

# KEYBOARD SHORTCUTS

```
Ctrl+R - Start/stop recording
Ctrl+P - Pause/resume
Escape - Cancel
```

# CONFIGURATION

Settings available through GUI:
- Frame rate
- Downscale factor
- Output format
- Recording area

# CAVEATS

GIF files can be large. Wayland support varies. Requires FFmpeg for some formats.

# HISTORY

peek was created by **Philipp Wolfer** as a simple screen-to-GIF recorder for Linux desktops.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [byzanz-record](/man/byzanz-record)(1), [recordmydesktop](/man/recordmydesktop)(1)
