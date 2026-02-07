# TAGLINE

CLI for Flux v1 GitOps tool

# TLDR

**List workloads**

```fluxctl list-workloads```

**List images for** workload

```fluxctl list-images --workload=[namespace:deployment/name]```

**Release new image**

```fluxctl release --workload=[namespace:deployment/name] --update-image=[image:tag]```

**Sync with git**

```fluxctl sync```

**Lock workload**

```fluxctl lock --workload=[namespace:deployment/name]```

# SYNOPSIS

**fluxctl** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: list-workloads, list-images, release, sync, etc.

**list-workloads**
> Show all managed workloads.

**list-images** _WORKLOAD_
> Show available images.

**release**
> Update workload to new image.

**sync**
> Synchronize with Git repository.

**lock** _WORKLOAD_
> Prevent automated updates.

**unlock** _WORKLOAD_
> Allow automated updates.

**--help**
> Display help information.

# DESCRIPTION

**fluxctl** is the CLI for Flux v1, a GitOps tool for Kubernetes. It manages workloads, triggers deployments, and controls automated image updates from container registries.

The tool connects to the Flux daemon running in Kubernetes to list resources, release images, and trigger Git synchronization. It enables manual intervention in otherwise automated GitOps workflows.

fluxctl provides operational control over Flux-managed clusters.

# CAVEATS

Flux v1 is deprecated in favor of Flux v2. Requires Flux daemon access. Cluster context must be configured.

# HISTORY

fluxctl was part of **Flux v1** by Weaveworks. Flux pioneered GitOps for Kubernetes, using Git as the source of truth for cluster state. Flux v2 replaced it with the flux CLI.

# SEE ALSO

[flux](/man/flux)(1), [kubectl](/man/kubectl)(1), [argocd](/man/argocd)(1)
