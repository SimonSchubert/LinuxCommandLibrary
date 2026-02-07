# TAGLINE

remove groups from the system

# TLDR

**Delete a group**

```sudo delgroup [groupname]```

**Remove user from group**

```sudo delgroup [username] [groupname]```

**Delete system group**

```sudo delgroup --system [groupname]```

**Delete only if empty**

```sudo delgroup --only-if-empty [groupname]```

# SYNOPSIS

**delgroup** [_options_] _group_

**delgroup** [_options_] _user_ _group_

# DESCRIPTION

**delgroup** removes a group from the system or removes a user from a group. It's the Debian/Ubuntu counterpart to groupdel with additional safety features.

When called with just a group name, it deletes the group. With both user and group names, it removes the user from that group without deleting the group.

# PARAMETERS

**--system**
> Only delete system groups.

**--only-if-empty**
> Only delete if group has no members.

**-q**, **--quiet**
> Suppress informational messages.

**--help**
> Display help information.

**--version**
> Display version.

**--conf** _file_
> Use alternate configuration.

# CONFIGURATION

**/etc/deluser.conf**
> Controls default behavior for deluser and delgroup operations.

# CAVEATS

Requires root privileges. Cannot delete a user's primary group while user exists. Files owned by deleted group keep numeric GID. Debian/Ubuntu specific command.

# HISTORY

**delgroup** is part of the **adduser** package, created for **Debian** Linux to provide friendlier user/group management than the low-level commands. It wraps groupdel and gpasswd with additional checks and configuration options.

# SEE ALSO

[groupdel](/man/groupdel)(1), [deluser](/man/deluser)(1), [addgroup](/man/addgroup)(1), [gpasswd](/man/gpasswd)(1)
