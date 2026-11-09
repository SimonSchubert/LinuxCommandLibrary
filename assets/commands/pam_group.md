# TAGLINE

PAM module for group access based on login context

# TLDR

**Enable group assignment in PAM config**

```auth required pam_group.so```

**Grant audio group to all users at all times**

```echo "* ; * ; * ; Al0000-2400 ; audio" >> /etc/security/group.conf```

**Grant video group to users on tty devices**

```echo "* ; tty* ; * ; Al0000-2400 ; video" >> /etc/security/group.conf```

**Grant a group to members of another group during weekday office hours**

```echo "* ; * ; %[staff] ; Wk0900-1800 ; [group]" >> /etc/security/group.conf```

# SYNOPSIS

**pam_group.so**

# PARAMETERS

Configuration in /etc/security/group.conf:

Format: _services_ ; _ttys_ ; _users_ ; _times_ ; _groups_

In the _users_ field, UNIX groups are prefixed with **%** and netgroups with **@**. Times combine day codes (**Mo Tu We Th Fr Sa Su**, **Wk** weekdays, **Wd** weekend, **Al** all days) with an **HHMM-HHMM** range.

This module does not accept any options.

# DESCRIPTION

**pam_group** is a PAM module that grants supplementary group memberships during the credential setting phase of authentication. It does not authenticate the user. Memberships are granted based on the service being accessed, the terminal, the user, and the time of login, as configured in /etc/security/group.conf. Groups are added in addition to those in /etc/group.

# CAVEATS

Only the **auth** module type is provided. Requires /etc/security/group.conf to be configured, or a vendor copy where Linux-PAM was built with one. Once granted group membership, a user could attempt to create a setgid binary; mount filesystems with the **nosuid** option to mitigate this.

# SEE ALSO

[group.conf](/man/group.conf)(5), [pam](/man/pam)(8), [pam.d](/man/pam.d)(5), [pam_time](/man/pam_time)(8), [pam_unix](/man/pam_unix)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

<!-- verified: 2026-11-09 -->
