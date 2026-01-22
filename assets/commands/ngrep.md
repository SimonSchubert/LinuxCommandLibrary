# TLDR

**Search packets for pattern**

```ngrep -q "[pattern]"```

**Search on specific port**

```ngrep -d [eth0] "[pattern]" port [80]```

**Search HTTP traffic**

```ngrep -q -W byline "[GET|POST]" port [80]```

**Search specific host**

```ngrep -q "[pattern]" host [192.168.1.1]```

**Show packet headers**

```ngrep -q -t "[pattern]"```

**Read from pcap**

```ngrep -I [file.pcap] "[pattern]"```

**Case insensitive**

```ngrep -qi "[pattern]"```

# SYNOPSIS

**ngrep** [_options_] _pattern_ [_filter_]

# PARAMETERS

_PATTERN_
> Regex pattern to match.

_FILTER_
> BPF filter expression.

**-q**
> Quiet mode.

**-d** _IFACE_
> Interface to listen on.

**-W** _MODE_
> Output mode (byline, single, none).

**-i**
> Case insensitive.

**-I** _FILE_
> Read from pcap file.

**--help**
> Display help information.

# DESCRIPTION

**ngrep** is network grep. It searches network packets for patterns.

The tool matches regex in packet payloads. Like grep for network traffic.

ngrep searches network packets.

# CAVEATS

Requires root. Plaintext only. BPF filter support.

# HISTORY

ngrep was created to provide **grep-like** functionality for network packet inspection.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [grep](/man/grep)(1), [wireshark](/man/wireshark)(1)

