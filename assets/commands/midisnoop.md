# TLDR

**Start MIDI monitor**

```midisnoop```

**Monitor specific port**

```midisnoop -i [port]```

**List MIDI ports**

```midisnoop -l```

**Hex output**

```midisnoop -x```

**Verbose output**

```midisnoop -v```

# SYNOPSIS

**midisnoop** [_options_]

# PARAMETERS

**-i** _PORT_
> Input port.

**-l**
> List ports.

**-x**
> Hex output.

**-v**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**midisnoop** monitors MIDI messages. It displays incoming MIDI data in real-time.

The tool helps debug MIDI devices and software. Shows note, control, and system messages.

midisnoop monitors MIDI data.

# CAVEATS

Requires MIDI ports. ALSA or JACK backend. Real-time monitoring.

# HISTORY

midisnoop provides **MIDI** debugging by displaying messages from connected MIDI devices.

# SEE ALSO

[aconnect](/man/aconnect)(1), [pmidi](/man/pmidi)(1), [amidi](/man/amidi)(1)

