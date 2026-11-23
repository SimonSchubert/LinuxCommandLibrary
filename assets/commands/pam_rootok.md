# TAGLINE

PAM module that succeeds for UID 0

# TLDR

**Allow root without password** in /etc/pam.d/su

```auth sufficient pam_rootok.so```

**Enable debug logging** for the module

```auth sufficient pam_rootok.so debug```

# SYNOPSIS

**pam_rootok.so** [_debug_]

# DESCRIPTION

**pam_rootok** is a PAM authentication module that returns success if the calling user has a UID of 0 (root). It is most commonly used in **/etc/pam.d/su** to allow the root user to switch identity to any other account without being prompted for a password.

It is typically combined with the **sufficient** control flag, so that root passes immediately and other users continue down the stack to be authenticated normally (e.g. by **pam_unix** or **pam_wheel**).

The module provides the **auth**, **account**, and **password** module types, but is almost always used in the **auth** group.

# PARAMETERS

**debug**
> Log a message to syslog (auth facility) describing the action taken.

# EXAMPLES

```
# /etc/pam.d/su: let root su to anyone without a password
auth   sufficient   pam_rootok.so
auth   required     pam_unix.so
```

# CAVEATS

Mostly used in **auth** stacks; Linux-PAM also provides the **account** and **password** module types with the same UID check. The module checks the real UID, so it relies on the calling process actually running as root. Misconfigured PAM stacks that place this module in the wrong service file can grant unintended privilege escalation.

# HISTORY

**pam_rootok** is part of the **Linux-PAM** distribution and has been included since the early releases of Linux-PAM in the late 1990s.

# SEE ALSO

[pam](/man/pam)(8), [su](/man/su)(1), [pam_wheel](/man/pam_wheel)(8), [pam_unix](/man/pam_unix)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_rootok.8.html)```

<!-- verified: 2026-11-23 -->
