# TAGLINE

CLI for Linkerd, a lightweight service mesh for Kubernetes

# TLDR

**Check CLI and control plane versions**

```linkerd version```

**Validate cluster configuration**

```linkerd check```

**Install Linkerd** control plane

```linkerd install | kubectl apply -f -```

**Inject sidecar proxy** into deployment

```linkerd inject [deployment.yaml] | kubectl apply -f -```

**View real-time traffic** statistics

```linkerd stat deploy```

**Open Linkerd dashboard**

```linkerd viz dashboard```

**View top traffic** by route

```linkerd viz top deploy/[name]```

**Check proxy status** for a pod

```linkerd diagnostics proxy-status [pod-name]```

# SYNOPSIS

**linkerd** _command_ [_options_]

# COMMANDS

**install**
> Generate Linkerd control plane installation manifest.

**check**
> Validate installation and cluster configuration.

**inject**
> Add Linkerd proxy sidecar to Kubernetes resources.

**uninject**
> Remove Linkerd proxy from resources.

**upgrade**
> Generate upgrade manifest for control plane.

**uninstall**
> Generate manifest to remove Linkerd.

**version**
> Show CLI and control plane versions.

**identity**
> View workload identity certificates.

**diagnostics**
> Troubleshooting and debugging commands.

**completion**
> Generate shell completion scripts.

# VIZ EXTENSION COMMANDS

**viz install**
> Install observability extension.

**viz dashboard**
> Open web dashboard.

**viz stat**
> Display traffic statistics.

**viz top**
> Show real-time traffic by route.

**viz tap**
> Live stream of requests.

**viz edges**
> Show connections between resources.

**viz routes**
> Display per-route metrics.

# PARAMETERS

**--context** _name_
> Kubernetes context to use.

**--kubeconfig** _path_
> Path to kubeconfig file.

**--api-addr** _address_
> Override API server address.

**--namespace**, **-n** _namespace_
> Target namespace.

**--linkerd-namespace** _namespace_
> Linkerd control plane namespace.

**--set** _key=value_
> Override configuration values.

**--values** _file_
> Path to values file for configuration.

**--verbose**
> Enable verbose output.

# DESCRIPTION

**linkerd** is the CLI for Linkerd, a lightweight service mesh for Kubernetes. It manages installation, proxy injection, and provides observability tools for microservices traffic.

The **install** command generates Kubernetes manifests for the control plane. Pipe output to **kubectl apply** for deployment. Use **check** to validate prerequisites and installation health.

Sidecar proxy injection with **inject** adds the Linkerd proxy to pods, enabling mTLS, traffic metrics, and load balancing. Injection can be automated via namespace annotations.

The **viz** extension provides observability features. The **dashboard** opens a web UI showing service topology and metrics. Commands like **stat**, **top**, and **tap** provide CLI-based traffic analysis.

Linkerd uses mutual TLS by default, automatically encrypting traffic between meshed services without application changes.

# CAVEATS

Some commands require the viz extension to be installed separately. The CLI version should match the control plane version. Proxy injection requires pod restart to take effect. Some features require cluster admin privileges.

# HISTORY

Linkerd was originally created at **Buoyant** in **2016** as one of the first service meshes. Version 2 was a complete rewrite in Rust and Go, released in **2018**, focusing on simplicity and low resource overhead. Linkerd joined the CNCF and graduated in **2021**. It remains popular for its lightweight footprint and operational simplicity compared to alternatives.

# SEE ALSO

[kubectl](/man/kubectl)(1), [istioctl](/man/istioctl)(1), [helm](/man/helm)(1)
