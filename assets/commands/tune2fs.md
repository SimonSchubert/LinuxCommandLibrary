# TLDR

Set max **mount count** before check

```sudo tune2fs -c 2 /dev/sdXN```

Set filesystem **label**

```sudo tune2fs -L 'MY_LABEL' /dev/sdXN```

Enable **discard** and extended attributes

```sudo tune2fs -o discard,user_xattr /dev/sdXN```

Enable **journaling**

```sudo tune2fs -o has_journal /dev/sdXN```

Assign new **random UUID**

```sudo tune2fs -U random /dev/sdXN```

Set **reserved blocks** percentage

```sudo tune2fs -m 1 /dev/sdXN```

# SYNOPSIS

**tune2fs** [_options_] _device_

# DESCRIPTION

**tune2fs** adjusts tunable filesystem parameters on ext2, ext3, or ext4 filesystems. Many parameters can be changed on mounted filesystems, but some require the filesystem to be unmounted.

# PARAMETERS

**-c MAX-MOUNT-COUNTS**
> Set maximum mount count before fsck

**-C MOUNT-COUNT**
> Set current mount count

**-e ERROR-BEHAVIOR**
> Set error behavior (continue, remount-ro, panic)

**-E EXTENDED-OPTIONS**
> Set extended options

**-f**
> Force operation on filesystems with errors

**-i INTERVAL**
> Time between filesystem checks (d/w/m for days/weeks/months)

**-j**
> Add ext3 journal to ext2 filesystem

**-J JOURNAL-OPTIONS**
> Set journal options

**-l**
> List filesystem superblock contents

**-L LABEL**
> Set filesystem label

**-m RESERVED-BLOCKS-PERCENTAGE**
> Set percentage of reserved blocks

**-o OPTIONS**
> Set/clear default mount options

**-O FEATURES**
> Set/clear filesystem features

**-r RESERVED-BLOCKS-COUNT**
> Set number of reserved blocks

**-T TIME**
> Set time of last filesystem check

**-u USER**
> Set user who can use reserved blocks

**-U UUID**
> Set filesystem UUID

# CAVEATS

Some changes require unmounting the filesystem. Changing certain features incorrectly can make the filesystem unmountable. Always backup important data before making changes.

# HISTORY

**tune2fs** is part of **e2fsprogs**, the ext2/3/4 filesystem utilities package.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [dumpe2fs](/man/dumpe2fs)(8), [mke2fs](/man/mke2fs)(8)
