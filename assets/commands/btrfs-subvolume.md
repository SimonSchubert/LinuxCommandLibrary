# TAGLINE

Manage btrfs subvolumes and snapshots

# TLDR

**Create** subvolume

```sudo btrfs subvolume create path/to/new_subvolume```

**List** subvolumes

```sudo btrfs subvolume list path/to/filesystem```

**Delete** subvolume

```sudo btrfs subvolume delete path/to/subvolume```

Create **read-only** snapshot

```sudo btrfs subvolume snapshot -r path/to/source path/to/target```

Create **read-write** snapshot

```sudo btrfs subvolume snapshot path/to/source path/to/target```

**Show** subvolume details

```sudo btrfs subvolume show path/to/subvolume```

# SYNOPSIS

**btrfs subvolume** _command_ [_OPTIONS_] [_path_]

# DESCRIPTION

**btrfs subvolume** manages btrfs subvolumes and snapshots. Subvolumes are separately mountable filesystem trees that can have independent snapshot and quota policies. Snapshots are point-in-time copies that initially share all data with their source.

# PARAMETERS

**create**
> Create a new empty subvolume

**list**
> List all subvolumes in the filesystem

**delete**
> Delete a subvolume or snapshot

**snapshot**
> Create a snapshot of an existing subvolume

**show**
> Display detailed information about a subvolume

**-r, --readonly**
> Create a read-only snapshot

**get-default**
> Get the default subvolume

**set-default**
> Set the default subvolume

# CAVEATS

Deleting a subvolume does not immediately free space; asynchronous cleanup runs in the background. Snapshots are not recursive - nested subvolumes must be snapshotted separately.

# HISTORY

**btrfs subvolume** is part of the **btrfs-progs** package for managing btrfs filesystems on Linux.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-filesystem](/man/btrfs-filesystem)(8)
