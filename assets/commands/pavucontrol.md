# TAGLINE

PulseAudio Volume Control

# TLDR

**Open volume control**

```pavucontrol```

**Start on specific tab**

```pavucontrol -t [1]```

# SYNOPSIS

**pavucontrol** [_options_]

# PARAMETERS

**-t**, **--tab=**_NUMBER_
> Start on tab number (1=Playback, 2=Recording, 3=Output Devices, 4=Input Devices, 5=Configuration).

**--maximize**
> Start the window maximized.

**--retry**
> Retry if the PulseAudio connection fails.

**--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**pavucontrol** is PulseAudio Volume Control. Graphical mixer for PulseAudio.

The application controls per-application volumes. Stream and device management.

# CAVEATS

GUI application. Requires PulseAudio. Per-stream control.

# HISTORY

pavucontrol was created for **graphical PulseAudio** volume control.

# SEE ALSO

[pulseaudio](/man/pulseaudio)(1), [pactl](/man/pactl)(1), [alsamixer](/man/alsamixer)(1)

