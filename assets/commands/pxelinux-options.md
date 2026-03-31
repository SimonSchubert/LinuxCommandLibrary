# TAGLINE

Reference for PXELINUX-specific DHCP options

# TLDR

**View the pxelinux-options man page**

```man pxelinux-options```

# SYNOPSIS

This is a documentation reference, not an executable command.

# PARAMETERS

**DHCP Option 208** (pxelinux.magic)
> Magic number identifying PXELINUX-aware DHCP configuration. Must be set to F1:00:74:7E.

**DHCP Option 209** (pxelinux.configfile)
> Specifies the PXELINUX configuration file path relative to the TFTP server prefix.

**DHCP Option 210** (pxelinux.pathprefix)
> Path prefix prepended to all file references in the PXELINUX configuration file.

**DHCP Option 211** (pxelinux.reboottime)
> Reboot time in seconds, encoded as a 32-bit unsigned integer. Controls how long PXELINUX waits before rebooting on failure.

# DESCRIPTION

**pxelinux-options** is a man page documenting the DHCP options specific to **PXELINUX**, the network (PXE) booting variant of the SYSLINUX bootloader. These options are passed via DHCP to PXELINUX clients to configure their boot behavior.

The options use DHCP option numbers 208-211 (site-specific option space) and allow the DHCP server to specify the configuration file, path prefix, and reboot timeout for PXE booting clients. These options must be configured on the DHCP server (e.g., ISC dhcpd or dnsmasq) to be passed to booting clients.

# CAVEATS

This is a documentation reference, not an executable. The DHCP options 208-211 are in the site-local option space and may conflict with other uses of these option numbers. Option 208 (pxelinux.magic) must be set correctly for PXELINUX to recognize the other options.

# HISTORY

pxelinux-options is part of the **SYSLINUX** project, created by **H. Peter Anvin**. PXELINUX enables Linux systems to boot over the network using the PXE (Preboot Execution Environment) standard.

# SEE ALSO

[syslinux](/man/syslinux)(1), [pxelinux](/man/pxelinux)(1), [tftp](/man/tftp)(1), [dhcpd](/man/dhcpd)(1), [dnsmasq](/man/dnsmasq)(1)

