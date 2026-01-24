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

**swaymsg** communicates with Sway window manager. It sends commands and queries state.

Commands control window management. Move, resize, focus operations.

Get queries return JSON data. Parse with jq for specific info.

Monitor mode watches events. See changes in real-time.

Socket path defaults to SWAYSOCK. Override for specific instance.

# CAVEATS

Sway must be running. Socket permissions required. JSON output needs parsing.

# HISTORY

**swaymsg** is the IPC client for **Sway** compositor. It mirrors i3-msg functionality for Wayland.

# SEE ALSO

[sway](/man/sway)(1), [jq](/man/jq)(1), [i3-msg](/man/i3-msg)(1)
