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

**wpaclean** cleans WPA captures. It extracts handshakes.

EAPOL extraction. Only handshakes.

File size reduction. Remove noise.

Multiple inputs. Combine captures.

Aircrack-ng suite. Wireless tool.

# CAVEATS

Part of aircrack-ng. For WPA captures. EAPOL focused.

# HISTORY

**wpaclean** is part of the **aircrack-ng** suite, extracting WPA handshakes from packet captures.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [tcpdump](/man/tcpdump)(1)
