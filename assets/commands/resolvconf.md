# TAGLINE

Manage DNS resolver configuration dynamically

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

**resolvconf** is a framework for dynamically managing the system's DNS resolver configuration in **/etc/resolv.conf**. Rather than allowing individual network tools to overwrite the file, resolvconf aggregates DNS information from multiple sources such as DHCP clients, VPN connections, and NetworkManager, then generates a unified resolv.conf based on priority ordering.

Each network interface registers its DNS servers and search domains through resolvconf using the **-a** flag, and removes them with **-d** when the connection terminates. The framework determines the final configuration by combining all registered inputs, with earlier-registered interfaces taking higher priority. Static entries can be added through head and tail configuration files that are prepended or appended to the generated output.

Several implementations exist, including openresolv and the Debian resolvconf package, each with slightly different features. On systemd-based systems, **systemd-resolved** may provide similar functionality and can coexist or conflict with resolvconf depending on configuration.

# CONFIGURATION

**/etc/resolv.conf**
> Generated output file containing the aggregated DNS resolver configuration. Managed by resolvconf and should not be edited manually.

**/etc/resolvconf/resolv.conf.d/head**
> Static content prepended to the generated resolv.conf.

**/etc/resolvconf/resolv.conf.d/tail**
> Static content appended to the generated resolv.conf.

**/etc/resolvconf/interface-order**
> Defines the priority ordering of network interfaces for DNS resolution.

# CAVEATS

May conflict with systemd-resolved. Distribution implementations vary. Some use openresolv, others resolvconf.

# HISTORY

**resolvconf** was created to handle dynamic DNS configuration from multiple network sources. Various implementations exist including openresolv and the Debian resolvconf package.

# SEE ALSO

[systemd-resolved](/man/systemd-resolved)(1), [dhclient](/man/dhclient)(1), [nmcli](/man/nmcli)(1)
