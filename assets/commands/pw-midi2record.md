# TAGLINE

Record MIDI 2 (UMP) events through PipeWire

# TLDR

**Record MIDI 2 input to a UMP file**

```pw-midi2record [path/to/output.midi2]```

**Record from a specific source node**

```pw-midi2record --target [node_id] [path/to/output.midi2]```

**Force the legacy MIDI 1 byte-stream format**

```pw-midi2record --force-midi midi [path/to/output.midi2]```

**Record with verbose output**

```pw-midi2record -v [path/to/output.midi2]```

**Pipe MIDI 2 capture to another program**

```pw-midi2record - | [tool]```

# SYNOPSIS

**pw-midi2record** [_options_] [_FILE_ | **-**]

# PARAMETERS

**-h**, **--help**
> Show help and exit.

**--version**
> Show version information.

**-v**, **--verbose**
> Enable verbose output.

**-R**, **--remote** _NAME_
> Connect to the named PipeWire daemon.

**--target** _VALUE_
> Source node serial or name. **0** disables linking.

**--latency** _VALUE_
> Set node latency, e.g. **100ms**, **2048** samples.

**-P**, **--properties** _JSON_
> Extra stream properties as a JSON object.

**-M**, **--force-midi** _FORMAT_
> Force MIDI format, **midi** (legacy bytes) or **ump** (Universal MIDI Packets, default).

**-C**, **--monitor**
> Capture monitor ports of output nodes (when recording).

# DESCRIPTION

**pw-midi2record** captures MIDI 2 events from the PipeWire graph and writes them to a file. It is an alias of **pw-cat**(1) invoked with the **TYPE_MIDI2** data type, encoding events as **Universal MIDI Packets (UMP)** as defined by the MIDI 2.0 specification.

UMP can carry both legacy MIDI 1 messages and MIDI 2 features (per-note controllers, 32-bit values, 16 groups of 16 channels). A MIDI 2 capable source — controller, software instrument, or upstream PipeWire node — must be connected for events to be recorded.

When **-** is given as the file argument, MIDI data is written to standard output.

# CAVEATS

Records MIDI events only, not rendered audio; use **pw-record**(1) to capture the audio output of a synthesiser. Without a connected MIDI source the file will only contain headers. Files produced are UMP, not the legacy SMF (**.mid**) format.

# HISTORY

MIDI 2 support arrived in **PipeWire** alongside the broader pw-cat MIDI 2 (UMP) work, complementing the older **pw-midiplay**/**pw-midirecord** pair. PipeWire was created by **Wim Taymans** at Red Hat and first released in **2017**. The MIDI 2.0 specification was ratified by the MMA in **2020**.

# SEE ALSO

[pw-cat](/man/pw-cat)(1), [pw-midi2play](/man/pw-midi2play)(1), [pw-midiplay](/man/pw-midiplay)(1), [pw-midirecord](/man/pw-midirecord)(1), [pw-mididump](/man/pw-mididump)(1), [pw-record](/man/pw-record)(1), [pipewire](/man/pipewire)(1)
