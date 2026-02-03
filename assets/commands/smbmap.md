# TLDR

**List shares on host**

```smbmap -H [192.168.1.100]```

**Authenticate with credentials**

```smbmap -H [192.168.1.100] -u [user] -p [password]```

**List share contents**

```smbmap -H [192.168.1.100] -u [user] -p [password] -r [share]```

**Download file**

```smbmap -H [192.168.1.100] -u [user] -p [password] --download '[share/file.txt]'```

**Execute command**

```smbmap -H [192.168.1.100] -u [admin] -p [password] -x '[whoami]'```

# SYNOPSIS

**smbmap** [_options_]

# PARAMETERS

**-H** _host_
> Target host.

**-u** _user_
> Username.

**-p** _pass_
> Password.

**-d** _domain_
> Domain.

**-r** _share_
> Recursively list share.

**--download** _path_
> Download file.

**--upload** _src_ _dst_
> Upload file.

**-x** _cmd_
> Execute command.

**-L**
> List drives.

# DESCRIPTION

**smbmap** enumerates SMB share permissions and contents. Security tool for authorized penetration testing and share auditing. Shows read/write access levels and enables file operations.

# CAVEATS

For authorized security assessments only. Requires proper authorization before use.

# SEE ALSO

[smbclient](/man/smbclient)(1), [enum4linux](/man/enum4linux)(1)

