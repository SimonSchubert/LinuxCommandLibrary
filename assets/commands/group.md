# TAGLINE

System group database file

# TLDR

**View group file**

```cat /etc/group```

**Find groups for user**

```groups [username]```

**Find group by name**

```getent group [groupname]```

**List group members**

```getent group [groupname] | cut -d: -f4```

# DESCRIPTION

**/etc/group** is the system file that defines groups and their members. Each line contains a group entry with four colon-separated fields: group name, password placeholder, numeric GID, and a comma-separated list of member usernames.

Groups control file access permissions and are fundamental to Unix security. Users can belong to multiple groups, with one primary group set in /etc/passwd.

# FILE FORMAT

```
groupname:password:GID:members
```

**Fields:**
- **groupname**: Group name
- **password**: Usually 'x' (see /etc/gshadow)
- **GID**: Numeric group ID
- **members**: Comma-separated list of users

# RELATED COMMANDS

```bash
groupadd groupname      # Create group
groupdel groupname      # Delete group
groupmod -n new old     # Rename group
gpasswd -a user group   # Add user to group
gpasswd -d user group   # Remove user from group
newgrp groupname        # Switch primary group
```

# CAVEATS

Direct editing not recommended; use groupadd/groupmod. Changes may require logout to take effect. GIDs below 1000 typically reserved for system groups.

# SEE ALSO

[groups](/man/groups)(1), [groupadd](/man/groupadd)(8), [groupmod](/man/groupmod)(8), [passwd](/man/passwd)(5)
