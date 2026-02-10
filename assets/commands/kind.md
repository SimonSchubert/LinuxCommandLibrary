# TAGLINE

runs Kubernetes clusters in Docker containers

# TLDR

**Create cluster**

```kind create cluster```

**Create named cluster**

```kind create cluster --name [my-cluster]```

**Create with config**

```kind create cluster --config [kind-config.yaml]```

**List clusters**

```kind get clusters```

**Delete cluster**

```kind delete cluster --name [my-cluster]```

**Load image to cluster**

```kind load docker-image [myimage:tag] --name [my-cluster]```

# SYNOPSIS

**kind** _command_ [_options_]

# PARAMETERS

**create cluster**
> Create new cluster.

**delete cluster**
> Delete cluster.

**get clusters**
> List clusters.

**get nodes**
> List cluster nodes.

**load docker-image** _IMAGE_
> Load image to cluster.

**--name** _NAME_
> Cluster name.

**--config** _FILE_
> Configuration file.

**--help**
> Display help information.

# DESCRIPTION

**kind** (Kubernetes IN Docker) creates and manages local Kubernetes clusters using Docker containers as nodes. Each cluster node runs as a separate Docker container with systemd, kubelet, and containerd inside it, providing a lightweight alternative to virtual machine-based solutions like minikube for local development and CI/CD testing.

The tool supports multi-node clusters including multiple control plane nodes for testing high-availability configurations, and accepts YAML configuration files to customize node counts, port mappings, mounted volumes, and Kubernetes feature gates. Local Docker images can be loaded directly into the cluster without pushing to a registry, which accelerates the inner development loop.

kind was created by the Kubernetes SIG Testing team and is used extensively in the Kubernetes project's own CI pipelines. It is optimized for fast cluster creation and teardown, making it well-suited for automated testing workflows, but is not intended for production use.

# CAVEATS

Requires Docker. Development focused. Not for production.

# HISTORY

kind (Kubernetes IN Docker) was created by the **Kubernetes** SIG Testing as a tool for testing Kubernetes itself.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k3d](/man/k3d)(1), [minikube](/man/minikube)(1), [docker](/man/docker)(1)
