# TAGLINE

creates a new LXC container in Proxmox VE from a template image

# TLDR

**Create** container with disk size

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4```

Create with **memory** limit

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --memory 8192```

Create with **hostname** and password

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --hostname name --password pass```

Create with **network**

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --net0 name=eth0,bridge=vmbr0,ip=dhcp```

Create **unprivileged** container with CPU and swap limits

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --unprivileged 1 --cores 2 --swap 512```

Enable **nesting** for containers that run containers

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --features nesting=1```

Create and **start** immediately

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --start 1```

# SYNOPSIS

**pct create** _vmid_ _ostemplate_ [_OPTIONS_]

# DESCRIPTION

**pct create** creates a new LXC container in Proxmox VE from a template image, or restores one from a backup file with **--restore 1**. It configures storage, networking, resources, and other container properties during creation.

# PARAMETERS

**vmid**
> The unique numeric ID for the new container (100 to 999999999)

**ostemplate**
> The OS template or backup file (e.g., local:vztmpl/distro.tar.zst)

**--rootfs** _storage:size_
> Root volume, using _storage:size_ in GiB to allocate a new one. If omitted, a 4 GiB volume is allocated on **--storage**.

**--memory** _megabytes_
> Amount of RAM in MB (default: 512)

**--hostname** _name_
> Container hostname

**--password** _password_
> Root password for the container

**--net**_N_ _config_
> Network interface configuration

**--cores** _number_
> Number of CPU cores assigned to the container (default: all available cores)

**--swap** _megabytes_
> Swap memory limit in MB (default: 512)

**--unprivileged** _0|1_
> Run the container as an unprivileged user. Defaults to 1 on creation; on restore, the value from the backup is used.

**--ssh-public-keys** _filepath_
> SSH public keys for root user authentication

**--features** _list_
> Enable features as key=value pairs: nesting, keyctl, fuse, mknod, mount, force_rw_sys

**--start** _0|1_
> Start container after creation (default: 0).

**--onboot** _0|1_
> Start container during system bootup (default: 0).

**--storage** _storage_
> Default storage for the container (default: local).

**--nameserver** _ip_
> DNS server IP address for the container.

**--ostype** _type_
> OS type: alpine, archlinux, centos, debian, devuan, fedora, gentoo, nixos, opensuse, ubuntu or unmanaged.

**--arch** _arch_
> OS architecture: amd64 (default), arm64, armhf, i386, riscv32 or riscv64.

**--mp**_N_ _config_
> Additional mount point, for example volume,mp=/path.

**--searchdomain** _domain_
> DNS search domains for the container.

**--timezone** _zone_
> Time zone to use, or **host** to match the host.

**--tags** _tags_
> Tags of the container (meta information only).

**--pool** _pool_
> Add the container to the specified pool.

**--restore** _0|1_
> Mark this as a restore task.

**--force** _0|1_
> Allow overwriting an existing container.

# CAVEATS

Templates must be downloaded with **pveam** or uploaded to Proxmox storage first. The container ID must be unique across the cluster. Enable nesting for containers that run Docker or other containers inside.

# HISTORY

**pct create** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-clone](/man/pct-clone)(1), [pct-enter](/man/pct-enter)(1), [pct-destroy](/man/pct-destroy)(1), [pveam](/man/pveam)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

<!-- verified: 2026-11-09 -->
