# TAGLINE

queries and manages compute nodes in a PBS cluster

# TLDR

**List all nodes**

```pbsnodes -a```

**Show specific node**

```pbsnodes [node_name]```

**Show free nodes**

```pbsnodes -l free```

**Mark node offline**

```pbsnodes -o [node_name]```

**Clear offline status**

```pbsnodes -c [node_name]```

**Set node comment**

```pbsnodes -N "[comment]" [node_name]```

# SYNOPSIS

**pbsnodes** [_options_] [_nodes_...]

# PARAMETERS

**-a**
> Show all nodes.

**-l** _state_
> List nodes in state.

**-o**
> Mark offline.

**-c**
> Clear offline.

**-N** _note_
> Set note/comment.

**-x**
> XML output.

**-s** _server_
> PBS server.

# DESCRIPTION

**pbsnodes** queries and manages compute nodes in a PBS (Portable Batch System) cluster. Administrators use it to check node status, mark nodes offline for maintenance, and view resource availability.

# NODE STATES

```
free          - Available for jobs
job-exclusive - Running exclusive job
job-sharing   - Running shared jobs
down          - Unavailable
offline       - Admin disabled
```

# EXAMPLE OUTPUT

```
node01
     state = free
     np = 32
     properties = gpu
     status = ...
```

# CAVEATS

Requires PBS installation. Admin rights for modifications. Cluster-specific configuration.

# HISTORY

PBS was developed at **NASA Ames** in the early 1990s for cluster job scheduling, evolving into OpenPBS and PBS Professional.

# SEE ALSO

[qstat](/man/qstat)(1), [qsub](/man/qsub)(1), [qdel](/man/qdel)(1), [slurm](/man/slurm)(1)
