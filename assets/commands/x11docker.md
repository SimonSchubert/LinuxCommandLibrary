# TAGLINE

Run GUI Docker containers securely

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

**x11docker** runs graphical applications from Docker containers with secure X11 display forwarding. It provides isolated display access using multiple backends including Xephyr, Xpra, and nxagent, preventing containers from accessing the host's X server directly.

The tool supports GPU hardware acceleration, PulseAudio integration, and clipboard sharing between the container and host. This security-focused approach allows running untrusted GUI applications in containers while maintaining display isolation from the host desktop environment.

# CAVEATS

Docker required. X11 setup. May need configuration.

# HISTORY

**x11docker** was created to securely run Docker containers with X11 GUI applications.

# SEE ALSO

[docker](/man/docker)(1), [xhost](/man/xhost)(1), [xephyr](/man/xephyr)(1)
