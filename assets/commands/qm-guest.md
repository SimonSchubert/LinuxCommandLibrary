# TLDR

**Check** command execution status

```qm guest exec-status vm_id pid```

**Set** user password interactively

```qm guest passwd vm_id username```

Set **hashed** password

```qm guest passwd vm_id username --crypted 1```

Execute **guest agent** command

```qm guest cmd vm_id fsfreeze-freeze```

**Execute** command in guest

```qm guest exec vm_id command arg1 arg2```

Execute **asynchronously**

```qm guest exec vm_id command --synchronous 0```

Execute with **timeout**

```qm guest exec vm_id command --timeout 10```

Execute with **stdin** forwarding

```qm guest exec vm_id command --pass-stdin 1```

# SYNOPSIS

**qm guest** _cmd_ _vmid_ [_OPTIONS_]

# DESCRIPTION

**qm guest** interacts with the QEMU Guest Agent running inside a virtual machine. It allows executing commands, managing user accounts, and running guest agent operations like filesystem freeze/thaw for consistent backups.

# PARAMETERS

**cmd**
> Subcommand: cmd, exec, exec-status, passwd

**vmid**
> The numeric ID of the virtual machine

**--timeout** _seconds_
> Timeout for command execution

**--synchronous** _boolean_
> Run command synchronously (default) or asynchronously

**--pass-stdin** _boolean_
> Forward stdin to the guest agent

**--crypted** _boolean_
> Password is already hashed

# CAVEATS

Requires the QEMU Guest Agent to be installed and running inside the VM. The guest agent must be enabled in the VM configuration. Network-independent communication occurs through a virtio serial device.

# HISTORY

**qm guest** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machines through the guest agent.

# SEE ALSO

[qm](/man/qm)(1), [qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1)
