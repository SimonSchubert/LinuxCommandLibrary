# TAGLINE

symbolic link to **mount

# TLDR

This command is an alias of **mount.cifs** with SMB3 as the default protocol version.

**Mount SMB3 share** with username

```sudo mount.smb3 -o user=[username] //[server]/[share] [mountpoint]```

Mount as **guest user**

```sudo mount.smb3 -o guest //[server]/[share] [mountpoint]```

# SYNOPSIS

**mount.smb3** _//server/share_ _mount-point_ [**-o** _options_]

# DESCRIPTION

**mount.smb3** is a symbolic link to **mount.cifs** that defaults to using SMB protocol version 3. It provides the same functionality as mount.cifs but is optimized for modern SMB3 connections.

For SMB versions before 3, use mount.cifs with the vers= option to specify the protocol version explicitly.

# SEE ALSO

[mount.cifs](/man/mount.cifs)(8), [mount](/man/mount)(8), [smbclient](/man/smbclient)(1)
