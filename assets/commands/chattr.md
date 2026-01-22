# TLDR

Make **immutable**

```sudo chattr +i path/to/file```

Remove **immutable**

```sudo chattr -i path/to/file```

**Recursive** immutable

```sudo chattr -R +i path/to/dir```

**Case-folding** directory

```chattr +F path/to/dir```

**Append-only** mode

```sudo chattr +a path/to/file```

# SYNOPSIS

**chattr** [_OPTIONS_] [_mode_] _files_...

# DESCRIPTION

**chattr** changes file attributes on Linux filesystems. These extended attributes provide security and administrative controls beyond standard permissions, such as making files immutable or append-only.

# PARAMETERS

**+attribute**
> Add attribute to file

**-attribute**
> Remove attribute from file

**=attribute**
> Set only the specified attributes

**-R**
> Change attributes recursively

**i**
> Immutable - cannot be modified, deleted, or renamed

**a**
> Append-only - can only be appended to

**s**
> Secure deletion - blocks overwritten with zeros

**S**
> Synchronous updates

**A**
> No atime updates

**c**
> Compressed

**e**
> Extent format (default on ext4)

**F**
> Case-fold directory (case-insensitive)

# CAVEATS

Requires appropriate capabilities or root privileges. Immutable files cannot be changed even by root until the attribute is removed. Not all filesystems support all attributes.

# HISTORY

**chattr** is part of **e2fsprogs**, providing extended attribute management for ext2/ext3/ext4 and other Linux filesystems.

# SEE ALSO

[lsattr](/man/lsattr)(1), [chmod](/man/chmod)(1)
