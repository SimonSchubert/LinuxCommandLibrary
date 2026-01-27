# TLDR

**Send snapshot to file**

```zfs send [pool/dataset@snapshot] > [backup.zfs]```

**Send snapshot to remote system**

```zfs send [pool/dataset@snap] | ssh [host] zfs recv [pool/newdataset]```

**Send incremental between snapshots**

```zfs send -i [pool/data@snap1] [pool/data@snap2] | ssh [host] zfs recv [pool/data]```

**Send all incrementals between snapshots**

```zfs send -I [pool/data@snap1] [pool/data@snap5] > [backup.zfs]```

**Send replication stream** (all descendants)

```zfs send -R [pool/dataset@snapshot] > [full-backup.zfs]```

**Dry run to estimate size**

```zfs send -nvP [pool/dataset@snapshot]```

**Send raw encrypted stream**

```zfs send -w [pool/encrypted@snap] > [encrypted-backup.zfs]```

# SYNOPSIS

**zfs send** [_options_] _snapshot_

**zfs send** [_options_] **-i** _snapshot1_ _snapshot2_

# PARAMETERS

**-i** _snapshot_
> Generate incremental stream from snapshot.

**-I** _snapshot_
> Generate cumulative incremental stream.

**-R**
> Generate replication stream (all descendants, clones, properties).

**-D**
> Deduplicate the stream.

**-L**
> Generate larger blocks in stream if available.

**-e**
> Generate more compact stream.

**-c**
> Generate compressed stream.

**-w**
> Send raw encrypted data (for encrypted datasets).

**-p**
> Include dataset properties in stream.

**-b**
> Include properties that are in local source.

**-h**
> Include snapshot holds.

**-n**
> Dry run, don't generate stream.

**-P**
> Print verbose machine-parsable info.

**-v**
> Verbose output.

# DESCRIPTION

**zfs send** creates a stream representation of a ZFS snapshot that can be saved to a file or piped to **zfs receive** on another system. This enables backup, replication, and migration of ZFS datasets.

Full streams contain complete snapshot data. Incremental streams (-i) contain only changes between two snapshots, enabling efficient ongoing replication. Replication streams (-R) include all descendant datasets and their snapshots.

For encrypted datasets, the -w flag sends raw encrypted data that remains encrypted at the destination. Without -w, the stream is decrypted during send.

Streams can be compressed, deduplicated, and piped through SSH for remote replication.

# CAVEATS

Incremental receives require the base snapshot to exist at destination. Replication streams destroy snapshots not present on sender. Raw encrypted streams can only be received as-is. Large transfers may require significant network bandwidth.

# HISTORY

**zfs send** has been part of ZFS since its introduction in Solaris 10. The command evolved with OpenZFS to include features like raw encrypted sends, redacted sends, and resumable transfers. It remains the primary method for ZFS backup and replication.

# SEE ALSO

[zfs-receive](/man/zfs-receive)(8), [zfs-snapshot](/man/zfs-snapshot)(8), [zfs](/man/zfs)(8), [zpool](/man/zpool)(8)
