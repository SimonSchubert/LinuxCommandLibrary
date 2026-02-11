# TAGLINE

Low-level OCI container runtime

# TLDR

**Run container**

```runc run [container-id]```

**Create container**

```runc create [container-id]```

**Start container**

```runc start [container-id]```

**List containers**

```runc list```

**Kill container**

```runc kill [container-id]```

**Delete container**

```runc delete [container-id]```

**Execute in container**

```runc exec [container-id] [command]```

# SYNOPSIS

**runc** [_options_] _command_ [_args_...]

# DESCRIPTION

**runc** is a CLI tool for spawning and running containers according to the OCI specification. It's the reference implementation of the Open Container Initiative runtime specification.

The tool provides low-level container runtime functionality, used by Docker, containerd, and other container platforms.

# PARAMETERS

**run** _id_
> Create and start container.

**create** _id_
> Create container.

**start** _id_
> Start created container.

**list**
> List containers.

**state** _id_
> Output container state.

**kill** _id_ [_signal_]
> Send signal to container.

**delete** _id_
> Delete container.

**exec** _id_ _cmd_
> Execute command in container.

**spec**
> Generate spec file.

**--root** _dir_
> Root directory for storage.

# CAVEATS

Requires OCI bundle. Low-level tool - usually not used directly. Needs root for full functionality. Container must be configured properly.

# HISTORY

**runc** was developed as part of the **Open Container Initiative** (OCI) by Docker and others in **2015**. It standardized container runtime behavior, enabling interoperability between container platforms.

# SEE ALSO

[docker](/man/docker)(1), [containerd](/man/containerd)(8), [podman](/man/podman)(1), [crun](/man/crun)(1)
