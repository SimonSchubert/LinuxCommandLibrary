# TAGLINE

Network PXE bootloader for BIOS systems

# TLDR

**Basic PXELINUX setup**

```cp pxelinux.0 [/tftproot/]```

**Create config directory**

```mkdir -p [/tftproot/pxelinux.cfg/]```

**Create default config**

```vi [/tftproot/pxelinux.cfg/default]```

# SYNOPSIS

PXELINUX bootloader configuration

# DESCRIPTION

**PXELINUX** is a SYSLINUX derivative for PXE network booting. It loads via TFTP and allows booting Linux kernels and other operating systems over the network.

# CONFIGURATION

```
# /tftproot/pxelinux.cfg/default
DEFAULT linux
TIMEOUT 50
PROMPT 1

LABEL linux
  KERNEL vmlinuz
  APPEND initrd=initrd.img root=/dev/nfs nfsroot=server:/path ip=dhcp

LABEL local
  LOCALBOOT 0
```

# EXAMPLES

```bash
# Setup TFTP root
mkdir -p /tftproot/pxelinux.cfg
cp /usr/lib/PXELINUX/pxelinux.0 /tftproot/
cp /usr/lib/syslinux/modules/bios/*.c32 /tftproot/

# DHCP config (dhcpd.conf)
next-server 192.168.1.1;
filename "pxelinux.0";
```

# CONFIG FILE SEARCH ORDER

```
/pxelinux.cfg/01-88-99-aa-bb-cc-dd  # MAC address
/pxelinux.cfg/C0A80001              # IP in hex
/pxelinux.cfg/default               # Fallback
```

# CAVEATS

Requires TFTP and DHCP servers. BIOS/legacy boot only (use SYSLINUX for UEFI). Part of SYSLINUX project.

# HISTORY

PXELINUX was developed by **H. Peter Anvin** as part of the SYSLINUX project for PXE network boot.

# SEE ALSO

[syslinux](/man/syslinux)(1), [tftpd](/man/tftpd)(8), [dhcpd](/man/dhcpd)(8)
