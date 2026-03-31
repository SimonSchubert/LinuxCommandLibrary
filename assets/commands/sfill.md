# TAGLINE

Securely wipe free disk space

# TLDR

**Securely wipe** free space (38 passes)

```sfill /path/to/mounted_disk```

**Reduced security wipe** with 2 passes

```sfill -l -v /path/to/mounted_disk```

**Fastest wipe** with 1 random pass

```sfill -ll -v /path/to/mounted_disk```

Wipe only **free space** (not inodes)

```sfill -I /path/to/mounted_disk```

Wipe only **free inodes**

```sfill -i /path/to/mounted_disk```

# SYNOPSIS

**sfill** [_options_] _directory_

# DESCRIPTION

**sfill** securely overwrites the free space and inodes of a partition where the specified directory resides. It uses multiple passes to prevent recovery of previously deleted files.

# PARAMETERS

**-l**
> Lessens security. Only two passes are written: one with 0xff and a final one with random values.

**-ll**
> Lessens security even further. Only one random pass is written.

**-v**
> Verbose mode; show progress

**-I**
> Overwrite only free disk space, not inodes

**-i**
> Overwrite only free inodes, not disk space

**-f**
> Fast and insecure mode. No /dev/urandom, no synchronize mode.

**-z**
> Final overwrite with zeros instead of random data

# CAVEATS

This operation is time-consuming, especially with the default 38 passes. SSDs may not be effectively wiped due to wear leveling. The target must be a mounted filesystem, not a raw device.

# HISTORY

**sfill** is part of the **secure-delete** package, providing tools for securely erasing data to prevent forensic recovery.

# SEE ALSO

[srm](/man/srm)(1), [shred](/man/shred)(1), [wipe](/man/wipe)(1)
