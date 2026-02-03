# TLDR

**Scale deployment replicas**

```kubectl scale deployment [name] --replicas=[3]```

**Scale multiple deployments**

```kubectl scale deployment [name1] [name2] --replicas=[3]```

**Scale with current replica check**

```kubectl scale deployment [name] --current-replicas=[2] --replicas=[3]```

**Scale from file**

```kubectl scale -f [manifest.yaml] --replicas=[5]```

# SYNOPSIS

**kubectl** **scale** _type_ _name_ **--replicas=**_count_ [_options_]

# PARAMETERS

**--replicas** _count_
> Target number of replicas.

**--current-replicas** _count_
> Precondition for current replicas.

**-f**, **--filename** _file_
> Resource file to scale.

**--timeout** _duration_
> Timeout for scaling operation.

# DESCRIPTION

**kubectl scale** sets a new size for a deployment, replica set, or replication controller. Changes take effect immediately. Use --current-replicas to ensure the current state matches expectations before scaling.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-autoscale](/man/kubectl-autoscale)(1)

