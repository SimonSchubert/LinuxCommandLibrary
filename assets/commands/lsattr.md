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

List **directory** attributes (not its contents)

```lsattr -d [path/to/dir]```

Show attributes with **long names**

```lsattr -l [path/to/file]```

List attributes with **version numbers**

```lsattr -v [path/to/file]```

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

**-p**
> List file's project number

**-l**
> Use long names instead of single character abbreviations

**-V**
> Display the program version

# CAVEATS

Only shows attributes on filesystems that support extended attributes (ext2/ext3/ext4, btrfs). The output format shows attribute flags as single characters (e.g., i for immutable, a for append-only) with a dash (-) for unset flags, followed by the filename.

# HISTORY

**lsattr** is part of **e2fsprogs**, providing attribute listing for Linux filesystems.

# SEE ALSO

[chattr](/man/chattr)(1), [ls](/man/ls)(1)
