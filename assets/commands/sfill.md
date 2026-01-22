# TLDR

**Securely wipe** free space (38 writes)

```sfill /path/to/mounted_disk```

**Fast wipe** with 6 writes

```sfill -l -v /path/to/mounted_disk```

**Fastest wipe** with 1 write

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
> Use less secure mode with fewer overwrites (6 passes instead of 38)

**-ll**
> Use fast mode with single overwrite pass

**-v**
> Verbose mode; show progress

**-I**
> Overwrite only free disk space, not inodes

**-i**
> Overwrite only free inodes, not disk space

**-f**
> Force operation without prompting

**-z**
> Final overwrite with zeros instead of random data

# CAVEATS

This operation is time-consuming, especially with the default 38 passes. SSDs may not be effectively wiped due to wear leveling. The target must be a mounted filesystem, not a raw device.

# HISTORY

**sfill** is part of the **secure-delete** package, providing tools for securely erasing data to prevent forensic recovery.

# SEE ALSO

[srm](/man/srm)(1), [smem](/man/smem)(1), [sswap](/man/sswap)(1), [shred](/man/shred)(1)
