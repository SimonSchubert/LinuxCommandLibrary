# TAGLINE

PAM dynamic group assignment configuration

# TLDR

**View** the group.conf file

```cat /etc/security/group.conf```

**Add user** to **audio** group on every console login (rule line)

```*;tty*;[user];Al0000-2400;audio```

**Grant** **video** and **cdrom** to weekday logins only

```login;*;[user];Wk0800-1800;video,cdrom```

**Service-specific rule** for SSH only

```sshd;*;[user];Al0000-2400;developers```

**Enable** the module in PAM (in **/etc/pam.d/login**)

```auth optional pam_group.so```

# DESCRIPTION

**/etc/security/group.conf** configures the pam_group module, which assigns supplementary groups to users based on the service they are logging into and time of day.

This PAM configuration file allows dynamic group membership without modifying /etc/group permanently. Rules are defined with five semicolon-separated fields specifying services, terminals, users, time windows, and groups to assign.

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

# TIME FORMAT

```
Al - All days
Wk - Weekdays
Wd - Weekends
Mo,Tu,We,Th,Fr,Sa,Su - Specific days
0000-2400 - Time range (24h format)
```

# CONFIGURATION

**/etc/security/group.conf**
> The configuration file itself, read by pam_group.so during login.

# CAVEATS

Requires pam_group.so in PAM configuration. Only affects new sessions. Not a replacement for permanent group membership.

# SEE ALSO

[pam_group](/man/pam_group)(8), [group](/man/group)(5), [pam.conf](/man/pam.conf)(5)
