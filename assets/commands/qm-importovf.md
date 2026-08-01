# TAGLINE

Import a VM from an OVF manifest into Proxmox VE

# TLDR

Create a VM from an **OVF** package into the given storage

```qm importovf [vmid] [path/to/manifest.ovf] [storage]```

# SYNOPSIS

**qm importovf** _vmid_ _manifest_ _storage_ [_OPTIONS_]

# PARAMETERS

**vmid**
> Numeric ID for the new virtual machine

**manifest**
> Path to the `.ovf` Open Virtualization Format manifest

**storage**
> Destination Proxmox storage for disks

# DESCRIPTION

**qm importovf** imports a virtual machine described by an Open Virtualization Format (OVF) package into Proxmox VE. OVF packages usually include a `.ovf` descriptor plus one or more disk images (often `.vmdk`). The command creates a new VM with the given ID and places disks on the specified storage.

OVF is commonly used when migrating from VMware and other platforms that export OVA/OVF appliances. After import, review network, CPU, and disk bus settings under `qm config` / the web UI.

# CAVEATS

All referenced disk files must sit next to the manifest (or at the paths the OVF declares). Some guest hardware options do not map 1:1 to QEMU and need manual tuning. Ensure the target `vmid` is unused.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management (`qm`).

# INSTALL

```dnf: sudo dnf install qm```

<!-- packages: 2026-07-28 -->

# SEE ALSO

[qm](/man/qm)(1), [qm-import](/man/qm-import)(1), [qm-importdisk](/man/qm-importdisk)(1)

# RESOURCES

```[Homepage](https://www.proxmox.com)```

```[Documentation](https://pve.proxmox.com/pve-docs/qm.1.html)```

<!-- verified: 2026-07-28 -->
