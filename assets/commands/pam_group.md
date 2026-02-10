# TAGLINE

assigns supplementary groups at login

# TLDR

**Enable group assignment**

```auth required pam_group.so```

**Configure in group.conf**

```echo "* ; * ; * ; Al0000-2400 ; audio" >> /etc/security/group.conf```

# SYNOPSIS

**pam_group.so**

# PARAMETERS

Configuration in /etc/security/group.conf:

Format: services ; ttys ; users ; times ; groups

# DESCRIPTION

**pam_group** assigns supplementary groups at login. Time and terminal based.

The module adds groups conditionally. Configured via group.conf.

# CAVEATS

Requires group.conf. Auth stack only. Groups added per-session.

# HISTORY

pam_group provides **conditional group assignment** based on login context.

# SEE ALSO

[pam](/man/pam)(8), [group.conf](/man/group.conf)(5)

