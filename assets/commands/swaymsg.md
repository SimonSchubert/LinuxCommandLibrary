# TAGLINE

Send IPC commands to Sway compositor

# TLDR

**Send command**

```swaymsg [command]```

**Get workspaces**

```swaymsg -t get_workspaces```

**Get outputs**

```swaymsg -t get_outputs```

**Get focused window**

```swaymsg -t get_tree | jq '.. | select(.focused?)'```

**Reload configuration**

```swaymsg reload```

**Exit sway**

```swaymsg exit```

**Move workspace**

```swaymsg move workspace to output [HDMI-A-1]```

# SYNOPSIS

**swaymsg** [_-t type_] [_-m_] [_options_] _message_

# PARAMETERS

**-t**, **--type** _TYPE_
> Message type.

**-m**, **--monitor**
> Monitor for responses.

**-r**, **--raw**
> Raw output.

**-q**, **--quiet**
> Quiet mode.

**-s**, **--socket** _PATH_
> Socket path.

# MESSAGE TYPES

**get_workspaces** - List workspaces
**get_outputs** - List outputs
**get_tree** - Window tree
**get_marks** - Window marks
**get_bar_config** - Bar config
**get_version** - Sway version

# DESCRIPTION

**swaymsg** is the IPC (Inter-Process Communication) client for the Sway Wayland compositor. It sends commands and queries to a running Sway instance via the IPC socket, enabling scripted control of window management operations like moving, resizing, and focusing windows.

Query message types (get_workspaces, get_outputs, get_tree) return JSON data describing the current compositor state, which can be parsed with tools like jq. This makes swaymsg useful for building custom status bars, automation scripts, and workspace management tools.

Monitor mode subscribes to Sway events and prints them in real time, useful for debugging and building reactive scripts. The IPC socket path defaults to the SWAYSOCK environment variable set by Sway.

# CAVEATS

Sway must be running. Socket permissions required. JSON output needs parsing.

# HISTORY

**swaymsg** is the IPC client for **Sway** compositor. It mirrors i3-msg functionality for Wayland.

# SEE ALSO

[sway](/man/sway)(1), [jq](/man/jq)(1), [i3-msg](/man/i3-msg)(1)
