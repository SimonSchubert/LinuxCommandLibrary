# TLDR

**Start buddy-ng server**

```buddy-ng```

**Start without dropping privileges**

```buddy-ng -p```

**Show help**

```buddy-ng -h```

# SYNOPSIS

**buddy-ng** [_options_]

# DESCRIPTION

**buddy-ng** is a companion tool for easside-ng that runs on a remote computer with Internet access. It receives and echoes back decrypted packets, allowing easside-ng to access WEP-protected wireless networks without knowing the key.

The tool works by having the access point itself decrypt the packets, then forwarding them through buddy-ng.

# PARAMETERS

**-h**
> Display help screen

**-p**
> Don't drop privileges after starting

# NETWORK

Buddy-ng listens on port **6969** by default, which is the standard port used by easside-ng for communication.

# WORKFLOW

1. Start buddy-ng on a remote server with Internet access
2. Run easside-ng on the attacking machine, specifying the buddy-ng server
3. Easside-ng establishes TCP connection with buddy-ng
4. Packets are decrypted by the AP and forwarded through buddy-ng
5. Internet access is achieved without knowing the WEP key

# COMPILATION

Building buddy-ng requires the **--with-experimental** flag when compiling aircrack-ng:

```./configure --with-experimental```

Also requires the libpcap development package.

# CAVEATS

Only useful with easside-ng for WEP network attacks. Requires a publicly accessible server to run buddy-ng. Only use on networks you own or have explicit authorization to test. WEP is deprecated and should not be used for security.

# SEE ALSO

[easside-ng](/man/easside-ng)(1), [aircrack-ng](/man/aircrack-ng)(1), [wesside-ng](/man/wesside-ng)(1)
