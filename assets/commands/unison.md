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

**unison** synchronizes files. It's bidirectional sync.

Two-way sync. Changes both directions.

Conflict detection. Manual resolution.

SSH support. Remote sync.

Profiles. Save configurations.

# CAVEATS

Same version both ends. Conflicts need attention. Initial sync slow.

# HISTORY

**Unison** was developed at the University of Pennsylvania as a file synchronization tool supporting bidirectional sync.

# SEE ALSO

[rsync](/man/rsync)(1), [syncthing](/man/syncthing)(1), [rclone](/man/rclone)(1)
