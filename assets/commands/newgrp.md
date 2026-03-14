# TAGLINE

changes the current real group ID to the specified group

# TLDR

**Switch** to a different primary group

```newgrp [group_name]```

**Switch** group and reinitialize the environment as a login shell

```newgrp - [group_name]```

**Reset** to default primary group

```newgrp```

**Rerun last command with sudo** after permission denied (common pattern)

```sudo newgrp [group_name]```

# SYNOPSIS

**newgrp** [**-**] [_group_]

# PARAMETERS

**-**
> Reinitialize the environment as if the user had logged in

**group**
> Group name to switch to; must be a member or know group password

# DESCRIPTION

**newgrp** changes the current real group ID to the specified group and also tries to add the group to the user groupset. If a hyphen is provided, the environment is reinitialized as a login shell. Files created after running newgrp will have the new group as their group owner.

If not root, the user will be prompted for a password if the user does not have a password and the group does, or if the user is not listed as a member and the group has a password. The user will be denied access if the group password is empty and the user is not listed as a member. If no group is specified, the group is changed to the default group listed in /etc/passwd.

# CAVEATS

This starts a new shell with the changed group. The original shell's group remains unchanged. Group passwords are rarely used and considered insecure. The change only affects the new shell and its children.

# HISTORY

**newgrp** is a standard POSIX command that has been part of Unix systems since early versions. It provides a way to temporarily switch group context without logging out and back in.

# SEE ALSO

[groups](/man/groups)(1), [id](/man/id)(1), [sg](/man/sg)(1), [gpasswd](/man/gpasswd)(1), [chgrp](/man/chgrp)(1)
