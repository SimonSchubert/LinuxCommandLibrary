# TAGLINE

Check Flux prerequisites and the health of installed controllers

# TLDR

**Check prerequisites** before bootstrapping Flux

```flux check --pre```

**Check the status** of the Flux installation on the cluster

```flux check```

**Check specific components** only

```flux check --components=source-controller,kustomize-controller```

**Include extra components** such as image automation

```flux check --components-extra=image-reflector-controller,image-automation-controller```

# SYNOPSIS

**flux** **check** [_options_]

# DESCRIPTION

**flux check** validates that the prerequisites for running Flux are met on the current machine and (when connected to a cluster) that the Flux controllers are healthy and ready.

`--pre` performs a client-side check (kubectl, permissions, network, etc.) and is typically run before `flux bootstrap`.

Without `--pre` it connects to the cluster and reports on the installed Flux components.

# PARAMETERS

**--pre**
> Only perform pre-installation checks (no cluster connection required for most checks).

**--components** _list_
> Comma-separated list of components to check (default `source-controller,kustomize-controller,helm-controller,notification-controller`).

**--components-extra** _list_
> Additional components to check beyond those supplied or defaulted (comma-separated).

**--poll-interval** _duration_
> How often the health checker polls the cluster for resource state (default `5s`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**-n**, **--namespace** _ns_
> Namespace scope for the CLI request (default `flux-system`).

# SEE ALSO

[flux](/man/flux)(1), [flux-bootstrap](/man/flux-bootstrap)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_check/)```

<!-- verified: 2026-07-11 -->
