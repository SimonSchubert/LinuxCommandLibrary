# TAGLINE

Toggle SELinux enforcing and permissive modes

# TLDR

**Put** SELinux in enforcing mode

```setenforce 1```

**Put** SELinux in permissive mode

```setenforce 0```

# SYNOPSIS

**setenforce** [**0**|**1**|**Permissive**|**Enforcing**]

# PARAMETERS

**0, Permissive**
> Switch to permissive mode (log violations but don't enforce)

**1, Enforcing**
> Switch to enforcing mode (log and enforce policy)

# DESCRIPTION

**setenforce** toggles SELinux between enforcing and permissive modes at runtime. In **enforcing** mode, SELinux denies access based on policy rules. In **permissive** mode, violations are logged but not blocked.

This change is temporary and does not persist across reboots. To permanently change the SELinux mode, edit **/etc/selinux/config** and set the **SELINUX** variable.

# CAVEATS

Requires root privileges. Cannot enable/disable SELinux entirely; only toggles between enforcing and permissive. To check current mode, use **getenforce**. Switching to permissive mode reduces system security.

# HISTORY

**setenforce** is part of the SELinux userspace tools developed by the NSA and Red Hat. It has been available since the introduction of SELinux in the Linux 2.6 kernel.

# SEE ALSO

[getenforce](/man/getenforce)(8), [semanage-permissive](/man/semanage-permissive)(8), [sestatus](/man/sestatus)(8), [selinux](/man/selinux)(8)
