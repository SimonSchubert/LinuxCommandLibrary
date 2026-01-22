# TLDR

**Enable resource limits**

```session required pam_limits.so```

**Configure limits**

```echo "* hard nofile 65535" >> /etc/security/limits.conf```

**User specific limit**

```echo "@admin soft nproc unlimited" >> /etc/security/limits.conf```

# SYNOPSIS

**pam_limits.so** [_options_]

# PARAMETERS

**conf=**_FILE_
> Alternate config file.

**change_uid**
> Change to user UID first.

**utmp_early**
> Update utmp early.

Configuration in /etc/security/limits.conf.

# DESCRIPTION

**pam_limits** sets resource limits. Enforces ulimit values on login.

The module configures process limits. Uses limits.conf for settings.

pam_limits enforces resource limits.

# CAVEATS

Session module. Limits apply at login. Root can override.

# HISTORY

pam_limits provides **resource limiting** to prevent system resource exhaustion.

# SEE ALSO

[pam](/man/pam)(8), [limits.conf](/man/limits.conf)(5), [ulimit](/man/ulimit)(1)

