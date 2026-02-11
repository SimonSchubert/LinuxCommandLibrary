# TAGLINE

OpenWrt unified configuration interface

# TLDR

**Get** a value

```uci get [network.lan.ipaddr]```

**Show** all options

```uci show [network]```

**Set** a value

```uci set [config].[section].[option]=[value]```

**Add** new section

```uci add [config] [section]```

**Delete** section or option

```uci delete [config].[section].[option]```

**Commit** changes

```uci commit [config]```

**Revert** uncommitted changes

```uci revert [config]```

# SYNOPSIS

**uci** _COMMAND_ [_ARGUMENTS_...]

# COMMANDS

**get** _CONFIG.SECTION.OPTION_
> Fetch a value

**show** _CONFIG_
> List all options and values

**set** _CONFIG.SECTION.OPTION=VALUE_
> Set a configuration value

**add** _CONFIG_ _SECTION_
> Add a new section

**delete** _CONFIG.SECTION[.OPTION]_
> Delete section or option

**commit** _CONFIG_
> Write changes to configuration file

**revert** _CONFIG_
> Discard uncommitted changes

# DESCRIPTION

**uci** (Unified Configuration Interface) manages OpenWrt configuration files. It provides a standardized way to read and modify the UCI configuration format used throughout OpenWrt.

Configuration is organized into files, sections, and options. Changes are staged and must be committed to take effect. The revert command discards uncommitted changes.

# CAVEATS

OpenWrt specific. Changes require commit to apply. Some services need restart after configuration changes. Invalid configuration can break network access.

# HISTORY

**UCI** was developed for **OpenWrt** to provide a consistent configuration interface across all system services, simplifying administration of embedded routers and devices.

# SEE ALSO

[ubus](/man/ubus)(1), [opkg](/man/opkg)(1)
