# TAGLINE

Open-source disk encryption software

# TLDR

**Create** new volume

```veracrypt -t -c --random-source=/dev/urandom```

**Mount** volume interactively

```veracrypt -t [path/to/volume] [path/to/mount_point]```

Mount with **keyfile**

```veracrypt -k [path/to/keyfile] [/dev/sdXN] [path/to/mount_point]```

**Dismount** volume

```veracrypt -d [path/to/mounted_point]```

# SYNOPSIS

**veracrypt** [_OPTIONS_] [_VOLUME_] [_MOUNT_POINT_]

# PARAMETERS

**-t, --text**
> Use text user interface

**-c, --create**
> Create a new volume

**-k, --keyfiles** _FILE_
> Use keyfile for decryption

**-d, --dismount**
> Dismount a volume

**--random-source** _FILE_
> Source of random data for volume creation

**-p, --password** _PASSWORD_
> Specify password (less secure)

# DESCRIPTION

**veracrypt** is free and open source disk encryption software. It creates encrypted containers (file-hosted volumes) or encrypts entire partitions or drives, providing on-the-fly encryption.

VeraCrypt supports multiple encryption algorithms and can create hidden volumes for plausible deniability.

# CAVEATS

Forgetting password or losing keyfile results in permanent data loss. Volume creation can be slow. Some features require root privileges.

# HISTORY

**VeraCrypt** is a fork of the discontinued TrueCrypt project, continuing development with security improvements and new features.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8)
