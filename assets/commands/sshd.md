# TLDR

**Start SSH daemon**

```sshd```

**Test configuration**

```sshd -t```

**Run in foreground**

```sshd -D```

**Use alternate config**

```sshd -f [/etc/ssh/sshd_config]```

**Debug mode**

```sshd -d```

**Extended debug**

```sshd -ddd```

**Specify port**

```sshd -p [2222]```

# SYNOPSIS

**sshd** [_-D_] [_-d_] [_-f config_] [_-p port_] [_options_]

# PARAMETERS

**-D**
> Foreground mode.

**-d**
> Debug mode.

**-t**
> Test configuration.

**-f** _FILE_
> Config file.

**-p** _PORT_
> Listen port.

**-e**
> Log to stderr.

**-q**
> Quiet mode.

**-4**
> IPv4 only.

**-6**
> IPv6 only.

# DESCRIPTION

**sshd** is the OpenSSH server daemon. It listens for SSH connections and authenticates users.

Configuration file controls behavior. Authentication methods, access controls, and features.

Debug mode helps troubleshoot connections. Multiple -d flags increase verbosity.

Test mode validates configuration. Catches errors before restart.

Foreground mode is useful for containers. Daemon doesn't detach from terminal.

# CAVEATS

Requires root to bind port 22. Misconfiguration can lock you out. Test changes carefully.

# HISTORY

**sshd** is part of **OpenSSH**, developed by the OpenBSD project starting in **1999**. It replaced insecure protocols like telnet and rsh.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [sshd_config](/man/sshd_config)(5)
