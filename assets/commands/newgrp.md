# TAGLINE

changes the current real group ID to the specified group

# TLDR

**Switch** to a different primary group

```newgrp [group_name]```

**Reset** to default primary group

```newgrp```

# SYNOPSIS

**newgrp** [**-**] [_group_]

# PARAMETERS

**-**
> Reinitialize the environment as if the user had logged in

**group**
> Group name to switch to; must be a member or know group password

# DESCRIPTION

**newgrp** changes the current real group ID to the specified group. If a hyphen is provided, the environment is reinitialized as a login shell. Files created after running newgrp will have the new group as their group owner.

The user must be a member of the specified group or know the group password (if set). If no group is specified, the group is changed to the default group listed in /etc/passwd.

# CAVEATS

This starts a new shell with the changed group. The original shell's group remains unchanged. Group passwords are rarely used and considered insecure. The change only affects the new shell and its children.

# HISTORY

**newgrp** is a standard POSIX command that has been part of Unix systems since early versions. It provides a way to temporarily switch group context without logging out and back in.

# SEE ALSO

[groups](/man/groups)(1), [id](/man/id)(1), [sg](/man/sg)(1), [gpasswd](/man/gpasswd)(1)
