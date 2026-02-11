# TAGLINE

Wait for a Proxmox VM to stop

# TLDR

**Wait** until the virtual machine is stopped

```qm wait 100```

Wait with **timeout** of 10 seconds

```qm wait --timeout 10 100```

**Shutdown** then wait for VM to stop

```qm shutdown 100 && qm wait --timeout 10 100```

# SYNOPSIS

**qm wait** [_options_] _vmid_

# PARAMETERS

**--timeout** _seconds_
> Maximum time to wait before returning

# DESCRIPTION

**qm wait** blocks until a virtual machine reaches stopped state. This is useful in scripts to ensure a VM has fully stopped before performing subsequent operations.

Combined with shutdown, it provides a way to gracefully stop VMs and wait for completion.

# CAVEATS

Without timeout, the command may block indefinitely if the VM doesn't stop. Always use timeout in scripts for predictable behavior.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-shutdown](/man/qm-shutdown)(1), [qm-stop](/man/qm-stop)(1)
