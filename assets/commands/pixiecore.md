# TAGLINE

All-in-one PXE network boot server

# TLDR

**Boot from kernel**

```pixiecore boot [vmlinuz] [initrd.img]```

**Boot with kernel args**

```pixiecore boot [vmlinuz] [initrd.img] --cmdline "[console=ttyS0]"```

**Serve via API**

```pixiecore api [http://localhost:8080]```

**Quick PXE boot**

```pixiecore quick [ubuntu] --cmdline "[auto=true]"```

**Listen on interface**

```pixiecore boot [vmlinuz] [initrd.img] --listen-addr [192.168.1.1]```

**Debug mode**

```pixiecore boot [vmlinuz] [initrd.img] --debug```

# SYNOPSIS

**pixiecore** _command_ [_options_] [_args_]

# PARAMETERS

**boot**
> Serve static boot config.

**api**
> Dynamic config via API.

**quick**
> Preset configurations.

**--cmdline** _ARGS_
> Kernel command line.

**--listen-addr** _IP_
> Listen address.

**--port** _N_
> HTTP port.

**--dhcp-no-bind**
> Don't bind DHCP ports.

**--debug**
> Debug output.

# DESCRIPTION

**pixiecore** is an all-in-one network boot server that combines DHCP/ProxyDHCP, TFTP, and HTTP services into a single binary for PXE booting machines on a local network. Unlike traditional PXE setups that require configuring separate DHCP, TFTP, and boot menu services, pixiecore handles the entire boot process internally and can operate alongside an existing DHCP server without any changes to the network's DHCP configuration.

The tool offers three operating modes. In static boot mode, a fixed kernel and initrd are served to all clients with the same configuration. API mode delegates boot configuration to an external HTTP service, enabling per-machine customization based on MAC address or other identifiers, which is particularly useful for large-scale provisioning. Quick mode provides ready-made presets for common Linux distributions, requiring minimal configuration to get machines booting over the network.

# CAVEATS

Requires root for low ports. May conflict with existing DHCP. Network must allow broadcast.

# HISTORY

**Pixiecore** was created at **Google** for simple, API-driven network booting. It simplifies PXE setups by eliminating need for separate DHCP/TFTP configuration.

# SEE ALSO

[dnsmasq](/man/dnsmasq)(1), [pxelinux](/man/pxelinux)(1), [iPXE](/man/iPXE)(1)
