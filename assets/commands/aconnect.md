# TLDR

**List** all MIDI input and output ports

```aconnect -l```

**Connect** two MIDI ports

```aconnect [sender_client]:[port] [receiver_client]:[port]```

**Disconnect** two MIDI ports

```aconnect -d [sender_client]:[port] [receiver_client]:[port]```

Disconnect **all** connections

```aconnect -x```

List only **input** ports

```aconnect -i```

# SYNOPSIS

**aconnect** [_-l_] [_-i_] [_-o_] [_sender_] [_receiver_]

# DESCRIPTION

**aconnect** is an ALSA (Advanced Linux Sound Architecture) utility for connecting and disconnecting MIDI ports. It manages the ALSA sequencer connections that route MIDI data between applications, hardware MIDI interfaces, and virtual MIDI ports.

The tool is essential for setting up MIDI routing in Linux audio workflows, allowing you to connect MIDI controllers to synthesizers, route between DAWs, or chain MIDI effects processors.

# PARAMETERS

**-l**, **--list**
> List current MIDI ports and connections

**-i**, **--input**
> List only input (readable) ports

**-o**, **--output**
> List only output (writable) ports

**-d**, **--disconnect**
> Disconnect the specified ports

**-x**, **--removeall**
> Remove all connections

**-e**, **--exclusive**
> Connect ports exclusively (no other connections allowed)

# CAVEATS

Connections made with aconnect are not persistent; they're lost when the MIDI device is disconnected or the system reboots. For persistent connections, use tools like **qjackctl** or write startup scripts. Client numbers may change between sessions.

# HISTORY

**aconnect** was developed as part of the ALSA project in the late **1990s**. It provided a command-line interface for the ALSA sequencer system, which replaced the older OSS (Open Sound System) MIDI handling in Linux.

# SEE ALSO

[amidi](/man/amidi)(1), [aplaymidi](/man/aplaymidi)(1), [arecordmidi](/man/arecordmidi)(1), [aseqdump](/man/aseqdump)(1)
