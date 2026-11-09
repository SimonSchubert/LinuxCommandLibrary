# TAGLINE

Text-based audio player and music visualizer

# TLDR

**Open the file selector**

```ocp```

**Play a music file**

```ocp [path/to/file]```

**Play a playlist**

```ocp @[path/to/playlist.m3u]```

Play with a specific **display driver**

```ocp -d[curses|x11|vcsa|sdl2] [path/to/file]```

**Quit** when the playlist is empty

```ocp -p [path/to/file]```

**Render a module to disk**

```ocp -fl0,r1 -vf2 -spdevpdisk -sr48000 [path/to/file.xm]```

# SYNOPSIS

**ocp** [_options_] [@_playlist_...] [_file_...]

# PARAMETERS

**-h**
> Show help.

**-c**_NAME_
> Use a specific configuration.

**-f**_SETTINGS_
> File selector settings, comma-separated: **r**0|1 remove played files from the list, **o**0|1 do not scramble list order, **l**0|1 loop modules.

**-v**_SETTINGS_
> Sound settings: **a**0..800 amplification, **v**0..100 volume, **b**-100..100 balance, **p**-100..100 panning, **r**-100..100 reverb, **c**-100..100 chorus, **s**0|1 surround, **f**0..2 filter (0 off, 1 AOI, 2 FOI).

**-s**_SETTINGS_
> Device settings: **p**_name_ player device, **w**_name_ wavetable device, **r**0..64000 sample rate, **8** 8-bit, **m** mono.

**-p**
> Quit when the playlist is empty.

**-d**_DRIVER_
> Force a display driver: curses, x11, vcsa, sdl, sdl2 or sdl3, depending on the build.

# DESCRIPTION

**opencubicplayer** (command: **ocp**) is a text-based audio player and music visualizer supporting tracked music formats (MOD, XM, S3M, IT), chiptunes, SID, MP3, OGG, FLAC, and more. It features FFT analyzer, oscilloscope, phase viewer, and channel viewer visualizations.

Originally from the demoscene era on DOS, the Unix/Linux fork maintains the classic text-mode interface with modern codec support. Output can go through ncurses, the Linux console (VCSA and framebuffer), X11 or SDL.

In the player, press **F1** for the built-in help browser and **Alt+k** to list the keys for the current view. **Alt+c** configures the file selector.

# CAVEATS

Available display drivers depend on how the program was built. Some extra graphical effects are only available with SDL output.

# HISTORY

**Open Cubic Player** was written by **Niklas Beisert** for DOS. The Unix fork is maintained by **Stian Sebastian Skjelstad** (mywave82) and is written in **C**.

# SEE ALSO

[cmus](/man/cmus)(1), [mpv](/man/mpv)(1), [musikcube](/man/musikcube)(1)

# RESOURCES

```[Source code](https://github.com/mywave82/opencubicplayer)```

```[Homepage](https://stian.cubic.org/project-ocp.php)```

<!-- verified: 2026-11-09 -->
