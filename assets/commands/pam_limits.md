# TAGLINE

sets resource limits for user sessions

# TLDR

**Enable resource limits in a PAM service file**

```session required pam_limits.so```

**Set a hard limit on open file descriptors for all users**

```echo "* hard nofile 65535" >> /etc/security/limits.conf```

**Set soft and hard process limits for a group**

```echo "@developers - nproc 4096" >> /etc/security/limits.conf```

**Drop in a per-application limits override**

```echo "nginx hard nofile 100000" > /etc/security/limits.d/nginx.conf```

# SYNOPSIS

**pam_limits.so** [_options_]

# PARAMETERS

**conf=**_FILE_
> Use an alternate limits configuration file instead of `/etc/security/limits.conf`.

**debug**
> Print debug information to the system log.

**change_uid**
> Change to the user's UID before reading the limits file. Useful when the limits file is only accessible by the target user.

**utmp_early**
> Read the utmp entry before the module runs. Works around broken applications that allocate utmp entries before PAM completes.

**noaudit**
> Do not report exceeded maximum login count to the audit subsystem.

**set_all**
> Set unspecified limits from the PID 1 process limits. Not recommended on systemd systems, as PID 1 limits differ from kernel defaults.

Configuration is read from `/etc/security/limits.conf` and drop-in files in `/etc/security/limits.d/*.conf`.

# DESCRIPTION

**pam_limits** is a PAM session module that enforces per-user and per-group resource limits at login time. It reads limit definitions from `/etc/security/limits.conf` and any `*.conf` files in `/etc/security/limits.d/`, which are applied in lexicographic order.

Each rule in the configuration has the format: `domain type item value`. The domain is a username, `@groupname`, `*` (all users), or a UID/GID range. The type is `soft` (user-adjustable ceiling), `hard` (kernel-enforced maximum), or `-` (set both). Common items include `nofile` (open file descriptors), `nproc` (processes), `memlock` (locked memory in KB), `stack` (stack size in KB), `cpu` (CPU time in minutes), `as` (address space in KB), `maxlogins` (concurrent logins per user), and `priority` (scheduling priority).

Individual user entries take precedence over group entries. Users including root (uid=0) are subject to these limits. Use `unlimited`, `infinity`, or `-1` as the value to remove a limit (not valid for `priority`, `nice`, or `nonewprivs`).

Limits only take effect for new login sessions; running processes are not affected.

# CAVEATS

Session module only — must be placed in the `session` stack of a PAM service file (e.g. `/etc/pam.d/common-session`). Limits are applied per-session at login; changes require the user to log out and back in.

Root (uid=0) is affected by these limits like any other user.

Systemd services ignore `/etc/security/limits.conf`; use `LimitNOFILE=` and related directives in the unit file instead.

This module must not be called from a multithreaded application.

# SEE ALSO

[limits.conf](/man/limits.conf)(5), [pam](/man/pam)(8), [ulimit](/man/ulimit)(1), [sysctl](/man/sysctl)(8)
