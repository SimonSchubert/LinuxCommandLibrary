# TAGLINE

succeeds if user is root

# TLDR

**Allow root without password**

```auth sufficient pam_rootok.so```

# SYNOPSIS

**pam_rootok.so**

# PARAMETERS

No parameters. Checks for UID 0.

# DESCRIPTION

**pam_rootok** succeeds if user is root. Allows password-less root operations.

The module checks UID equals zero. Used for su and similar.

# CAVEATS

Only for root user. Use with sufficient. Security implications.

# HISTORY

pam_rootok allows **root user bypass** for commands like su.

# SEE ALSO

[pam](/man/pam)(8), [su](/man/su)(1), [pam_wheel](/man/pam_wheel)(8)

