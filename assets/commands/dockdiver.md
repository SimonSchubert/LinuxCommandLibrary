# TAGLINE

explore and extract Docker registry contents

# TLDR

**List all repositories** in a registry

```dockdiver -url [registry_host] -list```

**Dump a specific repository**

```dockdiver -url [registry_host] -dump [repository]```

**Dump every repository** into a directory

```dockdiver -url [registry_host] -dump-all -dir [output_dir]```

**Authenticate with basic** credentials

```dockdiver -url [registry_host] -username [user] -password [pass] -list```

**Use a bearer token** and skip TLS verification

```dockdiver -url [registry_host] -bearer [token] -insecure -dump-all```

# SYNOPSIS

**dockdiver** [_options_]

# PARAMETERS

**-url** _STRING_
> Base URL or hostname of the Docker registry (required).

**-port** _INT_
> Registry port used when not specified in the URL. Default 5000.

**-list**
> List all repositories in the registry.

**-dump** _REPOSITORY_
> Download a single repository (manifest, config blob, and layer tarballs).

**-dump-all**
> Download all repositories found in the registry.

**-dir** _DIRECTORY_
> Output directory for dumped files. Default docker_dump.

**-username** _STRING_
> Username for HTTP Basic authentication.

**-password** _STRING_
> Password for HTTP Basic authentication.

**-bearer** _STRING_
> Bearer token for the Authorization header.

**-headers** _JSON_
> Custom request headers as JSON, e.g. '{"X-Custom": "Value"}'.

**-insecure**
> Skip TLS certificate verification.

**-rate** _INT_
> Requests per second. Default 3.

**-timeout** _DURATION_
> HTTP request timeout, e.g. 10s or 500ms. Default 30s.

**-proxy** _URL_
> Proxy URL (http, https, or socks5).

**-proxy-username** _STRING_
> Username for SOCKS5 proxy authentication.

**-proxy-password** _STRING_
> Password for SOCKS5 proxy authentication.

# DESCRIPTION

**dockdiver** is a Go utility that enumerates and extracts the contents of a Docker registry exposed over the Registry HTTP API V2. It can list repositories, dump a single repository, or dump every repository, retrieving manifests, configuration blobs, and layer tarballs while verifying each blob with its SHA256 digest.

It is aimed at penetration testing, bug bounty, and CTF scenarios where a registry (often a self-hosted one on port 5000) is reachable and may expose images that contain source code, configuration, or credentials. Authentication via Basic credentials or a bearer token, custom headers, proxy support, and a configurable request rate make it suitable for working against access-controlled or rate-limited registries.

This tool targets the registry itself rather than the public Docker Hub web interface, and it downloads raw image data for offline inspection rather than scanning layers for secrets on its own.

# CAVEATS

Only registries reachable over the HTTP API V2 are supported. Use against registries you are authorized to access. Dumping all repositories can transfer large amounts of data; the default rate of 3 requests per second limits load and helps avoid tripping rate limits.

# HISTORY

dockdiver is an open-source Go tool published on GitHub by MachiavelliII. It ships with a registry lab environment in its lab directory for safe testing.

# SEE ALSO

[dive](/man/dive)(1), [trivy](/man/trivy)(1), [grype](/man/grype)(1), [docker-pull](/man/docker-pull)(1)
