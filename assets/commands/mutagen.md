# TLDR

**Create sync session**

```mutagen sync create [/local/path] [user@host:/remote/path]```

**List sync sessions**

```mutagen sync list```

**Pause sync session**

```mutagen sync pause [session_name]```

**Resume sync session**

```mutagen sync resume [session_name]```

**Terminate sync session**

```mutagen sync terminate [session_name]```

**Create with ignore patterns**

```mutagen sync create --ignore "*.log" [/local] [remote:/path]```

**Flush pending changes**

```mutagen sync flush [session_name]```

**Monitor sessions**

```mutagen sync monitor```

# SYNOPSIS

**mutagen** [_sync_] [_forward_] [_create_] [_list_] [_terminate_] [_options_] [_args_]

# PARAMETERS

**sync create** _LOCAL_ _REMOTE_
> Create synchronization session.

**sync list**
> List sync sessions.

**sync monitor**
> Monitor sessions in real-time.

**sync pause** _SESSION_
> Pause synchronization.

**sync resume** _SESSION_
> Resume synchronization.

**sync flush** _SESSION_
> Flush pending changes.

**sync terminate** _SESSION_
> End sync session.

**forward create** _LOCAL_ _REMOTE_
> Create port forwarding.

**--ignore** _PATTERN_
> Ignore matching files.

**--sync-mode** _MODE_
> Sync mode (two-way-safe, one-way-safe, etc.).

**--name** _NAME_
> Session name.

# DESCRIPTION

**mutagen** provides fast file synchronization and network forwarding for development workflows. It's designed for syncing code between local and remote environments.

Synchronization watches for filesystem changes and propagates them bidirectionally. Unlike rsync, it maintains persistent sessions that react to changes in real-time.

The tool handles conflicts intelligently. Two-way-safe mode creates conflict files rather than overwriting. One-way modes sync in a single direction.

Docker integration syncs files into containers. SSH connections sync with remote servers. Both can run simultaneously for complex development setups.

Port forwarding tunnels network connections, enabling access to remote services locally or exposing local services remotely.

Performance optimizations include compression, caching, and differential transfers. Large codebases sync efficiently.

# CAVEATS

Requires agent on remote systems (auto-installed via SSH). High file counts may slow initial scan. Conflicts need manual resolution. Docker Desktop on macOS/Windows may have filesystem limitations.

# HISTORY

**Mutagen** was created by **Jacob Howard** around **2018** to solve file synchronization issues in containerized development environments. It addresses performance problems with Docker Desktop's file sharing on macOS and Windows.

# SEE ALSO

[rsync](/man/rsync)(1), [unison](/man/unison)(1), [syncthing](/man/syncthing)(1), [docker](/man/docker)(1)
