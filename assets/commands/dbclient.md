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

**dbclient** is the SSH client from the Dropbear suite, a lightweight SSH implementation designed for embedded systems and environments with limited resources.

It provides standard SSH functionality with a smaller footprint than OpenSSH.

# PARAMETERS

**-p** _port_
> Connect to specified port

**-i** _keyfile_
> Identity key file (Dropbear format)

**-t**
> Allocate a TTY

**-A**
> Forward authentication agent

**-L** _port:host:port_
> Local port forwarding

**-R** _port:host:port_
> Remote port forwarding

**-N**
> Don't request a shell

# CAVEATS

Uses Dropbear key format, not OpenSSH format. Use dropbearconvert to convert keys. Part of the Dropbear SSH suite, commonly used in embedded Linux systems.

# SEE ALSO

[ssh](/man/ssh)(1), [dropbear](/man/dropbear)(8), [dropbearconvert](/man/dropbearconvert)(1)
