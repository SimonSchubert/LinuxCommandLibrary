# TAGLINE

creates ReiserFS filesystems

# TLDR

**Create ReiserFS filesystem**

```mkreiserfs [/dev/sdb1]```

**Force creation**

```mkreiserfs -f [/dev/sdb1]```

**Set label**

```mkreiserfs -l "[label]" [/dev/sdb1]```

**Set UUID**

```mkreiserfs -u [uuid] [/dev/sdb1]```

**Quiet mode**

```mkreiserfs -q [/dev/sdb1]```

# SYNOPSIS

**mkreiserfs** [_options_] _device_

# PARAMETERS

_DEVICE_
> Block device to format.

**-f**
> Force creation.

**-l** _LABEL_
> Volume label.

**-u** _UUID_
> Set UUID.

**-q**
> Quiet mode.

**--help**
> Display help information.

# DESCRIPTION

**mkreiserfs** creates ReiserFS filesystems. ReiserFS is a journaling filesystem.

The tool formats partitions with ReiserFS. Known for handling small files efficiently.

# CAVEATS

ReiserFS is legacy. Use ext4 or btrfs instead. Destroys existing data.

# HISTORY

mkreiserfs was part of **ReiserFS** tools, a journaling filesystem created by Hans Reiser.

# SEE ALSO

[mkfs.reiserfs](/man/mkfs.reiserfs)(8), [reiserfsck](/man/reiserfsck)(8), [mkfs](/man/mkfs)(8)

