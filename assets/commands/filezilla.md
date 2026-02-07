# TAGLINE

graphical FTP/SFTP client

# TLDR

**Start FileZilla**

```filezilla```

**Connect to server**

```filezilla [ftp://user@host]```

**Connect with SFTP**

```filezilla [sftp://user@host]```

**Open site manager**

```filezilla --site [sitename]```

**Start minimized**

```filezilla -a```

# SYNOPSIS

**filezilla** [_options_] [_url_]

# PARAMETERS

_URL_
> Server URL to connect to.

**--site** _NAME_
> Connect to saved site.

**-a**, **--admin**
> Enable admin mode (minimized).

**-s**, **--sitemanager**
> Open Site Manager.

**-l** _PATH_, **--local** _PATH_
> Local start directory.

**--version**
> Display version.

**--help**
> Display help information.

# CONFIGURATION

**~/.config/filezilla/sitemanager.xml**
> Saved FTP/SFTP site configurations and connection profiles.

**~/.config/filezilla/filezilla.xml**
> General application settings and preferences.

# DESCRIPTION

**filezilla** is a graphical FTP, SFTP, and FTPS client. It provides file transfer with drag-and-drop, directory comparison, bookmarks, and transfer queue management.

The application supports multiple concurrent connections, resume for interrupted transfers, and configurable transfer speed limits. Site Manager stores connection profiles for quick access.

FileZilla handles large files and directories efficiently with its transfer queue and multi-threaded engine.

# CAVEATS

GUI application requires display. Stored passwords may be security risk. Very large directories may be slow to list.

# HISTORY

FileZilla was created by **Tim Kosse** in 2001, initially as a school project. It became one of the most popular open source FTP clients, later adding SFTP and FTPS support.

# SEE ALSO

[sftp](/man/sftp)(1), [ftp](/man/ftp)(1), [lftp](/man/lftp)(1)
