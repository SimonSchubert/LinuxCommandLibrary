# TLDR

**Start** a paste server

```airpaste```

Send **text** to other peers

```echo "Hello" | airpaste```

Send a **file**

```airpaste < [file.txt]```

Receive and **save** to file

```airpaste > [received.txt]```

# SYNOPSIS

**airpaste** [_-h_|_-v_]

# DESCRIPTION

**airpaste** is a peer-to-peer network clipboard sharing tool. It uses mDNS (multicast DNS) for discovery and TCP for data transfer, allowing instant text sharing between devices on the same local network without configuration.

When you pipe data to airpaste, it broadcasts availability. Other instances of airpaste on the network automatically receive the data. It works across different operating systems and requires no server setup.

# PARAMETERS

**-h**, **--help**
> Display help information

**-v**, **--version**
> Display version information

# CAVEATS

Only works on local networks (same broadcast domain). No encryption by default; data is transmitted in plain text. All airpaste instances on the network will receive the data.

# HISTORY

**airpaste** was created by Mathias Buus (mafintosh) as a simple solution for sharing clipboard content between devices during development, leveraging mDNS for zero-configuration networking.

# SEE ALSO

[nc](/man/nc)(1), [wormhole](/man/wormhole)(1), [croc](/man/croc)(1)
