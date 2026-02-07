# TAGLINE

manage container registry authentication

# TLDR

**Login to a registry**

```crane auth login [registry] -u [username] -p [password]```

**Get authentication token**

```crane auth token [image]```

**Logout from registry**

```crane auth logout [registry]```

# SYNOPSIS

**crane** **auth** _subcommand_ [_options_]

# SUBCOMMANDS

**login**
> Authenticate with a registry.

**logout**
> Remove credentials for a registry.

**token**
> Get authentication token for an image.

**get**
> Get credentials for a registry.

# PARAMETERS

**-u**, **--username** _user_
> Username for authentication.

**-p**, **--password** _pass_
> Password for authentication.

**--password-stdin**
> Read password from stdin.

# DESCRIPTION

**crane auth** manages authentication for container registries. It stores credentials and retrieves authentication tokens for registry operations.

# SEE ALSO

[crane](/man/crane)(1), [docker-login](/man/docker-login)(1)
