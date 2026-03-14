# TAGLINE

PAM module to allow/deny login based on SELinux user state

# TLDR

**Enable in PAM auth stack**

```auth required pam_sepermit.so```

**Enable with exclusive login enforcement**

```auth required pam_sepermit.so exclusive```

**Use custom configuration file**

```auth required pam_sepermit.so conf=/etc/security/custom_sepermit.conf```

**Add user permit rule to config**

```echo "%wheel" >> /etc/security/sepermit.conf```

# SYNOPSIS

**pam_sepermit.so** [**conf=**_file_] [**exclusive**]

# PARAMETERS

**exclusive**
> Only allow one login session at a time for the SELinux user. If another session is active, login is denied.

**conf=**_FILE_
> Use an alternate configuration file instead of the default /etc/security/sepermit.conf.

# CONFIGURATION

**/etc/security/sepermit.conf**
> Configuration file listing SELinux users, UNIX users, or UNIX groups (prefixed with %) that are allowed or denied login. Lines beginning with # are comments. Each line specifies a user or group and optional modifiers like exclusive or ignore.

# DESCRIPTION

**pam_sepermit** is a PAM module that allows or denies login depending on the SELinux user state. It checks whether SELinux is enforcing and whether the user's SELinux context matches entries in the configuration file. When SELinux is in permissive mode or disabled, the module allows access by default.

The module is typically placed in the auth stack and is used to restrict which users can log in on SELinux-enabled systems based on their mapped SELinux identity.

# CAVEATS

Requires SELinux to be enabled and configured on the system. When SELinux is disabled, the module permits all access. The module must be placed correctly in the PAM stack order. Configuration errors can lock out users.

# HISTORY

**pam_sepermit** is part of the Linux-PAM project and was introduced to provide fine-grained login control on SELinux-enabled systems, complementing the broader pam_selinux module.

# SEE ALSO

[pam](/man/pam)(8), [pam_selinux](/man/pam_selinux)(8), [getenforce](/man/getenforce)(8), [sestatus](/man/sestatus)(8)

