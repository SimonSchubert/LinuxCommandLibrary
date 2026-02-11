# TAGLINE

Check if SELinux is enabled on the system

# TLDR

**Check** if SELinux is enabled (no output)

```selinuxenabled```

Check and **print result**

```selinuxenabled && echo "SELinux is enabled" || echo "SELinux is disabled"```

Use in **shell script** conditionally

```if selinuxenabled; then echo "SELinux is running"; fi```

# SYNOPSIS

**selinuxenabled**

# DESCRIPTION

**selinuxenabled** checks whether SELinux is enabled on the system. It produces no output but returns exit code 0 if SELinux is enabled, and 1 if it is disabled.

This is useful for scripts that need to conditionally execute commands based on SELinux status.

# CAVEATS

Only checks if SELinux is enabled, not whether it's in enforcing or permissive mode. Use getenforce for mode information.

# HISTORY

Part of **libselinux-utils**, providing SELinux status checking utilities.

# SEE ALSO

[getenforce](/man/getenforce)(1), [setenforce](/man/setenforce)(8), [sestatus](/man/sestatus)(8)
