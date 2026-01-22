# TLDR

**Check FTP credentials**

```nxc ftp [target] -u [user] -p [password]```

**Anonymous login check**

```nxc ftp [target] -u anonymous -p anonymous```

**List directory**

```nxc ftp [target] -u [user] -p [password] --ls [/path]```

**Download file**

```nxc ftp [target] -u [user] -p [password] --get [file]```

# SYNOPSIS

**nxc** **ftp** [_target_] [_options_]

# PARAMETERS

_TARGET_
> FTP server address.

**-u** _USER_
> Username.

**-p** _PASSWORD_
> Password.

**--ls** _PATH_
> List directory.

**--get** _FILE_
> Download file.

**--put** _FILE_
> Upload file.

**--help**
> Display help information.

# DESCRIPTION

**nxc ftp** is the NetExec FTP module. Tests FTP server security.

The tool checks credentials and access. Part of NetExec suite.

nxc ftp tests FTP servers.

# CAVEATS

Security tool. Authorized use only. Part of NetExec.

# HISTORY

nxc ftp provides **FTP penetration testing** capabilities within NetExec.

# SEE ALSO

[nxc](/man/nxc)(1), [ftp](/man/ftp)(1), [lftp](/man/lftp)(1)

