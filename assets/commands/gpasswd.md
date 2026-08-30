# TAGLINE

Administer group passwords and membership

# TLDR

Set a group password **interactively**

```gpasswd [group]```

**Add** a user to a group

```sudo gpasswd --add [user] [group]```

**Remove** a user from a group

```sudo gpasswd --delete [user] [group]```

**Replace the member list** outright

```sudo gpasswd --members [user1,user2] [group]```

Name the group's **administrators**

```sudo gpasswd --administrators [user1,user2] [group]```

**Clear the group password**, so only members can join with `newgrp`

```sudo gpasswd --remove-password [group]```

**Restrict** the group to its listed members

```sudo gpasswd --restrict [group]```

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

# INSTALL

```apt: sudo apt install passwd```

```pacman: sudo pacman -S shadow```

```apk: sudo apk add shadow```

```zypper: sudo zypper install shadow```

```nix: nix profile install nixpkgs#shadow```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[groupadd](/man/groupadd)(8), [groupmod](/man/groupmod)(8), [usermod](/man/usermod)(8), [newgrp](/man/newgrp)(1)

# RESOURCES

```[Source code](https://github.com/shadow-maint/shadow)```

<!-- verified: 2026-07-17 -->
