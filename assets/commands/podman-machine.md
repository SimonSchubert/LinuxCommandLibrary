# TAGLINE

Manage virtual machines for Podman

# TLDR

**Initialize a new machine with custom resources**

```podman machine init --cpus [4] --memory [4096] --disk-size [50]```

**Initialize and start immediately**

```podman machine init --now```

**Start machine**

```podman machine start```

**List machines**

```podman machine list```

**SSH into machine**

```podman machine ssh```

**Inspect machine details as JSON**

```podman machine inspect```

**Modify resources on a stopped machine**

```podman machine set --cpus [8] --memory [8192]```

**Remove machine**

```podman machine rm```

# SYNOPSIS

**podman** **machine** _command_ [_options_]

# PARAMETERS

**init**
> Initialize a new virtual machine.

**start**
> Start a virtual machine.

**stop**
> Stop a virtual machine.

**list**
> List virtual machines.

**ssh**
> SSH into a virtual machine.

**inspect**
> Display machine configuration as JSON.

**set**
> Modify settings on a stopped machine (CPUs, memory, disk, rootful).

**rm**
> Remove a virtual machine.

**info**
> Display machine host info (architecture, OS, VM provider).

**reset**
> Remove all machines, configurations, and cached images.

**os** apply|upgrade
> Manage the VM operating system image.

**--cpus** _n_
> Number of CPUs (init, set).

**--memory** _mb_
> Memory in MiB (init, set).

**--disk-size** _gb_
> Disk size in GiB (init, set — expand only).

**--rootful**
> Prefer rootful container execution (init, set).

**--now**
> Start machine immediately after init.

**--volume** _src:dst_
> Mount a host directory into the VM (init).

# DESCRIPTION

**podman machine** manages Linux virtual machines for running Podman on macOS and Windows. Since containers require a Linux kernel, this command creates and manages a VM that runs the Podman service.

The VM provider is selected automatically based on the platform: Apple Hypervisor on macOS, WSL or Hyper-V on Windows, and QEMU on Linux. Use `--provider` at init time to override. The `set` subcommand allows modifying CPU, memory, and disk on stopped machines.

# CAVEATS

All machine commands are rootless only. The `set` subcommand requires the machine to be stopped. Disk size can only be expanded, not shrunk. Some `set` options (--cpus, --memory, --disk-size) are QEMU-only.

# SEE ALSO

[podman](/man/podman)(1), [docker-machine](/man/docker-machine)(1)

