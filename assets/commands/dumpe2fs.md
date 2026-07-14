# TAGLINE

ext2/ext3/ext4 filesystem information dumper

# TLDR

Display **filesystem information**

```sudo dumpe2fs /dev/sdXN```

Display **bad blocks** only

```sudo dumpe2fs -b /dev/sdXN```

**Force** display with unrecognized features

```sudo dumpe2fs -f /dev/sdXN```

Display **superblock** info only

```sudo dumpe2fs -h /dev/sdXN```

Display block numbers in **hexadecimal**

```sudo dumpe2fs -x /dev/sdXN```

# SYNOPSIS

**dumpe2fs** [_-bfghixV_] [_-o superblock=superblock_] [_-o blocksize=blocksize_] _device_

# DESCRIPTION

**dumpe2fs** prints the superblock and block group information for ext2, ext3, and ext4 filesystems. It displays detailed filesystem metadata including features, block counts, and allocation information.

# PARAMETERS

**-b**
> Print only the blocks marked as bad

**-f**
> Force display even with unrecognized feature flags

**-g**
> Display block group descriptor information in colon-separated format

**-h**
> Display superblock info only, not block group details

**-i**
> Display filesystem data from image file

**-o superblock=NUM**
> Use alternative superblock at block NUM

**-o blocksize=SIZE**
> Specify block size when searching for superblock

**-x**
> Display block numbers in hexadecimal format

**-V**
> Display version information

# CAVEATS

dumpe2fs only **reads**, so it is safe to run on a mounted filesystem, but the figures it prints will be slightly stale: the superblock on disk lags the kernel's in-memory copy, so free block and inode counts can be out of date. Unmount first if the numbers must be exact.

The output is long, and **-h** is usually what you actually want: the superblock alone gives the block size, inode count, feature flags, mount count, and the UUID, without pages of block group detail.

**-b** does not list bad blocks from a fresh scan. It prints the blocks already recorded in the filesystem's bad-block inode, which is only populated if something put them there, typically `mke2fs -c` or `e2fsck -c`. An empty result therefore means "none recorded", not "none exist".

A practical use is recovering from a damaged primary superblock: `dumpe2fs` prints the locations of the backup superblocks, which is what `e2fsck -b` then needs.

# HISTORY

**dumpe2fs** is part of **e2fsprogs**, the ext2/3/4 utility suite that **Theodore Ts'o** has maintained since **1993**. It is the counterpart to `tune2fs`: where tune2fs changes filesystem parameters, dumpe2fs shows them, and between them they cover almost everything you can ask or tell an ext filesystem without mounting it. The tool has outlived two filesystem revisions largely unchanged, since ext3 and ext4 both kept the ext2 on-disk layout and simply added features to the superblock's feature flags.

# SEE ALSO

[tune2fs](/man/tune2fs)(8), [e2fsck](/man/e2fsck)(8), [mke2fs](/man/mke2fs)(8), [debugfs](/man/debugfs)(8), [resize2fs](/man/resize2fs)(8), [blkid](/man/blkid)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/fs/ext2/e2fsprogs.git)```

```[Homepage](http://e2fsprogs.sourceforge.net)```

<!-- verified: 2026-07-14 -->

