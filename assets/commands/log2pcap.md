# TAGLINE

converts Samba debug logs to pcap format

# TLDR

**Convert Samba log to pcap**

```log2pcap [samba.log] > [output.pcap]```

**Output to file**

```log2pcap -o [output.pcap] [samba.log]```

**Verbose conversion**

```log2pcap -v [samba.log] > [output.pcap]```

**Process multiple logs**

```log2pcap [log1] [log2] > [combined.pcap]```

# SYNOPSIS

**log2pcap** [_options_] _logfile_

# PARAMETERS

_LOGFILE_
> Samba debug log file.

**-o** _FILE_
> Output pcap file.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**log2pcap** converts Samba debug logs to pcap format. The pcap files can be analyzed with Wireshark.

The tool extracts packet data from Samba's debug output for network analysis and troubleshooting.

# CAVEATS

Requires specific Samba log format. Part of Samba tools. Limited to Samba traffic.

# HISTORY

log2pcap is part of the **Samba** suite, enabling analysis of SMB protocol traffic from debug logs.

# SEE ALSO

[smbclient](/man/smbclient)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1)

