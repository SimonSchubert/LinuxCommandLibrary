# TAGLINE

SELinux persistent policy management tool

# TLDR

**Set** or unset a SELinux boolean

```sudo semanage boolean -m --on|--off [haproxy_connect_any]```

**Add** a user-defined file context labeling rule

```sudo semanage fcontext -a -t [samba_share_t] '/mnt/share(/.*)?'```

**Add** a user-defined port labeling rule

```sudo semanage port -a -t [ssh_port_t] -p [tcp] [22000]```

**Set** or unset permissive mode for a confined domain

```sudo semanage permissive --add|--delete [httpd_t]```

**List** only local file context customizations

```sudo semanage fcontext -l -C```

**Export** local customizations to a file

```sudo semanage export -f [path/to/file]```

**Import** customizations from a file

```sudo semanage import -f [path/to/file]```

# SYNOPSIS

**semanage** {_subcommand_} [_options_]

# PARAMETERS

**boolean**
> Manage SELinux booleans.

**fcontext**
> Manage file context labeling rules.

**port**
> Manage port type definitions.

**interface**
> Manage network interface type definitions.

**node**
> Manage network node type definitions.

**login**
> Manage mappings between Linux users and SELinux confined users.

**user**
> Manage SELinux user definitions and their authorized roles.

**module**
> Manage SELinux policy modules.

**permissive**
> Manage permissive mode for confined domains.

**dontaudit**
> Toggle dontaudit rules in the policy.

**export**
> Export local customizations.

**import**
> Import local customizations.

**ibpkey**
> Manage InfiniBand pkey type definitions.

**ibendport**
> Manage InfiniBand end port type definitions.

**-a**, **--add**
> Add a new record.

**-m**, **--modify**
> Modify an existing record.

**-d**, **--delete**
> Delete a record.

**-l**, **--list**
> List records.

**-D**, **--deleteall**
> Remove all local customizations of the object type.

**-E**, **--extract**
> Print customizable commands, for use within a transaction.

**-t**, **--type** _type_
> SELinux type for the object.

**-S**, **--store** _store_
> Select an alternate SELinux policy store to manage.

**-N**, **--noreload**
> Do not reload the policy after commit.

**-n**, **--noheading**
> Suppress the heading line when listing.

**-C**, **--locallist**
> List only local customizations (not base policy records).

**-f**, **--output_file** | **--input_file** _file_
> With export, write to this file; with import, read from it.

# DESCRIPTION

**semanage** is the SELinux Policy Management tool for configuring persistent security policy settings. Unlike **chcon**, or **setsebool** without **-P**, changes made with semanage persist across reboots and relabels.

The tool manages booleans, file contexts, ports, network interfaces, and user mappings. It provides granular control over SELinux policy without requiring policy source modification.

# CONFIGURATION

**/etc/selinux/*/policy/**
> Directory containing the compiled binary policy loaded into the kernel.

**/var/lib/selinux/**
> Policy store holding installed modules and local customizations.

# CAVEATS

Requires root privileges. Changes to file contexts require **restorecon** to apply. Importing customizations may remove existing local modifications. Available only on SELinux-enabled systems.

# SEE ALSO

[semanage-boolean](/man/semanage-boolean)(8), [semanage-fcontext](/man/semanage-fcontext)(8), [semanage-port](/man/semanage-port)(8), [restorecon](/man/restorecon)(8), [getsebool](/man/getsebool)(8), [setsebool](/man/setsebool)(8), [chcon](/man/chcon)(1)

# RESOURCES

```[Source code](https://github.com/SELinuxProject/selinux)```

```[Documentation](https://man7.org/linux/man-pages/man8/semanage.8.html)```

<!-- verified: 2026-11-09 -->
