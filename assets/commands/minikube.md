# TAGLINE

run a local single-node Kubernetes cluster

# TLDR

**Start the cluster** with the default driver

```minikube start```

**Start with a specific** driver

```minikube start --driver=[docker]```

**Start with a Kubernetes** version pin

```minikube start --kubernetes-version=[v1.30.0]```

**Stop the running** cluster

```minikube stop```

**Delete the cluster** and its data

```minikube delete```

**Check cluster** status

```minikube status```

**Open the Kubernetes dashboard** in a browser

```minikube dashboard```

**SSH into the cluster node**

```minikube ssh```

**Get a service URL** exposed inside the cluster

```minikube service [service_name] --url```

**Enable a built-in addon**

```minikube addons enable [ingress]```

# SYNOPSIS

**minikube** _command_ [_options_]

# PARAMETERS

**start**
> Create and start the local Kubernetes cluster.

**stop**
> Stop the cluster while preserving its state.

**delete**
> Delete the cluster, releasing all VM and disk resources.

**status**
> Show the status of host, kubelet, apiserver, and kubeconfig.

**dashboard**
> Launch the Kubernetes web dashboard.

**ssh**
> Open a shell on the underlying VM or container.

**service** _NAME_
> Print the URL of a Kubernetes service, optionally opening it in the browser.

**addons** _SUBCOMMAND_
> Manage built-in addons (ingress, metrics-server, registry, ...).

**tunnel**
> Create a network route into the cluster for LoadBalancer services.

**profile** _NAME_
> Switch between named clusters managed by minikube.

**--driver** _NAME_
> Select the hypervisor or runtime: docker, podman, kvm2, hyperkit, virtualbox, qemu, vfkit, parallels, hyperv, none.

**--cpus** _N_
> Number of CPUs allocated to the node.

**--memory** _MB_
> Amount of RAM in MB (or with suffix like 4g).

**--disk-size** _SIZE_
> Disk size for the node, e.g. **20g**.

**--container-runtime** _RUNTIME_
> containerd (default since v1.24), cri-o, or docker.

**--kubernetes-version** _VERSION_
> Kubernetes release to deploy, e.g. **v1.30.0**.

**--addons** _LIST_
> Comma-separated list of addons to enable at start.

**--help**
> Display help information.

# DESCRIPTION

**minikube** provisions and runs a local single-node (or small multi-node) Kubernetes cluster suitable for development, learning, and CI. It abstracts the underlying compute platform: depending on the **--driver** flag it can spin up a VM (kvm2, virtualbox, hyperkit, qemu) or a container (docker, podman) hosting the Kubernetes components, then writes a context to **~/.kube/config** so **kubectl** can target the cluster transparently.

Minikube ships with optional addons (ingress, metrics-server, registry, storage-provisioner) that can be enabled with **minikube addons enable**. The **service** and **tunnel** commands bridge cluster networking to the host so applications running inside the cluster are reachable from the developer's machine.

Multiple clusters can coexist via **--profile**, each with its own VM, addons, and kubeconfig context.

# CAVEATS

Single-node by default; multi-node clusters (**--nodes=N**) exist but are intended for local testing only. Resource-hungry: a typical cluster needs at least 2 CPUs and 2 GiB of RAM. The **none** driver runs Kubernetes directly on the host and is destructive to existing system configuration. On macOS Apple Silicon, prefer the **docker**, **qemu**, or **vfkit** drivers; **hyperkit** is x86-only.

# HISTORY

**minikube** was created by the Kubernetes community to provide a reliable on-laptop development experience. It graduated from the **kubernetes-incubator** to the main **kubernetes** GitHub organization and has tracked upstream Kubernetes releases closely since version **0.1** (2016).

# SEE ALSO

[kubectl](/man/kubectl)(1), [kind](/man/kind)(1), [k3s](/man/k3s)(1), [k3d](/man/k3d)(1)
