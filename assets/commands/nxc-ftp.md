# TAGLINE

NetExec FTP protocol module

# TLDR

**Check FTP credentials**

```nxc ftp [target] -u [user] -p [password]```

**Check for anonymous login**

```nxc ftp [target] -u anonymous -p ''```

**Spray a user and password list against a subnet**

```nxc ftp [192.168.1.0/24] -u [users.txt] -p [passwords.txt] --continue-on-success```

**List files in a directory** (current directory if omitted)

```nxc ftp [target] -u [user] -p [password] --ls [/path]```

**Print a remote file**

```nxc ftp [target] -u [user] -p [password] --cat [/path/to/file]```

**Download a file**

```nxc ftp [target] -u [user] -p [password] --get [file]```

**Upload a file**

```nxc ftp [target] -u [user] -p [password] --put [local_file] [remote_file]```

# SYNOPSIS

**nxc** **ftp** _target_ [_options_]

# PARAMETERS

_target_
> IP, hostname, CIDR range, IP range or file containing targets.

**-u** _user_
> Username(s) or file of usernames.

**-p** _password_
> Password(s) or file of passwords.

**--port** _port_
> FTP port (default 21).

**--continue-on-success**
> Keep trying credentials after a valid login is found.

**--no-bruteforce**
> Pair user and password files line by line instead of trying every combination.

**--ls** [_directory_]
> List all files, including hidden ones, in a directory (default **.**).

**--cat** _file_
> Display the contents of a remote file.

**--get** _file_
> Download a file.

**--put** _local_file_ _remote_file_
> Upload a file.

# DESCRIPTION

**nxc ftp** is the FTP protocol module of NetExec. It tests credentials against FTP servers at scale (including anonymous access) and, once authenticated, lists, reads, downloads and uploads files.

# CAVEATS

Only use against systems you are authorized to test. FTP credentials travel in cleartext. Password spraying can trigger account lockouts or intrusion detection.

# SEE ALSO

[nxc](/man/nxc)(1), [netexec](/man/netexec)(1), [ftp](/man/ftp)(1), [lftp](/man/lftp)(1), [hydra](/man/hydra)(1)

# RESOURCES

```[Source code](https://github.com/Pennyw0rth/NetExec)```

```[Documentation](https://www.netexec.wiki/ftp-protocol/)```

<!-- verified: 2026-11-07 -->
