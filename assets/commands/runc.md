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

**Execute command in running container**

```runc exec [container-id] [command]```

**Show container state**

```runc state [container-id]```

**Generate OCI spec file**

```runc spec```

**Show processes running in container**

```runc ps [container-id]```

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
> Execute new process inside container.

**pause** _id_
> Suspend all processes inside container.

**resume** _id_
> Resume previously paused processes.

**ps** _id_
> Show processes running inside container.

**events** _id_
> Display container events (OOM, CPU, memory, I/O stats).

**update** _id_
> Update container resource constraints.

**checkpoint** _id_
> Checkpoint a running container.

**restore** _id_
> Restore container from a previous checkpoint.

**spec**
> Generate new OCI spec file (config.json).

**--root** _dir_
> Root directory for container state storage (should be on tmpfs).

**--debug**
> Enable debug logging.

**--log** _path_
> Set log file path (default: stderr).

**--log-format** _text|json_
> Set log format (default: text).

**--systemd-cgroup**
> Enable systemd cgroup support.

**--rootless** _true|false|auto_
> Enable or disable rootless mode (default: auto).

# CAVEATS

Requires OCI bundle. Low-level tool - usually not used directly. Needs root for full functionality. Container must be configured properly.

# HISTORY

**runc** was developed as part of the **Open Container Initiative** (OCI) by Docker and others in **2015**. It standardized container runtime behavior, enabling interoperability between container platforms.

# SEE ALSO

[docker](/man/docker)(1), [containerd](/man/containerd)(8), [podman](/man/podman)(1), [crun](/man/crun)(1)
