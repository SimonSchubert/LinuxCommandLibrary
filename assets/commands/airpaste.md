# TAGLINE

Pipe data between two machines on the local network using mDNS discovery

# TLDR

**Wait** for a peer to connect (prints received data to stdout)

```airpaste```

Send **text** to the waiting peer

```echo "Hello" | airpaste```

Send a **file**

```airpaste < [file.txt]```

Receive and **save** to file

```airpaste > [received.txt]```

Use a **named channel** so only peers with the same name connect

```airpaste [channel_name]```

# SYNOPSIS

**airpaste** [_name_]

# DESCRIPTION

**airpaste** is a 1-to-1 network pipe that auto-discovers another peer on the same local network using mDNS (multicast DNS), so you do not need to know the other machine's IP address. Data is transferred over TCP.

Run **airpaste** on two machines: whatever you pipe into one is streamed to the other. Pass an optional channel name so that only peers using the same name connect to each other. It works across different operating systems and requires no server setup.

# PARAMETERS

_name_
> Optional channel name; only peers using the same name connect to each other

# CAVEATS

Only works on local networks where mDNS multicast is reachable. Data moves over the network without encryption and could be captured, so it is intended for use on trusted networks only. It connects two peers at a time, not a broadcast to many.

# HISTORY

**airpaste** was created by Mathias Buus (mafintosh) as a simple way to pipe data and files between machines during development, leveraging mDNS for zero-configuration networking. It is written in JavaScript and distributed via npm.

# SEE ALSO

[nc](/man/nc)(1), [wormhole](/man/wormhole)(1), [croc](/man/croc)(1)

# RESOURCES

```[Source code](https://github.com/mafintosh/airpaste)```

```[Homepage](https://github.com/mafintosh/airpaste)```

<!-- verified: 2026-06-11 -->
