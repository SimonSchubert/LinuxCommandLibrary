# TAGLINE

ALSA MIDI port connection manager

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

**aconnect** [_-options_] _sender_ _receiver_

**aconnect** **-d** [_-options_] _sender_ _receiver_

**aconnect** **-i**|**-o** [_-options_]

**aconnect** **-x**

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

**-r**, **--real** _queue_
> Convert time-stamps using the given real-time queue

**-t**, **--tick** _queue_
> Convert time-stamps using the given tick queue

# CAVEATS

Connections made with aconnect are not persistent; they're lost when the MIDI device is disconnected or the system reboots. For persistent connections, use tools like **qjackctl** or write startup scripts. Client numbers may change between sessions.

# HISTORY

**aconnect** was developed as part of the ALSA project in the late **1990s**. It provided a command-line interface for the ALSA sequencer system, which replaced the older OSS (Open Sound System) MIDI handling in Linux.

# INSTALL

```apt: sudo apt install alsa-utils```

```dnf: sudo dnf install alsa-utils```

```pacman: sudo pacman -S alsa-utils```

```apk: sudo apk add alsa-utils```

```zypper: sudo zypper install alsa-utils```

```nix: nix profile install nixpkgs#alsa-utils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[amidi](/man/amidi)(1), [aplaymidi](/man/aplaymidi)(1), [arecordmidi](/man/arecordmidi)(1), [aseqdump](/man/aseqdump)(1)

# RESOURCES

```[Source code](https://github.com/alsa-project/alsa-utils)```

```[Homepage](https://www.alsa-project.org/)```

<!-- verified: 2026-06-10 -->
