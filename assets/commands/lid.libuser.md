# TAGLINE

displays information about group membership on Linux systems

# TLDR

List **primary and secondary groups** of a specific user

```sudo lid [username]```

List **users of a specific group**

```sudo lid --group [group_name]```

# SYNOPSIS

**lid** [_OPTION_]... [_name_]

# PARAMETERS

**-g, --group**
> List users belonging to a group instead of groups containing a user

**-i, --interactive**
> Prompt for all configuration questions when accessing the user database

**-n, --onlynames**
> Display only names without corresponding numeric IDs

# DESCRIPTION

**lid** displays information about group membership on Linux systems. By default, it shows all groups containing a specified user (or the invoking user if no name is given). With the **-g** option, it reverses this behavior to show all users within a specified group.

Part of the **libuser** library tools, lid reads from the system's user and group databases. It requires root privileges to query membership information for other users or groups.

# CAVEATS

Requires **root privileges** (sudo) to query information about users or groups other than the invoking user. The command depends on the libuser library configuration for database access.

# HISTORY

The lid command is part of the **libuser** library project, developed in the early 2000s to provide a common interface for user and group account manipulation across different Linux distributions.

# SEE ALSO

[groups](/man/groups)(1), [id](/man/id)(1), [getent](/man/getent)(1), [usermod](/man/usermod)(8)
