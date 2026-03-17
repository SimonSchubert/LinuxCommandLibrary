# TAGLINE

List tags in a container image repository

# TLDR

**List all tags in a repository**

```crane ls [registry/repository]```

**List tags with full image references**

```crane ls --full-ref [registry/repository]```

**List tags excluding digest-based tags**

```crane ls -O [registry/repository]```

**List tags from an insecure (HTTP) registry**

```crane ls --insecure [registry/repository]```

# SYNOPSIS

**crane** **ls** [_options_] _REPOSITORY_

# PARAMETERS

**--full-ref**
> Print full image references instead of just tag names.

**-O**, **--omit-digest-tags**
> Omit digest-based tags (e.g., sha256-...) from output.

**--platform** _PLATFORM_
> Specify platform in os/arch[/variant] format (e.g., linux/amd64). Default: all.

**--insecure**
> Allow fetching image references without TLS (plain HTTP).

**-v**, **--verbose**
> Enable debug logging.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**crane ls** lists all tags in a container image repository by querying the registry's tag list API. It is part of **crane**, a tool for interacting with remote container registries from Google's go-containerregistry project.

The command is useful for inspecting available image versions without pulling any images locally.

# CAVEATS

Requires authentication for private registries (configured via **crane auth** or Docker config). The **--insecure** flag forces HTTP instead of HTTPS, which should only be used for local or trusted registries.

# SEE ALSO

[crane](/man/crane)(1), [crane-pull](/man/crane-pull)(1), [crane-digest](/man/crane-digest)(1), [crane-catalog](/man/crane-catalog)(1), [crane-tag](/man/crane-tag)(1)
