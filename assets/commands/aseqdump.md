# TAGLINE

Show the events received at an ALSA sequencer port

# TLDR

**Dump** MIDI events from all sources

```aseqdump```

Dump from a **specific port**

```aseqdump -p [20:0]```

**List** available input ports

```aseqdump -l```

Show events with **normalized** MIDI 1.0 values

```aseqdump -p [20:0] -N```

Show events as **percentages**

```aseqdump -p [20:0] -P```

# SYNOPSIS

**aseqdump** [**-p** _client:port,..._] [**-l**] [**-u** _version_] [**-r**] [**-R**|**-N**|**-P**]

# DESCRIPTION

**aseqdump** is a command-line utility that prints the ALSA sequencer events it receives as human-readable text. It is useful for debugging MIDI connections, testing keyboards, and monitoring MIDI data streams.

The output shows event type, channel, note numbers, velocity, control changes, and other MIDI message details.

# PARAMETERS

**-h**, **--help**
> Print a list of options

**-V**, **--version**
> Print the current version

**-l**, **--list**
> Print a list of possible input ports

**-p**, **--port**=_client:port,..._
> Set the sequencer port(s) from which events are received. A client can be specified by its number, its name, or a prefix of its name. A port is specified by its number; for port 0, the ":0" part can be omitted

**-u**, **--ump**=_version_
> Set the client MIDI version. 0 is for legacy mode, 1 is UMP MIDI 1.0 mode, and 2 is UMP MIDI 2.0 mode

**-r**, **--raw**
> Suppress the automatic conversion of events among UMP and legacy clients

**-R**, **--raw-view**
> Show the raw values as is. Channel numbers and UMP group numbers are 0-based. This is the default

**-N**, **--normalized-view**
> Show normalized values aligned with MIDI 1.0. Channel and group numbers are 1-based, velocity and data values are normalized between 0 and 127

**-P**, **--percent-view**
> Show values as percentages. Channel and group numbers are 1-based

# CAVEATS

Only displays ALSA sequencer events, not raw MIDI. Subscribe to specific ports to filter output. Events are displayed but not recorded.

# HISTORY

**aseqdump** is part of the **alsa-utils** package, providing MIDI debugging capabilities since ALSA's introduction.

# SEE ALSO

[aconnect](/man/aconnect)(1), [amidi](/man/amidi)(1), [arecordmidi](/man/arecordmidi)(1), [aseqnet](/man/aseqnet)(1), [aplaymidi](/man/aplaymidi)(1)
