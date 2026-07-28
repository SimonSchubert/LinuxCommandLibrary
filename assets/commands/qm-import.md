# TAGLINE

Import a foreign VM image into Proxmox VE

# TLDR

**Import** a disk image into a new or existing VM storage layout

```qm import [100] [storage_name]:import/[file_name] --storage [destination_storage]```

# SYNOPSIS

**qm import** _vmid_ _source_ [_OPTIONS_]

# PARAMETERS

**vmid**
> Target virtual machine ID

**source**
> Source volume or path (often under a storage `import` content location)

**--storage** _storage_
> Destination storage for imported disks

# DESCRIPTION

**qm import** imports supported virtual machine images (from VMware, VirtualBox, and similar hypervisors) into Proxmox VE. Source images are typically placed on a storage that allows `import` content, then referenced as `storage:import/filename`.

The command creates or attaches disk images on the destination storage and prepares the VM for configuration under `qm`. Exact supported formats and workflow follow the Proxmox import docs for your VE version.

# CAVEATS

Imported guests often need driver or boot adjustments (VirtIO vs legacy hardware). Large images require enough free space on the target storage. Prefer stopping the source VM before exporting for a consistent image.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management (`qm`).

# INSTALL

```dnf: sudo dnf install qm```

<!-- packages: 2026-07-28 -->

# SEE ALSO

[qm](/man/qm)(1), [qm-importovf](/man/qm-importovf)(1), [qm-importdisk](/man/qm-importdisk)(1)

# RESOURCES

```[Homepage](https://www.proxmox.com)```

```[Documentation](https://pve.proxmox.com/pve-docs/qm.1.html)```

<!-- verified: 2026-07-28 -->
