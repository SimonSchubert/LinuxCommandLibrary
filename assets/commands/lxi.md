# TAGLINE

controls LXI compatible test equipment such as oscilloscopes, spectrum

# TLDR

Find LXI instruments on the network

```lxi discover```

Ask an instrument to **identify itself**

```lxi scpi --address [192.168.1.50] "*IDN?"```

Send **any SCPI command** and print the reply

```lxi scpi --address [192.168.1.50] "[MEASure:VOLTage:DC?]"```

Allow **longer for a slow instrument** to answer

```lxi scpi --address [192.168.1.50] --timeout [5000] "*IDN?"```

Grab a **screenshot**, detecting the model automatically

```lxi screenshot --address [192.168.1.50]```

Grab one using a **named plugin**, when detection guesses wrong

```lxi screenshot --address [192.168.1.50] --plugin [rigol-1000z]```

Measure **request and response latency**

```lxi benchmark --address [192.168.1.50]```

# SYNOPSIS

**lxi** _command_ [_options_]

# PARAMETERS

**discover**
> Scan the network for LXI-compatible instruments

**screenshot**
> Capture a screenshot from an instrument's display

**scpi**
> Send SCPI (Standard Commands for Programmable Instruments) commands

**benchmark**
> Test communication performance with an instrument

**-a, --address _ip_**
> Specify the IP address of the target instrument

**-p, --plugin _name_**
> Use a specific screenshot plugin for the instrument model

# DESCRIPTION

**lxi** controls LXI (LAN eXtensions for Instrumentation) compatible test equipment such as oscilloscopes, spectrum analyzers, multimeters, and other measurement instruments over Ethernet.

LXI is an instrumentation standard that extends the GPIB/IEEE-488 interface over TCP/IP networks. The tool uses SCPI commands to communicate with instruments, allowing remote control, data acquisition, and automation of measurements.

The screenshot feature supports various instrument brands through plugins, automatically detecting the appropriate capture method when possible.

# CAVEATS

Requires network connectivity to LXI instruments. Discovery may not find instruments on different subnets. Screenshot plugins must match the instrument model for proper display capture. SCPI command syntax varies between manufacturers.

# HISTORY

The lxi-tools project was created to provide open-source tools for communicating with LXI-compatible test equipment, supporting the LXI 1.4+ specification for network-based instrumentation.

# INSTALL

```apt: sudo apt install lxi-tools```

```dnf: sudo dnf install lxi-tools```

```brew: brew install lxi-tools```

```nix: nix profile install nixpkgs#lxi-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

