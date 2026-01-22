# TLDR

**Start audio visualizer**

```cava```

**Use custom config file**

```cava -p [/path/to/config]```

**Show version**

```cava -v```

# SYNOPSIS

**cava** [_options_]

# DESCRIPTION

**cava** (Cross-platform Audio Visualizer) is a bar spectrum audio visualizer for terminal (ncurses) or desktop (SDL). Displays audio input as frequency bars. Supports ALSA, PulseAudio, PipeWire, JACK, and more.

# PARAMETERS

**-p** _path_
> Path to configuration file

**-v**
> Print version

# CONTROLS

**q** / **Ctrl+C**
> Quit

**r**
> Reload configuration

# CONFIGURATION

Default config: ~/.config/cava/config

Configurable options:
- Bar width and spacing
- Colors and gradients
- Audio source
- Sensitivity and smoothing
- Output mode (ncurses, SDL, raw)

# AUDIO SOURCES

- PulseAudio
- PipeWire
- ALSA
- JACK
- sndio
- PortAudio
- FIFO buffer

# SIGNALS

**SIGUSR1**
> Force config reload

# CAVEATS

Requires audio capture permissions. Different audio backends need corresponding dev libraries. Works best with music playback.

# SEE ALSO

[alsamixer](/man/alsamixer)(1), [pavucontrol](/man/pavucontrol)(1)
