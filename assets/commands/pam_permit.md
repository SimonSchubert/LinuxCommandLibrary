# TAGLINE

always returns success

# TLDR

**Allow all authentication**

```auth sufficient pam_permit.so```

**Disable account management** for a service

```account required pam_permit.so```

**Always succeed session**

```session optional pam_permit.so```

# SYNOPSIS

**pam_permit.so**

# PARAMETERS

No parameters. Always returns success.

# DESCRIPTION

**pam_permit** always returns **PAM_SUCCESS**. Permits all access unconditionally and provides all four module types: auth, account, password and session.

The module performs no checks of its own. It is mostly useful as a placeholder in a stack where a module type must succeed, such as disabling account management while still letting users log in.

# CAVEATS

Very dangerous: anyone can pass an **auth** stack that relies on this module, as no authentication is performed. If the application has not set a user name during authentication, the module sets it to **nobody**, which can confuse applications and other PAM modules.

# HISTORY

pam_permit is part of **Linux-PAM**, the pluggable authentication framework used by most Linux distributions.

# SEE ALSO

[pam](/man/pam)(8), [pam.d](/man/pam.d)(5), [pam_deny](/man/pam_deny)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man.archlinux.org/man/pam_permit.8)```

<!-- verified: 2026-11-08 -->
