# TAGLINE

cross-platform audio spectrum visualizer for the terminal

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

**cava** (Console Audio Visualizer for ALSA) is a bar spectrum audio visualizer that displays real-time frequency analysis as animated bars in the terminal or on the desktop. It captures audio from the system and renders it as a colorful equalizer-style display.

The visualizer supports multiple audio backends including ALSA, PulseAudio, PipeWire, JACK, sndio, and PortAudio. Output can be rendered through ncurses for terminal display, SDL for a desktop window, or raw data for piping to other programs. All visual and audio settings are controlled through a configuration file.

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

**~/.config/cava/config**
> Controls bar width, spacing, colors, gradients, audio source, sensitivity, smoothing, and output mode.

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
