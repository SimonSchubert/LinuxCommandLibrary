# TAGLINE

print a libvirt domain's XML configuration

# TLDR

Dump the **current** domain XML

```virsh dumpxml [domain]```

Dump the **inactive** config (used on next start)

```virsh dumpxml --inactive [domain]```

Include **security-sensitive** fields

```virsh dumpxml --security-info [domain]```

Request XML suitable for **migration**

```virsh dumpxml --migratable [domain]```

Save XML to a **file** for **virsh create** / **define**

```virsh dumpxml [domain] > [domain.xml]```

# SYNOPSIS

**virsh** **dumpxml** [_--inactive_] [_--security-info_] [_--update-cpu_] [_--migratable_] [_--xpath_ _EXPR_] [_--wrap_] _domain_

# PARAMETERS

**--inactive**
> Dump the persistent configuration used at next start, not the live running config.

**--security-info**
> Include secrets and other security-sensitive XML.

**--update-cpu**
> Update domain CPU requirements from the host CPU.

**--migratable**
> Produce XML aimed at older libvirt / migration; may enable other flags as needed.

**--xpath** _EXPR_
> Print only matching nodes.

**--wrap**
> Wrap XPath matches in a common root element.

_domain_
> Name, ID, or UUID.

# DESCRIPTION

**virsh dumpxml** writes the guest domain definition as libvirt XML to stdout. That XML is the same format **virsh create** and **virsh define** consume. Use **--inactive** when you want the on-disk definition rather than runtime amendments (PCI addresses, live disks).

**virsh edit** is dumpxml --inactive --security-info, open in **$EDITOR**, then define.

This is a **virsh** subcommand, not a separate binary.

# CAVEATS

Needs a connection to libvirtd (often root for qemu:///system). Live XML can differ from the next-boot XML. **--security-info** may print passwords or TPM data; do not share those dumps.

# HISTORY

Part of **libvirt**'s **virsh** (dumpxml exists since early libvirt).

# INSTALL

```apt: sudo apt install libvirt-clients```

```dnf: sudo dnf install libvirt-client```

```apk: sudo apk add libvirt-client```

```zypper: sudo zypper install libvirt-client```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-list](/man/virsh-list)(1), [virsh-undefine](/man/virsh-undefine)(1)

# RESOURCES

```[Documentation](https://libvirt.org/manpages/virsh.html#dumpxml)```

```[Homepage](https://libvirt.org/)```

<!-- verified: 2026-08-26 -->
