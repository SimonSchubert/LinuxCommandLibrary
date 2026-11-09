# TAGLINE

netkit FTP client

# TLDR

**Connect to FTP server**

```netkit-ftp [ftp.example.com]```

**Connect to a server on a specific port**

```netkit-ftp [ftp.example.com] [2121]```

**Connect in passive mode (useful behind firewalls)**

```netkit-ftp -p [ftp.example.com]```

**Connect with verbose output**

```netkit-ftp -v [ftp.example.com]```

**Connect without auto-login**

```netkit-ftp -n [ftp.example.com]```

**Connect with non-interactive multi-file transfers**

```netkit-ftp -i [ftp.example.com]```

**Enable debugging**

```netkit-ftp -d [ftp.example.com]```

# SYNOPSIS

**netkit-ftp** [**-46pinegvd**] [_host_ [_port_]]

**pftp** [**-46inegvd**] [_host_ [_port_]]

# PARAMETERS

_HOST_
> FTP server hostname.

_PORT_
> Port to connect to on the server.

**-4**
> Use only IPv4 to contact the host.

**-6**
> Use only IPv6 to contact the host.

**-p**
> Use passive mode for data transfers. Default when invoked as pftp.

**-i**
> Turn off interactive prompting during multiple file transfers.

**-n**
> Do not attempt auto-login upon initial connection (skip .netrc lookup).

**-e**
> Disable command editing and history support, if compiled in.

**-g**
> Disable file name globbing.

**-v**
> Verbose output; show all responses from the remote server and data transfer statistics.

**-d**
> Enable debugging.

# DESCRIPTION

**netkit-ftp** is the classic Internet file transfer program. It provides an interactive command-line interface to the standard File Transfer Protocol, allowing users to transfer files to and from a remote network site. It supports auto-login via the .netrc file, passive mode for firewall traversal, and interactive file globbing.

# CAVEATS

Transfers are unencrypted, including passwords. Consider **sftp** or **lftp** for secure transfers. The binary name depends on packaging, and it is often installed simply as **ftp**. Recent Debian releases build their **ftp** package from tnftp instead of netkit, so its options may differ.

# HISTORY

netkit-ftp comes from **Linux NetKit**, a collection of network utilities whose last release was 0.17. Upstream is no longer active and the code survives through distribution patches.

# SEE ALSO

[ftp](/man/ftp)(1), [sftp](/man/sftp)(1), [lftp](/man/lftp)(1)
