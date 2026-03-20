# TAGLINE

Extract network traces from Samba log files

# TLDR

**Convert Samba log to pcap**

```log2pcap [samba.log] > [output.pcap]```

**Output to a named file**

```log2pcap -o [output.pcap] [samba.log]```

**Read from stdin**

```log2pcap < [/var/log/samba/log.smbd] > [output.pcap]```

**Output as hex dump for text2pcap**

```log2pcap -h [samba.log] | text2pcap -T 139,139 - [trace.pcap]```

**Quiet mode, suppress warnings**

```log2pcap -q [samba.log] > [output.pcap]```

# SYNOPSIS

**log2pcap** [_options_] [_logfile_]

# PARAMETERS

_logfile_
> Samba debug log file. Reads from stdin if not specified.

**-h**
> Output as hex dump readable by text2pcap.

**-q**
> Quiet mode. Suppress warnings about missing or incomplete data.

**--help**
> Display help information.

# DESCRIPTION

**log2pcap** reads a Samba log file and generates a pcap file based on the packet dumps in the log. The pcap files can then be analyzed with network sniffers like Wireshark or tcpdump.

The Samba log level must be at least 5 to capture SMB headers/parameters correctly, 10 to include the first 512 bytes of packet data, and 50 to get full packets.

# CAVEATS

Only SMB data is extracted from the logs; LDAP, NetBIOS lookups, and other protocols are not included. The generated TCP and IP headers do not contain valid checksums. Part of the Samba suite.

# HISTORY

log2pcap is part of the **Samba** suite, enabling analysis of SMB protocol traffic from debug logs.

# SEE ALSO

[smbclient](/man/smbclient)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1), [tshark](/man/tshark)(1)

