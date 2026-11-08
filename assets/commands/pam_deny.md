# TAGLINE

always returns failure

# TLDR

**Deny all authentication**

```auth required pam_deny.so```

**Block account access**

```account required pam_deny.so```

**Disable password changes**

```password required pam_deny.so```

**Refuse session** setup

```session required pam_deny.so```

**Log and deny** by default in **/etc/pam.d/other**

```auth required pam_warn.so\nauth required pam_deny.so```

# SYNOPSIS

**pam_deny.so**

# PARAMETERS

No parameters. Always returns failure.

# DESCRIPTION

**pam_deny** always returns failure. Used to block authentication.

The module denies all requests unconditionally and provides all four module types: auth, account, password and session. It is commonly used as a failsafe at the end of a stack or in the **other** service, which applies to services without their own configuration.

# RETURN VALUES

**PAM_AUTH_ERR**
> Returned by the account and auth services.

**PAM_CRED_ERR**
> Returned by the setcred function.

**PAM_AUTHTOK_ERR**
> Returned by the password service.

**PAM_SESSION_ERR**
> Returned by the session service.

# CAVEATS

No configuration options. Use carefully to avoid lockout.

# HISTORY

pam_deny is part of **Linux-PAM**, the pluggable authentication framework used by most Linux distributions.

# SEE ALSO

[pam](/man/pam)(8), [pam.d](/man/pam.d)(5), [pam_permit](/man/pam_permit)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man.archlinux.org/man/pam_deny.8)```

<!-- verified: 2026-11-08 -->
