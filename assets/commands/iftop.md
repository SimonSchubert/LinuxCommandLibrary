# TLDR

Show **bandwidth usage** on default interface

```sudo iftop```

Show bandwidth usage on a **specific interface**

```sudo iftop -i [interface]```

Show bandwidth usage with **port information**

```sudo iftop -P```

**Disable** bar graphs of traffic

```sudo iftop -b```

**Don't resolve** hostnames

```sudo iftop -n```

# SYNOPSIS

**iftop** [_options_]

# PARAMETERS

**-i** _INTERFACE_
> Listen on specified interface

**-P**
> Show port numbers as well as host names

**-n**
> Don't do hostname lookups

**-N**
> Don't convert port numbers to service names

**-b**
> Don't display bar graphs

**-B**
> Display bandwidth in bytes rather than bits

**-f** _FILTER_
> Use filter code (pcap syntax)

**-F** _NET/MASK_
> Show traffic in/out of network

# DESCRIPTION

**iftop** displays bandwidth usage on a network interface, broken down by connection. It shows which hosts are communicating and how much data is being transferred, updated in real time.

The display shows source and destination hosts, with bar graphs indicating traffic volume. Three columns show bandwidth over 2, 10, and 40-second intervals. Totals are shown at the bottom.

Press **?** during operation to see interactive commands for filtering, sorting, and display options.

# CAVEATS

Requires root privileges or appropriate capabilities for packet capture. High-bandwidth interfaces may cause high CPU usage. DNS lookups can slow initial display; use -n to disable.

# HISTORY

iftop was written by Paul Warren and Chris Sherlock, inspired by the top utility. It was first released in **2002** and has become a standard tool for real-time network bandwidth monitoring.

# SEE ALSO

[nethogs](/man/nethogs)(8), [tcpdump](/man/tcpdump)(8), [ifstat](/man/ifstat)(1)
