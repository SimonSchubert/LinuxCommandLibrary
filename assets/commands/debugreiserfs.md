# TAGLINE

debugging tool for ReiserFS filesystems

# TLDR

**Display superblock** information

```debugreiserfs [/dev/sda1]```

**Dump filesystem tree**

```debugreiserfs -d [/dev/sda1]```

**Print journal contents**

```debugreiserfs -j [/dev/sda1]```

**Display block** information

```debugreiserfs -1 [block_number] [/dev/sda1]```

**Scan for reiserfs** filesystem

```debugreiserfs -S [/dev/sda1]```

**Unpack metadata** to directory

```debugreiserfs -u [/output/dir] [/dev/sda1]```

# SYNOPSIS

**debugreiserfs** [_options_] _device_

# PARAMETERS

_DEVICE_
> ReiserFS filesystem device to examine.

**-d**
> Dump the filesystem tree.

**-j**
> Print journal contents.

**-J**
> Print journal header only.

**-1** _BLOCK_
> Print information about specific block.

**-S**
> Scan partition for reiserfs filesystem.

**-u** _DIR_
> Unpack metadata to directory.

**-p**
> Print item contents in hex.

**-q**
> Quiet mode.

# DESCRIPTION

**debugreiserfs** is a debugging tool for ReiserFS filesystems. It displays internal filesystem structures including the superblock, journal, and B+ tree nodes without mounting the filesystem.

The tool is valuable for diagnosing ReiserFS problems, understanding filesystem structure, and recovering data. It can dump the entire filesystem tree, examine specific blocks, and extract metadata for analysis.

debugreiserfs operates on unmounted filesystems and provides low-level access to ReiserFS internals that are not visible through normal filesystem operations.

# CAVEATS

Only works with ReiserFS (v3) filesystems. Device should not be mounted during examination for consistent results. Some operations require significant time on large filesystems. Does not support Reiser4.

# HISTORY

debugreiserfs was developed as part of the **reiserfsprogs** package. ReiserFS was created by **Hans Reiser** and Namesys, introduced in Linux 2.4.1 (**2001**) as the first journaling filesystem included in the mainline kernel.

# SEE ALSO

[reiserfsck](/man/reiserfsck)(8), [mkfs.reiserfs](/man/mkfs.reiserfs)(8), [debugfs](/man/debugfs)(8)
