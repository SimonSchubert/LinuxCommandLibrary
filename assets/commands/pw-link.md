# TLDR

List **input and output** ports with IDs

```pw-link -oiI```

**Create** link between ports

```pw-link [output_port] [input_port]```

**Disconnect** two ports

```pw-link -d [output_port] [input_port]```

List all **links** with IDs

```pw-link -lI```

Display **help**

```pw-link -h```

# SYNOPSIS

**pw-link** [**-o**] [**-i**] [**-l**] [**-I**] [**-d**] [_output_port_ _input_port_]

# PARAMETERS

**-o, --output**
> List output ports

**-i, --input**
> List input ports

**-l, --links**
> List existing links

**-I, --id**
> Show object IDs

**-d, --disconnect**
> Disconnect ports instead of connecting

**-h, --help**
> Display help information

# DESCRIPTION

**pw-link** manages connections between PipeWire ports. It can list available ports, create new links between audio sources and sinks, and remove existing connections.

The tool enables routing audio between applications and devices, useful for creating complex audio setups like virtual cables or recording application output.

# CAVEATS

Port names can be long and complex. Links may be recreated by session manager. Use IDs for scripting stability. Some links managed by WirePlumber.

# HISTORY

**pw-link** is part of **PipeWire**, providing port connection management similar to jack_connect for JACK. It enables manual control over the audio routing graph.

# SEE ALSO

[pw-cli](/man/pw-cli)(1), [wpctl](/man/wpctl)(1), [jack_connect](/man/jack_connect)(1)
