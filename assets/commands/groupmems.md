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

**-g** _GROUP_
> Target group name.

**-a** _USER_
> Add user to group.

**-d** _USER_
> Delete user from group.

**-l**
> List group members.

**-p**
> Purge all members.

**-R** _DIR_
> Chroot directory.

**--help**
> Display help information.

# DESCRIPTION

**groupmems** manages group membership. It allows administrators to add or remove users from groups without directly editing /etc/group.

The tool provides a safe interface for group membership changes. Regular users can manage groups they own if configured appropriately.

groupmems manages group membership.

# CAVEATS

Requires root or group ownership. Part of shadow package. Changes take effect on next login.

# HISTORY

groupmems was developed as part of the **shadow** password suite for secure group management.

# SEE ALSO

[groups](/man/groups)(1), [gpasswd](/man/gpasswd)(1), [usermod](/man/usermod)(8)
