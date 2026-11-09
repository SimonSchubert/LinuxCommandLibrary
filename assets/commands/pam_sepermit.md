# TAGLINE

PAM module to allow/deny login based on SELinux enforcement state

# TLDR

**Enable in the PAM auth stack** (upstream example)

```auth [success=done ignore=ignore default=bad] pam_sepermit.so```

**Enable with debug logging**

```auth [success=done ignore=ignore default=bad] pam_sepermit.so debug```

**Use custom configuration file**

```auth [success=done ignore=ignore default=bad] pam_sepermit.so conf=/etc/security/custom_sepermit.conf```

**Allow one session for an SELinux user** in the config file

```echo "%guest_u:exclusive" >> /etc/security/sepermit.conf```

# SYNOPSIS

**pam_sepermit.so** [**debug**] [**conf=**_file_]

# PARAMETERS

**debug**
> Turn on debugging via syslog.

**conf=**_FILE_
> Use an alternate configuration file instead of the default /etc/security/sepermit.conf.

# CONFIGURATION

**/etc/security/sepermit.conf**
> One entry per line in the form _user_[:_option_:_option_...]. An entry is a username, a group as **@group**, or an SELinux user as **%seuser**. Lines whose first non-whitespace character is # are comments.

**exclusive**
> Config file option: allow only a single login session for the user, and kill the user's processes on logout.

**ignore**
> Config file option: never return PAM_SUCCESS for the user. Returns PAM_IGNORE if SELinux is enforcing and PAM_AUTH_ERR otherwise.

# DESCRIPTION

**pam_sepermit** is a PAM module that allows or denies login depending on the SELinux enforcement state. Users matching an entry in the configuration file are allowed only when SELinux is enforcing, and are denied otherwise. For users matching no entry, the module returns PAM_IGNORE.

The module provides the **auth** and **account** types.

# CAVEATS

Matching users are denied when SELinux is permissive or disabled. Entries using **%seuser** are never matched when SELinux is disabled, because the SELinux user cannot be determined, so the module returns PAM_IGNORE for them. The module must be placed correctly in the PAM stack order. Configuration errors can lock out users.

# HISTORY

**pam_sepermit** is part of the Linux-PAM project and was introduced to provide fine-grained login control on SELinux-enabled systems, complementing the broader pam_selinux module.

# SEE ALSO

[pam](/man/pam)(8), [pam_selinux](/man/pam_selinux)(8), [getenforce](/man/getenforce)(8), [sestatus](/man/sestatus)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_sepermit.8.html)```

<!-- verified: 2026-11-09 -->
