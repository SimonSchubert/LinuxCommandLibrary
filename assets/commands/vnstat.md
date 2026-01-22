# TLDR

**Display** traffic summary for all interfaces

```vnstat```

**Display** traffic summary for a specific interface

```vnstat -i [network_interface]```

**Display** live stats for a specific interface

```vnstat -l -i [network_interface]```

**Show** hourly traffic statistics with bar graph

```vnstat -hg```

**Measure** and show average traffic for 30 seconds

```vnstat -tr 30```

# SYNOPSIS

**vnstat** [_options_] [_interface_]

# PARAMETERS

**-i, --iface _interface_**
> Select specific interface

**-l, --live**
> Display live traffic statistics

**-hg, --hoursgraph**
> Show hourly statistics as bar graph

**-tr, --traffic _seconds_**
> Measure traffic for specified duration

**-d, --days**
> Show daily statistics

**-m, --months**
> Show monthly statistics

**-t, --top**
> Show top traffic days

**-s, --short**
> Use short output format

**--json**
> Output in JSON format

**--xml**
> Output in XML format

# DESCRIPTION

**vnstat** is a console-based network traffic monitor that keeps a log of network traffic for selected interfaces. It uses kernel interface statistics for minimal resource usage.

The daemon (vnstatd) runs in the background collecting data, while the vnstat command queries and displays the collected statistics. Data persists across reboots in a database.

# CAVEATS

Requires vnstatd daemon to be running for data collection. Initial statistics require time to accumulate. Traffic counters may reset if the interface is reconfigured. Statistics are based on kernel counters, not packet inspection.

# SEE ALSO

[vnstatd](/man/vnstatd)(8), [iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8), [nload](/man/nload)(1)
