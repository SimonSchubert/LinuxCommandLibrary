# TLDR

**Search** for a package

```snap find query```

**Install** a package

```snap install package```

**Update** a package

```snap refresh package```

Update to different **channel**

```snap refresh package --channel=channel```

Update **all** packages

```snap refresh```

**List** installed snaps

```snap list```

**Remove** a package

```snap remove package```

Show **recent changes**

```snap changes```

# SYNOPSIS

**snap** _command_ [_OPTIONS_]

# DESCRIPTION

**snap** is the command-line interface for managing snap packages, which are self-contained software bundles that include all dependencies. Snaps are sandboxed, automatically updated, and work across many Linux distributions.

# PARAMETERS

**find** _query_
> Search for snaps matching the query

**install** _snap_
> Install a snap package

**remove** _snap_
> Remove an installed snap

**refresh** [_snap_]
> Update a specific snap or all snaps

**list**
> List installed snaps

**info** _snap_
> Show detailed information about a snap

**changes**
> Show recent changes and operations

**connections** [_snap_]
> Show interface connections

**--channel** _channel_
> Specify the channel (track/risk/branch) for install or refresh

**--classic**
> Install with classic confinement (less sandboxing)

**--devmode**
> Install in development mode (no confinement)

# CAVEATS

Snaps run in a sandbox with limited access to system resources. Interface connections control what resources a snap can access. Some snaps require **--classic** mode to access the full system.

# HISTORY

**snap** is part of **snapd**, developed by Canonical for universal Linux packaging. It provides automatic updates, rollback capabilities, and runs on most Linux distributions.

# SEE ALSO

[snapd](/man/snapd)(8), [apt](/man/apt)(8), [flatpak](/man/flatpak)(1)
