# TAGLINE

mount SMB3 network shares

# TLDR

This command is an alias of **mount.cifs** limited to the SMB3 filesystem.

**Mount SMB3 share** with username

```sudo mount.smb3 -o username=[user] //[server]/[share] [/mnt/point]```

Mount as **guest user**

```sudo mount.smb3 -o guest //[server]/[share] [/mnt/point]```

**Mount with credentials file**

```sudo mount.smb3 -o credentials=[/etc/samba/creds] //[server]/[share] [/mnt/point]```

**Mount with specific permissions**

```sudo mount.smb3 -o username=[user],uid=[1000],gid=[1000],file_mode=[0644],dir_mode=[0755] //[server]/[share] [/mnt/point]```

**Mount with encryption**

```sudo mount.smb3 -o username=[user],seal //[server]/[share] [/mnt/point]```

# SYNOPSIS

**mount.smb3** _//server/share_ _mount-point_ [**-o** _options_]

# PARAMETERS

**username=**_arg_
> Username for authentication. Defaults to the USER environment variable.

**password=**_arg_
> Password for authentication. Using a credentials file is more secure.

**credentials=**_filename_
> File containing username, password, and optionally domain.

**domain=**_arg_
> Workgroup or domain for authentication.

**guest**
> Connect without a password.

**sec=**_mode_
> Security mode (krb5, krb5i, ntlmv2, ntlmv2i, ntlmssp, ntlmsspi, none).

**uid=**_arg_
> Owner UID for files on the mounted share.

**gid=**_arg_
> Owner GID for files on the mounted share.

**file_mode=**_mode_
> Default file permissions (octal).

**dir_mode=**_mode_
> Default directory permissions (octal).

**seal**
> Enable SMB3 encryption for all data.

**vers=**_version_
> SMB protocol version (3.0, 3.02, 3.1.1).

**cache=**_mode_
> Cache mode (none, strict, loose).

**ro**
> Mount read-only.

**rw**
> Mount read-write.

**multiuser**
> Allow different users to access the mount with individual credentials.

**nounix**
> Disable Unix Extensions.

# DESCRIPTION

**mount.smb3** mounts SMB3 network shares to local directories. It is a symbolic link to **mount.cifs** that is limited to the SMB3 filesystem. It can also be invoked via **mount -t smb3**.

For older SMB versions, use mount.cifs with the **vers=** option instead.

# CAVEATS

Requires the cifs-utils package. Passwords on the command line are visible in process listings; use a credentials file instead. Kerberos authentication requires a valid keytab or ticket.

# SEE ALSO

[mount.cifs](/man/mount.cifs)(8), [mount](/man/mount)(8), [umount](/man/umount)(8), [smbclient](/man/smbclient)(1), [fstab](/man/fstab)(5)
