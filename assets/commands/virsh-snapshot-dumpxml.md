# TAGLINE

print the XML for a libvirt domain snapshot

# TLDR

Dump XML for a named **snapshot**

```virsh snapshot-dumpxml [domain] [snapshot]```

Include **security-sensitive** fields

```virsh snapshot-dumpxml --security-info [domain] [snapshot]```

Dump XML for use with **snapshot-create --redefine**

```virsh snapshot-dumpxml [domain] [snapshot] > [snap.xml]```

# SYNOPSIS

**virsh** **snapshot-dumpxml** [_--security-info_] [_--xpath_ _EXPR_] [_--wrap_] _domain_ _snapshot_

# PARAMETERS

**--security-info**
> Include security-sensitive information in the XML.

**--xpath** _EXPR_
> Print only matching nodes.

**--wrap**
> Wrap XPath matches in a common root element.

_domain_
> Name, ID, or UUID.

_snapshot_
> Snapshot name as shown by **virsh snapshot-list**.

# DESCRIPTION

**virsh snapshot-dumpxml** writes the snapshot record as libvirt snapshot XML. That document is what **snapshot-create --redefine** accepts when you copy snapshot metadata between hosts or recreate it for a domain with the same name and UUID.

**virsh snapshot-current** is the shortcut for the current snapshot's XML.

This is a **virsh** subcommand, not a separate binary.

# CAVEATS

Needs libvirtd access. XML may embed host-specific domain config; redefining on another machine can require edits. **--security-info** can expose secrets.

# HISTORY

Part of **libvirt** snapshot support in **virsh**.

# INSTALL

```apt: sudo apt install libvirt-clients```

```dnf: sudo dnf install libvirt-client```

```apk: sudo apk add libvirt-client```

```zypper: sudo zypper install libvirt-client```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-snapshot-list](/man/virsh-snapshot-list)(1), [virsh-snapshot-delete](/man/virsh-snapshot-delete)(1), [virsh-dumpxml](/man/virsh-dumpxml)(1)

# RESOURCES

```[Documentation](https://libvirt.org/manpages/virsh.html#snapshot-dumpxml)```

```[Homepage](https://libvirt.org/)```

<!-- verified: 2026-08-26 -->
