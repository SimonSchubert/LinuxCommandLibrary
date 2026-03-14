# TAGLINE

Remote login to another host

# TLDR

**Log in** to a remote host

```rlogin remote_host```

Log in with a **specific username**

```rlogin -l username remote_host```

# SYNOPSIS

**rlogin** [_options_] _host_

# PARAMETERS

**-8**, **--8-bit**
> Allow an eight-bit input data path at all times

**-d**, **--debug**
> Turn on socket debugging (SO_DEBUG)

**-e** _char_, **--escape** _char_
> Set escape character (default: ~)

**-E**, **--no-escape**
> Disable escape character recognition

**-l** _username_, **--user** _username_
> Specify remote username

**-4**, **--ipv4**
> Use IPv4 addresses only

**-6**, **--ipv6**
> Use IPv6 addresses only

# DESCRIPTION

**rlogin** starts a terminal session on a remote host. It provides remote login functionality similar to telnet but designed for trusted networks. The escape character (default **~**) at the start of a line allows disconnecting (**~.**) or suspending (**~^Z**) the session.

Note: rlogin transmits data unencrypted and is insecure. Use SSH for secure remote access.

# CAVEATS

Transmits credentials and session data in plain text. Not recommended for use over untrusted networks. SSH is the secure alternative. Most modern systems no longer include rlogin by default.

# HISTORY

Part of **GNU inetutils**, providing classic Unix networking utilities. Originally part of the BSD rcommands suite. Superseded by SSH for security reasons.

# SEE ALSO

[ssh](/man/ssh)(1), [rsh](/man/rsh)(1), [telnet](/man/telnet)(1)
