# TLDR

**Connect to a host** on default port (23)

```telnet [host]```

**Connect to a host** on a specific port

```telnet [host] [port]```

**Test if a port is open**

```telnet [host] [80]```

**Connect with automatic login**

```telnet -a [host]```

**Connect as a specific user**

```telnet -l [username] [host]```

**Set a custom escape character**

```telnet -e [^X] [host]```

**Force IPv4 connection**

```telnet -4 [host]```

# SYNOPSIS

**telnet** [_options_] [_host_] [_port_]

# PARAMETERS

**-4**
> Force IPv4 address resolution

**-6**
> Force IPv6 address resolution

**-8**
> Request 8-bit data path

**-a**
> Attempt automatic login with current username

**-l** _USER_
> Specify username for automatic login

**-e** _CHAR_
> Set escape character (default: ^])

**-E**
> Disable escape character

**-d**
> Enable debug mode

**-n** _FILE_
> Record trace information to file

**-K**
> Disable automatic login

**-L**
> Use 8-bit data path on output only

**-7**
> Strip 8th bit on input and output

# TELNET COMMANDS

When in telnet command mode (press escape character):

**open** _host_ [_port_]
> Connect to a host

**close**
> Close current connection

**quit**
> Exit telnet

**status**
> Show connection status

**send** _chars_
> Send special characters

**set** _variable_
> Set telnet variable

**toggle** _option_
> Toggle option on/off

**?**
> Show help

# DESCRIPTION

**telnet** is a user interface to the TELNET protocol for communicating with remote hosts. It can connect to any TCP port, making it useful for testing network services beyond traditional terminal access.

Without arguments, telnet enters command mode with a **telnet>** prompt. With a host argument, it attempts to connect immediately. The escape character (default **Ctrl+]**) returns to command mode during a connection.

Common uses include testing web servers (port 80), mail servers (port 25), and verifying if network services are accessible. The protocol transmits data in plaintext without encryption.

# CAVEATS

Telnet transmits all data including passwords in plaintext—never use it for sensitive connections over untrusted networks. Use SSH instead for secure remote access. Telnet may not be installed by default on modern systems. Some firewalls block the default telnet port (23). The protocol is considered obsolete for remote administration.

# HISTORY

The TELNET protocol was developed in **1969** as one of the earliest internet protocols, defined in RFC 15 and later RFC 854. It provided remote terminal access over ARPANET, the precursor to the internet. Telnet was the standard for remote Unix access until the mid-1990s when **SSH** emerged as a secure replacement. While deprecated for remote login, telnet remains useful for testing and debugging network services.

# SEE ALSO

[ssh](/man/ssh)(1), [nc](/man/nc)(1), [netcat](/man/netcat)(1), [rlogin](/man/rlogin)(1)
