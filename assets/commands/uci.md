# TAGLINE

OpenWrt unified configuration interface

# TLDR

Read a single option

```uci get [network.lan.ipaddr]```

Dump an entire **configuration file**

```uci show [network]```

Dump just **one section**

```uci show [network.lan]```

**Change** an option

```uci set [network.lan.ipaddr]=[192.168.2.1]```

**Add** an anonymous section

```uci add [firewall] [rule]```

**Rename** a section to something readable

```uci rename [network].[cfg01]=[lan]```

**Append** a value to a list option

```uci add_list [network.lan.dns]=[1.1.1.1]```

**Remove one value** from a list option

```uci del_list [network.lan.dns]=[1.1.1.1]```

**Delete** an option or a whole section

```uci delete [network.guest]```

Review the changes that are **staged but not yet written**

```uci changes```

**Write** the staged changes to disk

```uci commit [network]```

**Discard** the staged changes

```uci revert [network]```

**Export** a configuration in a form that can be imported again

```uci export [network]```

# SYNOPSIS

**uci** _COMMAND_ [_ARGUMENTS_...]

# COMMANDS

**get** _CONFIG.SECTION.OPTION_
> Fetch a value

**show** [_CONFIG_]
> List all options and values

**set** _CONFIG.SECTION.OPTION=VALUE_
> Set a configuration value

**add** _CONFIG_ _SECTION_
> Add a new anonymous section

**delete** _CONFIG.SECTION[.OPTION]_
> Delete section or option

**rename** _CONFIG.SECTION[.OPTION]=NAME_
> Rename a section or option

**add_list** _CONFIG.SECTION.OPTION=VALUE_
> Add a value to a list option

**del_list** _CONFIG.SECTION.OPTION=VALUE_
> Remove a value from a list option

**commit** [_CONFIG_]
> Write changes to configuration file

**revert** _CONFIG_
> Discard uncommitted changes

**changes** [_CONFIG_]
> Display pending uncommitted changes

**export** [_CONFIG_]
> Export configuration in machine-readable format

# DESCRIPTION

**uci** (Unified Configuration Interface) manages OpenWrt configuration files. It provides a standardized way to read and modify the UCI configuration format used throughout OpenWrt.

Configuration files are stored in **/etc/config/** and are organized into files, sections, and options. Changes are staged in a temporary location and must be committed to take effect. The revert command discards uncommitted changes.

# CAVEATS

OpenWrt specific. Changes require commit to apply. Some services need restart after configuration changes. Invalid configuration can break network access.

# HISTORY

**UCI** was developed for **OpenWrt** to provide a consistent configuration interface across all system services, simplifying administration of embedded routers and devices.

# INSTALL

```nix: nix profile install nixpkgs#uci```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ubus](/man/ubus)(1), [opkg](/man/opkg)(1)
