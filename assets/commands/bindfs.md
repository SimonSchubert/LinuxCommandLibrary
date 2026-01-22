# TLDR

**Mount** directory

```sudo bindfs /path/to/source /path/to/mount```

Mount with **user mapping**

```sudo bindfs --map=user1/user2 /path/to/source /path/to/mount```

**Unmount**

```sudo umount /path/to/mount```

# SYNOPSIS

**bindfs** [_OPTIONS_] _source_ _mountpoint_

# DESCRIPTION

**bindfs** mounts a directory to another location with different ownership and permissions. It uses FUSE to create a view of a directory tree with modified permissions.

# PARAMETERS

**--map=** _user1/user2_
> Map ownership from user1 to user2

**--force-user=** _user_
> Force all files to appear owned by user

**--force-group=** _group_
> Force all files to appear owned by group

**--perms=** _mode_
> Set permission bits for all files

**-o** _options_
> Pass FUSE mount options

# CAVEATS

Changes to ownership mapping are bidirectional - newly created files are mapped back. Requires FUSE support. Use umount to unmount the bindfs filesystem.

# HISTORY

**bindfs** is a FUSE filesystem for mounting directories with altered permissions.

# SEE ALSO

[mount](/man/mount)(8), [fusermount](/man/fusermount)(1)
