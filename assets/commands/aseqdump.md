# TLDR

**Dump** MIDI events from all sources

```aseqdump```

Dump from **specific port**

```aseqdump -p [hw:1,0]```

**List** available ports

```aseqdump -l```

# SYNOPSIS

**aseqdump** [_-p port_] [_-l_]

# DESCRIPTION

**aseqdump** displays MIDI events from ALSA sequencer ports in human-readable format. It's useful for debugging MIDI connections, testing keyboards, and monitoring MIDI data streams.

The output shows event type, channel, note numbers, velocity, control changes, and other MIDI message details.

# PARAMETERS

**-p** _port_
> Subscribe to specific MIDI port(s)

**-l**, **--list**
> List available sequencer ports

# OUTPUT FORMAT

Shows MIDI events with:
- Source port
- Event type (note on/off, control, etc.)
- Channel number
- Data values

# CAVEATS

Only displays ALSA sequencer events, not raw MIDI. Subscribe to specific ports to filter output. Events are displayed but not recorded.

# HISTORY

**aseqdump** is part of the ALSA utilities, providing MIDI debugging capabilities since ALSA's introduction.

# SEE ALSO

[aconnect](/man/aconnect)(1), [amidi](/man/amidi)(1), [arecordmidi](/man/arecordmidi)(1)
