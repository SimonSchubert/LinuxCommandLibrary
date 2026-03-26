# TAGLINE

extracts detailed information about the hardware configuration of the machine

# TLDR

**List all hardware in compact table**

```sudo lshw -short```

**Show CPU information**

```sudo lshw -class processor```

**Show disk and storage devices**

```sudo lshw -class disk -class storage -short```

**Show network hardware**

```sudo lshw -class network```

**Output as JSON**

```sudo lshw -json```

**Save network info as HTML**

```sudo lshw -class network -html > network.html```

**Strip sensitive information** (serials, IPs)

```sudo lshw -sanitize```

# SYNOPSIS

**lshw** [_-format_] [_-class class_] [_options_]

# DESCRIPTION

**lshw** (Hardware Lister) extracts detailed information about the hardware configuration of the machine. It can report on memory, firmware, CPU, bus, disk, network, and other hardware configurations.

# PARAMETERS

**-class CLASS**
> Show only specified hardware class (can repeat)

**-short**
> Output hardware paths in compact tabular format

**-businfo**
> Output bus information

**-X**
> Launch graphical interface (if available)

**-html**
> Output as HTML

**-xml**
> Output as XML

**-json**
> Output as JSON

**-sanitize**
> Remove sensitive information (IPs, serials)

**-numeric**
> Output numeric IDs

**-quiet**
> Suppress status messages

**-notime**
> Exclude timing information from output

**-enable TEST**
> Enable specific test

**-disable TEST**
> Disable specific test

# HARDWARE CLASSES

system, bridge, memory, processor, address, storage, disk, tape, bus, network, display, input, printer, multimedia, communication, power, volume, generic

# CAVEATS

Requires root privileges for complete hardware information. Without root, some details may be missing or inaccurate.

# HISTORY

**lshw** was developed by Lyonel Vincent as a comprehensive hardware information tool for Linux, providing more detail than basic tools.

# SEE ALSO

[dmidecode](/man/dmidecode)(8), [hwinfo](/man/hwinfo)(8), [inxi](/man/inxi)(1), [lscpu](/man/lscpu)(1)
