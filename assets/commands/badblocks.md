# TAGLINE

Scan devices for bad disk blocks

# TLDR

**Check** device for bad blocks (read-only)

```badblocks -v [/dev/sdb]```

**Destructive** write test

```badblocks -wsv [/dev/sdb]```

**Non-destructive** read-write test

```badblocks -nsv [/dev/sdb]```

Save **bad block list**

```badblocks -o [badblocks.txt] [/dev/sdb]```

# SYNOPSIS

**badblocks** [_options_] _device_ [_last-block_] [_first-block_]

# DESCRIPTION

**badblocks** searches a device for bad blocks by performing read, write, or non-destructive read-write tests. It's used to verify disk integrity and create lists of bad blocks for filesystem tools.

The tool is particularly useful for testing new drives or diagnosing failing storage devices.

# PARAMETERS

**-v**
> Verbose mode

**-w**
> Destructive write test (erases data)

**-n**
> Non-destructive read-write test

**-s**
> Show progress

**-o** _file_
> Output bad blocks to file

**-b** _size_
> Block size in bytes (default: 1024)

**-c** _blocks_
> Number of blocks to test at once (default: 64)

**-p** _passes_
> Number of test passes (default: 0, meaning single pass)

**-t** _pattern_
> Test pattern (use `random` for random data, or a numeric value 0-255)

**-i** _file_
> Read existing bad blocks list from file (skip retesting known blocks)

**-f**
> Force testing on a mounted device (dangerous, normally prevented)

# TEST MODES

**Read-only** (default)
> Safe, detects existing bad blocks

**Write** (-w)
> Destructive, thorough testing, erases all data

**Non-destructive** (-n)
> Safe, reads then writes back original data

# WORKFLOW

```bash
# Check for bad blocks (safe)
sudo badblocks -sv /dev/sdb

# Create bad block list for e2fsck
sudo badblocks -o badblocks.txt /dev/sdb
sudo e2fsck -l badblocks.txt /dev/sdb

# Thorough destructive test (WARNING: erases data)
sudo badblocks -wsv /dev/sdb
```

# CAVEATS

Write modes DESTROY all data on the device. Requires root privileges. Very slow on large drives (hours or days). Modern drives remap bad sectors automatically. Non-destructive mode still carries small risk of data loss. SMR drives may show poor performance during testing.

# HISTORY

**badblocks** has been part of e2fsprogs since the early **1990s**, created as a companion tool for ext2 filesystem management.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [fsck](/man/fsck)(8), [smartctl](/man/smartctl)(8), [dd](/man/dd)(1), [hdparm](/man/hdparm)(8)
