# TLDR

**Login to Docker Hub**

```podman login docker.io```

**Login to specific registry**

```podman login [registry.example.com]```

**Login with credentials**

```podman login -u [username] -p [password] [registry]```

**Login with stdin password**

```echo [password] | podman login -u [user] --password-stdin [registry]```

# SYNOPSIS

**podman** **login** [_options_] _registry_

# PARAMETERS

**-u**, **--username** _name_
> Registry username.

**-p**, **--password** _pass_
> Registry password.

**--password-stdin**
> Read password from stdin.

**--tls-verify** _bool_
> Verify TLS certificates.

**--authfile** _file_
> Path to auth file.

# DESCRIPTION

**podman login** authenticates with container registries. Stores credentials in auth file for subsequent pulls and pushes. Supports Docker Hub, Quay.io, and private registries.

# SEE ALSO

[podman](/man/podman)(1), [podman-logout](/man/podman-logout)(1)

