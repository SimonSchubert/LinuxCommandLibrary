# TAGLINE

LAN device discovery tool with interactive TUI

# TLDR

**Launch the interactive device discovery TUI**

```whosthere```

**Perform a single scan with timeout**

```whosthere scan -t [5]```

**Export scan results as JSON**

```whosthere scan -t [5] --json --pretty > [devices.json]```

# SYNOPSIS

**whosthere** [_command_] [_options_]

# DESCRIPTION

**whosthere** is a local area network discovery tool that identifies devices using mDNS, SSDP, and ARP cache techniques without requiring elevated privileges. Discovered devices are enhanced with OUI lookups to display manufacturer names. Supports interactive TUI mode, single scan, JSON export, and daemon mode with HTTP API.

# HISTORY

**whosthere** was created by **Ramon Vermeulen** (ramonvermeulen) and is written in **Go**.

# SEE ALSO

[arp-scan](/man/arp-scan)(1), [nmap](/man/nmap)(1), [avahi-browse](/man/avahi-browse)(1)
