# TAGLINE

Build and run lightweight, portable virtual machines

# TLDR

**Run a command** in an ephemeral VM

```smolvm machine run [command]```

**Start an interactive shell** in an ephemeral VM

```smolvm machine run -it```

**Create** a persistent virtual machine

```smolvm machine create [name]```

**Create a VM** with networking enabled

```smolvm machine create [name] --net```

**Execute a command** in an existing VM

```smolvm machine exec [name] [command]```

**Start** a stopped VM

```smolvm machine start [name]```

**Stop** a running VM

```smolvm machine stop [name]```

**Pack** a VM into a portable executable

```smolvm pack create [name] -o [output]```

# SYNOPSIS

**smolvm** \<command\> [_options_]

# PARAMETERS

**machine run** [_command_]
> Execute a command in an ephemeral VM that is cleaned up after exit

**machine run -it**
> Start an interactive shell in an ephemeral VM

**machine create** _name_ [_--net_] [_--image image_] [_--cpus n_] [_--mem size_]
> Create a persistent virtual machine

**machine start** _name_
> Boot a stopped VM

**machine stop** _name_
> Halt a running VM

**machine exec** _name_ _command_
> Run a command in an existing VM

**pack create** _name_ [_-o path_] [_-s smolfile_]
> Bundle a workload into a portable, self-contained executable

**--net**
> Enable network access (disabled by default; TCP/UDP only, no ICMP)

**--image** _image_
> Specify the base Linux image

**--cpus** _n_
> Override vCPU count (default: 4)

**--mem** _size_
> Override RAM allocation (default: 8 GiB)

**--ssh-agent**
> Forward host SSH keys into the VM

**--allow-host** _domain_
> Restrict egress to specific domains

**-o** _path_
> Output path for packed binaries

**-s** _smolfile_
> Use a Smolfile configuration

# DESCRIPTION

**smolvm** is a CLI tool for building and running portable, lightweight, self-contained virtual machines with sub-second cold starts and elastic memory usage. Each workload gets real hardware isolation — its own kernel running on **Hypervisor.framework** (macOS) or **KVM** (Linux).

VMs can be packed into single **.smolmachine** files that rehydrate on any supported platform. All dependencies are pre-baked with no install step or runtime downloads required, booting in under 200ms. Memory is elastic via virtio balloon — the host only commits what the guest actually uses and reclaims the rest automatically.

Network access is opt-in and disabled by default, providing a strong security boundary for sandboxing untrusted code. Host filesystem, network, and credentials are separated by a hypervisor boundary.

# CAVEATS

Network is opt-in only with support for TCP/UDP; ICMP is not supported. Volume mounts support directories only, not individual files. On macOS, binaries must be signed with Hypervisor.framework entitlements. On Linux, KVM access is required. The tool is written in Rust and currently supports macOS (Apple Silicon and Intel) and Linux (x86_64 and aarch64).

# HISTORY

smolvm was created by **Smol Machines** and written in **Rust**. It was developed to provide developers with fast, isolated virtual machine environments that prioritize security by default, enabling safe execution of untrusted code and reproducible build environments without the overhead of traditional virtualization.

# SEE ALSO

[qemu](/man/qemu)(1), [docker](/man/docker)(1), [podman](/man/podman)(1), [firecracker](/man/firecracker)(1)
