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

**jack_connect** [_options_] _source_port_ _destination_port_

# PARAMETERS

_source_port_
> Output port (client:port format).

_destination_port_
> Input port (client:port format).

**-s**, **--server** _servername_
> Connect to the named JACK server.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jack_connect** creates audio connections between JACK ports. JACK (JACK Audio Connection Kit) provides low-latency audio routing between applications.

The command links output ports to input ports, enabling audio to flow between applications. Use **jack_lsp** to list available ports and **jack_disconnect** to remove connections.

# CAVEATS

Requires running JACK server. Port names include client name. Connections don't persist across restarts. Consider QjackCtl for GUI management.

# HISTORY

JACK was created by **Paul Davis** and others, starting in **2002**. It provides professional-grade audio routing on Linux and macOS, used extensively in audio production.

# SEE ALSO

[jackd](/man/jackd)(1), [pulseaudio](/man/pulseaudio)(1), [pipewire](/man/pipewire)(1)
