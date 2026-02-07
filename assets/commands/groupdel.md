# TAGLINE

delete a group from the system

# TLDR

**Delete** an existing group

```sudo groupdel [group_name]```

# SYNOPSIS

**groupdel** [_options_] _group_

# PARAMETERS

**-f**, **--force**
> Delete group even if it's a user's primary group (dangerous)

**-R**, **--root** _CHROOT_DIR_
> Apply changes in chroot environment

**-P**, **--prefix** _PREFIX_DIR_
> Apply changes in prefix directory

# DESCRIPTION

**groupdel** removes a group entry from the system. It deletes the group from /etc/group and /etc/gshadow files. The command cannot remove a group if it is the primary group of any existing user.

Files owned by the deleted group retain their numeric GID but lose the group name association. Consider reassigning file ownership before deleting groups.

# CAVEATS

Cannot delete a group if any user has it as their primary group. Logged-in users who are secondary members won't lose access until their next login. Files owned by the group will show numeric GID instead of group name after deletion.

# HISTORY

groupdel is part of the shadow-utils package, providing the standard Unix group management tools. It works in conjunction with groupadd and groupmod for complete group lifecycle management.

# SEE ALSO

[groupadd](/man/groupadd)(8), [groupmod](/man/groupmod)(8), [gpasswd](/man/gpasswd)(1), [userdel](/man/userdel)(8)
