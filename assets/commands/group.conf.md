# TLDR

**View group.conf**

```cat /etc/security/group.conf```

# DESCRIPTION

**/etc/security/group.conf** configures the pam_group module, which assigns supplementary groups to users based on the service they're logging into and time of day.

This PAM configuration file allows dynamic group membership without modifying /etc/group permanently.

# FILE FORMAT

```
services;ttys;users;times;groups
```

**Fields:**
- **services**: PAM service names (login, sshd, *)
- **ttys**: Terminal names (tty*, pts/*, *)
- **users**: Usernames or * for all
- **times**: Time specifications (Al0000-2400 = always)
- **groups**: Groups to assign

# EXAMPLE ENTRIES

```
# Give console users floppy access
login;tty*;*;Al0000-2400;floppy,cdrom

# Give ssh users special group on weekdays
sshd;*;alice,bob;Wk0900-1700;developers

# All local logins get audio group
login|gdm;*;*;Al0000-2400;audio,video
```

# TIME FORMAT

```
Al - All days
Wk - Weekdays
Wd - Weekends
Mo,Tu,We,Th,Fr,Sa,Su - Specific days
0000-2400 - Time range (24h format)
```

# CAVEATS

Requires pam_group.so in PAM configuration. Only affects new sessions. Not a replacement for permanent group membership.

# SEE ALSO

[pam_group](/man/pam_group)(8), [group](/man/group)(5), [pam.conf](/man/pam.conf)(5)
