# TAGLINE

Detect motion using a video4linux device or network camera

# TLDR

**Start motion detection with default config**

```motion```

**Use a specific config file**

```motion -c [/etc/motion/motion.conf]```

**Run in foreground (non-daemon mode)**

```motion -n```

**Run as a background daemon**

```motion -b```

**Run with verbose logging at a specific level**

```motion -d [1-9]```

**Log to a specific file**

```motion -l [/var/log/motion.log]```

**Start in pause mode (motion detection disabled until activated)**

```motion -m```

**Set process ID file**

```motion -p [/var/run/motion.pid]```

# SYNOPSIS

**motion** [**-hbnsm**] [**-c** _config_file_] [**-d** _level_] [**-k** _level_] [**-p** _pid_file_] [**-l** _log_file_]

# PARAMETERS

**-c** _FILE_
> Specifies the path to the configuration file.

**-n**
> Run in non-daemon mode (foreground).

**-b**
> Run as a background daemon.

**-s**
> Enable setup mode; forces non-daemon execution.

**-d** _level_
> Set debug verbosity level from 1 to 9.

**-k** _level_
> Set message log type from 1 to 9.

**-l** _FILE_
> Specify the log file path.

**-p** _FILE_
> Specify the process ID file location.

**-m**
> Start in pause mode (motion detection initially disabled).

**-h**
> Display help information.

# DESCRIPTION

**motion** is a program that detects motion using a Video4Linux device or network camera. It monitors video feeds for movement and can capture images and video sequences when activity is detected, as well as execute automated actions for notifications or snapshots.

The tool supports multiple cameras, live streaming, and configurable motion detection sensitivity. Command-line arguments override corresponding settings in configuration files.

# CAVEATS

Can be CPU intensive depending on camera resolution and detection settings. Requires camera access (Video4Linux or network camera). Configuration can become complex for multi-camera and advanced detection setups.

# HISTORY

motion was created as an **open source** motion detection system for Linux security and surveillance applications. It uses the Video4Linux interface and has been widely adopted for home security and wildlife monitoring.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [v4l2-ctl](/man/v4l2-ctl)(1), [vlc](/man/vlc)(1), [fswebcam](/man/fswebcam)(1), [streamer](/man/streamer)(1)

