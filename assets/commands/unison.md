# TAGLINE

Bidirectional file synchronization tool

# TLDR

**Sync directories**

```unison [dir1] [dir2]```

**Sync with SSH**

```unison [local/path] ssh://[user@host]/[path]```

**Batch mode**

```unison -batch [dir1] [dir2]```

**Use profile**

```unison [profilename]```

**Show differences**

```unison -diff [dir1] [dir2]```

# SYNOPSIS

**unison** [_-batch_] [_profile_] _root1_ _root2_

# PARAMETERS

**-batch**
> Non-interactive.

**-auto**
> Accept defaults.

**-diff**
> Show differences.

**-force** _ROOT_
> Force from root.

**-ignore** _PATTERN_
> Ignore pattern.

**-path** _PATH_
> Sync specific path.

# DESCRIPTION

**unison** is a file synchronization tool that propagates changes in both directions between two directory replicas. Unlike one-way sync tools like rsync, unison detects modifications on both sides and reconciles them, making it suitable for keeping directories in sync across multiple machines.

When conflicts arise from both replicas being modified, unison detects the conflict and presents options for resolution rather than silently overwriting changes. It can synchronize over SSH for remote directories or work with local paths. The tool tracks file state between synchronizations, so it only transfers files that have actually changed.

Unison supports profiles that save synchronization configurations for repeated use, including path filters, ignore patterns, and connection settings. It runs on Unix, macOS, and Windows, and requires the same version of unison on both sides of a synchronization.

# CAVEATS

Same version both ends. Conflicts need attention. Initial sync slow.

# HISTORY

**Unison** was developed at the University of Pennsylvania as a file synchronization tool supporting bidirectional sync.

# SEE ALSO

[rsync](/man/rsync)(1), [syncthing](/man/syncthing)(1), [rclone](/man/rclone)(1)
