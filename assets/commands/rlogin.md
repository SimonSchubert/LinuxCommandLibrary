# TLDR

**Log in** to a remote host

```rlogin remote_host```

Log in with a **specific username**

```rlogin -l username remote_host```

# SYNOPSIS

**rlogin** [_options_] _host_

# PARAMETERS

**-l**, **--user** _username_
> Specify remote username

# DESCRIPTION

**rlogin** starts a terminal session on a remote host. It provides remote login functionality similar to telnet but designed for trusted networks.

Note: rlogin transmits data unencrypted and is insecure. Use SSH for secure remote access.

# CAVEATS

Transmits credentials and session data in plain text. Not recommended for use over untrusted networks. SSH is the secure alternative.

# HISTORY

Part of **GNU inetutils**, providing classic Unix networking utilities. Superseded by SSH for security reasons.

# SEE ALSO

[ssh](/man/ssh)(1), [rsh](/man/rsh)(1), [telnet](/man/telnet)(1)
