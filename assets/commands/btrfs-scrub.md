# TAGLINE

Verify data integrity on btrfs filesystems

# TLDR

**Start** scrub

```sudo btrfs scrub start path/to/mount```

Show **status**

```sudo btrfs scrub status path/to/mount```

**Cancel** scrub

```sudo btrfs scrub cancel path/to/mount```

**Resume** scrub

```sudo btrfs scrub resume path/to/mount```

Start in **foreground**

```sudo btrfs scrub start -B path/to/mount```

Start with a per-device **throughput limit**

```sudo btrfs scrub start --limit [100M] path/to/mount```

Show the current **limits**

```sudo btrfs scrub limit path/to/mount```

Start in **quiet** mode

```sudo btrfs -q scrub start path/to/mount```

# SYNOPSIS

**btrfs scrub** _command_ [_OPTIONS_] _path_|_device_

# DESCRIPTION

**btrfs scrub** verifies data integrity on btrfs filesystems by reading all data and metadata blocks and checking their checksums. It is recommended to run a scrub monthly to detect and potentially repair corrupted data.

# PARAMETERS

**start**
> Start a scrub operation

**status**
> Show status of running or last completed scrub

**cancel**
> Cancel a running scrub

**resume**
> Resume a cancelled or interrupted scrub

**limit**
> Show or set per-device scrub limits. Use **-a**, **--all** or **-d**, **--devid** _id_ to select devices and **-l**, **--limit** _size_ to set the limit (0 resets to unlimited).

**-B**
> Do not run in background (foreground mode) and print statistics when finished

**-r**
> Read-only mode - do not attempt repairs

**-d**
> Print separate statistics for each device in the filesystem

**-R**
> Raw print mode - print full data instead of a summary

**--limit** _limit_
> Set the throughput limit per device for this scrub, in bytes per second with optional KMGT suffix

**-f**
> Force starting a new scrub even if one is reported as running, for example when the status file is damaged

# CAVEATS

Scrub can be I/O intensive and may impact system performance. On RAID configurations, scrub can repair errors from redundant copies. Single-disk setups can detect but not repair errors. The **scrub start -q** option is deprecated in favor of the global **btrfs -q**.

# HISTORY

**btrfs scrub** is part of the **btrfs-progs** package, providing data integrity verification for btrfs filesystems.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-balance](/man/btrfs-balance)(8), [btrfs-check](/man/btrfs-check)(8)

# RESOURCES

```[Source code](https://github.com/kdave/btrfs-progs)```

```[Documentation](https://btrfs.readthedocs.io/en/latest/btrfs-scrub.html)```

<!-- verified: 2026-11-09 -->
