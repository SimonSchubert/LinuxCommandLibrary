# TAGLINE

lightweight SSH client from the Dropbear suite

# TLDR

**Connect** to a remote host

```dbclient [user]@[host]```

Connect on **specific port**

```dbclient [user]@[host] -p 2222```

Connect using **identity key**

```dbclient -i [path/to/key_file] [user]@[host]```

Run a **command** with TTY allocation

```dbclient [user]@[host] -t [command] [arguments]```

**Forward agent** connections

```dbclient -A [user]@[host]```

# SYNOPSIS

**dbclient** [_options_] [_user_@]_host_ [_command_]

# DESCRIPTION

**dbclient** is the SSH client from the Dropbear suite, a lightweight SSH implementation designed for embedded systems and environments with limited resources. It provides standard SSH functionality including remote shell access, command execution, port forwarding, and agent forwarding, all with a significantly smaller binary size and memory footprint than OpenSSH.

Dropbear is commonly found on routers, IoT devices, embedded Linux systems, and other resource-constrained environments. The entire suite (server and client) is typically under 110KB compressed, compared to several megabytes for OpenSSH.

dbclient supports the core SSH protocol features: public key authentication, password authentication, local and remote port forwarding, and TTY allocation for interactive sessions. However, it omits some advanced OpenSSH features to maintain its small size.

One notable difference is key format: dbclient uses Dropbear's own key format rather than OpenSSH's format. The **dropbearconvert** utility can convert between the two formats when needed.

# PARAMETERS

**-p** _port_
> Connect to specified port (default: 22)

**-i** _keyfile_
> Identity key file (Dropbear format); multiple allowed

**-l** _user_
> Login as user on the remote host

**-t**
> Allocate a PTY

**-T**
> Don't allocate a PTY

**-A**
> Forward authentication agent connections

**-L** _listenport:host:port_
> Local port forwarding

**-R** _listenport:host:port_
> Remote port forwarding

**-g**
> Allow non-local hosts to connect to forwarded ports

**-N**
> Don't request a remote shell

**-f**
> Fork into the background after authentication

**-y**
> Always accept unknown hostkeys without prompting

**-W** _windowsize_
> Per-channel receive window buffer size

**-K** _seconds_
> Keepalive interval in seconds

**-s**
> Request the remote command as a subsystem (used for sftp).

**-o** _option_
> Specify options in OpenSSH config file format (e.g., **-o** "StrictHostKeyChecking=no").

**-c** _cipherlist_
> Comma-separated list of ciphers to enable.

**-m** _MAClist_
> Comma-separated list of MACs to enable.

# CAVEATS

Uses Dropbear key format, not OpenSSH format. Use **dropbearconvert** to convert keys between formats. Does not support all OpenSSH config options via **-o**. Part of the Dropbear SSH suite, commonly used in embedded Linux systems.

# HISTORY

**dbclient** is part of the **Dropbear** SSH suite, created by **Matt Johnston**. Dropbear was designed for embedded systems where the full OpenSSH suite is too large, with the entire server and client typically under 110KB compressed.

# SEE ALSO

[ssh](/man/ssh)(1), [scp](/man/scp)(1), [dropbear](/man/dropbear)(8), [dropbearkey](/man/dropbearkey)(1), [dropbearconvert](/man/dropbearconvert)(1)
