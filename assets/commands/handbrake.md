# TAGLINE

GTK graphical interface for the HandBrake video transcoder

# TLDR

**Launch the HandBrake GUI**

```ghb```

**Open a video file directly in the GUI**

```ghb [video.mkv]```

**Open the GUI with a preset preselected**

```ghb --preset="[Fast 1080p30]"```

**Load a DVD/Blu-ray device or directory**

```ghb --device [/dev/dvd]```

**Automatically start the encode queue on launch**

```ghb --auto-start-queue [video.mkv]```

**Enable verbose debug logging to the terminal**

```ghb --debug --console```

# SYNOPSIS

**ghb** [_options_] [_file_]

# PARAMETERS

**-d**, **--device** _file_
> Device, directory, or file to load for encoding on startup.

**-p**, **--preset** _name_
> Preset to select on startup.

**-x**, **--debug**
> Enable verbose (debug-level) logging.

**-c**, **--console**
> Write debug output to the console instead of capturing it internally.

**-o**, **--config** _dir_
> Override the user configuration directory.

**--auto-start-queue**
> Automatically start the encode queue on launch.

**--clear-queue**
> Clear previously queued items on launch.

# DESCRIPTION

**HandBrake** is an open-source video transcoder. **ghb** is its native GTK graphical interface, used on Linux to pick sources, choose presets, configure video/audio/subtitle settings, and manage an encode queue interactively.

ghb and [HandBrakeCLI](/man/handbrakecli)(1) share the same underlying libhb encoding engine and preset format: presets built or tweaked in ghb can be exported and reused from HandBrakeCLI for scripted or headless encoding, and vice versa.

On Linux, ghb is installed via the distribution's package (e.g. `handbrake` on Arch, `handbrake-gtk` on Debian/Ubuntu) or as the `fr.handbrake.ghb` Flatpak.

# CAVEATS

Requires a graphical session (GTK4/Wayland or X11); not usable over a plain SSH connection without display forwarding. DVD/Blu-ray decryption requires libdvdcss. Hardware encoding needs a compatible GPU and drivers.

# HISTORY

HandBrake was originally created by **Eric Petit** in **2003** as "MediaFork" for BeOS, later renamed and ported to other platforms. The GTK interface was written for Linux users after the project's revival by the open-source community, and now targets GTK 4.

# SEE ALSO

[handbrakecli](/man/handbrakecli)(1), [ffmpeg](/man/ffmpeg)(1), [vlc](/man/vlc)(1)

# RESOURCES

```[Source code](https://github.com/HandBrake/HandBrake)```

```[Homepage](https://handbrake.fr/)```

```[Documentation](https://handbrake.fr/docs/)```

<!-- verified: 2026-07-17 -->
