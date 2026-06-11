# TAGLINE

Send and receive raw MIDI data

# TLDR

**List** MIDI hardware ports

```amidi -l```

**Send** a MIDI file to a port

```amidi -p [hw:1,0,0] -s [file.syx]```

**Receive** MIDI data to file

```amidi -p [hw:1,0,0] -r [output.syx]```

**Dump** incoming MIDI messages

```amidi -p [hw:1,0,0] -d```

Send **system exclusive** data

```amidi -p [hw:1,0,0] -S "F0 43 10 4C 00 00 7E 00 F7"```

# SYNOPSIS

**amidi** [_-l_] [_-p port_] [_-s file_] [_-r file_] [_-S hex_] [_-d_] [_options_]

# DESCRIPTION

**amidi** is an ALSA utility for sending and receiving raw MIDI data. It works at the byte level, making it suitable for sending system exclusive (SysEx) messages, firmware updates to MIDI devices, or capturing MIDI dumps.

Unlike higher-level MIDI sequencers, amidi doesn't interpret MIDI timing or song structure; it transfers raw data to and from hardware ports.

# PARAMETERS

**-l**, **--list-devices**
> List available hardware MIDI ports

**-L**, **--list-rawmidis**
> List all RawMIDI definitions (useful when debugging configuration files)

**-p** _port_, **--port=**_port_
> RawMIDI port to use (e.g., hw:1,0,0). Defaults to port 0 on card 0

**-s** _file_, **--send=**_file_
> Send the raw MIDI commands in file to the port (e.g., a .syx file)

**-r** _file_, **--receive=**_file_
> Receive data from the port and write it to file

**-S** _hex_, **--send-hex=**_hex_
> Send the bytes given as hexadecimal numbers to the port

**-d**, **--dump**
> Print received data as hexadecimal bytes

**-t** _seconds_, **--timeout=**_seconds_
> Stop receiving when no data arrives for the given time

**-a**, **--active-sensing**
> Do not ignore Active Sensing bytes (FEh)

**-c**, **--clock**
> Do not ignore Clock bytes (F8h)

**-i** _ms_, **--sysex-interval=**_ms_
> Add a delay between each SysEx message sent, useful for firmware updates

# CAVEATS

Works only with hardware MIDI ports, not virtual/software ports. SysEx transfers can be large and slow. Some devices require specific timing between messages.

# HISTORY

**amidi** is part of the ALSA utilities, providing low-level MIDI access since ALSA replaced OSS in the Linux kernel in the early **2000s**.

# SEE ALSO

[aconnect](/man/aconnect)(1), [aplaymidi](/man/aplaymidi)(1), [arecordmidi](/man/arecordmidi)(1)

# RESOURCES

```[Source code](https://github.com/alsa-project/alsa-utils)```

```[Homepage](https://www.alsa-project.org)```

<!-- verified: 2026-06-11 -->
