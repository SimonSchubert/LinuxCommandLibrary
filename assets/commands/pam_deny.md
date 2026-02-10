# TAGLINE

always returns failure

# TLDR

**Deny all authentication**

```auth required pam_deny.so```

**Block account access**

```account required pam_deny.so```

**Disable password changes**

```password required pam_deny.so```

# SYNOPSIS

**pam_deny.so**

# PARAMETERS

No parameters. Always returns failure.

# DESCRIPTION

**pam_deny** always returns failure. Used to block authentication.

The module denies all requests unconditionally. Security failsafe module.

# CAVEATS

No configuration options. Use carefully to avoid lockout.

# HISTORY

pam_deny provides a **universal deny module** for PAM configurations.

# SEE ALSO

[pam](/man/pam)(8), [pam_permit](/man/pam_permit)(8)

