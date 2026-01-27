# TLDR

**Start spotifyd** with default configuration

```spotifyd```

**Start without daemonizing** (foreground mode)

```spotifyd --no-daemon```

**Start with a specific configuration file**

```spotifyd --config-path [~/.config/spotifyd/spotifyd.conf]```

**Start with verbose logging**

```spotifyd --verbose```

**Show device name** in Spotify Connect

```spotifyd --device-name "[My Linux PC]"```

# SYNOPSIS

**spotifyd** [_options_]

# PARAMETERS

**--no-daemon**
> Run in the foreground instead of daemonizing.

**-c**, **--config-path** _path_
> Path to configuration file.

**--verbose**
> Enable verbose logging output.

**--device-name** _name_
> Name displayed in Spotify Connect device list.

**--device-type** _type_
> Device type (computer, tablet, smartphone, speaker, tv, avr, stb, audiodongle).

**--bitrate** _rate_
> Audio bitrate: 96, 160, or 320 kbps.

**--backend** _backend_
> Audio backend: pulseaudio, alsa, rodio, portaudio.

**--device** _device_
> Audio device name for playback.

**--mixer** _mixer_
> Mixer to use for volume control.

**--initial-volume** _percent_
> Initial volume (0-100).

**--volume-normalisation**
> Enable volume normalization.

**--cache-path** _path_
> Path to cache directory.

**--username** _username_
> Spotify username.

**--password** _password_
> Spotify password (prefer config file for security).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**spotifyd** is a lightweight Spotify daemon that implements the Spotify Connect protocol. It runs as a background service on Linux, macOS, and other Unix-like systems, appearing as a controllable device in the Spotify ecosystem.

Unlike the full Spotify desktop client, spotifyd has no graphical interface and minimal resource usage. It can be controlled from any Spotify client (mobile app, web player, or desktop app) using Spotify Connect. For local control, it pairs well with terminal interfaces like **spotify-tui** (spt).

Configuration is typically done via a file at **~/.config/spotifyd/spotifyd.conf** containing credentials and playback settings. A Spotify Premium account is required for streaming.

# CAVEATS

Requires Spotify Premium for playback. Authentication may require OAuth setup in recent versions due to Spotify API changes. The daemon must be running for Spotify Connect to see the device. Audio backend availability depends on system configuration and compile-time options. Storing credentials in config files has security implications.

# HISTORY

**spotifyd** was created as an open-source alternative to the official Spotify client for users who wanted lightweight, headless Spotify playback. It's built on **librespot**, a reverse-engineered Spotify client library. The project gained popularity for running Spotify on servers, Raspberry Pi devices, and systems where the full client is impractical. Development continues with community contributions.

# SEE ALSO

[spotify-tui](/man/spotify-tui)(1), [ncspot](/man/ncspot)(1), [mopidy](/man/mopidy)(1)
