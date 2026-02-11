# TAGLINE

Lightweight Subversion repository server

# TLDR

**Start as daemon** serving repositories

```svnserve -d -r [/path/to/repos]```

**Start in foreground** for debugging

```svnserve -d --foreground -r [/path/to/repos]```

**Listen on specific port**

```svnserve -d -r [/path/to/repos] --listen-port [3690]```

**Listen on specific interface**

```svnserve -d -r [/path/to/repos] --listen-host [192.168.1.1]```

**Run in inetd mode**

```svnserve -i```

**Run in tunnel mode** for SSH

```svnserve -t```

**Use custom configuration file**

```svnserve -d -r [/path/to/repos] --config-file [/etc/svnserve.conf]```

# SYNOPSIS

**svnserve** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run as daemon, accepting TCP connections on svn port (3690).

**-i**, **--inetd**
> Run in inetd mode using stdin/stdout.

**-t**, **--tunnel**
> Run in tunnel mode for SSH access, pre-authenticated.

**-X**, **--listen-once**
> Accept one connection, serve it, and exit.

**-r**, **--root** _path_
> Set virtual root for served repositories.

**--listen-port** _port_
> Listen on specified port (default 3690).

**--listen-host** _host_
> Listen on specified interface or hostname.

**--foreground**
> Stay in foreground (with -d), for debugging.

**--tunnel-user** _name_
> Override authenticated username in tunnel mode.

**--config-file** _file_
> Use specified configuration file.

**--pid-file** _file_
> Write process ID to file.

**--log-file** _file_
> Write logs to specified file.

**--threads**
> Use threads instead of forking.

**--min-threads** _n_
> Minimum number of threads in pool.

**--max-threads** _n_
> Maximum number of threads in pool.

**-h**, **--help**
> Display usage information.

**--version**
> Display version information.

# DESCRIPTION

**svnserve** is a lightweight server for Subversion repositories using Subversion's custom network protocol. It provides access to repositories via the svn:// and svn+ssh:// URL schemes.

The server supports multiple operating modes: as a standalone daemon listening on TCP port 3690, as an inetd/xinetd service, or as a tunnel process spawned by SSH. The tunnel mode allows secure access without exposing the svn port.

The -r option sets a virtual root, restricting client access to repositories under that path and simplifying URLs. Authentication can be configured per-repository or globally using a shared configuration file.

For high-traffic environments, svnserve supports thread pools instead of fork-per-connection.

# CAVEATS

Uses plain text authentication by default unless tunneled through SSH or configured for SASL. No built-in SSL support; use SSH tunneling or svn+ssh:// for encryption. Access control is less granular than Apache-based serving. Firewall must allow port 3690 for daemon mode.

# HISTORY

**svnserve** was included in Subversion from early versions as a lightweight alternative to Apache-based repository serving. It provides faster setup and lower overhead for smaller deployments. The svn:// protocol was designed for simplicity while svn+ssh:// leverages SSH for authentication and encryption.

# SEE ALSO

[svnadmin](/man/svnadmin)(1), [svn](/man/svn)(1), [xinetd](/man/xinetd)(8), [sshd](/man/sshd)(8)
