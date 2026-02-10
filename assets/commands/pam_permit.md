# TAGLINE

always returns success

# TLDR

**Allow all authentication**

```auth sufficient pam_permit.so```

**Always succeed session**

```session optional pam_permit.so```

# SYNOPSIS

**pam_permit.so**

# PARAMETERS

No parameters. Always returns success.

# DESCRIPTION

**pam_permit** always returns success. Permits all access unconditionally.

The module grants all requests. Security bypass module.

# CAVEATS

Security risk. Use only when appropriate. No authentication performed.

# HISTORY

pam_permit provides a **universal permit module** for PAM configurations.

# SEE ALSO

[pam](/man/pam)(8), [pam_deny](/man/pam_deny)(8)

