# TAGLINE

workload orchestrator by HashiCorp

# TLDR

**Start development agent**

```nomad agent -dev```

**Run a job**

```nomad job run [job.nomad]```

**Show job status**

```nomad job status [job_name]```

**Stop a job**

```nomad job stop [job_name]```

**List running jobs**

```nomad job status```

**Show node status**

```nomad node status```

**View allocation logs**

```nomad alloc logs [alloc_id]```

# SYNOPSIS

**nomad** [_options_] _command_ [_args_]

# DESCRIPTION

**nomad** is a workload orchestrator by HashiCorp. It deploys and manages applications across a cluster, supporting containers, VMs, and standalone executables.

The tool provides scheduling, service discovery, and rolling updates. It integrates with Consul and Vault for service mesh and secrets management.

# PARAMETERS

**agent**
> Run Nomad agent.

**job run** _file_
> Submit job.

**job status** [_job_]
> Job status.

**job stop** _job_
> Stop job.

**node status**
> Node information.

**alloc status** _id_
> Allocation details.

**alloc logs** _id_
> Allocation logs.

**server members**
> Server cluster info.

**-dev**
> Development mode.

**-address** _addr_
> Nomad API address.

# CAVEATS

Cluster setup requires planning. ACLs needed for production. Resource limits important. Consul recommended for service discovery.

# HISTORY

**Nomad** was released by **HashiCorp** in **2015** as a simpler alternative to Kubernetes for workload scheduling. It focuses on operational simplicity while supporting multiple workload types beyond containers.

# SEE ALSO

[consul](/man/consul)(1), [vault](/man/vault)(1), [docker](/man/docker)(1), [kubectl](/man/kubectl)(1)
