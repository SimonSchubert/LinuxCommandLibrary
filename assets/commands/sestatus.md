# TAGLINE

Report SELinux status and configuration

# TLDR

**Print** current SELinux status

```sestatus```

**Print** states of all policy booleans

```sestatus -b```

**Print** file and process contexts

```sestatus -v```

# SYNOPSIS

**sestatus** [_-v_] [_-b_]

# PARAMETERS

**-b**
> Display current states of all policy booleans

**-v**
> Display security contexts of files and processes from /etc/sestatus.conf

# DESCRIPTION

**sestatus** reports the current status of the SELinux system. It shows whether SELinux is enabled, its current mode (enforcing, permissive, or disabled), the loaded policy type, and various security settings.

Typical output includes SELinux status, loaded policy, current mode, policy version, and whether policies are being denied.

# OUTPUT FIELDS

**SELinux status**: enabled/disabled
**SELinuxfs mount**: path to SELinux filesystem
**SELinux root directory**: SELinux configuration location
**Loaded policy name**: targeted, mls, etc.
**Current mode**: enforcing, permissive, disabled
**Mode from config file**: configured default mode
**Policy MLS status**: MLS/MCS status
**Policy deny_unknown status**: how unknown access is handled
**Memory protection checking**: protection mode

# CAVEATS

Only works on systems with SELinux installed. Requires read access to SELinux filesystem and configuration files.

# SEE ALSO

[getenforce](/man/getenforce)(8), [setenforce](/man/setenforce)(8), [semanage](/man/semanage)(8)
