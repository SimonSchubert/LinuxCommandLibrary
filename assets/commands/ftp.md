# TAGLINE

File Transfer Protocol client

# TLDR

**Connect to server**

```ftp [ftp.example.com]```

**Connect with username**

```ftp [username]@[ftp.example.com]```

**Non-interactive mode**

```ftp -n [ftp.example.com]```

**Download file**

```ftp> get [remote_file] [local_file]```

**Upload file**

```ftp> put [local_file] [remote_file]```

# SYNOPSIS

**ftp** [_options_] [_host_]

# PARAMETERS

_HOST_
> FTP server hostname or IP.

**-n**
> No auto-login.

**-i**
> No interactive prompts for multiple transfers.

**-v**
> Verbose mode.

**-p**
> Passive mode.

**get** _FILE_
> Download file.

**put** _FILE_
> Upload file.

**mget** _FILES_
> Download multiple files.

**--help**
> Display help information.

# CONFIGURATION

**~/.netrc**
> Stores FTP credentials for auto-login (format: machine host login user password pass).

# DESCRIPTION

**ftp** is the standard File Transfer Protocol client for transferring files between local and remote systems. It provides an interactive command interface for file operations.

The client supports navigation, file listing, binary/ASCII transfer modes, and batch transfers. Passive mode helps with firewalls. The protocol transmits credentials in cleartext.

ftp remains useful for accessing legacy systems and public FTP archives.

# CAVEATS

**Insecure** - passwords sent in cleartext. Use SFTP or FTPS for sensitive data. Firewall issues with active mode.

# HISTORY

ftp is one of the oldest Internet protocols, standardized in **RFC 959** (1985). While largely replaced by secure alternatives, it remains widely deployed for anonymous file archives.

# SEE ALSO

[sftp](/man/sftp)(1), [lftp](/man/lftp)(1), [curl](/man/curl)(1)
