# TAGLINE

Run commands inside a Proxmox VM

# TLDR

**Execute** a command via guest agent

```qm guest exec 100 command arg1 arg2```

Execute **asynchronously**

```qm guest exec 100 command --synchronous 0```

Execute with **timeout** of 10 seconds

```qm guest exec 100 command --timeout 10```

Execute and **forward stdin** to guest

```qm guest exec 100 command --pass-stdin 1```

# SYNOPSIS

**qm guest exec** _vmid_ _command_ [_arguments_...] [_options_]

# PARAMETERS

**--synchronous** _0|1_
> Wait for the command to complete (default _1_). With _0_, **qm guest exec** returns a PID immediately; collect output later with **qm guest exec-status**.

**--timeout** _seconds_
> Maximum time to wait for synchronous completion (default _30_). Forces an asynchronous run when exceeded.

**--pass-stdin** _0|1_
> Forward the host's stdin to the guest command (default _0_).

# DESCRIPTION

**qm guest exec** executes commands inside a virtual machine through the QEMU guest agent. This allows host-level control over guest operations without network access to the VM.

The guest agent must be installed and running inside the VM for this to work.

# CAVEATS

Requires QEMU guest agent to be installed and running in the VM. Some commands may require specific permissions within the guest OS.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools. Guest agent communication provides out-of-band management capabilities.

# INSTALL

```dnf: sudo dnf install qm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[qm](/man/qm)(1), [qm-agent](/man/qm-agent)(1)
