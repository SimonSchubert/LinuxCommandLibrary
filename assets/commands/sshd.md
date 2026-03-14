# TAGLINE

OpenSSH SSH daemon

# TLDR

**Start SSH daemon**

```sshd```

**Test configuration** for syntax errors

```sshd -t```

**Run in foreground** (useful for containers)

```sshd -D```

**Use alternate config** file

```sshd -f [/etc/ssh/sshd_config]```

**Debug mode** (single connection, verbose output)

```sshd -d```

**Extended debug** (maximum verbosity)

```sshd -ddd```

**Specify listen port**

```sshd -p [2222]```

**Extended test mode** with match criteria

```sshd -T -C user=[testuser],host=[example.com]```

# SYNOPSIS

**sshd** [**-46DdeGiqTtV**] [**-C** _connection_spec_] [**-f** _config_file_] [**-g** _login_grace_time_] [**-h** _host_key_file_] [**-o** _option_] [**-p** _port_] [**-u** _len_]

# PARAMETERS

**-D**
> Run in foreground, do not daemonize

**-d**
> Debug mode; process one connection with verbose output. Multiple -d increases verbosity (max 3).

**-t**
> Test mode; validate configuration file syntax

**-T**
> Extended test mode; output effective configuration to stdout

**-C** _connection_spec_
> Specify connection parameters for -T match testing (user, host, addr, laddr, lport, rdomain)

**-f** _file_
> Specify configuration file (default: /etc/ssh/sshd_config)

**-h** _host_key_file_
> Specify host key file (can be given multiple times for different key types)

**-g** _login_grace_time_
> Grace time for client authentication (default: 120 seconds)

**-p** _port_
> Listen port (can be given multiple times)

**-o** _option_
> Specify configuration options in key=value format

**-E** _log_file_
> Append debug logs to log_file instead of system log

**-e**
> Write debug logs to stderr instead of system log

**-q**
> Quiet mode; suppress non-fatal log messages

**-4**
> Force IPv4 addresses only

**-6**
> Force IPv6 addresses only

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

Requires root to bind privileged ports (below 1024). Misconfiguration can lock you out of the system. Always test configuration changes with **-t** before restarting, and keep an active session open during changes.

# HISTORY

**sshd** is part of **OpenSSH**, developed by the OpenBSD project starting in **1999**. It replaced insecure protocols like telnet and rsh.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1)
