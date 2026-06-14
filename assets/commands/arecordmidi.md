# TAGLINE

Record MIDI events to a Standard MIDI File

# TLDR

**List** available sequencer ports

```arecordmidi -l```

**Record** MIDI from a port (client:port) to a file

```arecordmidi -p [20:0] [recording.mid]```

Record with a **specific tempo** (BPM)

```arecordmidi -p [20:0] -b [120] [recording.mid]```

Record with a **metronome** on another port

```arecordmidi -p [20:0] -m [128:0] [recording.mid]```

# SYNOPSIS

**arecordmidi** **-p** _client:port_[_,..._] [_options_] _midifile_

# DESCRIPTION

**arecordmidi** records MIDI data from ALSA sequencer ports to a Standard MIDI File. It captures note events, control changes, and other MIDI messages from connected keyboards or controllers.

Ports are addressed as _client:port_ (for example **20:0**) or by name, as listed by the **-l** option. The tool is useful for capturing performances without running a full DAW application.

# PARAMETERS

**-p** _client:port_[_,..._], **--port** _client:port_
> Sequencer source port(s) to record from (required)

**-l**, **--list**
> List possible input ports, then exit

**-b** _bpm_, **--bpm** _bpm_
> Tempo in beats per minute (default: 120)

**-t** _ticks_, **--ticks** _ticks_
> Timing resolution in ticks per beat (default: 384)

**-f** _frames_, **--fps** _frames_
> Use SMPTE timing instead of musical ticks (24, 25, 29.97, or 30 fps)

**-s**, **--split-channels**
> Write each MIDI channel to a separate track (format 1 file)

**-m** _client:port_, **--metronome** _client:port_
> Play a metronome click on the specified port

**-i** _num:den_, **--timesig** _num:den_
> Time signature; denominator must be a power of two (default: 4:4)

# CAVEATS

Recording starts immediately; no countdown by default. **arecordmidi** reads from ALSA sequencer ports only, not raw MIDI devices, so connect raw hardware through the sequencer (for example with **amidi** or a virtual raw-MIDI port) first. Stop the recording with **Ctrl-C**; the file is written on exit.

# HISTORY

**arecordmidi** is part of the ALSA utilities, providing basic MIDI recording capability since ALSA's introduction in the early **2000s**.

# SEE ALSO

[aplaymidi](/man/aplaymidi)(1), [aconnect](/man/aconnect)(1), [amidi](/man/amidi)(1)

# RESOURCES

```[Source code](https://github.com/alsa-project/alsa-utils)```

```[Homepage](https://www.alsa-project.org)```

<!-- verified: 2026-06-15 -->
