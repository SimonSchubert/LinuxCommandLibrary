# TLDR

**Toggle** a SELinux boolean

```sudo togglesebool virt_use_samba```

Toggle **multiple** booleans

```sudo togglesebool httpd_enable_homedirs ftpd_full_access```

# SYNOPSIS

**togglesebool** _boolean_...

# DESCRIPTION

**togglesebool** flips the current (non-persistent) values of SELinux booleans. If a boolean is currently on, it will be turned off, and vice versa. Changes do not persist across reboots.

# PARAMETERS

**boolean**
> One or more SELinux boolean names to toggle

# CAVEATS

This tool has been deprecated and is often removed in favor of setsebool. Changes made with togglesebool are non-persistent and will be lost after reboot. Use setsebool -P for persistent changes.

# HISTORY

**togglesebool** was part of the early SELinux tools for managing boolean values. It has been superseded by **setsebool** which provides more control over persistence.

# SEE ALSO

[setsebool](/man/setsebool)(8), [getsebool](/man/getsebool)(8), [semanage-boolean](/man/semanage-boolean)(8)
