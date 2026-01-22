# TLDR

Create **cramfs** from directory

```sudo mkfs.cramfs [path/to/directory] /dev/sdXY```

Create with **volume name**

```sudo mkfs.cramfs -n [volume_name] [path/to/directory] /dev/sdXY```

# SYNOPSIS

**mkfs.cramfs** [_options_] _directory_ _device_

# DESCRIPTION

**mkfs.cramfs** creates a compressed ROM filesystem (cramfs) inside a partition. Cramfs is a simple, read-only filesystem designed for small embedded systems and boot ROMs.

# PARAMETERS

**-n NAME**
> Set volume name (max 16 characters)

**-E**
> Treat warnings as errors

**-e EDITION**
> Set edition number

**-b BLOCKSIZE**
> Block size (default: PAGE_SIZE)

**-s, --sortbyname**
> Sort directory entries by name

# CAVEATS

Read-only filesystem. Maximum file size of 16MB. Maximum filesystem size of 256MB. Designed for embedded use.

# SEE ALSO

[mkfs](/man/mkfs)(8), [mount](/man/mount)(8)
