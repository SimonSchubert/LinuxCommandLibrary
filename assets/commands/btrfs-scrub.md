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

Start in **quiet** mode

```sudo btrfs scrub start -q path/to/mount```

# SYNOPSIS

**btrfs scrub** _command_ [_OPTIONS_] _path_

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
> Resume a cancelled scrub

**-B**
> Do not run in background (foreground mode)

**-q, --quiet**
> Suppress errors and statistics output

**-r**
> Read-only mode - do not attempt repairs

# CAVEATS

Scrub can be I/O intensive and may impact system performance. On RAID configurations, scrub can repair errors from redundant copies. Single-disk setups can detect but not repair errors.

# HISTORY

**btrfs scrub** is part of the **btrfs-progs** package, providing data integrity verification for btrfs filesystems.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-balance](/man/btrfs-balance)(8)
