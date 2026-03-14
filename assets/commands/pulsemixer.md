# TAGLINE

CLI and TUI mixer for PulseAudio

# TLDR

**Launch TUI mixer**

```pulsemixer```

**Get volume**

```pulsemixer --get-volume```

**Set volume**

```pulsemixer --set-volume [50]```

**Change volume by relative amount**

```pulsemixer --change-volume [+10]```

**Change volume with a maximum cap**

```pulsemixer --change-volume [+10] --max-volume [100]```

**Mute/unmute**

```pulsemixer --toggle-mute```

**List sinks**

```pulsemixer --list-sinks```

**Set volume on a specific sink**

```pulsemixer --id [sink-1] --set-volume [75]```

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

**--change-volume** _+-n_
> Change volume by a relative amount.

**--set-volume-all** _n:n_
> Set volume for every channel separately.

**--max-volume** _n_
> Cap volume at n when using --change-volume.

**--id** _id_
> Target specific sink/source.

**--server** _server_
> Connect to a specific PulseAudio server.

**--color** _n_
> Colorize output (0=none, 1=selected, 2=full).

**--no-mouse**
> Disable mouse support in TUI.

**-l**, **--list**
> List all sinks, sources, and sink inputs.

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
h/l, Left/Right  - Adjust volume
j/k, Up/Down     - Select
m                - Toggle mute
Space            - Lock/unlock channels
1-9, 0           - Set volume 10%-90%, 100%
Enter            - Context menu
F1/F2/F3         - Switch mode (output/input/cards)
q, Esc           - Quit
```

# CAVEATS

Requires PulseAudio. Also works with PipeWire's PulseAudio compatibility.

# HISTORY

pulsemixer was created by **GeorgeFilipkin** as a convenient CLI/TUI for PulseAudio control.

# SEE ALSO

[pactl](/man/pactl)(1), [pavucontrol](/man/pavucontrol)(1), [amixer](/man/amixer)(1)
