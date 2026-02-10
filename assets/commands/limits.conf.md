# TAGLINE

PAM configuration file that sets resource limits for users and groups

# TLDR

**Set maximum open files for user**

```[username] hard nofile [65535]```

**Set memory limit**

```[username] hard as [4194304]```

**Set for all users**

```* soft nproc [1024]```

**Set for group**

```@[groupname] hard maxlogins [10]```

# SYNOPSIS

**/etc/security/limits.conf**

# PARAMETERS

**hard**
> Hard limit (maximum value).

**soft**
> Soft limit (default value).

**nofile**
> Maximum open files.

**nproc**
> Maximum processes.

**as**
> Address space limit.

**maxlogins**
> Maximum logins.

**memlock**
> Maximum locked memory.

**stack**
> Maximum stack size.

# DESCRIPTION

**limits.conf** is a PAM configuration file that sets resource limits for users and groups. Limits are enforced when users log in through PAM-enabled services.

The format is: domain type item value. Domain can be username, @groupname, or * for all users.

# EXAMPLE CONFIG

```
# /etc/security/limits.conf
* soft nofile 4096
* hard nofile 65535
@developers soft nproc 2048
root hard nproc unlimited
```

# CAVEATS

Requires pam_limits module. Changes apply at next login. Systemd services may need LimitNOFILE in unit files. Check with ulimit -a.

# SEE ALSO

[ulimit](/man/ulimit)(1), [pam](/man/pam)(8), [pam_limits](/man/pam_limits)(8), [sysctl](/man/sysctl)(8)
