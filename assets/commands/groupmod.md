# TLDR

Change the **group name**

```sudo groupmod -n [new_group] [group_name]```

Change the **group ID**

```sudo groupmod -g [new_id] [group_name]```

# SYNOPSIS

**groupmod** [_options_] _group_

# PARAMETERS

**-g**, **--gid** _GID_
> Change group ID to _GID_

**-n**, **--new-name** _NAME_
> Change group name to _NAME_

**-o**, **--non-unique**
> Allow non-unique GID

**-p**, **--password** _PASSWORD_
> Set encrypted group password

**-R**, **--root** _CHROOT_DIR_
> Apply changes in chroot environment

**-P**, **--prefix** _PREFIX_DIR_
> Apply changes in prefix directory

# DESCRIPTION

**groupmod** modifies the attributes of an existing group on the system. It can change the group name, group ID (GID), or group password.

When changing GID, files owned by the group are NOT automatically updated. You must manually find and update file ownership using commands like **find / -gid OLDGID -exec chgrp NEWGROUP {} \;**.

Changing a group name has no effect on file ownership since files reference groups by GID, not name.

# CAVEATS

Changing GID does not update file ownership automatically. Users must log out and back in for group changes to take effect. Cannot change a group to a name or GID that already exists (unless -o is used for GID).

# HISTORY

groupmod is part of the shadow-utils package, which has been the standard for Unix group management across Linux distributions. It provides safe modification of the /etc/group and /etc/gshadow files.

# SEE ALSO

[groupadd](/man/groupadd)(8), [groupdel](/man/groupdel)(8), [gpasswd](/man/gpasswd)(1), [usermod](/man/usermod)(8)
