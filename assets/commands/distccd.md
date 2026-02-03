# TLDR

**Start distcc daemon**

```distccd --daemon```

**Start with allowed hosts**

```distccd --daemon --allow [192.168.1.0/24]```

**Start in foreground**

```distccd --no-detach --daemon --allow [0.0.0.0/0]```

**Specify listen address**

```distccd --daemon --listen [0.0.0.0]```

# SYNOPSIS

**distccd** [_options_]

# PARAMETERS

**--daemon**
> Run as a daemon.

**--allow** _spec_
> Allow connections from specified addresses.

**--listen** _addr_
> Listen on specified address.

**--no-detach**
> Don't detach from terminal.

**--port** _port_
> Listen on specified port (default 3632).

**--jobs** _n_
> Maximum concurrent jobs.

**--log-file** _file_
> Log to file instead of syslog.

# DESCRIPTION

**distccd** is the distcc server daemon for distributed C/C++ compilation. It receives compilation jobs from distcc clients and compiles them locally.

Distcc distributes compilation across multiple machines to speed up builds.

# CAVEATS

Ensure firewall allows connections on port 3632. Use --allow to restrict access to trusted networks only.

# SEE ALSO

[distcc](/man/distcc)(1), [ccache](/man/ccache)(1)
