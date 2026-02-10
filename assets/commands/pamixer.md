# TAGLINE

controls PulseAudio and PipeWire volume from the command line

# TLDR

**Get current volume**

```pamixer --get-volume```

**Set volume**

```pamixer --set-volume [50]```

**Increase volume**

```pamixer -i [5]```

**Decrease volume**

```pamixer -d [5]```

**Mute audio**

```pamixer -m```

**Unmute audio**

```pamixer -u```

**Toggle mute**

```pamixer -t```

**Set volume for specific sink**

```pamixer --sink [1] --set-volume [50]```

# SYNOPSIS

**pamixer** [_--get-volume_] [_--set-volume n_] [_-i n_] [_-d n_] [_-m_] [_-u_] [_options_]

# PARAMETERS

**--get-volume**
> Print current volume.

**--set-volume** _N_
> Set volume percentage.

**-i** _N_, **--increase** _N_
> Increase volume by N%.

**-d** _N_, **--decrease** _N_
> Decrease volume by N%.

**-m**, **--mute**
> Mute.

**-u**, **--unmute**
> Unmute.

**-t**, **--toggle-mute**
> Toggle mute state.

**--get-mute**
> Print mute status.

**--sink** _ID_
> Select sink (output).

**--source** _ID_
> Select source (input).

**--default-source**
> Use default source.

**--list-sinks**
> List available sinks.

**--list-sources**
> List available sources.

**--allow-boost**
> Allow volume above 100%.

# DESCRIPTION

**pamixer** controls PulseAudio and PipeWire volume from the command line. It provides simple volume management for scripting and keybindings.

Volume operations work as percentages. Increase and decrease adjust relative to current level. Set-volume applies an absolute percentage.

Mute control toggles audio without changing volume level. The toggle command provides single-key mute/unmute functionality.

Sink selection targets specific audio outputs when multiple exist. Default sink is used when not specified. Sources control microphone and input levels.

Allow-boost permits volume above 100%, useful for quiet audio sources. This may cause distortion with already-loud content.

The tool works with both PulseAudio and PipeWire (through its PulseAudio compatibility layer).

# CAVEATS

Requires PulseAudio or PipeWire. Volume above 100% may distort. Sink IDs may change across reboots.

# HISTORY

**pamixer** was created as a command-line alternative to graphical PulseAudio mixers. It enables volume control through scripts, keybindings, and status bars common in minimal window managers.

# SEE ALSO

[pactl](/man/pactl)(1), [pulsemixer](/man/pulsemixer)(1), [amixer](/man/amixer)(1), [wpctl](/man/wpctl)(1)
