# TAGLINE

open-source network boot firmware

# TLDR

**Boot from iPXE command line**

```dhcp && chain [http://server/boot.ipxe]```

**Boot specific kernel**

```kernel [http://server/vmlinuz] initrd=initrd.img```

**Load initrd**

```initrd [http://server/initrd.img]```

**Boot loaded kernel**

```boot```

**Show network interfaces** and their status

```ifstat```

**Show IP configuration** (routing table)

```route```

**Boot from an iSCSI SAN** target

```sanboot iscsi:[192.168.0.1]::::iqn.2010-04.org.example:target```

Set a **static IP** manually

```set net0/ip [192.168.0.100] && set net0/netmask [255.255.255.0] && set net0/gateway [192.168.0.1]```

**Show** a configuration setting

```show net0/ip```

# SYNOPSIS

iPXE command-line or script commands

# COMMANDS

**dhcp**, **ifconf**
> Automatically configure network interfaces (via DHCP).

**ifopen**
> Open network interface.

**ifstat**
> Show interface status and statistics.

**route**
> Display the IP routing table.

**kernel** _url_ [_args_]
> Download and select an executable image, with optional command line.

**imgfetch** _url_
> Download an image without selecting it.

**initrd** _url_
> Load initial ramdisk.

**boot**
> Boot loaded kernel.

**chain** _url_
> Download and boot an executable image or script (alias **imgexec**).

**sanboot** _uri_
> Boot from a SAN device (iSCSI, AoE, FCoE, HTTP).

**set**, **show**, **clear** _setting_
> Manage configuration settings such as net0/ip or filename.

**autoboot**
> Boot system from network interface using standard PXE behavior.

**imgstat**
> Display loaded images.

**imgfree**
> Free loaded images.

**shell**
> Enter iPXE shell.

**exit**
> Exit iPXE.

# DESCRIPTION

**iPXE** is an open-source network boot firmware. It replaces or extends PXE (Preboot Execution Environment), supporting HTTP, iSCSI, FCoE, and many other protocols for network booting.

iPXE can be embedded in BIOS/UEFI, burned to ROM, or chainloaded from existing PXE. It enables flexible network-based system installation and diskless booting.

# BOOT SCRIPT EXAMPLE

```
#!ipxe
dhcp
kernel http://server/vmlinuz ip=dhcp
initrd http://server/initrd.img
boot
```

# CAVEATS

Requires network boot support. HTTPS needs certificates. UEFI and BIOS need different builds (e.g. undionly.kpxe vs ipxe.efi). UEFI Secure Boot requires a signed build. Some NICs may lack native driver support. Many features (HTTPS, NTP, extra commands) are compile-time options, so a given binary may not include every command.

# HISTORY

iPXE evolved from the **Etherboot** project (1995) via **gPXE**. It was forked from gPXE in **2010** by lead developer Michael Brown and remains actively maintained. It provides advanced network booting beyond standard PXE, supporting modern protocols and scripting capabilities.

# SEE ALSO

[pxelinux](/man/pxelinux)(1), [dnsmasq](/man/dnsmasq)(8), [tftp](/man/tftp)(1), [syslinux](/man/syslinux)(1)

# RESOURCES

```[Source code](https://github.com/ipxe/ipxe)```

```[Homepage](https://ipxe.org)```

```[Documentation](https://ipxe.org/cmd)```

<!-- verified: 2026-09-29 -->
