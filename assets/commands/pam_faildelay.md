# TAGLINE

sets authentication failure delay

# TLDR

**Set authentication delay**

```auth optional pam_faildelay.so delay=3000000```

**Short delay**

```auth optional pam_faildelay.so delay=1000000```

**Use FAIL_DELAY from /etc/login.defs**

```auth optional pam_faildelay.so```

# SYNOPSIS

**pam_faildelay.so** [_options_]

# PARAMETERS

**delay=**_MICROSECONDS_
> Delay in microseconds (1000000 = 1 second). If omitted, **FAIL_DELAY** from `/etc/login.defs` is used.

**debug**
> Send debugging messages to syslog.

# DESCRIPTION

**pam_faildelay** is a PAM module that sets the delay applied after a failed authentication attempt. An explicit **delay=** takes the place of the **FAIL_DELAY** value from `/etc/login.defs`, which is only used when no delay is given. The delay is specified in microseconds (1,000,000 = 1 second).

The module is configured in PAM service files (e.g., `/etc/pam.d/login`) and helps mitigate brute-force attacks by slowing down repeated authentication attempts.

# CAVEATS

Only the **auth** module type is provided. The delay is specified in microseconds, not seconds. Setting very long delays may frustrate legitimate users who mistype passwords. The module only affects failures handled by the PAM stack, not application-level authentication.

# HISTORY

**pam_faildelay** was written by **Darren Tucker** and ships with Linux-PAM.

# SEE ALSO

[pam](/man/pam)(8), [pam.d](/man/pam.d)(5), [pam.conf](/man/pam.conf)(5), [login.defs](/man/login.defs)(5), [pam_tally2](/man/pam_tally2)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

<!-- verified: 2026-11-09 -->
