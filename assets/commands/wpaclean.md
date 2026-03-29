# TAGLINE

Extract WPA handshakes from capture files

# TLDR

**Clean capture file**

```wpaclean [output.cap] [input.cap]```

**Clean multiple files**

```wpaclean [output.cap] [file1.cap] [file2.cap]```

# SYNOPSIS

**wpaclean** _output_ _input_ ...

# PARAMETERS

_output_
> Cleaned output file.

_input_
> Input capture files.

# DESCRIPTION

**wpaclean** cleans capture files to get only the 4-way handshake and a beacon. It produces cleaned output files containing only the EAPOL authentication frames needed for offline password analysis, significantly reducing file size by removing all non-handshake traffic.

Multiple input capture files can be processed and combined into a single cleaned output file. The tool is part of the aircrack-ng suite and is typically used to prepare capture files before running them through aircrack-ng or hashcat for WPA/WPA2 password recovery during authorized security assessments.

Note that the output file is specified **before** the input file(s) in the argument order.

# CAVEATS

Part of the aircrack-ng suite. Only extracts WPA/WPA2 4-way handshakes and beacons; all other frames are discarded. The tool has no command-line options beyond the positional arguments. Input files must be in pcap format.

# HISTORY

**wpaclean** is part of the **aircrack-ng** suite, a set of tools for 802.11 wireless network security auditing.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [hashcat](/man/hashcat)(1)
