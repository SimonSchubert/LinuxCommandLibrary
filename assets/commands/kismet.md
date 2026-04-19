# TAGLINE

Wireless network detector, sniffer, and intrusion detection system

# TLDR

**Start Kismet** with default settings

```kismet```

**Start Kismet** with a specific capture source

```kismet -c [wlan0]```

**Start with multiple capture sources**

```kismet -c [wlan0] -c [wlan1]```

**Run without the ncurses wrapper** (for scripting or service mode)

```kismet --no-ncurses```

**Specify an alternate configuration file**

```kismet -f [path/to/kismet.conf]```

**Disable all logging**

```kismet -n```

**Specify logging types**

```kismet -T [kismet,pcapng]```

**Use an alternate log directory**

```kismet -p [path/to/logs]```

**Enable debug mode** (for running under GDB)

```kismet --debug```

# SYNOPSIS

**kismet** [_options_]

# PARAMETERS

**-c** _SOURCE_
> Define a data source (e.g., interface name). May be specified multiple times; takes priority over config file sources.

**-f** _FILE_
> Use an alternate configuration file.

**-n**, **--no-logging**
> Disable all logging.

**-T** _TYPES_, **--log-types** _TYPES_
> Override the log types to generate (e.g., kismet, pcapng).

**-t** _TITLE_, **--log-title** _TITLE_
> Set the log title field used in log filenames.

**-p** _DIR_, **--log-prefix** _DIR_
> Directory to write logs to.

**--homedir** _PATH_
> Use an alternate home directory for settings and logs.

**--confdir** _PATH_
> Use a custom configuration directory.

**--override** _FLAVOR_
> Apply a named override configuration (e.g., wardrive).

**--no-ncurses**
> Disable the ncurses wrapper, producing plain text output. Useful for scripts and services.

**--no-line-wrap**
> Disable line wrapping in terminal messages.

**--no-plugins**
> Do not load plugins. Useful when debugging a crashing plugin.

**--debug**
> Enable debug mode: disables crash/backtrace handlers and the ncurses wrapper, for use under GDB.

**--silent**
> Do not print status messages to the console after startup.

**--daemonize**
> Fork to the background and run as a daemon.

**-v**, **--version**
> Print version information.

**-h**, **--help**
> Display help.

# DESCRIPTION

**kismet** is an 802.11 wireless network detector, sniffer, and intrusion detection system. It works with any wireless card that supports raw monitoring (rfmon) mode and can detect 802.11a/b/g/n/ac networks, as well as Bluetooth, Zigbee, and other radios via capture plugins.

Kismet operates passively by collecting packets without transmitting, making it difficult to detect. It identifies networks from beacon frames, decloaks hidden networks over time, and infers non-beaconing networks from data traffic.

Modern Kismet (2016+) runs as a single process exposing a web-based UI (default at **http://localhost:2501**) and a REST API. The older **kismet_server**/**kismet_client**/**gpsmap** split is no longer used. Kismet logs to its own SQLite-based **.kismet** format by default, and also supports pcap/pcapng for tools like Wireshark.

# CONFIGURATION

Configuration is primarily read from **kismet.conf** and override files (e.g., **kismet_logging.conf**, **kismet_httpd.conf**) in the system config directory (typically **/etc/kismet/** or **/usr/local/etc/**). Per-user settings live under **~/.kismet/**.

# CAVEATS

Requires a wireless card that supports monitor mode. Often requires root privileges (or CAP_NET_ADMIN/CAP_NET_RAW) to place interfaces in monitor mode. Capturing wireless traffic without authorization may violate laws in many jurisdictions. Channel hopping may miss traffic on other channels during rotation.

# HISTORY

Kismet was created by **Mike Kershaw** (dragorn) with the first version released in **2001**. It became one of the first widely used open-source wireless network detectors. The name comes from the Turkish word for "fate" or "destiny". The architecture was significantly rewritten between 2016 and 2018, merging the server/client/drone components into a single process with a web UI and REST API.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1)
