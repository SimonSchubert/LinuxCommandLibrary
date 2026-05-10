# TAGLINE

Play MIDI 2 (UMP) files through PipeWire

# TLDR

**Play a MIDI 2 (UMP) file**

```pw-midi2play [path/to/file.midi2]```

**Play to a specific PipeWire target node**

```pw-midi2play --target [node_id] [path/to/file.midi2]```

**Force the legacy MIDI 1 byte-stream format instead of UMP**

```pw-midi2play --force-midi midi [path/to/file.midi2]```

**Play with verbose output**

```pw-midi2play -v [path/to/file.midi2]```

**Read MIDI 2 data from stdin**

```cat [file.midi2] | pw-midi2play -```

# SYNOPSIS

**pw-midi2play** [_options_] [_FILE_ | **-**]

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
> Target node serial or name. **0** disables linking.

**--latency** _VALUE_
> Set node latency, e.g. **100ms**, **2048** samples.

**-P**, **--properties** _JSON_
> Extra stream properties as a JSON object.

**-M**, **--force-midi** _FORMAT_
> Force MIDI format, **midi** (legacy bytes) or **ump** (Universal MIDI Packets, default).

# DESCRIPTION

**pw-midi2play** sends MIDI 2 events into the PipeWire graph for playback. It is an alias of **pw-cat**(1) invoked with the **TYPE_MIDI2** data type, which expects **Universal MIDI Packet (UMP)** containers as defined by the MIDI 2.0 specification.

UMP packets carry both legacy MIDI 1 messages and MIDI 2 features such as 32-bit-per-channel resolution, per-note controllers, and 16 groups of 16 channels. The tool itself does not synthesise audio: events are routed through the PipeWire graph to a MIDI 2 capable synthesiser or hardware device that renders sound.

When **-** is given as the file argument, MIDI data is read from standard input.

# CAVEATS

Requires the destination synthesiser, plugin, or hardware to understand MIDI 2 / UMP. Without a downstream renderer the playback is silent. Standard **.mid** (SMF) files use MIDI 1 byte streams and are typically played with **pw-midiplay**(1) instead, or with **--force-midi midi**.

# HISTORY

MIDI 2 support arrived in **PipeWire** alongside the broader pw-cat MIDI 2 (UMP) work, complementing the older **pw-midiplay**/**pw-midirecord** pair. PipeWire was created by **Wim Taymans** at Red Hat and first released in **2017** and is now the default audio server in major Linux distributions. The MIDI 2.0 specification was ratified by the MMA in **2020**.

# SEE ALSO

[pw-cat](/man/pw-cat)(1), [pw-midi2record](/man/pw-midi2record)(1), [pw-midiplay](/man/pw-midiplay)(1), [pw-midirecord](/man/pw-midirecord)(1), [pw-mididump](/man/pw-mididump)(1), [pipewire](/man/pipewire)(1)
