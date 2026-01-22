# TLDR

**Discover** LXI devices on available networks

```lxi discover```

Capture a **screenshot**, detecting a plugin automatically

```lxi screenshot -a [ip_address]```

Capture a screenshot using a **specified plugin**

```lxi screenshot -a [ip_address] -p [rigol-1000z]```

Send an **SCPI command** to an instrument

```lxi scpi -a [ip_address] "[*IDN?]"```

Run a **benchmark** for request and response performance

```lxi benchmark -a [ip_address]```

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

# SEE ALSO

[gpib](/man/gpib)(7), [sigrok-cli](/man/sigrok-cli)(1)
