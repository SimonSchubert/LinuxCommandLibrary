# TLDR

**Launch** silentcast

```silentcast```

Launch on a **specific display**

```silentcast --display=[display]```

# SYNOPSIS

**silentcast** [**--display**=_display_]

# PARAMETERS

**--display** _display_
> Specify the X display to record from

# DESCRIPTION

**silentcast** creates silent video screencasts in MKV format and animated GIFs. It provides a graphical interface for recording screen activity without audio, making it ideal for creating tutorials, documentation, or demonstrations.

The workflow involves launching the application, positioning the green recording rectangle over the desired window or area, pressing Return to start recording, and clicking the system tray icon to stop. Recordings can be processed into animated GIFs or edited as needed.

# CAVEATS

Cannot run multiple instances simultaneously. Does not support recording its own interface. Requires GTK3, FFmpeg, and ImageMagick as dependencies. Some desktop environments (KDE Plasma 5, i3wm) may require special keyboard shortcut configuration for proper operation.

# HISTORY

**silentcast** was created by **Colin Keenan** as an open-source screen recording tool. Version 3.0 introduced a completely redesigned GUI interface. The project is released under the GPL-3.0 license and maintained on GitHub.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [byzanz-record](/man/byzanz-record)(1), [recordmydesktop](/man/recordmydesktop)(1), [peek](/man/peek)(1)
