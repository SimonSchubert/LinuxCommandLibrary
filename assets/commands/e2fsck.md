# TAGLINE

check and repair ext filesystems

# TLDR

**Check** filesystem for errors

```sudo e2fsck /dev/sdXN```

Check and **auto-repair** (preen)

```sudo e2fsck -p /dev/sdXN```

Check in **read-only** mode

```sudo e2fsck -c /dev/sdXN```

**Force** check even if clean

```sudo e2fsck -f /dev/sdXN```

Exhaustive **bad block** test

```sudo e2fsck -fccky /dev/sdXN```

**Verbose** output

```sudo e2fsck -v /dev/sdXN```

# SYNOPSIS

**e2fsck** [_-panyrcdfvtDFV_] [_-b superblock_] [_-B blocksize_] _device_

# DESCRIPTION

**e2fsck** checks and optionally repairs Linux ext2, ext3, or ext4 filesystems. The filesystem should be unmounted before running this command, or mounted read-only at minimum.

# PARAMETERS

**-a**
> Automatically repair without prompting (same as -p)

**-b SUPERBLOCK**
> Use alternative superblock

**-B BLOCKSIZE**
> Specify block size when searching for superblock

**-c**
> Check for bad blocks using read-only test

**-C FD**
> Write completion information to file descriptor

**-d**
> Print debugging output

**-D**
> Optimize directories

**-f**
> Force check even if filesystem seems clean

**-F**
> Flush buffer cache before checking

**-k**
> Keep existing bad block list

**-n**
> Open read-only, answer "no" to all questions

**-p**
> Preen mode: automatically repair safe problems

**-t**
> Print timing statistics

**-v**
> Verbose mode

**-y**
> Answer "yes" to all questions

# CONFIGURATION

**/etc/e2fsck.conf**
> Configuration file controlling default behavior, problem handling, and optimization settings.

# CAVEATS

Never run e2fsck on a mounted filesystem unless it's read-only. The **-y** option can cause data loss if used carelessly. Always backup before repairing.

# HISTORY

**e2fsck** is part of **e2fsprogs**, providing filesystem checking for ext2/3/4 filesystems since the early 1990s.

# SEE ALSO

[fsck](/man/fsck)(8), [tune2fs](/man/tune2fs)(8), [dumpe2fs](/man/dumpe2fs)(8), [mke2fs](/man/mke2fs)(8)
