# TAGLINE

start Kismet** with default settings

# TLDR

**Start Kismet** with default settings

```kismet```

**Start Kismet** with a specific capture source

```kismet -c [wlan0]```

**Start in silent mode** with no console output

```kismet -s```

**Specify an alternate configuration file**

```kismet -f [path/to/kismet.conf]```

**Disable all logging**

```kismet -n```

**Specify logging types**

```kismet -l [dump,csv,xml]```

**Run Kismet server** on a specific port

```kismet_server -p [2501]```

# SYNOPSIS

**kismet** [_options_]

**kismet_server** [_options_]

**kismet_client** [_options_]

# PARAMETERS

**-c** _SOURCE_
> Override capture source (type,interface,name)

**-C** _SOURCES_
> Comma-separated list of capture sources to enable

**-f** _FILE_
> Use an alternate configuration file

**-n**
> Disable all logging

**-l** _TYPES_
> Override logging types (dump, cisco, weak, csv, xml, gps)

**-m** _NUM_
> Maximum packets logged per file

**-t** _TITLE_
> Set title for logfile template

**-p** _PORT_
> Port to listen on for clients (default: 2501)

**-a** _HOSTS_
> Allowed client IPs or network/mask blocks

**-s**
> Silent mode (no console status)

**-q**
> Quiet mode (no sound)

**-g** _HOST:PORT_
> GPS host and port

**-x**
> Forcibly enable channel hopping

**-X**
> Forcibly disable channel hopping

**-I** _SOURCE:CHAN_
> Set initial channel for a source

**--daemonize**
> Run as background daemon

**-h**
> Display help

**-v**
> Print version

# DESCRIPTION

**kismet** is an 802.11 wireless network detector, sniffer, and intrusion detection system. It works with any wireless card that supports raw monitoring (rfmon) mode and can detect 802.11a/b/g/n networks.

Kismet operates passively by collecting packets without transmitting, making it difficult to detect. It identifies networks by capturing beacon frames, can decloak hidden networks over time, and infers the presence of non-beaconing networks through data traffic analysis.

The tool consists of three components: **kismet_server** handles packet capture and logging, **kismet_client** provides the console interface, and **gpsmap** plots network locations. Modern versions also provide a web interface at **http://localhost:2501**. Kismet logs data in multiple formats including pcap (compatible with Wireshark), CSV, and XML.

# CAVEATS

Requires a wireless card that supports monitor mode. Often requires root privileges to configure interfaces. Capturing wireless traffic without authorization may violate laws in many jurisdictions. Some drivers may require manual configuration for monitor mode. Channel hopping may miss some traffic on other channels during rotation.

# HISTORY

Kismet was created by **Mike Kershaw** (dragorn) with the first version released in **2001**. It became one of the first widely used open-source wireless network detectors and helped establish the field of wireless security auditing. The name comes from the Turkish word for "fate" or "destiny". Kismet was instrumental in early wardriving activities and remains a standard tool for wireless network security assessment.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1), [gpsd](/man/gpsd)(1)
