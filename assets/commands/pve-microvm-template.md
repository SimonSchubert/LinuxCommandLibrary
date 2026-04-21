# TAGLINE

Creates Proxmox VE microVM templates from OCI images

# TLDR

**Create the default microVM template** from _debian:trixie-slim_ (VMID 9000)

```pve-microvm-template```

**Clone the template** into a new microVM

```qm clone [9000] [901] --name [my-sandbox] --full```

**Start the cloned microVM** and open a serial console

```qm start [901] && qm terminal [901]```

**Remove the template** when no longer needed

```qm destroy [9000]```

# SYNOPSIS

**pve-microvm-template**

# DESCRIPTION

**pve-microvm-template** is a helper script shipped by the **pve-microvm** Debian package, an experimental add-on that brings QEMU's **microvm** machine type to **Proxmox VE**. Running it once pulls a minimal OCI base image (_debian:trixie-slim_ by default, about 28 MB), converts it to a bootable disk with **pve-oci-import**, registers it as Proxmox VM 9000, configures the microvm machine type and serial console, and finally converts the VM into a template.

Once the template exists, new microVMs can be created instantly with the standard **qm clone** workflow. Because microVMs boot in well under a second and use a stripped kernel with no firmware or PCI emulation, the resulting sandboxes behave more like containers than full VMs while keeping KVM-level isolation.

The command is intentionally zero-argument: it is meant as a one-shot bootstrapper so that **qm clone** and **qm start** can be used for everything afterwards.

# CAVEATS

The entire **pve-microvm** project is marked **highly experimental**: microvm is a QEMU machine type that Proxmox does not officially support, the package patches **qemu-server** to add support, and live migration, HA, and some backup edge cases are untested. Only use it on non-production hosts. The generated template boots a custom **vmlinuz-microvm** kernel with a minimal init — many tools (systemd, SSH, etc.) are not present until installed inside the guest. Tested on **Proxmox VE 9.1** with **QEMU 10.1**.

# HISTORY

Authored by **Rui Carmo** (rcarmo) and first released on GitHub in **2025** as part of the **pve-microvm** package. It complements sibling tools shipped in the same package: **pve-oci-import**, **pve-microvm-run**, **pve-microvm-share**, **pve-microvm-ssh-agent**, and **pve-microvm-bench**.

# SEE ALSO

[qm](/man/qm)(1), [pve-oci-import](/man/pve-oci-import)(1), [pvesh](/man/pvesh)(1), [qemu-system-x86_64](/man/qemu-system-x86_64)(1)
