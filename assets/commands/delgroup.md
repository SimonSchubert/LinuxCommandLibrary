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
> Only delete the group if it is a system group. Exits without error if the group does not exist, which makes it suitable for package maintainer scripts.

**--only-if-empty**
> Only remove the group if it has no members left.

**-c**, **--conf** _FILE_
> Use _FILE_ instead of **/etc/deluser.conf** and **/etc/adduser.conf**. Can be given multiple times.

**--stdoutmsglevel**, **--stderrmsglevel**, **--logmsglevel** _PRIO_
> Minimum priority of messages sent to stdout, stderr or syslog: _trace_, _debug_, _info_, _warn_, _err_ or _fatal_.

**-q**, **--quiet**
> Suppress informational messages (same as **--stdoutmsglevel=warn**). Deprecated.

**--verbose**
> Print more progress output (same as **--stdoutmsglevel=info**). Deprecated.

**--debug**
> Print debugging output (same as **--stdoutmsglevel=debug**). Deprecated.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version and copyright information.

# CONFIGURATION

**/etc/deluser.conf**
> Controls default behavior for deluser and delgroup operations.

**/etc/adduser.conf**
> Also read for shared settings such as system UID/GID ranges.

# CAVEATS

Requires root privileges. Cannot delete the primary group of an existing user. Files owned by the deleted group keep the numeric GID. Debian/Ubuntu specific: on BusyBox systems such as Alpine, **delgroup** is a simpler applet with no long options. Equivalent to **deluser --group**.

# HISTORY

**delgroup** is part of the **adduser** package, created for **Debian** Linux to provide friendlier user/group management than the low-level commands. It wraps groupdel and gpasswd with additional checks and configuration options.

# SEE ALSO

[groupdel](/man/groupdel)(1), [deluser](/man/deluser)(1), [addgroup](/man/addgroup)(1), [gpasswd](/man/gpasswd)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/adduser)```

<!-- verified: 2026-11-23 -->
