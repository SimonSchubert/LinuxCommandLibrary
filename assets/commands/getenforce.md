# TAGLINE

SELinux enforcement mode checker

# TLDR

Display the **current mode** of SELinux

```getenforce```

# SYNOPSIS

**getenforce**

# DESCRIPTION

**getenforce** displays the current mode of SELinux (Security-Enhanced Linux). The command outputs one of three possible values:

**Enforcing** - SELinux security policy is enforced. Access violations are blocked and logged.

**Permissive** - SELinux security policy is not enforced but violations are logged. Useful for troubleshooting and policy development.

**Disabled** - SELinux is completely disabled.

This is a quick way to check SELinux status without parsing configuration files or using more verbose tools like **sestatus**.

# CAVEATS

Returns "Disabled" if SELinux is not compiled into the kernel or if it was disabled at boot. The mode can be changed at runtime with **setenforce** (between Enforcing and Permissive only), but changing to/from Disabled requires a reboot.

# HISTORY

getenforce is part of the SELinux project, which was developed by the NSA (National Security Agency) and released as open source in **2000**. It was integrated into the Linux kernel in version 2.6 in **2003** and became the default security module for Red Hat Enterprise Linux and Fedora.

# SEE ALSO

[setenforce](/man/setenforce)(1), [sestatus](/man/sestatus)(8), [selinux](/man/selinux)(8)
