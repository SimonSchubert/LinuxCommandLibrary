# TAGLINE

shadow group password file format

# TLDR

**View gshadow (requires root)**

```sudo cat /etc/gshadow```

**Edit gshadow safely**

```sudo vigr -s```

**Check gshadow consistency**

```sudo grpck```

# DESCRIPTION

**/etc/gshadow** contains encrypted group passwords and group administrator information. It is the shadow file for /etc/group, restricting access to sensitive group information.

Each line follows the format: **groupname:password:admins:members**. The password field uses * for no password set, ! for password disabled, or an encrypted hash like $6$ for SHA-512.

Group administrators listed in the admins field can add/remove members and change the group password without root privileges using gpasswd.

# FILE FORMAT

```
groupname:password:admins:members
```

**Fields:**
- **groupname**: Group name (matches /etc/group)
- **password**: Encrypted password (! or * means disabled)
- **admins**: Comma-separated list of group administrators
- **members**: Comma-separated list of group members

# PASSWORD FIELD

```
*   - No password set
!   - Password disabled
$6$ - SHA-512 encrypted password
```

# GROUP ADMINISTRATORS

Administrators can add/remove members and change the group password without root privileges using gpasswd.

# CAVEATS

File permissions must be 0640 or stricter. Edit with vigr -s to prevent corruption. Not all systems use gshadow. Group passwords are rarely used.

# SEE ALSO

[group](/man/group)(5), [shadow](/man/shadow)(5), [gpasswd](/man/gpasswd)(1), [grpck](/man/grpck)(8)
