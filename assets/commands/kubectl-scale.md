# TAGLINE

sets a new size for a deployment, replica set, or replication controller

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

**kubectl scale** adjusts the replica count for deployments, replica sets, replication controllers, and stateful sets, allowing you to increase or decrease the number of running pod instances on demand. Changes take effect immediately, with the Kubernetes controller manager working to reconcile the actual state to the desired replica count.

The command supports a precondition flag (--current-replicas) that causes the scaling operation to fail if the current number of replicas does not match the expected value, which is useful for preventing race conditions in automated workflows. You can also scale resources defined in manifest files and apply the operation to multiple resources in a single invocation.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-autoscale](/man/kubectl-autoscale)(1)

