# TAGLINE

CLI for managing CubeSandbox templates and sandboxes

# TLDR

**Create a sandbox template** from a container image

```cubemastercli tpl create-from-image --image [registry/image:tag]```

**Expose ports** and set a probe port when creating a template

```cubemastercli tpl create-from-image --image [image] --expose-port [49999] --probe [49999]```

**Configure a writable layer size** for the template

```cubemastercli tpl create-from-image --image [image] --writable-layer-size [1G]```

**Watch the build progress** of a template job

```cubemastercli tpl watch --job-id [job_id]```

**Show help** for a subcommand

```cubemastercli tpl --help```

# SYNOPSIS

**cubemastercli** _subcommand_ _action_ [_options_]

# DESCRIPTION

**cubemastercli** is the command-line interface for **CubeSandbox**, a high-performance, secure sandbox service built on **RustVMM** and **KVM**. It is used by operators to create, build, and monitor sandbox templates that back isolated execution environments for AI agents.

Templates are produced from OCI container images and encapsulate everything needed to spin up a microVM-based sandbox, including the root filesystem, writable layer, exposed ports, and a readiness probe. Once a template is built, CubeSandbox can launch sandboxes from it in under 60 ms with hardware-level isolation.

The tool is typically run against a CubeMaster control plane that orchestrates the underlying microVMs on RustVMM/KVM hosts.

# PARAMETERS

**tpl create-from-image**
> Build a new sandbox template from a container image. Submits a build job to CubeMaster.

**tpl watch**
> Follow the progress of a running template build job.

**--image** _registry/image:tag_
> Container image used as the base of the template.

**--writable-layer-size** _size_
> Size of the writable overlay layer (e.g. _1G_). Sandboxes launched from the template get a fresh writable layer of this size.

**--expose-port** _port_
> Expose a TCP port from the sandbox. May be specified multiple times.

**--probe** _port_
> Port used for the readiness probe; the template is considered ready once this port accepts connections.

**--job-id** _id_
> Identifier of a build job to watch, as returned by **tpl create-from-image**.

**--help**
> Show help for the command or subcommand.

# EXAMPLES

Build a code-interpreter template from a Tencent Cloud image and watch the resulting job:

```
cubemastercli tpl create-from-image \
    --image ccr.ccs.tencentyun.com/ags-image/sandbox-code:latest \
    --writable-layer-size 1G \
    --expose-port 49999 \
    --expose-port 49983 \
    --probe 49999

cubemastercli tpl watch --job-id <job_id>
```

# CAVEATS

**cubemastercli** requires a reachable CubeMaster control plane and a host with KVM enabled. It is part of the CubeSandbox project and is not shipped by Linux distributions; flags and subcommands may change between releases.

# HISTORY

**CubeSandbox** was open-sourced by **Tencent Cloud** as an instant, concurrent, secure and lightweight sandbox for AI agents, built on **RustVMM** and **KVM**. **cubemastercli** ships as the administrative client for its CubeMaster control plane.

# SEE ALSO

[docker](/man/docker)(1), [firecracker](/man/firecracker)(1), [kvm](/man/kvm)(4), [qemu](/man/qemu)(1)
