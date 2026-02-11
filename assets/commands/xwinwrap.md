# TAGLINE

Run programs as desktop background

# TLDR

Run **video** as background

```xwinwrap -b -nf -ov -- mpv --wid wid --loop --no-audio --no-resume-playback --panscan=1.0 [path/to/video.mp4]```

Run video **fullscreen**

```xwinwrap -b -nf -fs -ov -- mpv --wid wid --loop --no-audio --no-resume-playback --panscan=1.0 [path/to/video.mp4]```

Run with **opacity**

```xwinwrap -b -nf -ov -o 0.8 -- mpv --wid wid --loop --no-audio --no-resume-playback --panscan=1.0 [path/to/video.mp4]```

Run on **specific** monitor

```xwinwrap -g 1600x900+1920 -b -nf -ov -- mpv --wid wid --loop --no-audio --no-resume-playback --panscan=1.0 [path/to/video.mkv]```

# SYNOPSIS

**xwinwrap** [_OPTIONS_] -- _COMMAND_

# PARAMETERS

**-b**
> Below other windows

**-nf**
> No focus

**-fs**
> Fullscreen

**-ov**
> Set override redirect

**-o** _OPACITY_
> Set opacity (0.0 to 1.0)

**-g** _GEOMETRY_
> Window geometry (WxH+X+Y)

**wid**
> Window ID placeholder for child process

# DESCRIPTION

**xwinwrap** runs a program as a desktop background window. It creates a window behind all others and passes its window ID to the child program, enabling video wallpapers and animated backgrounds.

Commonly used with mpv to play videos as desktop backgrounds.

# CAVEATS

X11 only. May not work with all window managers or compositors. Child process must support window ID parameter.

# SEE ALSO

[mpv](/man/mpv)(1), [feh](/man/feh)(1)
