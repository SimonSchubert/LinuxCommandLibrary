# TLDR

**Apply** network configuration permanently

```sudo netplan apply```

**Generate** backend configuration files

```sudo netplan generate```

Configure interface to use **DHCP**

```sudo netplan set ethernets.[interface].dhcp4=true```

**Try** configuration changes with timeout

```sudo netplan try --timeout [120]```

Apply with **debug** output

```sudo netplan --debug apply```

Display **current status**

```netplan status```

**Get** current configuration value

```netplan get [ethernets]```

# SYNOPSIS

**netplan** [**--debug**] _command_ [_options_]

# COMMANDS

**apply**
> Apply network configuration and make persistent

**generate**
> Generate backend-specific configuration files

**try**
> Try configuration changes with automatic rollback

**get**
> Get current configuration values

**set**
> Set configuration values

**status**
> Display current network status

**info**
> Show available features

# PARAMETERS

**--debug**
> Enable debug output

**--root-dir _path_**
> Use alternate root directory

**--timeout _seconds_**
> Timeout for try command before rollback

# CONFIGURATION

Configuration files are stored in **/etc/netplan/*.yaml**

Example YAML:
```
network:
  version: 2
  ethernets:
    eth0:
      dhcp4: true
```

# DESCRIPTION

**netplan** is a network configuration utility for Ubuntu and other Linux distributions. It uses YAML files to describe network interfaces and generates configuration for backend renderers like NetworkManager or systemd-networkd.

The abstraction layer allows the same configuration to work with different network management backends, simplifying network setup across environments.

# CAVEATS

YAML syntax errors prevent configuration from applying. The try command requires a timeout or manual confirmation. Backend must be installed (NetworkManager or systemd-networkd). Changes to configuration files require apply to take effect.

# HISTORY

**netplan** was developed by **Canonical** for Ubuntu, first appearing in Ubuntu 17.10. It was designed to provide a unified network configuration system that works across different network backends while being human-readable.

# SEE ALSO

[networkctl](/man/networkctl)(1), [nmcli](/man/nmcli)(1), [ip](/man/ip)(8)
