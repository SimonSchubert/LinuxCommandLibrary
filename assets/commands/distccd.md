# TAGLINE

distcc server daemon for distributed compilation

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

**distccd** is the distcc server daemon that receives and processes compilation jobs from distcc clients on a network. It accepts preprocessed source code, compiles it using local compilers, and returns the object files to the requesting client.

The daemon listens on TCP port 3632 by default and should be configured with access control to prevent unauthorized compilation requests. Security is implemented through IP address allowlists specified with the --allow option, as the protocol itself provides no authentication.

distccd can limit the number of concurrent compilation jobs to prevent system overload. It logs to syslog by default but can be configured to write to specific log files. The daemon typically runs as a dedicated user with limited privileges for security.

# CONFIGURATION

**/etc/default/distccd**
> Default configuration for distccd daemon on Debian-based systems.

**/etc/sysconfig/distccd**
> Default configuration for distccd daemon on Red Hat-based systems.

# CAVEATS

Ensure firewall allows connections on port 3632. Use --allow to restrict access to trusted networks only.

# SEE ALSO

[distcc](/man/distcc)(1), [ccache](/man/ccache)(1)
