# TLDR

**Update DNS configuration**

```resolvconf -u```

**Add interface configuration**

```echo "nameserver 8.8.8.8" | resolvconf -a [eth0]```

**Delete interface configuration**

```resolvconf -d [eth0]```

**List interfaces**

```resolvconf -l```

**Show current resolv.conf**

```cat /etc/resolv.conf```

# SYNOPSIS

**resolvconf** [_-a interface_] [_-d interface_] [_-u_] [_options_]

# PARAMETERS

**-a** _INTERFACE_
> Add/update interface config.

**-d** _INTERFACE_
> Delete interface config.

**-u**
> Update resolv.conf.

**-l**
> List interfaces.

**-i** _PATTERN_
> Include interfaces.

**-x** _PATTERN_
> Exclude interfaces.

**-p**
> Show head file.

# DESCRIPTION

**resolvconf** manages /etc/resolv.conf dynamically. It aggregates DNS configurations from multiple sources.

Interfaces register their DNS servers. DHCP, VPN, and NetworkManager contribute.

Priority ordering determines final configuration. Earlier interfaces have higher priority.

The generated resolv.conf combines all inputs. Head and tail files add static content.

Deletion removes interface contribution. Useful when connection terminates.

# CAVEATS

May conflict with systemd-resolved. Distribution implementations vary. Some use openresolv, others resolvconf.

# HISTORY

**resolvconf** was created to handle dynamic DNS configuration from multiple network sources. Various implementations exist including openresolv and the Debian resolvconf package.

# SEE ALSO

[systemd-resolved](/man/systemd-resolved)(1), [dhclient](/man/dhclient)(1), [nmcli](/man/nmcli)(1)
