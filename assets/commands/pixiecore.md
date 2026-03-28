# TAGLINE

All-in-one PXE network boot server

# TLDR

**Boot from kernel and initrd**

```sudo pixiecore boot [vmlinuz] [initrd.img]```

**Boot with kernel command-line args**

```sudo pixiecore boot [vmlinuz] [initrd.img] --cmdline "[console=ttyS0]"```

**Boot alongside an existing DHCP server**

```sudo pixiecore boot [vmlinuz] [initrd.img] --dhcp-no-bind```

**Serve boot config via external API endpoint**

```sudo pixiecore api [http://localhost:8080]```

**Listen on a specific address**

```sudo pixiecore boot [vmlinuz] [initrd.img] --listen-addr [192.168.1.1]```

**Enable debug output**

```sudo pixiecore boot [vmlinuz] [initrd.img] --debug```

# SYNOPSIS

**pixiecore** _command_ [_options_] [_args_]

# PARAMETERS

**boot** _KERNEL_ _INITRD_...
> Serve a static boot configuration to all clients.

**api** _URL_
> Delegate boot configuration to an external HTTP API (per-machine config via MAC address).

**--cmdline** _ARGS_
> Kernel command-line arguments passed to booting machines.

**--listen-addr** _IP_
> Address to listen on (default: all interfaces).

**--port** _N_
> HTTP port for serving boot files (default: 80).

**--dhcp-no-bind**
> Do not bind DHCP ports; operate as ProxyDHCP alongside an existing DHCP server.

**--log-timestamps**
> Add timestamps to log output.

**--debug**
> Enable verbose debug output.

# DESCRIPTION

**pixiecore** is an all-in-one network boot server that combines DHCP/ProxyDHCP, TFTP, and HTTP services into a single binary for PXE booting machines on a local network. Unlike traditional PXE setups that require configuring separate DHCP, TFTP, and boot menu services, pixiecore handles the entire boot process internally and can operate alongside an existing DHCP server without any changes to the network's DHCP configuration.

The tool offers three operating modes. In static boot mode, a fixed kernel and initrd are served to all clients with the same configuration. API mode delegates boot configuration to an external HTTP service, enabling per-machine customization based on MAC address or other identifiers, which is particularly useful for large-scale provisioning. Quick mode provides ready-made presets for common Linux distributions, requiring minimal configuration to get machines booting over the network.

# CAVEATS

Requires root or equivalent privileges to bind DHCP/TFTP ports. May conflict with existing DHCP servers unless **--dhcp-no-bind** is used. Network must allow broadcast traffic. Only supports BIOS PXE and iPXE; UEFI support is limited.

# HISTORY

**Pixiecore** was created at **Google** for simple, API-driven network booting. It simplifies PXE setups by eliminating need for separate DHCP/TFTP configuration.

# SEE ALSO

[dnsmasq](/man/dnsmasq)(1), [ipxe](/man/ipxe)(1), [pxelinux](/man/pxelinux)(1), [tftp](/man/tftp)(1)
