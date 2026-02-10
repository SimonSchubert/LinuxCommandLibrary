# TAGLINE

lists file attributes on Linux ext2/ext3/ext4 filesystems

# TLDR

**List** attributes

```lsattr```

List for **path**

```lsattr path/to/file```

**Recursive** listing

```lsattr -R```

Show **hidden** files

```lsattr -a```

List **directory** attributes

```lsattr -d```

# SYNOPSIS

**lsattr** [_OPTIONS_] [_files_...]

# DESCRIPTION

**lsattr** lists file attributes on Linux ext2/ext3/ext4 filesystems. It shows special attributes like immutable, append-only, and other extended attributes set by chattr.

# PARAMETERS

**-R**
> List attributes recursively

**-a**
> List all files including hidden ones

**-d**
> List directories themselves, not their contents

**-v**
> List file's version/generation number

**-l**
> Use long names instead of single character

# CAVEATS

Only shows attributes on filesystems that support extended attributes. The output format shows attribute letters followed by the filename.

# HISTORY

**lsattr** is part of **e2fsprogs**, providing attribute listing for Linux filesystems.

# SEE ALSO

[chattr](/man/chattr)(1), [ls](/man/ls)(1)
