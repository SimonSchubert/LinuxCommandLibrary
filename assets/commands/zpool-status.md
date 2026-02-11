# TAGLINE

Display ZFS pool health status

# TLDR

**Show status of all pools**

```zpool status```

**Show status of specific pool**

```zpool status [poolname]```

**Show only pools with errors**

```zpool status -x```

**Show verbose error details**

```zpool status -v```

**Show deduplication statistics**

```zpool status -D```

**Output as JSON**

```zpool status -j```

# SYNOPSIS

**zpool status** [_options_] [_pool_...]

# PARAMETERS

**-v**
> Verbose mode; show data error list.

**-x**
> Only show pools with errors or unavailable.

**-D**
> Display deduplication statistics.

**-g**
> Display vdev GUIDs.

**-L**
> Display real device paths.

**-P**
> Display full device paths.

**-T** _d_|_u_
> Timestamp format: d (date) or u (unix).

**-j**
> Output in JSON format.

# POOL STATES

**ONLINE**: Fully operational.

**DEGRADED**: One or more devices failed but pool operational.

**FAULTED**: Pool completely inaccessible.

**OFFLINE**: Device explicitly taken offline.

**UNAVAIL**: Device cannot be opened.

**REMOVED**: Device physically removed.

# DESCRIPTION

**zpool status** displays detailed health information for ZFS storage pools. It shows device hierarchy, state of each vdev, error counts, and any ongoing scrub or resilver operations.

The READ, WRITE, and CKSUM columns show error counts for each device. Non-zero values indicate potential hardware problems requiring attention. Regular scrubs help detect silent corruption early.

When scrubs or resilvers are active, progress percentage and estimated completion time are displayed. The -x option provides a quick way to check if any pools need attention.

# CAVEATS

Error counts persist until cleared. CKSUM errors may indicate controller or cable issues, not just drive failure. Degraded pools should be repaired promptly to avoid data loss.

# HISTORY

**zpool status** is the primary tool for ZFS pool health monitoring. ZFS was developed by Sun Microsystems and introduced data integrity verification features that make status reporting more informative than traditional storage systems.

# SEE ALSO

[zpool](/man/zpool)(8), [zpool-events](/man/zpool-events)(8), [zpool-scrub](/man/zpool-scrub)(8), [zfs](/man/zfs)(8)
