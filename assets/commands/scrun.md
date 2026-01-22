# TLDR

**Create** a new container

```scrun create container_id```

**Start** a container

```scrun start container_id```

Query container **state**

```scrun state container_id```

**Kill** a container (send SIGTERM)

```scrun kill container_id```

Kill with **specific signal**

```scrun kill container_id SIGKILL```

**Delete** a container

```scrun delete container_id```

Enable **debug** logging

```scrun create container_id --debug```

# SYNOPSIS

**scrun** _command_ _container_id_ [_options_]

# PARAMETERS

**create**
> Create a new container

**start**
> Start a created container

**state**
> Query container state

**kill** [_signal_]
> Send signal to container

**delete**
> Delete container and release resources

**--debug**
> Enable debug logging

# DESCRIPTION

**scrun** is an OCI runtime proxy for Slurm that runs containers as jobs. It allows container orchestration systems to submit container workloads to Slurm clusters.

Containers are executed as Slurm jobs, leveraging the cluster's resource management and scheduling capabilities.

# CAVEATS

Requires Slurm's container support to be configured. Container images must be accessible to compute nodes.

# HISTORY

Part of **Slurm** workload manager, enabling container integration with HPC cluster environments.

# SEE ALSO

[srun](/man/srun)(1), [sbatch](/man/sbatch)(1), [podman](/man/podman)(1)
