# TLDR

**Boot from iPXE command line**

```dhcp && chain http://server/boot.ipxe```

**Boot specific kernel**

```kernel http://server/vmlinuz initrd=initrd.img```

**Load initrd**

```initrd http://server/initrd.img```

**Boot loaded kernel**

```boot```

**Show network configuration**

```ifstat```

# SYNOPSIS

iPXE command-line or script commands

# COMMANDS

**dhcp**
> Obtain IP via DHCP.

**ifopen**
> Open network interface.

**ifstat**
> Show interface statistics.

**kernel** _url_
> Load kernel image.

**initrd** _url_
> Load initial ramdisk.

**boot**
> Boot loaded kernel.

**chain** _url_
> Load and execute script.

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

Requires network boot support. HTTPS needs certificates. UEFI and BIOS need different builds. Some NICs may lack driver support.

# HISTORY

iPXE evolved from Etherboot and gPXE projects. It provides advanced network booting beyond standard PXE, supporting modern protocols and scripting capabilities.

# SEE ALSO

[pxelinux](/man/pxelinux)(1), [dnsmasq](/man/dnsmasq)(8), [tftp](/man/tftp)(1)
