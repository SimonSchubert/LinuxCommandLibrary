# TAGLINE

part of the Interception Tools suite for intercepting and multiplexing streams

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

**mux** [**-h** | [**-s** _size_] **-c** _name_ | [**-i** _name_] [**-o** _name_]]

# PARAMETERS

**-h**
> Show help message and exit

**-c _name_**
> Create a muxer with specified name (repeatable)

**-s _size_**
> Set muxer queue size; default is 100

**-i _name_**
> Read input from named muxer; can be repeated for switch mode

**-o _name_**
> Write output to named muxer; can be repeated

# DESCRIPTION

**mux** is part of the Interception Tools suite for multiplexing streams of input events. A muxer must be created first with **-c**, then used as the input or output of a given pipeline.

Besides combining multiple pipelines into one, mux can duplicate them (using multiple **-o** options) and act as a switch based on activity in other pipelines (using multiple **-i** options).

The tool is commonly used with udevmon and other Interception Tools components for keyboard remapping, event filtering, and input device manipulation at a low level.

# CAVEATS

Requires the Interception Tools framework to be installed and configured. Named muxers are created as FIFO files. Queue size affects latency and memory usage. Typically requires root privileges or uinput group membership.

# HISTORY

**mux** is part of **Interception Tools**, developed by Francisco Lopes (oblitum). The framework provides low-level input event interception on Linux, enabling tools like caps2esc and space2meta for keyboard customization.

# SEE ALSO

[intercept](/man/intercept)(1), [udevmon](/man/udevmon)(1), [uinput](/man/uinput)(1)
