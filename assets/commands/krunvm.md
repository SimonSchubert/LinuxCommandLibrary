# TAGLINE

manages lightweight microVMs

# TLDR

**Create microVM**

```krunvm create [image] --name [myvm]```

**Start microVM**

```krunvm start [myvm]```

**List microVMs**

```krunvm list```

**Delete microVM**

```krunvm delete [myvm]```

**Create with port mapping**

```krunvm create [image] --name [vm] -p [8080:80]```

**Set CPU and memory**

```krunvm create [image] --cpus [2] --mem [1024]```

# SYNOPSIS

**krunvm** _command_ [_options_]

# PARAMETERS

**create** _IMAGE_
> Create microVM from image.

**start** _NAME_
> Start microVM.

**delete** _NAME_
> Delete microVM.

**list**
> List microVMs.

**--name** _NAME_
> VM name.

**--cpus** _N_
> Number of CPUs.

**--mem** _MB_
> Memory in MB.

**-p** _MAPPING_
> Port mapping.

# DESCRIPTION

**krunvm** is a tool for creating and managing lightweight microVMs built from OCI container images. It uses libkrun, a library that leverages KVM virtualization to run each workload in its own minimal virtual machine, providing stronger isolation than containers while maintaining a container-like user experience with fast startup times and low memory overhead.

MicroVMs are created from standard container images pulled from registries, so existing container workflows and images can be reused directly. Each VM can be configured with a specific number of CPUs, memory allocation, and port mappings, similar to container runtime options. The result is a workflow that feels like managing containers but with the security boundaries of hardware virtualization, making krunvm well suited for multi-tenant environments or workloads that require stronger isolation guarantees.

# CAVEATS

Linux with KVM required. Container images as base. Lightweight isolation.

# HISTORY

krunvm was created by **Red Hat** as a simple tool for managing microVMs using libkrun virtualization.

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [firecracker](/man/firecracker)(1)
