# TAGLINE

netcat with twofish encryption

# TLDR

**Listen** on a port with encryption

```cryptcat -k password -l -p 1234```

**Connect** to a port with encryption

```cryptcat -k password host 1234```

Connect with **timeout**

```cryptcat -k password -w 10 host 1234```

**Port scan** a host

```cryptcat -v -z host 1-1024```

**Proxy** data between local and remote

```cryptcat -k password -l -p 8080 | cryptcat -k password host 80```

**Transfer** a file

```cryptcat -k password -l -p 1234 < file.txt```

# SYNOPSIS

**cryptcat** [_options_] [_hostname_] [_port_]

# DESCRIPTION

**cryptcat** is netcat with twofish encryption capabilities. It provides the same functionality as netcat but with encrypted data transmission for secure communication over untrusted networks.

# PARAMETERS

**-k PASSWORD**
> Specify encryption password

**-l**
> Listen mode (act as server)

**-p PORT**
> Specify local port number

**-w SECONDS**
> Timeout for connects and final net reads

**-z**
> Zero-I/O mode (scanning)

**-v**
> Verbose mode

**-n**
> Numeric-only IP addresses, no DNS

**-u**
> UDP mode instead of TCP

**-e COMMAND**
> Execute command after connect (use with caution)

# CAVEATS

Both ends must use the same password for encryption. This tool is intended for authorized security testing and legitimate encrypted communication. Using -e to execute commands creates significant security risks.

# HISTORY

**cryptcat** was developed as a secure version of netcat, adding twofish encryption to prevent eavesdropping on network communications.

# SEE ALSO

[nc](/man/nc)(1), [netcat](/man/netcat)(1), [ncat](/man/ncat)(1), [socat](/man/socat)(1)
