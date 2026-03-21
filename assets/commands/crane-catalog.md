# TAGLINE

list repositories in container registries

# TLDR

**List repositories** in a registry

```crane catalog [registry]```

**List repositories** with full image references

```crane catalog --full-ref [registry]```

**List repositories** using platform-specific settings

```crane catalog --platform [linux/amd64] [registry]```

# SYNOPSIS

**crane** **catalog** [_options_] _registry_

# PARAMETERS

**--full-ref**
> Print the full image reference for each repository.

**--platform** _platform_
> Specifies the platform in the form os/arch (e.g., linux/amd64).

**--insecure**
> Allow image references to be fetched without TLS.

# DESCRIPTION

**crane catalog** lists all repositories in a container registry. This requires the registry to support the catalog API (the `_catalog` endpoint defined in the OCI Distribution Spec).

Note that many registries limit or disable the catalog endpoint for security reasons.

# CAVEATS

Not all registries support the catalog API. Results may be paginated for large registries. Major cloud registries (Docker Hub, GCR, ECR) often restrict or disable the catalog endpoint entirely.

# SEE ALSO

[crane](/man/crane)(1), [crane-ls](/man/crane-ls)(1), [crane-copy](/man/crane-copy)(1)
