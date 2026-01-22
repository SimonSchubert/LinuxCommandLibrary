# TLDR

**Record** MIDI to file

```arecordmidi -p [hw:1,0] [recording.mid]```

**List** available MIDI ports

```arecordmidi -l```

Record with **specific BPM**

```arecordmidi -p [hw:1,0] -b [120] [recording.mid]```

Record with **metronome**

```arecordmidi -p [hw:1,0] -m [hw:1,0] [recording.mid]```

# SYNOPSIS

**arecordmidi** [_-p port_] [_-b bpm_] [_-t ticks_] [_options_] _output.mid_

# DESCRIPTION

**arecordmidi** records MIDI data from ALSA sequencer ports to a Standard MIDI File. It captures note events, control changes, and other MIDI messages from connected keyboards or controllers.

The tool is useful for capturing performances without running a full DAW application.

# PARAMETERS

**-p** _port_, **--port** _port_
> Source port(s) to record from

**-l**, **--list**
> List available ports

**-b** _bpm_, **--bpm** _bpm_
> Beats per minute

**-t** _ticks_, **--ticks** _ticks_
> Ticks per quarter note (default: 384)

**-s**, **--split-channels**
> Split channels to separate tracks

**-m** _port_, **--metronome** _port_
> Output metronome to port

**-i** _ticks_, **--timesig** _ticks_
> Time signature (n/d format)

# CAVEATS

Recording starts immediately; no countdown by default. Only records from ALSA sequencer ports, not raw MIDI. Tempo must be set manually.

# HISTORY

**arecordmidi** is part of the ALSA utilities, providing basic MIDI recording capability since ALSA's introduction in the early **2000s**.

# SEE ALSO

[aplaymidi](/man/aplaymidi)(1), [aconnect](/man/aconnect)(1), [amidi](/man/amidi)(1)
