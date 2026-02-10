# TAGLINE

creates audio connections between JACK ports

# TLDR

**Connect output to input**

```jack_connect [system:capture_1] [app:input_1]```

**Connect application ports**

```jack_connect [app1:output] [app2:input]```

**List all ports**

```jack_lsp```

**List with connections**

```jack_lsp -c```

**Disconnect ports**

```jack_disconnect [source] [destination]```

# SYNOPSIS

**jack_connect** _source_port_ _destination_port_

**jack_disconnect** _source_port_ _destination_port_

# PARAMETERS

_source_port_
> Output port (client:port format).

_destination_port_
> Input port (client:port format).

# DESCRIPTION

**jack_connect** creates audio connections between JACK ports. JACK (JACK Audio Connection Kit) provides low-latency audio routing between applications.

The command links output ports to input ports, enabling audio to flow between applications. Use **jack_lsp** to list available ports and **jack_disconnect** to remove connections.
# List available ports
jack_lsp

# Connect microphone to recorder
jack_connect system:capture_1 ardour:audio_in_1

# Connect synth to speakers
jack_connect yoshimi:output_L system:playback_1
jack_connect yoshimi:output_R system:playback_2
```

# CAVEATS

Requires running JACK server. Port names include client name. Connections don't persist across restarts. Consider QjackCtl for GUI management.

# HISTORY

JACK was created by **Paul Davis** and others, starting in **2002**. It provides professional-grade audio routing on Linux and macOS, used extensively in audio production.

# SEE ALSO

[jackd](/man/jackd)(1), [jack_lsp](/man/jack_lsp)(1), [qjackctl](/man/qjackctl)(1)
