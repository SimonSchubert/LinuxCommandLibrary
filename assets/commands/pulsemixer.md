# TLDR

**Launch TUI mixer**

```pulsemixer```

**Get volume**

```pulsemixer --get-volume```

**Set volume**

```pulsemixer --set-volume [50]```

**Mute/unmute**

```pulsemixer --toggle-mute```

**List sinks**

```pulsemixer --list-sinks```

# SYNOPSIS

**pulsemixer** [_options_]

# PARAMETERS

**--get-volume**
> Print current volume.

**--set-volume** _n_
> Set volume (0-100).

**--get-mute**
> Print mute status.

**--toggle-mute**
> Toggle mute.

**--mute**
> Mute.

**--unmute**
> Unmute.

**--list-sinks**
> List output devices.

**--list-sources**
> List input devices.

**--id** _id_
> Target specific sink/source.

# DESCRIPTION

**pulsemixer** is a CLI and TUI mixer for PulseAudio. It provides both an interactive interface and command-line controls for managing audio volumes and routing.

# EXAMPLES

```bash
# Interactive mode
pulsemixer

# Set to 75%
pulsemixer --set-volume 75

# Change specific sink
pulsemixer --id sink-1 --set-volume 50

# Toggle mute
pulsemixer --toggle-mute

# Get current volume
vol=$(pulsemixer --get-volume | cut -d' ' -f1)
```

# TUI KEYS

```
h/l, Left/Right - Adjust volume
j/k, Up/Down    - Select
m               - Toggle mute
1-9             - Set volume 10%-90%
q, Esc          - Quit
```

# CAVEATS

Requires PulseAudio. Also works with PipeWire's PulseAudio compatibility.

# HISTORY

pulsemixer was created by **GeorgeFilipkin** as a convenient CLI/TUI for PulseAudio control.

# SEE ALSO

[pactl](/man/pactl)(1), [pavucontrol](/man/pavucontrol)(1), [amixer](/man/amixer)(1)
