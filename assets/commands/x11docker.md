# TLDR

**Run GUI app**

```x11docker [image] [command]```

**With GPU acceleration**

```x11docker --gpu [image] [command]```

**Share home directory**

```x11docker --home [image]```

**With audio**

```x11docker --pulseaudio [image]```

**Clipboard sharing**

```x11docker --clipboard [image]```

# SYNOPSIS

**x11docker** [_--gpu_] [_--home_] [_--pulseaudio_] [_options_] _image_ [_command_]

# PARAMETERS

**--gpu**
> GPU access.

**--home**
> Share home.

**--pulseaudio**
> Audio support.

**--clipboard**
> Share clipboard.

**--xephyr**
> Use Xephyr.

# DESCRIPTION

**x11docker** runs GUI containers. It handles X11 forwarding.

Docker GUI apps. Secure display.

Multiple backends. Xephyr, Xpra, etc.

Security focused. Isolated display.

Feature-rich. GPU, audio, clipboard.

# CAVEATS

Docker required. X11 setup. May need configuration.

# HISTORY

**x11docker** was created to securely run Docker containers with X11 GUI applications.

# SEE ALSO

[docker](/man/docker)(1), [xhost](/man/xhost)(1), [xephyr](/man/xephyr)(1)
