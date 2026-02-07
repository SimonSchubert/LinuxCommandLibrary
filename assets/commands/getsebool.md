# TAGLINE

SELinux boolean state query tool

# TLDR

Show the **current setting** of a boolean

```getsebool httpd_can_connect_ftp```

Show the current setting of **all** booleans

```getsebool -a```

Show all booleans with **explanations**

```sudo semanage boolean -l```

# SYNOPSIS

**getsebool** [_-a_] [_boolean_]

# PARAMETERS

**-a**
> List all SELinux booleans and their current values

**boolean**
> Name of specific boolean to query

# DESCRIPTION

**getsebool** retrieves the current value of SELinux booleans. SELinux booleans are on/off switches that modify SELinux policy behavior at runtime without requiring policy recompilation.

Booleans control specific policy features like whether Apache can connect to external networks (httpd_can_network_connect), whether users can run unconfined processes, or whether certain services can access home directories.

Output shows the boolean name and its current state (on/off). Use **setsebool** to change values.

# COMMON BOOLEANS

**httpd_can_network_connect** - Allow Apache to initiate network connections
**httpd_can_connect_ftp** - Allow Apache to connect to FTP servers
**allow_user_exec_content** - Allow users to execute content in home/tmp
**virt_use_nfs** - Allow virtual machines to use NFS

# CAVEATS

Requires SELinux to be enabled. Boolean names and availability vary by distribution and installed policy modules. Use **semanage boolean -l** for descriptions of what each boolean controls.

# HISTORY

SELinux booleans were introduced to provide flexibility in the policy without requiring policy source modifications. getsebool is part of the libselinux-utils package, providing command-line access to SELinux functionality.

# SEE ALSO

[setsebool](/man/setsebool)(8), [semanage](/man/semanage)(8), [getenforce](/man/getenforce)(1), [sestatus](/man/sestatus)(8)
