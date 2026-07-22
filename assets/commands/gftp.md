# TAGLINE

graphical FTP and SFTP client

# TLDR

**Start gFTP**

```gftp```

**Connect to server**

```gftp [ftp.example.com]```

**Connect with port**

```gftp [ftp://server:2121]```

**Connect via SSH**

```gftp [ssh://user@server]```

# SYNOPSIS

**gftp** [_options_] [_url_]

# PARAMETERS

_URL_
> Server URL to connect to.

**--help**
> Display help information.

**--version**
> Display version.

# DESCRIPTION

**gftp** is a graphical FTP, SFTP, and HTTP client for Linux. It provides a dual-pane file manager interface for transferring files between local and remote systems.

The application supports multiple protocols, bookmarks, queue management, and recursive transfers. It handles resume for interrupted transfers.

gftp offers a user-friendly alternative to command-line file transfer tools.

# CAVEATS

GTK application requires X/Wayland. FTP credentials sent in cleartext. Some features protocol-dependent.

# HISTORY

gFTP was created by **Brian Masney** in 1998 as a GTK-based FTP client for Linux, later adding support for SFTP and other protocols.

# INSTALL

```dnf: sudo dnf install gftp```

```nix: nix profile install nixpkgs#gftp```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ftp](/man/ftp)(1), [sftp](/man/sftp)(1), [filezilla](/man/filezilla)(1)

# RESOURCES

```[Source code](https://github.com/masneyb/gftp)```

<!-- verified: 2026-07-15 -->
