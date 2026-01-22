# TLDR

**Show current user groups**

```groups```

**Show groups for user**

```groups [username]```

**Show groups for multiple users**

```groups [user1] [user2]```

# SYNOPSIS

**groups** [_options_] [_users_]

# PARAMETERS

_USERS_
> Usernames to check groups for.

**--help**
> Display help information.

**--version**
> Display version.

# DESCRIPTION

**groups** displays the groups a user belongs to. Without arguments, it shows groups for the current user.

The command reads from /etc/group and the user's supplementary group list. It shows both primary and secondary group memberships.

groups shows user group membership.

# CAVEATS

Shows cached groups at login. New group memberships require re-login. Primary group shown first.

# HISTORY

groups is a standard Unix command, part of **GNU coreutils** on Linux systems.

# SEE ALSO

[id](/man/id)(1), [groupmems](/man/groupmems)(8), [newgrp](/man/newgrp)(1)
