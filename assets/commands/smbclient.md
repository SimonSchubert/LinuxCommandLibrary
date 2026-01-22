# TLDR

**Connect** to a share

```smbclient //[server]/[share]```

Connect with **username**

```smbclient //[server]/[share] --user [username]```

Connect with **workgroup** and username

```smbclient //[server]/[share] --workgroup [domain] --user [username]```

Connect with username and **password**

```smbclient //[server]/[share] --user [username%password]```

**Download** a file

```smbclient //[server]/[share] --directory [path] --command "get [file.txt]"```

**Upload** a file

```smbclient //[server]/[share] --directory [path] --command "put [file.txt]"```

**List shares** anonymously

```smbclient --list=[server] --no-pass```

# SYNOPSIS

**smbclient** _//server/share_ [_OPTIONS_]

# PARAMETERS

**-U, --user** _username[%password]_
> Specify username and optional password

**-W, --workgroup** _domain_
> Set SMB workgroup/domain

**-N, --no-pass**
> Suppress password prompt for anonymous access

**-L, --list** _host_
> List available shares on server

**-D, --directory** _path_
> Change to initial directory on connection

**-c, --command** _commands_
> Execute semicolon-separated commands

**-I, --ip-address** _ip_
> Specify server IP directly

**-p, --port** _port_
> TCP port (default: 139 or 445)

**-m, --max-protocol** _level_
> Maximum SMB protocol (NT1, SMB2, SMB3)

**-A, --authentication-file** _file_
> Read credentials from file

**-T, --tar** _options_
> Tar backup mode with flags

**-d, --debuglevel** _level_
> Debug verbosity (0-10)

**-n, --netbiosname** _name_
> Override client NetBIOS name

# INTERACTIVE COMMANDS

**get** _remote_ [_local_]
> Download file from share

**put** _local_ [_remote_]
> Upload file to share

**ls** [_pattern_]
> List directory contents

**cd** _directory_
> Change remote directory

**lcd** _directory_
> Change local directory

**mkdir** _directory_
> Create remote directory

**rm** _file_
> Delete remote file

**exit**
> Close connection

# DESCRIPTION

**smbclient** is an FTP-like client for accessing SMB/CIFS network shares. It connects to Windows file servers and Samba shares, enabling file transfers, directory operations, and share browsing from the command line.

The tool supports interactive sessions with FTP-style commands or batch operations via **-c** flag. It can create tar backups of shares and browse available network resources.

# CAVEATS

Password on command line is visible in process listings; use **-A** for credentials file. Some features require specific SMB protocol versions. Firewall rules may block SMB ports (139, 445). NTLM authentication is being deprecated in favor of Kerberos.

# HISTORY

**smbclient** is part of **Samba**, created by **Andrew Tridgell** in **1992** after reverse-engineering the SMB protocol. Samba has evolved to support modern SMB2 and SMB3 protocols. The tool remains essential for cross-platform file sharing and accessing Windows shares from Linux.

# SEE ALSO

[mount.cifs](/man/mount.cifs)(8), [smbcacls](/man/smbcacls)(1), [smbget](/man/smbget)(1), [nmblookup](/man/nmblookup)(1)
