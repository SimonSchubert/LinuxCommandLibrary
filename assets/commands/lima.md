# TLDR

**Create default VM**

```limactl create```

**Start VM**

```limactl start [default]```

**Stop VM**

```limactl stop [default]```

**Shell into VM**

```limactl shell [default]```

**List VMs**

```limactl list```

**Delete VM**

```limactl delete [default]```

# SYNOPSIS

**limactl** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**create** [_INSTANCE_]
> Create a new VM instance.

**start** _INSTANCE_
> Start VM instance.

**stop** _INSTANCE_
> Stop VM instance.

**shell** _INSTANCE_
> Open shell in instance.

**list**
> List all instances.

**delete** _INSTANCE_
> Delete instance.

**--help**
> Display help information.

# DESCRIPTION

**lima** (Linux Machines) runs Linux VMs on macOS. It provides automatic file sharing and port forwarding.

The tool uses QEMU for virtualization. It's commonly used for running containerd and Docker on macOS.

lima runs Linux VMs on macOS.

# CAVEATS

macOS focused. Requires QEMU. Uses significant resources for VMs.

# HISTORY

Lima was created by **Akihiro Suda** to provide lightweight Linux virtual machines on macOS with seamless integration.

# SEE ALSO

[docker](/man/docker)(1), [nerdctl](/man/nerdctl)(1), [colima](/man/colima)(1)

