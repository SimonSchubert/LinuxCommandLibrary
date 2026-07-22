# TAGLINE

Lightweight, security-hardened container runtime

# TLDR

**Run a command** in an isolated container

```nucleus run [image] [command]```

**Run with a memory and CPU limit**

```nucleus run --memory [512m] --cpus [2] [image] [command]```

**Run detached** in the background

```nucleus run --detach [image] [command]```

**List running** containers

```nucleus ps```

**View the logs** of a container

```nucleus logs [container]```

**Stop a** running container

```nucleus stop [container]```

# SYNOPSIS

**nucleus** _subcommand_ [_options_] [_image_] [_command_]

# DESCRIPTION

**nucleus** is a lightweight, declarative container runtime aimed at ephemeral agent sandboxes and long-running production services. Rather than layering a heavy daemon on top, it drives Linux kernel primitives directly (namespaces, cgroups, seccomp, and Landlock) to create isolated execution environments with minimal overhead.

It runs in distinct modes. The default agent mode creates ephemeral sandboxes with best-effort isolation, while strict agent mode is fail-closed: it refuses to start unless cgroup creation, seccomp filtering, and Landlock enforcement all succeed. A production mode targets long-running services with declarative configuration, reproducible root filesystems, egress policy, health checks, and systemd integration. Subcommands cover the usual lifecycle (**run**, **create**, **ps**, **logs**, **stop**, **attach**) plus multi-container topologies via **compose** and seccomp profile generation from syscall traces.

# PARAMETERS

**run**
> Create and start a container from an image or root filesystem.

**create**
> Define a container from a JSON or TOML configuration without starting it.

**ps**
> List containers.

**logs**
> Show a container's output.

**stop**
> Stop a running container.

**attach**
> Attach to a running container's streams.

**compose**
> Bring up a multi-container topology.

**--memory** _SIZE_
> Limit the container's memory.

**--cpus** _N_
> Limit the number of CPUs.

**--network** _MODE_
> Select the networking mode for the container.

**--rootfs** _PATH_
> Use the given root filesystem.

**--seccomp-profile** _FILE_
> Apply a seccomp profile to the container.

**--landlock-policy** _SPEC_
> Apply a Landlock filesystem access policy.

**--detach**
> Run the container in the background.

# CAVEATS

nucleus relies on modern Linux kernel features such as cgroups v2, seccomp, and Landlock; strict agent mode fails closed when any of them are unavailable, so older kernels may only support the degraded agent mode. It is Linux-specific and not a drop-in replacement for the full Docker or OCI tooling ecosystem.

# INSTALL

```nix: nix profile install nixpkgs#nucleus```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [runc](/man/runc)(8), [bwrap](/man/bwrap)(1), [systemd-nspawn](/man/systemd-nspawn)(1)

# RESOURCES

```[Source code](https://github.com/sig-id/nucleus)```

<!-- verified: 2026-06-10 -->
