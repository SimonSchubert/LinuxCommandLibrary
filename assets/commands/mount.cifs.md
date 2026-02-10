# TAGLINE

mounts CIFS or SMB network shares on Linux

# TLDR

**Mount SMB share** with username (prompts for password)

```sudo mount.cifs -o user=[username] //[server]/[share] [mountpoint]```

Mount as **guest user** (no password)

```sudo mount.cifs -o guest //[server]/[share] [mountpoint]```

Set **ownership** for mounted files

```sudo mount.cifs -o uid=[user],gid=[group] //[server]/[share] [mountpoint]```

Mount with **credentials file**

```sudo mount.cifs -o credentials=[path/to/credentials] //[server]/[share] [mountpoint]```

Specify **SMB protocol version**

```sudo mount.cifs -o vers=3.0 //[server]/[share] [mountpoint]```

Mount **read-only**

```sudo mount.cifs -o ro //[server]/[share] [mountpoint]```

# SYNOPSIS

**mount.cifs** _//server/share_ _mount-point_ [**-o** _options_]

# PARAMETERS

**user=_username_**
> Login username; defaults to USER environment variable

**password=_pass_**
> Login password; uses PASSWD variable if unset

**credentials=_file_**
> File containing username, password, and domain

**guest**
> Connect without password prompt

**domain=_name_**
> Windows domain or workgroup name

**uid=_id_**
> Set owner UID for files when server provides none

**gid=_id_**
> Set owner GID for files when server provides none

**file_mode=_mode_**
> Override default file permissions (e.g., 0644)

**dir_mode=_mode_**
> Override default directory permissions (e.g., 0755)

**vers=_version_**
> SMB protocol version: 1.0, 2.0, 2.1, 3.0, 3.02, 3.1.1

**sec=_mode_**
> Security mode: none, krb5, ntlm, ntlmv2, ntlmssp

**seal**
> Request SMB-layer encryption (requires SMB3+)

**cache=_mode_**
> Caching mode: none, strict, loose

**ro**
> Mount read-only

**rw**
> Mount read-write (default)

**noperm**
> Disable client-side permission checks

**cifsacl**
> Map CIFS/NTFS ACLs to Linux permissions

# DESCRIPTION

**mount.cifs** mounts CIFS (Common Internet File System) or SMB (Server Message Block) network shares on Linux. It connects to Windows file shares, Samba servers, and NAS devices using the //server/share UNC syntax.

The utility is typically invoked through the mount command with -t cifs option. It requires Linux kernel CIFS filesystem support. Authentication can use username/password, Kerberos, or guest access.

# CREDENTIALS FILE FORMAT

```
username=myuser
password=mypassword
domain=WORKGROUP
```

# CAVEATS

Passwords containing commas fail to parse on command line; use credentials files or environment variables instead. The cache=loose option can cause data corruption with multiple clients; use cache=strict for shared access. Requires root privileges unless configured in /etc/fstab with user option.

# HISTORY

The Linux CIFS filesystem was developed as a replacement for the older smbfs. It provides native kernel support for Microsoft's SMB/CIFS protocol, enabling seamless integration with Windows networks and Samba servers.

# SEE ALSO

[mount](/man/mount)(8), [smbclient](/man/smbclient)(1), [umount](/man/umount)(8), [fstab](/man/fstab)(5)
