# TLDR

View documentation for **listing** enrolled fingerprints

```tldr fprintd-list```

View documentation for **enrolling** new fingerprints

```tldr fprintd-enroll```

View documentation for **verifying** a fingerprint against a database

```tldr fprintd-verify```

View documentation for **deleting** fingerprints from a database

```tldr fprintd-delete```

# SYNOPSIS

**fprintd** is a D-Bus daemon, not a standalone command. Use the related client commands.

# DESCRIPTION

**fprintd** is the fingerprint daemon that provides fingerprint scanning functionality through D-Bus. It acts as a system service managing fingerprint readers and enrolled fingerprint data, allowing applications to authenticate users via fingerprints.

The daemon itself runs in the background and is typically started by systemd. Users interact with it through client utilities:

**fprintd-enroll** - Register new fingerprints
**fprintd-list** - List enrolled fingerprints
**fprintd-verify** - Verify a fingerprint
**fprintd-delete** - Remove enrolled fingerprints

Integration with PAM allows fingerprint authentication for login, sudo, and other system authentication points.

# CAVEATS

Requires a compatible fingerprint reader supported by libfprint. Not all readers work reliably. Fingerprint data is stored in **/var/lib/fprint** and should be protected. PAM configuration is required for system authentication integration.

# HISTORY

fprintd is part of the fprint project, which provides fingerprint reader support for Linux. The project was started to bring standardized fingerprint authentication to Linux systems, leveraging the libfprint library for hardware abstraction.

# SEE ALSO

[fprintd-enroll](/man/fprintd-enroll)(1), [fprintd-list](/man/fprintd-list)(1), [fprintd-verify](/man/fprintd-verify)(1), [fprintd-delete](/man/fprintd-delete)(1)
