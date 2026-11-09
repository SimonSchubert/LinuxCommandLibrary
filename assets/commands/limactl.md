# TAGLINE

manages Lima Linux virtual machines

# TLDR

**Create and start default VM**

```limactl start```

**Create VM from template**

```limactl start --name=[myvm] template:ubuntu```

**Create a VM with specific resources**

```limactl start --name=[myvm] --cpus=[4] --memory=[8] --disk=[50] template:docker```

**List VMs**

```limactl list```

**Stop a VM**

```limactl stop [name]```

**Delete a VM**

```limactl delete [name]```

**Open shell in VM**

```limactl shell [name]```

**Run a command in VM**

```limactl shell [name] [uname -a]```

**Copy files to VM**

```limactl copy [local-file] [name]:[remote-path]```

**Copy a directory from VM**

```limactl copy -r [name]:[remote-dir] [local-dir]```

# SYNOPSIS

**limactl** _command_ [_options_]

# PARAMETERS

**create** _NAME_|_FILE.yaml_|_URL_
> Create an instance without starting it.

**start** [_NAME_|_FILE.yaml_|_URL_]
> Create and start a VM.

**stop** [**-f**] _name_
> Stop a running VM, forcibly with **-f**.

**restart** _name_
> Restart a running VM.

**delete** [**-f**] _name_
> Delete a VM.

**list** [_name_...]
> List all VMs. Supports **--json**, **-f**/**--format**, and **-q**/**--quiet**.

**shell** _name_ [_command_]
> Open shell in VM or run a command. Supports **--workdir** and **--shell**.

**copy** [**-r**] _src_ ... _dest_
> Copy files to/from VM. Alias: **cp**.

**edit** _name_
> Edit an instance configuration.

**clone** _old_ _new_
> Clone an instance.

**rename** _old_ _new_
> Rename an instance.

**snapshot** _subcommand_
> Manage instance snapshots (apply, create, delete, list).

**disk** _subcommand_
> Manage additional disks (create, delete, import, list, resize, unlock).

**protect** _name_
> Protect an instance from accidental removal.

**unprotect** _name_
> Remove protection from an instance.

**factory-reset** _name_
> Factory reset an instance.

**template** _subcommand_
> Manage templates (experimental).

**info**
> Show diagnostic information.

**prune**
> Prune garbage objects.

**--name** _name_
> Specify VM name (create/start).

**--cpus** _N_, **--memory** _GiB_, **--disk** _GiB_
> Set VM resources (create/start).

**--mount** _DIR_[:w]
> Directories to mount, with **:w** for writable (create/start).

**--vm-type** _TYPE_
> Virtual machine type (create/start).

**--tty**=false, **-y**, **--yes**
> Disable interactive prompts for automation.

**--debug**
> Enable debug mode.

# DESCRIPTION

**limactl** manages Lima (Linux Machines) virtual machines on macOS, Linux, and NetBSD. Creates Linux VMs with automatic file sharing and port forwarding. Supports containerd/nerdctl for container workloads, as well as Docker, Podman, and Kubernetes through templates.

The companion **lima** command is a shortcut for running commands in the default instance.

# SEE ALSO

[lima](/man/lima)(1), [colima](/man/colima)(1), [nerdctl](/man/nerdctl)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/lima-vm/lima)```

```[Homepage](https://lima-vm.io/)```

```[Documentation](https://lima-vm.io/docs/)```

<!-- verified: 2026-11-09 -->
