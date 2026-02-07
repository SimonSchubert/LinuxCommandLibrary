# TAGLINE

capture images from network traffic

# TLDR

**Capture images** from network

```driftnet -i [eth0]```

**Save images to** directory

```driftnet -i [eth0] -d [/tmp/images]```

**Capture without display**

```driftnet -i [eth0] -a -d [/tmp/images]```

**Read from pcap** file

```driftnet -f [capture.pcap]```

**Verbose output**

```driftnet -v -i [eth0]```

# SYNOPSIS

**driftnet** [_options_]

# PARAMETERS

**-i** _INTERFACE_
> Network interface to capture on.

**-d** _DIR_
> Directory to save images.

**-a**
> Adjunct mode (no display).

**-f** _FILE_
> Read from pcap file.

**-p**
> Don't put interface in promiscuous mode.

**-v**
> Verbose mode.

**-b**
> Beep when image captured.

**--help**
> Display help information.

# DESCRIPTION

**driftnet** captures and displays images from network traffic in real-time. It extracts JPEG, GIF, and PNG images transmitted over unencrypted HTTP connections passing through the monitored network interface.

The tool is useful for network monitoring, security demonstrations, and forensics. In display mode, captured images appear in a window; in adjunct mode, they're saved to disk.

driftnet can also extract audio data from network streams, playing it in real-time or saving to files.

# CAVEATS

Only captures unencrypted traffic (HTTP). Requires root/promiscuous access. HTTPS traffic not visible. Intended for authorized monitoring only.

# HISTORY

driftnet was created by **Chris Sherlock** as a demonstration of network traffic visibility. It highlights the privacy implications of unencrypted communications and is used in security awareness training.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [wireshark](/man/wireshark)(1), [ettercap](/man/ettercap)(8)
