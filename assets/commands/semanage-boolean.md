# TAGLINE

Manage persistent SELinux boolean settings

# TLDR

**List** all boolean settings

```sudo semanage boolean -l```

**List** all user-defined boolean settings without headings

```sudo semanage boolean -l -C -n```

**Set** or unset a boolean persistently

```sudo semanage boolean -m --on|--off [haproxy_connect_any]```

# SYNOPSIS

**semanage boolean** [**-l**|**-m**] [_options_] [_boolean_]

# PARAMETERS

**-l, --list**
> List all booleans and their current values

**-m, --modify**
> Modify a boolean's persistent value

**-C, --locallist**
> Show only locally modified booleans

**-n, --noheading**
> Omit column headings from output

**-1, --on**
> Set boolean to on/true

**-0, --off**
> Set boolean to off/false

# DESCRIPTION

**semanage boolean** manages persistent SELinux boolean settings. Booleans allow administrators to customize how SELinux policy rules affect confined processes without modifying the policy itself.

Unlike **setsebool**, which can make temporary changes, semanage boolean changes persist across system reboots. The **-C** flag shows which booleans have been customized from their default values.

# CAVEATS

Requires root privileges. Boolean changes take effect immediately but are also saved persistently. Use **getsebool -a** for a quick non-persistent view of all booleans.

# SEE ALSO

[semanage](/man/semanage)(8), [getsebool](/man/getsebool)(8), [setsebool](/man/setsebool)(8), [selinux](/man/selinux)(8)
