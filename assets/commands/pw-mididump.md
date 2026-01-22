# TLDR

Listen for and dump all **incoming MIDI** events

```pw-mididump```

Dump MIDI events from a **specific file**

```pw-mididump path/to/file.mid```

Connect to a specific **remote** PipeWire instance

```pw-mididump -r remote_instance```

Display **help**

```pw-mididump -h```

# SYNOPSIS

**pw-mididump** [_options_] [_file_]

# PARAMETERS

**-r**, **--remote** _name_
> Connect to specific remote PipeWire instance

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-mididump** dumps MIDI messages to stdout for debugging and monitoring purposes. It can listen for real-time MIDI events from connected devices or read MIDI data from files.

This is useful for troubleshooting MIDI connectivity and verifying that MIDI data is being received correctly.

# CAVEATS

Real-time MIDI monitoring requires appropriate device permissions. Output format is designed for debugging, not for creating MIDI files.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides MIDI debugging capabilities within the PipeWire ecosystem.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [aconnect](/man/aconnect)(1)
