# TAGLINE

sends commands to Kodi media center

# TLDR

**Send action**

```kodi-send --action="[PlayPause]"```

**Send to specific host**

```kodi-send --host=[192.168.1.100] --action="[Stop]"```

**Control volume**

```kodi-send --action="[VolumeUp]"```

**Navigate**

```kodi-send --action="[Up|Down|Left|Right|Select]"```

**Open URL**

```kodi-send --action="PlayMedia([url])"```

# SYNOPSIS

**kodi-send** [_options_]

# PARAMETERS

**--action** _ACTION_
> Action to send.

**--host** _HOST_
> Kodi host address.

**--port** _PORT_
> Kodi port (default 9777).

**--help**
> Display help information.

# DESCRIPTION

**kodi-send** is a command-line tool for remotely controlling a Kodi media center instance over the network. It communicates using the Kodi EventClient UDP protocol on port 9777 by default, sending action commands that simulate remote control button presses, navigation events, and media playback operations.

The tool supports a wide range of built-in Kodi actions including playback control (play, pause, stop, skip), volume adjustment, menu navigation (directional movement and selection), and media loading via URLs or file paths. Because it operates entirely from the command line, kodi-send is well suited for scripting automated media workflows, integrating Kodi with home automation systems, or building custom remote control interfaces.

# CAVEATS

Requires Kodi EventClient enabled. Network access needed. Part of kodi-eventclients.

# HISTORY

kodi-send is part of **Kodi** (formerly XBMC) event client tools for remote media center control.

# SEE ALSO

[kodi](/man/kodi)(1), [xbmc](/man/xbmc)(1)
