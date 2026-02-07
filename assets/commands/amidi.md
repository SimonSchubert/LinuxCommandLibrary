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

**amidi** [_-l_] [_-p port_] [_-s file_] [_-r file_] [_-d_] [_-S hex_]

# DESCRIPTION

**amidi** is an ALSA utility for sending and receiving raw MIDI data. It works at the byte level, making it suitable for sending system exclusive (SysEx) messages, firmware updates to MIDI devices, or capturing MIDI dumps.

Unlike higher-level MIDI sequencers, amidi doesn't interpret MIDI timing or song structure; it transfers raw data to and from hardware ports.

# PARAMETERS

**-l**, **--list-devices**
> List available hardware MIDI ports

**-p** _port_, **--port=**_port_
> MIDI port to use (e.g., hw:1,0,0)

**-s** _file_, **--send=**_file_
> Send contents of file to port

**-r** _file_, **--receive=**_file_
> Receive data and write to file

**-S** _hex_, **--send-hex=**_hex_
> Send hexadecimal bytes

**-d**, **--dump**
> Print received data as hex

**-t** _seconds_, **--timeout=**_seconds_
> Timeout for receive operations

**-a**, **--active-sensing**
> Don't ignore active sensing messages

# CAVEATS

Works only with hardware MIDI ports, not virtual/software ports. SysEx transfers can be large and slow. Some devices require specific timing between messages.

# HISTORY

**amidi** is part of the ALSA utilities, providing low-level MIDI access since ALSA replaced OSS in the Linux kernel in the early **2000s**.

# SEE ALSO

[aconnect](/man/aconnect)(1), [aplaymidi](/man/aplaymidi)(1), [arecordmidi](/man/arecordmidi)(1)
