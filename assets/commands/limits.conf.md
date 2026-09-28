# TAGLINE

PAM configuration file that sets resource limits for users and groups

# TLDR

**Set maximum open files for user**

```[username] hard nofile [65535]```

**Set soft and hard limit at once**

```[username] - nofile [65535]```

**Set memory limit (in KB)**

```[username] hard as [4194304]```

**Set for all users**

```* soft nproc [1024]```

**Set for group**

```@[groupname] hard maxlogins [10]```

**Allow unlimited locked memory for a group**

```@[groupname] - memlock unlimited```

**Disable core dumps for everyone**

```* hard core 0```

**Check the limits of the current session**

```ulimit -a```

# SYNOPSIS

**/etc/security/limits.conf**

**/etc/security/limits.d/*.conf**

_domain_ _type_ _item_ _value_

# PARAMETERS

**username**
> Domain: a single user.

**@group**
> Domain: all members of a group.

**\***
> Domain: wildcard default entry (does not apply to root).

**%group**
> Domain: for maxlogins only, limits the total logins of all members of a group.

**min_uid:max_uid**, **@min_gid:max_gid**
> Domain: a UID or GID range; either bound may be omitted.

**hard**
> Hard limit, set by root and enforced by the kernel. Users cannot raise it.

**soft**
> Soft limit, the default value, which users can raise up to the hard limit.

**-**
> Set both the soft and hard limit.

**nofile**
> Maximum open file descriptors.

**nproc**
> Maximum processes.

**as**
> Address space limit (KB).

**data**
> Maximum data size (KB).

**fsize**
> Maximum file size (KB).

**core**
> Maximum core file size (KB).

**memlock**
> Maximum locked-in-memory address space (KB).

**stack**
> Maximum stack size (KB).

**cpu**
> Maximum CPU time (minutes).

**maxlogins**
> Maximum logins for this user (not applied to uid 0).

**maxsyslogins**
> Maximum number of all logins on the system.

**priority**
> Priority to run user processes with.

**nice**
> Maximum nice priority allowed to raise to (-20 to 19).

**rtprio**
> Maximum realtime priority for non-privileged processes.

**locks**, **sigpending**, **msgqueue**, **rttime**
> Maximum file locks, pending signals, POSIX message queue bytes, and realtime timeout (microseconds).

**nonewprivs**
> 0 or 1; if 1, sets PR_SET_NO_NEW_PRIVS to block gaining new privileges.

# DESCRIPTION

**limits.conf** is the configuration file for the **pam_limits** module, which applies ulimit limits, nice priority and login-count limits to user sessions opened through PAM. Files in **/etc/security/limits.d/** with a **.conf** suffix are read as well.

Each line has the format: domain type item value. Values **-1**, **unlimited** or **infinity** mean no limit (except for priority, nice and nonewprivs). Individual user entries take priority over group entries. Lines starting with **#** are comments.

# EXAMPLE CONFIG

```
# /etc/security/limits.conf
* soft nofile 4096
* hard nofile 65535
@developers soft nproc 2048
@audio - rtprio 95
root hard nproc unlimited
```

# CAVEATS

Requires the pam_limits module in the relevant PAM service stack. Changes apply at the next login, not to running sessions. Limits are per session, not global (except maxlogins). The **\*** wildcard does not apply to root, which needs explicit entries. Systemd services ignore this file; use **LimitNOFILE=** and similar directives in unit files, or **DefaultLimitNOFILE=** in systemd's system.conf.

# SEE ALSO

[ulimit](/man/ulimit)(1), [prlimit](/man/prlimit)(1), [pam](/man/pam)(8), [pam_limits](/man/pam_limits)(8), [getrlimit](/man/getrlimit)(2), [sysctl](/man/sysctl)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man5/limits.conf.5.html)```

<!-- verified: 2026-09-29 -->
