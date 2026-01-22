# TLDR

**Fix corrupted pcap**

```pcapfix [corrupted.pcap]```

**Fix and save to new file**

```pcapfix -o [fixed.pcap] [corrupted.pcap]```

**Verbose output**

```pcapfix -v [corrupted.pcap]```

**Deep scan mode**

```pcapfix -d [corrupted.pcap]```

# SYNOPSIS

**pcapfix** [_options_] _file_

# PARAMETERS

_FILE_
> Corrupted pcap file.

**-o** _OUTPUT_
> Output file.

**-v**
> Verbose mode.

**-d**
> Deep scan.

**-n**
> Fix pcapng files.

# DESCRIPTION

**pcapfix** repairs corrupted packet captures. Fixes pcap and pcapng files.

The tool recovers network captures. Handles truncation and corruption.

pcapfix repairs captures.

# CAVEATS

May not recover all data. Backup originals. Supports pcap and pcapng.

# HISTORY

pcapfix was created for **recovering corrupted** packet capture files.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [editcap](/man/editcap)(1)

