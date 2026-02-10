# TAGLINE

controls SELinux user access

# TLDR

**Check SELinux permits**

```auth required pam_sepermit.so```

**With exclusive login**

```auth required pam_sepermit.so exclusive```

**Configure in sepermit.conf**

```echo "user:seuser" >> /etc/security/sepermit.conf```

# SYNOPSIS

**pam_sepermit.so** [_options_]

# PARAMETERS

**exclusive**
> Exclusive login required.

**conf=**_FILE_
> Configuration file.

Configuration in /etc/security/sepermit.conf.

# DESCRIPTION

**pam_sepermit** controls SELinux user access. Permit/deny based on SELinux user.

The module restricts logins. Based on sepermit.conf rules.

# CAVEATS

SELinux required. Configuration file based. Auth module.

# HISTORY

pam_sepermit provides **SELinux user login control** via permit configuration.

# SEE ALSO

[pam](/man/pam)(8), [pam_selinux](/man/pam_selinux)(8), [selinux](/man/selinux)(8)

