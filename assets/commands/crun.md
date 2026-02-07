# TAGLINE

fast OCI container runtime

# TLDR

**Run a container** from OCI bundle

```crun run [container_id]```

**Create a container** without starting it

```crun create [container_id]```

**Start a created container**

```crun start [container_id]```

**List running containers**

```crun list```

**Execute a command** in a running container

```crun exec [container_id] [command]```

**Delete a container**

```crun delete [container_id]```

**Get container state**

```crun state [container_id]```

# SYNOPSIS

**crun** [_global-options_] _command_ [_command-options_] [_arguments_]

# PARAMETERS

**run** _ID_
> Create and start a container from an OCI bundle.

**create** _ID_
> Create a container but don't start it.

**start** _ID_
> Start a previously created container.

**exec** _ID_ _CMD_
> Execute a command in a running container.

**delete** _ID_
> Delete a container.

**kill** _ID_ [_SIGNAL_]
> Send a signal to the container's init process.

**list**
> List containers.

**state** _ID_
> Output the state of a container.

**spec**
> Create a new OCI bundle specification.

**--root** _DIR_
> Root directory for container state.

# DESCRIPTION

**crun** is a fast and low-memory footprint OCI container runtime written in C. It is fully compatible with the OCI (Open Container Initiative) runtime specification and can be used as a drop-in replacement for runc.

crun implements all required OCI runtime operations including container creation, execution, and lifecycle management. It supports Linux namespaces, cgroups v1 and v2, seccomp, and other container isolation features.

The runtime is designed to be lightweight and efficient, with significantly faster startup times and lower memory usage compared to Go-based runtimes. It's used by container engines like Podman and Buildah.

# CAVEATS

Requires root privileges or appropriate user namespace configuration. OCI bundle must be properly configured with config.json and rootfs. crun operates on OCI bundles, not container images directly.

# HISTORY

crun was developed by Giuseppe Scrivano at Red Hat as a faster alternative to runc. First released around **2019**, it gained adoption due to its performance benefits. It became the default runtime for Podman and is supported by Kubernetes through CRI-O.

# SEE ALSO

[runc](/man/runc)(1), [podman](/man/podman)(1), [containerd](/man/containerd)(1), [docker](/man/docker)(1)
