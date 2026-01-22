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

**pmidi** plays MIDI files. ALSA sequencer interface.

The tool sends MIDI to hardware/software synths. Simple player.

pmidi plays MIDI.

# CAVEATS

ALSA only. Requires MIDI port. Linux specific.

# HISTORY

pmidi is part of **ALSA utilities** for MIDI playback.

# SEE ALSO

[aplaymidi](/man/aplaymidi)(1), [timidity](/man/timidity)(1), [fluidsynth](/man/fluidsynth)(1)

