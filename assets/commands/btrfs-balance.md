# TAGLINE

Redistribute data across btrfs devices

# TLDR

**Show balance status**

```sudo btrfs balance status [/mnt/data]```

**Start a full balance**

```sudo btrfs balance start [/mnt/data]```

**Balance underused data chunks** (in background)

```sudo btrfs balance start --bg -dusage=[15] [/mnt/data]```

**Balance metadata with a chunk limit**

```sudo btrfs balance start -musage=[20],limit=[10] [/mnt/data]```

**Convert RAID profile**

```sudo btrfs balance start -dconvert=[raid6] -mconvert=[raid1c3] [/mnt/data]```

**Cancel a running balance**

```sudo btrfs balance cancel [/mnt/data]```

# SYNOPSIS

**btrfs balance** _command_ [_OPTIONS_] _path_

# DESCRIPTION

**btrfs balance** redistributes data and metadata across devices in a btrfs filesystem. It operates on block groups (chunks), moving their contents to achieve a more even distribution or to convert between RAID profiles.

Common use cases include rebalancing after adding or removing devices, converting from one RAID level to another, and reclaiming space by consolidating partially used chunks. Filters allow targeting specific chunk types (data, metadata, system) and usage thresholds to avoid unnecessary work.

# PARAMETERS

**start**
> Start a balance operation

**status**
> Show status of running or paused balance

**cancel**
> Cancel a running balance

**pause**
> Pause a running balance

**resume**
> Resume a paused balance

**-d** _filters_
> Apply filters to data block groups

**-m** _filters_
> Apply filters to metadata block groups

**-s** _filters_
> Apply filters to system block groups

**--bg, --background**
> Run in background

**usage=** _percent_
> Balance chunks with usage below percentage

**limit=** _count_
> Process at most this many chunks

**convert=** _profile_
> Convert to specified RAID profile

**soft**
> Skip chunks already matching the target profile

**devid=** _id_
> Balance only chunks on the given device

**drange=** _start..end_
> Balance only chunks overlapping byte range

**-f**
> Force reducing metadata integrity (e.g., raid1 to single)

# CAVEATS

A full balance rewrites all data and is very slow. Use filters to target only necessary chunks. Balance requires free space to relocate data. Converting RAID profiles on a busy system may take a long time.

# HISTORY

**btrfs balance** is part of the **btrfs-progs** package for managing btrfs filesystems on Linux.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-device](/man/btrfs-device)(8), [btrfs-filesystem](/man/btrfs-filesystem)(8), [btrfs-scrub](/man/btrfs-scrub)(8), [mkfs.btrfs](/man/mkfs.btrfs)(8)
