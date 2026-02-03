# TLDR

**Log in to Docker Hub**

```docker login```

**Log in to specific registry**

```docker login [registry.example.com]```

**Log in with username**

```docker login -u [username]```

**Log in non-interactively**

```echo [password] | docker login -u [username] --password-stdin```

# SYNOPSIS

**docker** **login** [_options_] [_server_]

# PARAMETERS

**-u**, **--username** _string_
> Username.

**-p**, **--password** _string_
> Password (insecure, prefer --password-stdin).

**--password-stdin**
> Take password from stdin.

# DESCRIPTION

**docker login** authenticates with a Docker registry. Credentials are stored in ~/.docker/config.json. Defaults to Docker Hub if no server specified.

# CAVEATS

Using -p exposes password in shell history. Always prefer --password-stdin for scripted logins.

# SEE ALSO

[docker-logout](/man/docker-logout)(1), [docker-pull](/man/docker-pull)(1)

