# TLDR

**Create** a new muxer with specified name

```mux -c [muxer_name1] [muxer_name2]```

Set muxer's **internal queue size**

```mux -s [100]```

**Read input** from a named muxer

```mux -i [input_muxer_name]```

**Write output** to a named muxer

```mux -o [output_muxer_name]```

# SYNOPSIS

**mux** [**-c** _names_] [**-s** _size_] [**-i** _input_] [**-o** _output_]

# PARAMETERS

**-c _names_**
> Create new muxers with specified names

**-s _size_**
> Set internal queue size; default is 100 events

**-i _input_**
> Read input from named muxer; can be repeated for switch mode

**-o _output_**
> Write output to named muxer; can be repeated

# DESCRIPTION

**mux** is part of the Interception Tools suite for intercepting and multiplexing streams of input events. It creates named pipes for routing keyboard and mouse events between processes.

Muxers act as intermediary buffers allowing multiple input sources to be combined or switched, and multiple outputs to receive the same events. This enables complex input event processing pipelines.

The tool is commonly used with udevmon and other Interception Tools components for keyboard remapping, event filtering, and input device manipulation at a low level.

# CAVEATS

Requires the Interception Tools framework to be installed and configured. Named muxers are created as FIFO files. Queue size affects latency and memory usage. Typically requires root privileges or uinput group membership.

# HISTORY

**mux** is part of **Interception Tools**, developed by Francisco Lopes (oblitum). The framework provides low-level input event interception on Linux, enabling tools like caps2esc and space2meta for keyboard customization.

# SEE ALSO

[udevmon](/man/udevmon)(1), [intercept](/man/intercept)(1), [uinput](/man/uinput)(1)
