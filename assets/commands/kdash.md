# TAGLINE

fast terminal dashboard for Kubernetes written in Rust

# TLDR

**Launch Kubernetes dashboard**

```kdash```

**Use specific kubeconfig**

```kdash -c [~/.kube/config]```

**Set refresh interval**

```kdash -t [5]```

# SYNOPSIS

**kdash** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Path to kubeconfig file.

**-t**, **--tick-rate** _seconds_
> Refresh interval in seconds.

**-n**, **--namespace** _name_
> Default namespace to view.

# DESCRIPTION

**kdash** is a fast terminal dashboard for Kubernetes written in Rust. Provides a read-only view of cluster resources, node metrics, and pod status. Requires metrics-server for resource utilization data. Navigate using keyboard shortcuts.

# CAVEATS

Requires metrics-server deployed on the cluster for resource metrics. May not work properly with Minikube or Kind when running via Docker.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1)

