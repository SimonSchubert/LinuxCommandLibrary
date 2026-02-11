# TAGLINE

Sound server for Linux desktop audio

# TLDR

**Check** if running

```pulseaudio --check```

**Start** daemon

```pulseaudio --start```

**Kill** daemon

```pulseaudio -k```

List available **modules**

```pulseaudio --dump-modules```

**Load** a module

```pulseaudio -L "[module_name] [args]"```

# SYNOPSIS

**pulseaudio** [**--start**] [**-k**|**--kill**] [**--check**] [**-L** _module_]

# PARAMETERS

**--start**
> Start the daemon in background

**-k, --kill**
> Kill the running daemon

**--check**
> Check if daemon is running (exit code)

**--dump-modules**
> List available modules

**-L, --load _module_**
> Load a module into running daemon

**--dump-conf**
> Dump default configuration

**-D, --daemonize**
> Daemonize after startup

# DESCRIPTION

**pulseaudio** is a sound server that provides a software mixing layer between applications and audio hardware. It allows multiple applications to share audio devices and provides features like per-application volume control.

The daemon runs per-user and is typically started automatically by desktop sessions. It supports network audio streaming and various audio processing modules.

# CONFIGURATION

**~/.config/pulse/default.pa**
> Per-user startup script that loads modules, sets default sinks/sources, and configures audio routing.

**/etc/pulse/daemon.conf**
> System-wide daemon settings controlling sample rate, buffer sizes, resampling method, and resource limits.

**/etc/pulse/default.pa**
> System-wide startup script defining which modules to load and their configuration.

# CAVEATS

Being replaced by PipeWire on modern systems. May conflict with JACK for pro audio. User daemon, not system-wide by default. Configuration in ~/.config/pulse/.

# HISTORY

**PulseAudio** was created by **Lennart Poettering** at Red Hat to provide a modern sound server for Linux desktops. It became the default audio system for most distributions before PipeWire emerged as its successor.

# SEE ALSO

[pactl](/man/pactl)(1), [pavucontrol](/man/pavucontrol)(1), [pipewire](/man/pipewire)(1)
