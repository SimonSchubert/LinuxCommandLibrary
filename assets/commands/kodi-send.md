# TAGLINE

sends commands to Kodi media center

# TLDR

**Send an action**

```kodi-send --action="[PlayPause]"```

**Send to a specific host**

```kodi-send --host=[192.168.1.100] --action="[Stop]"```

**Send a notification**

```kodi-send --notification="[Backup complete]"```

**Send multiple actions as a macro with delays**

```kodi-send --action="[Up]" --delay=[500] --action="[Select]"```

**Send a key press event**

```kodi-send --button="[KB_Return]"```

**Open a media URL**

```kodi-send --action="PlayMedia([url])"```

# SYNOPSIS

**kodi-send** [_options_]

# PARAMETERS

**-a**, **--action** _ACTION_
> Action to send. Can be specified multiple times to create a macro.

**--button** _BUTTON_
> Send a key press event. Can be specified multiple times.

**--host** _HOST_
> Kodi host address (default localhost).

**--port** _PORT_
> Kodi EventClient port (default 9777).

**--notification** _MESSAGE_
> Send a notification to Kodi.

**--log** _MESSAGE_
> Send a log message to Kodi.

**--loglevel** _LEVEL_
> Log level when using --log (default LOGDEBUG).

**--mouse** _X,Y_
> Send mouse position to Kodi.

**-d**, **--delay** _T_
> Wait for T milliseconds. Can be used between actions to create macros.

**--keymap** _KEYMAP_
> Specify a custom keymap.

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

[curl](/man/curl)(1)
