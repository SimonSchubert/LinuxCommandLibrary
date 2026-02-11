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

**wpaclean** extracts WPA handshake data from wireless packet capture files, producing cleaned output files containing only the EAPOL authentication frames needed for offline password analysis. This significantly reduces file size by removing all non-handshake traffic.

Multiple input capture files can be processed and combined into a single cleaned output file. The tool is part of the aircrack-ng suite and is typically used to prepare capture files before running them through aircrack-ng or hashcat for WPA password recovery during authorized security assessments.

# CAVEATS

Part of aircrack-ng. For WPA captures. EAPOL focused.

# HISTORY

**wpaclean** is part of the **aircrack-ng** suite, extracting WPA handshakes from packet captures.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [tcpdump](/man/tcpdump)(1)
