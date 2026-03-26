# TAGLINE

authenticate with Docker registries

# TLDR

**Log in to Docker Hub** using device code flow

```docker login```

**Log in to Docker Hub** with a username (prompts for password)

```docker login -u [username]```

**Log in to a specific** registry

```docker login [registry.example.com]```

**Log in non-interactively** using stdin for the password

```echo [token] | docker login -u [username] --password-stdin```

**Log in to GitHub** Container Registry

```echo [PAT] | docker login ghcr.io -u [username] --password-stdin```

# SYNOPSIS

**docker** **login** [_options_] [_server_]

# PARAMETERS

**-u**, **--username** _string_
> Username.

**-p**, **--password** _string_
> Password or Personal Access Token (insecure, prefer --password-stdin).

**--password-stdin**
> Take password from stdin.

# DESCRIPTION

**docker login** authenticates with a Docker registry. When no server is specified, it authenticates to Docker Hub using a device code flow by default, unless --username is provided. Credentials are stored in ~/.docker/config.json or in an external credential store (such as the OS native keychain) when configured. Authentication is required to push images and access private repositories.

# CONFIGURATION

**~/.docker/config.json**
> Stores registry credentials and authentication tokens. Uses credential helpers for secure storage when available.

# CAVEATS

Using -p exposes the password in shell history and log files. Always prefer --password-stdin for scripted logins.

# SEE ALSO

[docker-pull](/man/docker-pull)(1), [docker-build](/man/docker-build)(1)

