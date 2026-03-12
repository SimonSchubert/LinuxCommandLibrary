# TAGLINE

Manage OCI/Docker registry authentication

# TLDR

**List** all configured OCI registry credentials

```apptainer registry list```

**Login** to a Docker registry

```apptainer registry login --username [user] docker://[docker.io]```

**Login** to an OCI registry with **password from stdin**

```apptainer registry login --username [user] --password-stdin oras://[registry.example.com]```

**Logout** from a registry

```apptainer registry logout docker://[docker.io]```

**Login** using a custom **auth file**

```apptainer registry login --authfile [path/to/authfile.json] --username [user] docker://[registry.example.com]```

# SYNOPSIS

**apptainer registry** [_subcommand_] [_options_]

# PARAMETERS

**-c, --config** _string_
> Path to the registry configuration file (default ~/.apptainer/remote.yaml)

**-h, --help**
> Display help for the registry command

# DESCRIPTION

**apptainer registry** manages authentication to standalone OCI/Docker registries accessed via **docker://** or **oras://** protocols. It provides subcommands for logging in, logging out, and listing configured credentials for container registries.

This command handles credentials separately from Apptainer's remote endpoints, allowing direct authentication against any OCI-compatible registry such as Docker Hub, GitHub Container Registry, or private registries.

# SUBCOMMANDS

**apptainer registry list**
> Display all configured OCI registry credentials

**apptainer registry login**
> Authenticate to an OCI/Docker registry

**apptainer registry logout**
> Remove authentication from an OCI/Docker registry

# CAVEATS

Registry credentials are stored in the Apptainer configuration file at **~/.apptainer/remote.yaml** by default. This file should be kept secure as it contains authentication tokens. Credentials configured via **apptainer registry** are separate from those managed by **apptainer remote**, which handles Sylabs Cloud and library endpoints.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-push](/man/apptainer-push)(1), [apptainer-search](/man/apptainer-search)(1)
