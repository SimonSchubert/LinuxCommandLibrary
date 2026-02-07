# TAGLINE

Administer group passwords and membership

# TLDR

Define group **administrators**

```sudo gpasswd -A [user1,user2] [group]```

Set the list of group **members**

```sudo gpasswd -M [user1,user2] [group]```

Create a **password** for the named group

```gpasswd [group]```

**Add** a user to the named group

```gpasswd -a [user] [group]```

**Remove** a user from the named group

```gpasswd -d [user] [group]```

# SYNOPSIS

**gpasswd** [_option_] _group_

# PARAMETERS

**-a**, **--add** _USER_
> Add user to the group

**-d**, **--delete** _USER_
> Remove user from the group

**-A**, **--administrators** _USER,..._
> Set list of group administrators

**-M**, **--members** _USER,..._
> Set list of group members (replaces existing)

**-r**, **--remove-password**
> Remove group password

**-R**, **--restrict**
> Restrict access to group (only members can use newgrp)

# DESCRIPTION

**gpasswd** administers /etc/group and /etc/gshadow files. It is used to add and remove users from groups, set group administrators, and manage group passwords.

Group administrators (set with **-A**) can add or remove members without root privileges, delegating group management to trusted users. Group passwords (rarely used) allow non-members to temporarily join a group using the **newgrp** command.

# CAVEATS

The **-M** option replaces all group members, not appends. Use **-a** and **-d** for incremental changes. Group password usage is discouraged in favor of proper membership management. Changes take effect on next login.

# HISTORY

gpasswd is part of the shadow-utils package, which provides the shadow password suite for Unix systems. The shadow system was developed in the 1980s to improve password security by moving password hashes from the world-readable /etc/passwd to the restricted /etc/shadow file.

# SEE ALSO

[groupadd](/man/groupadd)(8), [groupmod](/man/groupmod)(8), [usermod](/man/usermod)(8), [newgrp](/man/newgrp)(1)
