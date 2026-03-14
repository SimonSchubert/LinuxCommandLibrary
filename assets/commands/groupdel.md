# TAGLINE

delete a group from the system

# TLDR

**Delete** an existing group

```sudo groupdel [group_name]```

# SYNOPSIS

**groupdel** [_options_] _group_

# PARAMETERS

**-f**, **--force**
> Force removal of the group, even if a user has it as their primary group

**-h**, **--help**
> Display help message and exit

**-R**, **--root** _CHROOT_DIR_
> Apply changes in the CHROOT_DIR directory and use its configuration files. Only absolute paths are supported

**-P**, **--prefix** _PREFIX_DIR_
> Apply changes in the PREFIX_DIR directory. Does not chroot; intended for preparing a cross-compilation target

# DESCRIPTION

**groupdel** removes a group entry from the system. It modifies /etc/group and /etc/gshadow. The named group must exist. You may not remove the primary group of any existing user; the user must be removed first.

Files owned by the deleted group retain their numeric GID but lose the group name association. You should manually check all file systems to ensure no files remain owned by the deleted group.

# CAVEATS

Cannot delete a group if any user has it as their primary group; the user must be removed first. Logged-in users who are secondary members won't lose access until their next login. Files owned by the group will show numeric GID instead of group name after deletion. Exit values: 0 (success), 2 (invalid syntax), 6 (group doesn't exist), 8 (can't remove user's primary group), 10 (can't update group file).

# HISTORY

groupdel is part of the shadow-utils package, providing the standard Unix group management tools. It works in conjunction with groupadd and groupmod for complete group lifecycle management.

# SEE ALSO

[groupadd](/man/groupadd)(8), [groupmod](/man/groupmod)(8), [gpasswd](/man/gpasswd)(1), [userdel](/man/userdel)(8), [chgrp](/man/chgrp)(1), [groups](/man/groups)(1)
