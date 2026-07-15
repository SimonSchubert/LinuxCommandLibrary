# TAGLINE

OCI runtime for containers and VMs from one image and binary

# TLDR

**Pull** an OCI image into the local DAG store

```pullrun pull [image:tag]```

**Run** as a container (Linux) or default backend

```pullrun run [image:tag] --cmd [command]```

**Run** as a **microVM**

```pullrun run [image:tag] --backend vm --cmd [command] --attach -t```

**List** workloads

```pullrun list```

**Execute** a command in a running workload

```pullrun exec [id] [command]```

**Stop** a workload

```pullrun stop [id]```

**Build** an image from a Dockerfile

```pullrun build [Dockerfile] [.] -t [name:tag]```

**List** local images

```pullrun images```

**Start** the MCP server for AI agents

```pullrun mcp```

# SYNOPSIS

**pullrun** _command_ [_options_] [_args_]

# DESCRIPTION

**pullrun** is a single-binary OCI runtime that can run the same image as a Linux container (runc), a Firecracker microVM, or an Apple Silicon VM, without a separate VM image build. Layers live in a content-addressed **DAG store** (zero-copy mmap reads, content-hash verification) rather than classic overlayfs. An optional daemon supports P2P block sync, background services, and cluster-oriented workflows; many CLI operations work without a heavyweight central dockerd-style daemon.

The Go CLI covers image lifecycle (**pull**, **build**, **push**, **save**/**load**, **images**, **rmi**, **gc**), workload lifecycle (**run**, **stop**, **exec**, **list**, **logs**, **stats**, **events**, **inspect**, **commit**, **diff**), networking, encrypted secrets, configs, registry **login**/**logout**, policy gates (e.g. Cosign, SBOM, seccomp), and an **mcp** subcommand for agent integration. Compose support is provided via a companion **pullrun-compose** binary. A Kubernetes CRI shim and multi-node control-plane pieces exist in the wider project for cluster use.

Default backends depend on platform: Apple Virtualization on macOS Apple Silicon, containers and/or Firecracker on Linux when **runc** and KVM are available. Install via the project install script, Homebrew tap, or packages documented upstream.

# PARAMETERS

**pull** _image_
> Pull an OCI image into the local store.

**run** _image_ [_options_]
> Start a workload. Common flags: **--cmd** (repeatable), **--backend** **vm**|container path, **--attach**, **-t**/**--tty**, **--net**, **--secret**, **--config**, **--volume**.

**list**
> List workloads (pending/running/exited).

**stop** _id_
> Stop a workload.

**exec** _id_ [_command_]
> Run a command in a workload; **-t** for TTY re-attach patterns.

**build** _Dockerfile_ _context_ **-t** _tag_
> Native Dockerfile build with content-addressed layer caching (no Docker daemon required for RUN).

**push** _digest_ _registry/ref_
> Push store content to a registry.

**images**
> List images in the local DAG store.

**rmi** _image_|_digest_
> Remove an image; cascade-delete unreachable layers while preserving shared refs.

**gc** [**--apply**] [**--force**]
> Garbage-collect unreachable DAG nodes (dry-run by default).

**save** / **load**
> Export or import OCI-compatible tarballs for air-gapped use.

**network** **create** _name_ [_options_]
> Manage user-defined networks.

**secret** **create**|**ls**|... 
> AES-256-GCM secrets mounted into workloads.

**mcp** [**--sse** _addr_]
> MCP server (stdio or SSE) exposing runtime operations to AI agents.

**events** / **stats** / **inspect** / **diff** / **commit**
> Observability and filesystem change tools.

**login** / **logout**
> Registry authentication.

# CAVEATS

Young project; APIs and packaging may still evolve. VM backends need platform support (**KVM**/Firecracker on Linux, Apple Virtualization on Apple Silicon). Container mode needs **runc** (or equivalent) on the host. Rootless by design, but full network and VM features may still require host capabilities and correct device permissions. Prefer official docs for production CRI/compose layouts.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [nerdctl](/man/nerdctl)(1), [runc](/man/runc)(1), [containerd](/man/containerd)(1)

# RESOURCES

```[Source code](https://github.com/pullrun/pullrun)```

```[Homepage](https://pullrun.dev)```

```[Documentation](https://github.com/pullrun/pullrun/blob/main/docs/PULLRUN_GUIDE.md)```

<!-- verified: 2026-07-15 -->
