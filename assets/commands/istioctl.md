# TAGLINE

CLI for Istio, a service mesh that provides traffic management

# TLDR

**Install Istio** with default profile

```istioctl install```

**Install with specific profile**

```istioctl install --set profile=[demo]```

**Check proxy sync status**

```istioctl proxy-status```

**Analyze configuration** for issues

```istioctl analyze```

**View Envoy proxy config** for a pod

```istioctl proxy-config cluster [pod-name].[namespace]```

**Open Kiali dashboard**

```istioctl dashboard kiali```

**Generate installation manifest**

```istioctl manifest generate```

**Uninstall Istio**

```istioctl uninstall --purge```

# SYNOPSIS

**istioctl** _command_ [_options_]

# COMMANDS

**install**
> Install Istio control plane.

**uninstall**
> Remove Istio from cluster.

**manifest** generate|diff|install
> Generate, diff, or apply manifests.

**profile** list|dump|diff
> Manage installation profiles.

**analyze**
> Analyze configuration for potential issues.

**proxy-status**
> Show sync status of Envoy proxies.

**proxy-config** _type_ _pod_
> Retrieve Envoy configuration (cluster, listener, route, endpoint).

**dashboard** _component_
> Open web UI for Kiali, Grafana, Jaeger, etc.

**kube-inject**
> Inject Envoy sidecar into pod spec.

**validate**
> Validate Istio policies and rules.

**version**
> Show client and control plane versions.

**upgrade**
> Upgrade Istio control plane.

# PARAMETERS

**--set** _key=value_
> Override installation settings.

**--filename**, **-f** _file_
> Path to IstioOperator custom resource file.

**--revision** _name_
> Target specific Istio revision.

**--context** _name_
> Kubernetes context to use.

**--kubeconfig** _path_
> Path to kubeconfig file.

**--namespace**, **-n** _namespace_
> Target namespace.

**--istioNamespace** _namespace_
> Istio system namespace. Default: istio-system.

**--skip-confirmation**, **-y**
> Skip confirmation prompts.

**--dry-run**
> Preview without applying changes.

# PROFILES

**default**
> Production deployment with istiod and ingress gateway.

**demo**
> Full features for evaluation with high tracing/logging.

**minimal**
> Only istiod control plane.

**remote**
> For multi-cluster remote configuration.

**empty**
> Base for custom configuration.

# DESCRIPTION

**istioctl** is the CLI for Istio, a service mesh that provides traffic management, security, and observability for microservices. It manages Istio installation, configuration, and diagnostics.

The **install** command deploys the Istio control plane using profiles that bundle configuration presets. Use **--set** flags to customize individual settings or provide an IstioOperator YAML file with **-f**.

Diagnostics commands like **analyze** detect configuration issues, **proxy-status** shows Envoy synchronization state, and **proxy-config** inspects individual proxy configurations for debugging.

The **dashboard** command opens web interfaces for observability tools including Kiali (service mesh visualization), Grafana (metrics), Jaeger (tracing), and Prometheus.

For automatic sidecar injection, use **kube-inject** on pod manifests or enable namespace-level injection with labels.

# CAVEATS

Version compatibility between istioctl and the control plane is important; use matching versions. Some commands require cluster admin privileges. Multi-cluster setups need additional configuration. Uninstall with **--purge** to remove all resources.

# HISTORY

Istio was announced in **May 2017** as a collaboration between Google, IBM, and Lyft. It quickly became the leading service mesh for Kubernetes. The project joined the CNCF as an incubating project in **2022** and graduated in **2023**. istioctl has evolved to simplify installation and provide comprehensive diagnostic capabilities.

# SEE ALSO

[kubectl](/man/kubectl)(1), [linkerd](/man/linkerd)(1), [helm](/man/helm)(1)
