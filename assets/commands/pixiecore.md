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

**pixiecore** provides all-in-one network booting. It combines DHCP, TFTP, and HTTP for PXE.

Static boot mode serves fixed kernel and initrd. All clients get the same configuration.

API mode queries external service for boot config. This enables per-machine customization.

Quick mode provides presets for common distributions. Minimal configuration needed.

No external DHCP changes required. Pixiecore responds to PXE requests alongside existing DHCP.

# CAVEATS

Requires root for low ports. May conflict with existing DHCP. Network must allow broadcast.

# HISTORY

**Pixiecore** was created at **Google** for simple, API-driven network booting. It simplifies PXE setups by eliminating need for separate DHCP/TFTP configuration.

# SEE ALSO

[dnsmasq](/man/dnsmasq)(1), [pxelinux](/man/pxelinux)(1), [iPXE](/man/iPXE)(1)
