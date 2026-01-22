# TLDR

**Require valid shell**

```auth required pam_shells.so```

**Account validation**

```account required pam_shells.so```

# SYNOPSIS

**pam_shells.so**

# PARAMETERS

No parameters. Checks /etc/shells.

# DESCRIPTION

**pam_shells** validates user shells. Checks shell in /etc/shells.

The module denies invalid shells. Security access control.

pam_shells validates login shells.

# CAVEATS

Requires /etc/shells. Fails for unlisted shells.

# HISTORY

pam_shells ensures users have a **valid shell** listed in /etc/shells.

# SEE ALSO

[pam](/man/pam)(8), [shells](/man/shells)(5), [chsh](/man/chsh)(1)

