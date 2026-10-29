# TAGLINE

Bring up loopback inside an OpenShell microVM

# TLDR

Bring the guest **loopback** interface up (what guest init runs)

```openshell-vm-init prepare-network```

Print the **version**

```openshell-vm-init --version```

# SYNOPSIS

**openshell-vm-init** **prepare-network**

**openshell-vm-init** **--version**

# DESCRIPTION

**openshell-vm-init** is a one-shot Linux helper that NVIDIA OpenShell places in each microVM guest. **openshell-driver-vm** embeds the binary and writes it to **/opt/openshell/bin/openshell-vm-init** in the bootstrap root and in prepared image roots. Guest init runs as root and calls **prepare-network** after it reconciles the sandbox account, fixes **/sandbox** ownership, and sets the hostname and hosts file. It then hands the workload to **openshell-sandbox**.

**prepare-network** opens an IPv4 datagram socket and sets the up flag on the loopback interface **lo**. If the interface is already up, that flag stays set. The command reads the flags again and fails when loopback is still down. It does not assign an address. Guest init writes the resolver file and allows unprivileged binds of port 53 only after this command succeeds. A failure aborts the boot.

**--version** prints **openshell-vm-init** and the crate version. It does not touch the network.

The command takes no further arguments. Anything else is an error.

# COMMANDS

**prepare-network**

> Bring **lo** up. Linux only. Must run as the guest root user (effective UID 0). No arguments.

# PARAMETERS

**--version**

> Print the program name and crate version, then exit.

# CAVEATS

This binary is for the guest, not the host operator shell. The usual caller is the guest init script **/srv/openshell-vm-sandbox-init.sh**. On the host, the bytes live inside **openshell-driver-vm** until that driver injects them into a root disk.

**prepare-network** is rejected when the effective UID is not 0, and on platforms other than Linux. An unknown command, a missing command, or any extra argument fails. Errors go to stderr as **openshell-vm-init:** followed by the reason, and the process exits non-zero.

The helper only sets the interface up. Address configuration, DNS, and the unprivileged-port sysctl stay in the guest init script.

# HISTORY

**openshell-vm-init** ships in NVIDIA **OpenShell** (Apache License 2.0), in the **openshell-driver-vm** crate. OpenShell was first published in **March 2026**. The **0.1.x** line is the stable release cadence. The VM driver is marked experimental in its crate README.

# SEE ALSO

[openshell-driver-vm](/man/openshell-driver-vm)(1), [openshell-sandbox](/man/openshell-sandbox)(1), [openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-supervisor](/man/openshell-supervisor)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://github.com/NVIDIA/OpenShell/blob/main/crates/openshell-driver-vm/README.md)```

<!-- verified: 2026-10-29 -->
