# TAGLINE

Graphical ping with live terminal graph

# TLDR

**Ping a host with graph**

```gping [example.com]```

**Ping multiple hosts**

```gping [example.com] [google.com] [cloudflare.com]```

**Ping with custom interval**

```gping -i [0.5] [example.com]```

**Execute command and graph results**

```gping --cmd "[curl -so /dev/null -w '%{time_total}' example.com]"```

**Ping with custom buffer size**

```gping -b [100] [example.com]```

**Set graph color**

```gping --color [blue] [example.com]```

**Use simple graphics mode**

```gping -s [example.com]```

**Show help**

```gping --help```

# SYNOPSIS

**gping** [_options_] _host_...

# PARAMETERS

**-i**, **--interval** _seconds_
> Ping interval. Default: 0.2.

**-b**, **--buffer** _size_
> Number of data points in graph. Default: 300.

**-n**, **--watch-interval** _seconds_
> Interval for command execution graph.

**-s**, **--simple-graphics**
> Use dot character instead of braille.

**--vertical-margin** _lines_
> Vertical margin above graph.

**--horizontal-margin** _cols_
> Horizontal margin beside graph.

**-c**, **--color** _color_
> Graph line color (repeatable).

**-4**
> Force IPv4.

**-6**
> Force IPv6.

**--cmd** _command_
> Execute command and graph output as float.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# COLORS

red, green, blue, yellow, cyan, magenta, white, black

# DESCRIPTION

**gping** is a graphical ping tool that displays latency as a live updating graph in the terminal. Multiple hosts can be pinged simultaneously, each displayed with different colors for easy comparison.

The **--cmd** option executes arbitrary commands and graphs their numeric output, useful for graphing any time-series metric like response times or resource usage. Simple graphics mode (**-s**) uses basic characters for terminals lacking Unicode braille support.

# CAVEATS

Requires ICMP permissions (may need root/sudo on Linux). Terminal must support 256 colors for best display. Some terminals may not render braille characters correctly.

# HISTORY

gping was created by **Ohri Tzipora** (orf) and first released around **2020**. Written in Rust, it was designed as a modern alternative to traditional ping with visual feedback. The project gained popularity for its intuitive display and multi-host comparison capability.

# SEE ALSO

[ping](/man/ping)(1), [mtr](/man/mtr)(1), [trippy](/man/trippy)(1), [fping](/man/fping)(1)
