# TAGLINE

packet capture file editor and converter

# TLDR

**Extract packets by range**

```editcap -r [input.pcap] [output.pcap] [1-100]```

**Remove duplicate packets**

```editcap -d [input.pcap] [output.pcap]```

**Split by packet count**

```editcap -c [1000] [input.pcap] [output.pcap]```

**Split by duration**

```editcap -i [60] [input.pcap] [output.pcap]```

**Convert format**

```editcap -F [pcapng] [input.pcap] [output.pcapng]```

**Change snap length**

```editcap -s [128] [input.pcap] [output.pcap]```

# SYNOPSIS

**editcap** [_options_] _infile_ _outfile_ [_packet_range_]

# PARAMETERS

**-r** _range_
> Keep only packets in range.

**-d**
> Remove duplicate packets.

**-D** _window_
> Duplicate window (default 5).

**-c** _count_
> Split into files of count packets.

**-i** _seconds_
> Split by time interval.

**-F** _format_
> Output file format.

**-s** _snaplen_
> Truncate packets to length.

**-t** _adjustment_
> Adjust timestamps.

**-S** _offset_
> Set start time.

**-A** _time_
> Keep packets after time.

**-B** _time_
> Keep packets before time.

**-T** _type_
> Set encapsulation type.

# DESCRIPTION

**editcap** is a packet capture file editor from the Wireshark suite. It reads capture files and writes portions or modified versions to new files, supporting format conversion, packet selection, and time adjustments.

Common uses include splitting large captures, removing duplicates, extracting time ranges, and converting between capture formats like pcap and pcapng.

# CAVEATS

Does not modify original file. Some operations load entire file into memory. Packet ranges are 1-based. Format conversion may lose metadata. Part of Wireshark; requires wireshark or tshark packages.

# HISTORY

editcap is part of the **Wireshark** project, originally **Ethereal**, created by **Gerald Combs** in **1998**. It provides command-line capture file manipulation complementing the graphical Wireshark analyzer.

# SEE ALSO

[wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1), [mergecap](/man/mergecap)(1), [capinfos](/man/capinfos)(1)
