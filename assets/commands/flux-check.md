# TAGLINE

Check Flux prerequisites and the health of installed controllers

# TLDR

**Check prerequisites** before bootstrapping Flux

```flux check --pre```

**Check the status** of the Flux installation on the cluster

```flux check```

# SYNOPSIS

**flux** **check** [_options_]

# DESCRIPTION

**flux check** validates that the prerequisites for running Flux are met on the current machine and (when connected to a cluster) that the Flux controllers are healthy and ready.

`--pre` performs a client-side check (kubectl, permissions, network, etc.) and is typically run before `flux bootstrap`.

Without `--pre` it connects to the cluster and reports on the installed Flux components.

# PARAMETERS

**--pre**
> Only perform pre-installation checks (no cluster connection required for most checks).

**--namespace** _ns_
> Namespace scope (default `flux-system`).

# SEE ALSO

flux, flux-bootstrap

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_check/)```

<!-- verified: 2026-07-09 -->
