# TAGLINE

guacamole proxy daemon, the core component of Apache Guacamole

# TLDR

**Start guacd daemon**

```guacd```

**Run in foreground**

```guacd -f```

**Listen on specific address and port**

```guacd -b [0.0.0.0] -l [4822]```

**Run with debug logging**

```guacd -f -L debug```

**Specify PID file**

```guacd -p [/var/run/guacd.pid]```

# SYNOPSIS

**guacd** [_options_]

# PARAMETERS

**-b** _address_
> Bind to specified address.

**-l** _port_
> Listen on specified port (default 4822).

**-f**
> Run in foreground.

**-L** _level_
> Log level (error, warning, info, debug).

**-p** _file_
> PID file location.

**-C** _file_
> SSL certificate file.

**-K** _file_
> SSL private key file.

# DESCRIPTION

**guacd** is the Guacamole proxy daemon, the core component of Apache Guacamole. It handles connections between the Guacamole web application and remote desktop protocols (VNC, RDP, SSH, Telnet, Kubernetes). Written in C for performance, it translates these protocols into the Guacamole protocol for browser-based access.

# SEE ALSO

[sshd](/man/sshd)(1), [xrdp](/man/xrdp)(1)

