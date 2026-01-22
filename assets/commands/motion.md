# TLDR

**Start motion detection**

```motion```

**Use specific config file**

```motion -c [/etc/motion/motion.conf]```

**Run in foreground**

```motion -n```

**Run as daemon**

```motion -b```

**Log to specific file**

```motion -l [/var/log/motion.log]```

**Set process ID file**

```motion -p [/var/run/motion.pid]```

# SYNOPSIS

**motion** [_options_]

# PARAMETERS

**-c** _FILE_
> Configuration file path.

**-n**
> Run in foreground (no daemon).

**-b**
> Run as background daemon.

**-l** _FILE_
> Log file location.

**-p** _FILE_
> PID file location.

**--help**
> Display help information.

# DESCRIPTION

**motion** is a video motion detection software. It monitors camera feeds for movement.

The tool captures images and video when motion detected. Supports multiple cameras and streaming.

motion is video motion detector.

# CAVEATS

CPU intensive. Requires camera access. Configuration complex for advanced setups.

# HISTORY

motion was created as an **open source** motion detection system for Linux security and surveillance applications.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [v4l2-ctl](/man/v4l2-ctl)(1), [vlc](/man/vlc)(1)

