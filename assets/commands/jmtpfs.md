# TAGLINE

FUSE filesystem for accessing MTP devices like Android phones

# TLDR

**Mount MTP device to directory**

```jmtpfs [mountpoint]```

**Mount with specific device**

```jmtpfs -device=[bus],[dev] [mountpoint]```

**List available MTP devices**

```jmtpfs -l```

**Unmount MTP device**

```fusermount -u [mountpoint]```

# SYNOPSIS

**jmtpfs** [_options_] [_mountpoint_]

# PARAMETERS

**-l**
> List available MTP devices.

**-device=**_bus_,_dev_
> Specify device by bus and device number.

**-o** _options_
> Pass FUSE mount options.

# DESCRIPTION

**jmtpfs** is a FUSE filesystem for accessing MTP (Media Transfer Protocol) devices like Android phones, tablets, and media players. It uses libmtp and allows mounting MTP devices as regular filesystems for file transfer operations.

# SEE ALSO

[fusermount](/man/fusermount)(1), [mtpfs](/man/mtpfs)(1)

