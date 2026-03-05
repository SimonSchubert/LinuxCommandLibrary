# TAGLINE

Top-like monitoring tool for Kubernetes clusters

# TLDR

**Monitor the current Kubernetes cluster**

```ktop```

**Monitor a specific namespace**

```ktop -n [namespace]```

**Use a specific kubeconfig**

```ktop --kubeconfig [path/to/config]```

# SYNOPSIS

**ktop** [_options_]

# DESCRIPTION

**ktop** is a terminal UI monitoring tool for Kubernetes clusters, similar to **htop** for Linux. It provides real-time visualization of cluster resource usage including CPU, memory, disk, and GPU across nodes and pods.

The TUI displays a cluster overview with total resources and aggregate utilization, per-node metrics with CPU, memory, and pod counts, and a sortable list of pods with resource consumption and restart counts. Metrics update every 2 seconds by default.

# CAVEATS

Requires a working kubectl configuration and metrics-server deployed in the cluster. GPU monitoring requires appropriate drivers and device plugins.

# HISTORY

**ktop** was created by **Vladimir Vivien** (vladimirvivien) and is written in **Go**. It was inspired by classic Unix monitoring tools like **top** and **htop**, adapted for Kubernetes cluster monitoring.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1), [htop](/man/htop)(1)
