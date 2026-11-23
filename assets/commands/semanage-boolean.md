# TAGLINE

Manage persistent SELinux boolean settings

# TLDR

**List** all boolean settings

```sudo semanage boolean -l```

**List** all user-defined boolean settings without headings

```sudo semanage boolean -l -C -n```

**Set** or unset a boolean persistently

```sudo semanage boolean -m --on|--off [haproxy_connect_any]```

**Show** a specific boolean

```sudo semanage boolean -l | grep [httpd_can_sendmail]```

**Export** local boolean customizations as semanage commands

```sudo semanage boolean -E```

**Remove** all local boolean customizations

```sudo semanage boolean -D```

# SYNOPSIS

**semanage boolean** [**-h**] [**-n**] [**-N**] [**-S** _store_] [**-E** | **-D** | **-l** [**-C**] | **-m** (**--on** | **--off**) _boolean_]

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

**-E, --extract**
> Print local customizations as commands, for use within a transaction

**-D, --deleteall**
> Remove all local boolean customizations

**-N, --noreload**
> Do not reload policy after commit

**-S, --store** _STORE_
> Select an alternate SELinux policy store to manage

**-h, --help**
> Show help message and exit

# DESCRIPTION

**semanage boolean** manages persistent SELinux boolean settings. Booleans allow administrators to customize how SELinux policy rules affect confined processes without modifying the policy itself.

Unlike **setsebool** without **-P**, which only changes the runtime value, semanage boolean changes persist across reboots (**semanage boolean -m --on** is equivalent to **setsebool -P ... on**). The **-C** flag shows which booleans have been customized from their default values.

# CAVEATS

Requires root privileges. Boolean changes take effect immediately but are also saved persistently. Modifying a boolean rebuilds the policy store, which can take a few seconds. Use **getsebool -a** for a quick view of current runtime values.

# SEE ALSO

[semanage](/man/semanage)(8), [getsebool](/man/getsebool)(8), [setsebool](/man/setsebool)(8), [sestatus](/man/sestatus)(8), [selinuxenabled](/man/selinuxenabled)(8)

# RESOURCES

```[Source code](https://github.com/SELinuxProject/selinux)```

```[Documentation](https://man7.org/linux/man-pages/man8/semanage-boolean.8.html)```

<!-- verified: 2026-11-23 -->
