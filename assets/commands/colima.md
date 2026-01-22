# TLDR

**Start with defaults**

```colima start```

**Start with custom resources**

```colima start --cpu [4] --memory [8] --disk [100]```

**Start with containerd runtime**

```colima start --runtime containerd```

**Start with Kubernetes**

```colima start --kubernetes```

**Stop Colima**

```colima stop```

**Delete instance**

```colima delete```

**List instances**

```colima list```

**SSH into VM**

```colima ssh```

# SYNOPSIS

**colima** _command_ [_options_]

# DESCRIPTION

**colima** provides container runtimes on macOS and Linux with minimal setup. Uses Lima to run Linux VMs. Supports Docker and containerd. Free alternative to Docker Desktop.

# COMMANDS

**start**
> Start Colima VM

**stop**
> Stop Colima VM

**delete**
> Delete Colima instance

**status**
> Show status

**list**
> List instances

**ssh**
> SSH into VM

**nerdctl**
> Run nerdctl (containerd)

**version**
> Show version

# START OPTIONS

**--cpu** _n_
> Number of CPUs

**--memory** _n_
> Memory in GB

**--disk** _n_
> Disk size in GB

**--runtime** _type_
> Runtime: docker, containerd

**--kubernetes**
> Enable Kubernetes

**--arch** _arch_
> Architecture: x86_64, aarch64

**--vm-type** _type_
> Virtualization: vz, qemu

**--profile** _name_
> Instance profile name

# DOCKER USAGE

After starting:
```
docker ps
docker run hello-world
```

# CAVEATS

Requires macOS 10.15+ or Linux. vz (Apple virtualization) faster on Apple Silicon. Completely free and open source.

# SEE ALSO

[docker](/man/docker)(1), [nerdctl](/man/nerdctl)(1), [lima](/man/lima)(1)
