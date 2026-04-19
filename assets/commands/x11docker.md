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
> Enable hardware OpenGL acceleration.

**--home**
> Provide a persistent per-container home directory on the host.

**--pulseaudio**
> Enable PulseAudio sound support.

**--alsa**
> Enable ALSA sound support.

**--pipewire**
> Enable PipeWire sound support.

**--clipboard**
> Share clipboard between host and container.

**--desktop**
> Run a full desktop environment rather than a single application.

**--xephyr**
> Use the Xephyr nested X server (default fallback).

**--xpra**
> Use Xpra as the X server backend.

**--nxagent**
> Use nxagent as the X server backend.

**--wayland**
> Run in a Wayland compositor.

**--hostdisplay**
> Share the host X socket (less secure, fallback).

**--share** _PATH_
> Share a host file or folder with the container.

**--network**, **-I**
> Allow network access from the container.

**--init** _SYSTEM_
> Use an init system (e.g., systemd, runit, tini).

**--backend** _BACKEND_
> Choose container backend: docker, podman, or host.

**--webcam**
> Share webcams with the container.

**--printer**
> Share host CUPS printers.

**--user** _USER_
> Run the container as a specific user.

# DESCRIPTION

**x11docker** runs graphical applications from Docker containers with secure X11 display forwarding. It provides isolated display access using multiple backends including Xephyr, Xpra, and nxagent, preventing containers from accessing the host's X server directly.

The tool supports GPU hardware acceleration, PulseAudio integration, and clipboard sharing between the container and host. This security-focused approach allows running untrusted GUI applications in containers while maintaining display isolation from the host desktop environment.

# CAVEATS

Requires Docker or Podman. At least one nested X server backend (Xephyr, Xpra, nxagent, or Xwayland) must be installed on the host. Using **--hostdisplay** reduces isolation. GPU acceleration requires compatible drivers inside the container.

# HISTORY

**x11docker** was created by **Martin Viereck** to run Docker containers with GUI applications while preserving host security. It predates modern Wayland-native container workflows and remains a widely-used solution for desktop containerization.

# SEE ALSO

[docker](/man/docker)(1), [xhost](/man/xhost)(1), [xephyr](/man/xephyr)(1)
