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

Grant **plugdev** to every member of the **admin** group on local terminals

```*;tty*;%admin;Al0000-2400;plugdev```

Grant **games** to everyone **outside working hours**

```login;tty*;*;!Wk0900-1800;games```

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
- **users**: Usernames, **%group** for members of a group, **@netgroup**, or * for all
- **times**: Day/time ranges (Al0000-2400 = always)
- **groups**: Comma or space separated groups to add

The services, ttys and users fields are logic lists: tokens may be prefixed with **!** (not) and joined with **&** (and) or **|** (or), e.g. **tty*&!ttyp***. The wildcard * may be used only once per field. Text after **#** is a comment, and lines can be continued with a trailing backslash.

# TIME FORMAT

```
Al - All days
Wk - Weekdays
Wd - Weekend days
Mo Tu We Th Fr Sa Su - Specific days
0000-2400 - Time range (HHMM-HHMM)
```

Day codes are concatenated without separators (**MoTuSa**). Repeating a day removes it (**AlFr** = every day except Friday). A leading **!** negates the whole entry. If the end time is earlier than the start time the range continues into the next day.

# CONFIGURATION

**/etc/security/group.conf**
> The configuration file itself, read by pam_group.so during login.

# CAVEATS

Requires **pam_group.so** in the **auth** stack of the PAM configuration; the groups are applied when credentials are set, so the calling application must run as root. Only affects new sessions. Not a replacement for permanent group membership, and not inherently secure: a user given a group temporarily can create a setgid executable to keep that group access at any time.

# SEE ALSO

[pam_group](/man/pam_group)(8), [group](/man/group)(5), [pam.conf](/man/pam.conf)(5)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

<!-- verified: 2026-11-23 -->
