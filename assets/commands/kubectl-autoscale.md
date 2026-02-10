# TAGLINE

creates a Horizontal Pod Autoscaler for a deployment, replica set

# TLDR

**Create HPA for deployment**

```kubectl autoscale deployment [name] --min=[2] --max=[10] --cpu-percent=[80]```

**Autoscale replication controller**

```kubectl autoscale rc [name] --max=[5]```

**Create HPA with specific name**

```kubectl autoscale deployment [name] --name=[hpa-name] --max=[10]```

# SYNOPSIS

**kubectl** **autoscale** _type_ _name_ [_options_]

# PARAMETERS

**--min** _count_
> Minimum number of replicas.

**--max** _count_
> Maximum number of replicas.

**--cpu-percent** _percent_
> Target CPU utilization percentage.

**--name** _name_
> Name for the HPA resource.

**-n**, **--namespace** _name_
> Kubernetes namespace.

# DESCRIPTION

**kubectl autoscale** creates a Horizontal Pod Autoscaler (HPA) for a deployment, replica set, or replication controller. Automatically scales the number of pods based on CPU utilization or custom metrics.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-scale](/man/kubectl-scale)(1)

