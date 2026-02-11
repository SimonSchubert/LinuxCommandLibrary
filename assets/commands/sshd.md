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

**sshd** is the OpenSSH server daemon that listens for incoming SSH connections, authenticates users, and provides encrypted remote shell access, file transfer, and port forwarding services. It is the server-side counterpart to the **ssh** client.

The daemon supports multiple authentication methods including public key, password, keyboard-interactive, and GSSAPI/Kerberos. Access can be restricted by user, group, and source address through configuration directives. Features like X11 forwarding, agent forwarding, and TCP port forwarding are individually controllable.

Debug mode (**-d**) runs a single connection in the foreground with verbose output for troubleshooting, while **-t** validates the configuration file for syntax errors before restarting the service. Foreground mode (**-D**) is commonly used in container environments where the daemon should not detach from the controlling process.

# CONFIGURATION

**/etc/ssh/sshd_config**
> Main configuration file controlling authentication methods, access restrictions, port, protocol options, forwarding permissions, and logging.

**/etc/ssh/ssh_host_*_key**
> Host key files (RSA, Ed25519, ECDSA) used to identify the server to connecting clients.

**/etc/ssh/sshd_config.d/**
> Drop-in configuration directory for modular configuration snippets (included via Include directive).

# CAVEATS

Requires root to bind port 22. Misconfiguration can lock you out. Test changes carefully.

# HISTORY

**sshd** is part of **OpenSSH**, developed by the OpenBSD project starting in **1999**. It replaced insecure protocols like telnet and rsh.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [sshd_config](/man/sshd_config)(5)
