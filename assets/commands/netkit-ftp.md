# TLDR

**Connect to FTP server**

```netkit-ftp [ftp.example.com]```

**Connect with username**

```netkit-ftp -u [username] [host]```

**Passive mode**

```netkit-ftp -p [host]```

**Verbose mode**

```netkit-ftp -v [host]```

**Debug mode**

```netkit-ftp -d [host]```

# SYNOPSIS

**netkit-ftp** [_options_] [_host_]

# PARAMETERS

_HOST_
> FTP server hostname.

**-u** _USER_
> Username.

**-p**
> Use passive mode.

**-v**
> Verbose output.

**-d**
> Debug mode.

**--help**
> Display help information.

# DESCRIPTION

**netkit-ftp** is the netkit FTP client. It transfers files over FTP protocol.

The tool connects to FTP servers. Interactive command-line interface.

netkit-ftp is traditional FTP client.

# CAVEATS

Unencrypted protocol. Legacy tool. Consider sftp for secure transfers.

# HISTORY

netkit-ftp is part of **netkit**, providing standard Unix network utilities since the early internet era.

# SEE ALSO

[ftp](/man/ftp)(1), [sftp](/man/sftp)(1), [lftp](/man/lftp)(1)

