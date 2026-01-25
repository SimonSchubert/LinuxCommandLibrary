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

**/etc/group** is the system file that defines groups and their members. Each line contains a group entry with four colon-separated fields.

# FILE FORMAT

```
groupname:password:GID:members
```

**Fields:**
- **groupname**: Group name
- **password**: Usually 'x' (see /etc/gshadow)
- **GID**: Numeric group ID
- **members**: Comma-separated list of users

# EXAMPLE ENTRIES

```
root:x:0:
wheel:x:10:alice,bob
docker:x:999:alice
www-data:x:33:
```

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
