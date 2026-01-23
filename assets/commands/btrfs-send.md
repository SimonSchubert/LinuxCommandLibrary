# TLDR

**Send a snapshot** to stdout

```btrfs send [/path/to/snapshot]```

**Send to a file**

```btrfs send [/path/to/snapshot] -f [backup.send]```

**Send incremental** (only differences from parent)

```btrfs send -p [/path/to/parent] [/path/to/snapshot]```

**Send with multiple clone sources**

```btrfs send -c [/path/to/clone1] -c [/path/to/clone2] [/path/to/snapshot]```

**Send and receive** in one pipeline

```btrfs send [/path/to/snapshot] | btrfs receive [/path/to/destination]```

**Send incremental over SSH**

```btrfs send -p [/snapshots/old] [/snapshots/new] | ssh [user@host] btrfs receive [/backup]```

**Quiet mode** (no progress)

```btrfs send -q [/path/to/snapshot]```

# SYNOPSIS

**btrfs send** [**-v**] [**-p** _parent_] [**-c** _clone-src_] [**-f** _outfile_] _subvolume_

# DESCRIPTION

**btrfs send** generates a stream of instructions representing a btrfs subvolume or snapshot. This stream can be received by **btrfs receive** to recreate the subvolume on another filesystem, enabling backup and replication workflows.

The send operation works on read-only snapshots and produces a binary stream containing file data, metadata, and structural information. When a parent snapshot is specified, only the differences (incremental send) are transmitted, dramatically reducing transfer size for regular backups.

The stream format is forward-compatible and can be piped directly, saved to a file, or transferred over network connections like SSH.

# PARAMETERS

**-f** _file_
> Write stream to file instead of stdout.

**-p** _parent_
> Parent subvolume for incremental send.

**-c** _clone-src_
> Clone source (additional reference for deduplication).

**-v**
> Verbose mode.

**-q**
> Quiet mode (no progress).

**--no-data**
> Send without file data (metadata only).

**-e**
> End stream after subvolume data.

**--proto** _N_
> Use send stream protocol version N.

# CAVEATS

Source subvolume must be read-only. Parent snapshot must exist on receive side for incremental restores. Stream is not human-readable. Interrupting send/receive may leave incomplete subvolumes. File permissions and ownership require appropriate privileges to restore. Compressed send streams require protocol version 2+.

# HISTORY

**btrfs send/receive** was introduced in Linux kernel **3.6** (released **September 2012**) as part of btrfs development. It was designed to enable efficient snapshot-based backup and replication, similar to ZFS send/receive. The feature has been enhanced over time with compressed transfers (protocol v2) and improved performance for large filesystems.

# SEE ALSO

[btrfs-receive](/man/btrfs-receive)(8), [btrfs-subvolume](/man/btrfs-subvolume)(8), [btrfs](/man/btrfs)(8), [rsync](/man/rsync)(1)
