# TAGLINE

manage group membership

# TLDR

**Add user to group**

```sudo groupmems -g [group] -a [user]```

**Remove user from group**

```sudo groupmems -g [group] -d [user]```

**List group members**

```sudo groupmems -g [group] -l```

**Purge all members**

```sudo groupmems -g [group] -p```

# SYNOPSIS

**groupmems** [_options_]

# PARAMETERS

**-g**, **--group** _GROUP_
> Target group name. Required for superuser; regular users operate on their primary group.

**-a**, **--add** _USER_
> Add user to group.

**-d**, **--delete** _USER_
> Delete user from group.

**-l**, **--list**
> List group members.

**-p**, **--purge**
> Purge all members from the group.

**-R**, **--root** _DIR_
> Apply changes in the specified chroot directory.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**groupmems** manages group membership. It allows administrators to add or remove users from groups without directly editing /etc/group.

The tool provides a safe interface for group membership changes. Regular users can manage their own primary group without superuser privileges; only the superuser can modify other groups using the **-g** option.

# CAVEATS

Requires root or primary group ownership. Part of the shadow-utils package. Changes take effect on next login. If /etc/gshadow exists, entries are updated automatically.

# HISTORY

groupmems was developed as part of the **shadow** password suite for secure group management.

# SEE ALSO

[groups](/man/groups)(1), [gpasswd](/man/gpasswd)(1), [usermod](/man/usermod)(8), [groupadd](/man/groupadd)(8), [groupmod](/man/groupmod)(8)
