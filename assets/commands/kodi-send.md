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

**kodi-send** sends commands to Kodi media center. It uses the EventClient protocol for remote control.

The tool enables scripted media control. It supports playback, navigation, and system commands.

kodi-send controls Kodi remotely.

# CAVEATS

Requires Kodi EventClient enabled. Network access needed. Part of kodi-eventclients.

# HISTORY

kodi-send is part of **Kodi** (formerly XBMC) event client tools for remote media center control.

# SEE ALSO

[kodi](/man/kodi)(1), [xbmc](/man/xbmc)(1)
