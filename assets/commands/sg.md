# TAGLINE

execute a command with a different group ID

# TLDR

**Start a shell** with a different group

```sg [group]```

**Execute a specific command** with a different group

```sg [group] -c "[command]"```

**Run a command as the** www-data **group**

```sg www-data -c "touch [/var/www/html/file.txt]"```

**Start a login shell** with a different group, reinitializing the environment

```sg - [group]```

# SYNOPSIS

**sg** [**-**] [_group_] [[**-c**] _command_]

# PARAMETERS

_group_
> The group name to switch to. The user must be a member of this group (or know its password).

**-c** _command_
> Execute the specified command with the new group ID rather than starting an interactive shell.

**-**
> Start the shell as a login shell, reinitializing the environment.

# DESCRIPTION

**sg** executes a command or starts a shell with a different group ID. It is functionally similar to **newgrp** but allows running a single command rather than starting a new shell session.

When called without a command, **sg** starts a new shell with the specified group as the effective group ID. When called with **-c**, it executes the given command with the new group and returns.

The user must be a member of the target group, or the group must have a password set (via **gpasswd**) which the user can provide. The root user can switch to any group without restrictions.

# CAVEATS

The **sg** command is part of the shadow-utils package. If the user is not a member of the specified group and no group password is set, access will be denied. Environment variables may be reset depending on how the shell is invoked. On some systems, the **sg** name may conflict with the ast-grep tool alias; use the full path /usr/bin/sg if needed.

# SEE ALSO

[newgrp](/man/newgrp)(1), [groups](/man/groups)(1), [id](/man/id)(1), [gpasswd](/man/gpasswd)(1), [su](/man/su)(1), [chgrp](/man/chgrp)(1)
