# TLDR

List **objects**

```wpctl status```

**Inspect** object

```wpctl inspect [id]```

Set **default**

```wpctl set-default [id]```

**Get** volume

```wpctl get-volume [id]```

**Set** volume

```wpctl set-volume [id] [n]%```

**Adjust** volume

```wpctl set-volume [id] [n]%[+|-]```

Set volume with **limit**

```wpctl set-volume -l 1 [id] [n]%+```

**Mute** toggle

```wpctl set-mute [id] [1|0|toggle]```

# SYNOPSIS

**wpctl** _COMMAND_ [_OPTIONS_]

# COMMANDS

**status**
> List all managed objects

**inspect** _ID_
> Print object properties

**set-default** _ID_
> Set default for group

**get-volume** _ID_
> Get sink volume

**set-volume** _ID_ _LEVEL_
> Set sink volume

**set-mute** _ID_ _STATE_
> Set mute state

# PARAMETERS

**-l, --limit** _MAX_
> Limit volume to maximum

**@DEFAULT_SINK@**
> Special name for default sink

# DESCRIPTION

**wpctl** manages WirePlumber, the session and policy manager for PipeWire. It controls audio routing, volume, and device selection.

The special name @DEFAULT_SINK@ can be used instead of numeric IDs to target the current default sink.

# CAVEATS

Requires WirePlumber running. Object IDs may change between sessions. Volume percentages can exceed 100% unless limited.

# SEE ALSO

[wireplumber](/man/wireplumber)(1), [pw-cli](/man/pw-cli)(1), [pactl](/man/pactl)(1)
