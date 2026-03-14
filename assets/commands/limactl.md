# TAGLINE

manages Lima Linux virtual machines

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

**edit** _name_
> Edit an instance configuration.

**snapshot** _subcommand_
> Manage instance snapshots (apply, create, delete, list).

**disk** _subcommand_
> Manage additional disks (create, delete, list, resize).

**protect** _name_
> Protect an instance from accidental removal.

**unprotect** _name_
> Remove protection from an instance.

**factory-reset** _name_
> Factory reset an instance.

**--name** _name_
> Specify VM name.

# DESCRIPTION

**limactl** manages Lima (Linux Machines) virtual machines on macOS, Linux, and NetBSD. Creates Linux VMs with automatic file sharing and port forwarding. Supports containerd/nerdctl for container workloads.

# SEE ALSO

[nerdctl](/man/nerdctl)(1), [docker](/man/docker)(1)

