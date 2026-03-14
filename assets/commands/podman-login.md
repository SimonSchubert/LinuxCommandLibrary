# TAGLINE

Authenticate with container registries

# TLDR

**Login to Docker Hub**

```podman login docker.io```

**Login to specific registry**

```podman login [registry.example.com]```

**Login with credentials**

```podman login -u [username] -p [password] [registry]```

**Login with stdin password**

```echo [password] | podman login -u [user] --password-stdin [registry]```

**Check which user is logged in** to a registry

```podman login --get-login [registry]```

**Login using a TLS client certificate**

```podman login --cert-dir [/path/to/certs] [registry]```

# SYNOPSIS

**podman** **login** [_options_] _registry_

# PARAMETERS

**-u**, **--username** _name_
> Registry username.

**-p**, **--password** _pass_
> Registry password.

**--password-stdin**
> Read password from stdin.

**--tls-verify**
> Require HTTPS and verify TLS certificates when contacting registries (default: **true**).

**--authfile** _file_
> Path to the authentication file (default: `${XDG_RUNTIME_DIR}/containers/auth.json`).

**--cert-dir** _path_
> Use TLS certificates at _path_ (*.crt, *.cert, *.key) to connect to the registry.

**--compat-auth-file** _path_
> Write credentials to _path_ in Docker-compatible format.

**--get-login**
> Return the logged-in user for the registry. Returns an error if no login is found.

**--secret** _name_
> Read the password from a podman secret.

**-v**, **--verbose**
> Print detailed information about the credential store.

# DESCRIPTION

**podman login** authenticates with container registries. Credentials are stored in an auth file (default: `${XDG_RUNTIME_DIR}/containers/auth.json`) for subsequent pulls and pushes. If no registry is specified, the first registry under `[registries.search]` from `registries.conf` is used.

Supports Docker Hub, Quay.io, GitHub Container Registry, and private registries.

# SEE ALSO

[podman](/man/podman)(1), [podman-pull](/man/podman-pull)(1), [docker-login](/man/docker-login)(1)

