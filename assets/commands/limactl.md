# TAGLINE

manages Lima virtual machines on macOS

# TLDR

**Create and start default VM**

```limactl start```

**Create VM from template**

```limactl start --name=[myvm] template://ubuntu```

**List VMs**

```limactl list```

**Stop a VM**

```limactl stop [name]```

**Delete a VM**

```limactl delete [name]```

**Open shell in VM**

```limactl shell [name]```

**Copy files to VM**

```limactl copy [local-file] [name]:[remote-path]```

# SYNOPSIS

**limactl** _command_ [_options_]

# PARAMETERS

**start** [_name_]
> Create and start a VM.

**stop** _name_
> Stop a running VM.

**delete** _name_
> Delete a VM.

**list**
> List all VMs.

**shell** _name_
> Open shell in VM.

**copy** _src_ _dest_
> Copy files to/from VM.

**--name** _name_
> Specify VM name.

# DESCRIPTION

**limactl** manages Lima (Linux Machines) virtual machines on macOS. Creates Linux VMs with automatic file sharing and port forwarding. Supports containerd/nerdctl for container workloads. Alternative to Docker Desktop for macOS.

# SEE ALSO

[nerdctl](/man/nerdctl)(1), [docker](/man/docker)(1)

