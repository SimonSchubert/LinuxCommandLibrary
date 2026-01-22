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

**krunvm** manages lightweight microVMs. It creates VMs from OCI container images using libkrun.

The tool provides container-like UX with VM isolation. It supports rapid startup and minimal overhead.

krunvm manages microVMs.

# CAVEATS

Linux with KVM required. Container images as base. Lightweight isolation.

# HISTORY

krunvm was created by **Red Hat** as a simple tool for managing microVMs using libkrun virtualization.

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [firecracker](/man/firecracker)(1)
