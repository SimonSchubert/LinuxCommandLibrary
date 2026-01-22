# TLDR

**Set** or unset a SELinux boolean

```sudo semanage boolean -m --on|--off [haproxy_connect_any]```

**Add** a user-defined file context labeling rule

```sudo semanage fcontext -a -t [samba_share_t] '/mnt/share(/.*)?'```

**Add** a user-defined port labeling rule

```sudo semanage port -a -t [ssh_port_t] -p [tcp] [22000]```

**Set** or unset permissive mode for a confined domain

```sudo semanage permissive --add|--delete [httpd_t]```

**Export** local customizations to a file

```sudo semanage export -f [path/to/file]```

**Import** customizations from a file

```sudo semanage import -f [path/to/file]```

# SYNOPSIS

**semanage** {_subcommand_} [_options_]

# PARAMETERS

**boolean**
> Manage SELinux booleans

**fcontext**
> Manage file context labeling rules

**port**
> Manage port labeling rules

**permissive**
> Manage permissive domain modes

**login**
> Manage login mappings between Linux users and SELinux users

**user**
> Manage SELinux user definitions

**-a, --add**
> Add a new record

**-m, --modify**
> Modify an existing record

**-d, --delete**
> Delete a record

**-l, --list**
> List records

# DESCRIPTION

**semanage** is the SELinux Policy Management tool for configuring persistent security policy settings. Unlike **setsebool** or **chcon**, changes made with semanage persist across reboots.

The tool manages booleans, file contexts, ports, network interfaces, and user mappings. It provides granular control over SELinux policy without requiring policy source modification.

# CAVEATS

Requires root privileges. Changes to file contexts require **restorecon** to apply. Importing customizations may remove existing local modifications. Available only on SELinux-enabled systems.

# SEE ALSO

[semanage-boolean](/man/semanage-boolean)(8), [semanage-fcontext](/man/semanage-fcontext)(8), [semanage-port](/man/semanage-port)(8), [restorecon](/man/restorecon)(8), [getsebool](/man/getsebool)(8)
