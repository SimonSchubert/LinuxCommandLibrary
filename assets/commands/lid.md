# TAGLINE

Display a user's groups or a group's users

# TLDR

List **groups** for a user

```sudo lid [username]```

List **users** in a group

```sudo lid -g [groupname]```

List groups for the **current** user

```sudo lid```

# SYNOPSIS

**lid** [_options_] [_name_]

# DESCRIPTION

**lid** displays a user's groups or a group's users. It reads from the system's user and group databases to show membership information. Without arguments, it shows groups for the current user.

# PARAMETERS

**-g**, **--group**
> Treat the argument as a group name and list its members

**name**
> User or group name to query (user by default)

# CAVEATS

Requires root privileges to access all group membership information. Part of the **libuser** library tools for user and group account management.

# SEE ALSO

[groups](/man/groups)(1), [id](/man/id)(1), [getent](/man/getent)(1), [gpasswd](/man/gpasswd)(1), [groupmems](/man/groupmems)(1)
