# TAGLINE

list repositories in container registries

# TLDR

**List repositories** in a registry

```crane catalog [registry]```

# SYNOPSIS

**crane** **catalog** [_options_] _registry_

# DESCRIPTION

**crane catalog** lists all repositories in a container registry. This requires the registry to support the catalog API.

Note that many registries limit or disable the catalog endpoint for security reasons.

# CAVEATS

Not all registries support the catalog API. Results may be paginated for large registries.

# SEE ALSO

[crane](/man/crane)(1), [crane-ls](/man/crane-ls)(1)
