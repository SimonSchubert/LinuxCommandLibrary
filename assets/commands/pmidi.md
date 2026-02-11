# TAGLINE

Play MIDI files via ALSA sequencer

# TLDR

**Play MIDI file**

```pmidi -p [port] [file.mid]```

**List MIDI ports**

```pmidi -l```

**Play with delay**

```pmidi -d [seconds] -p [port] [file.mid]```

# SYNOPSIS

**pmidi** [_options_] [_file_]

# PARAMETERS

_FILE_
> MIDI file to play.

**-p** _PORT_
> MIDI output port.

**-l**
> List available ports.

**-d** _SECONDS_
> Delay before playing.

**--help**
> Display help.

# DESCRIPTION

**pmidi** plays standard MIDI files through the ALSA sequencer interface. It sends MIDI events to a specified output port, which can be a hardware synthesizer, software synth like FluidSynth or TiMidity, or any ALSA MIDI device.

Use **-l** to list available MIDI ports and **-p** to select the target port for playback. The tool provides straightforward MIDI file playback without the overhead of a full media player.

# CAVEATS

ALSA only. Requires MIDI port. Linux specific.

# HISTORY

pmidi is part of **ALSA utilities** for MIDI playback.

# SEE ALSO

[aplaymidi](/man/aplaymidi)(1), [timidity](/man/timidity)(1), [fluidsynth](/man/fluidsynth)(1)

