# TAGLINE

interact with container registries without Docker

# TLDR

**Pull image**

```crane pull [registry/image:tag] [output.tar]```

**Push image**

```crane push [image.tar] [registry/image:tag]```

**Copy image between registries**

```crane copy [src/image:tag] [dst/image:tag]```

**List tags for image**

```crane ls [registry/image]```

**Get image digest**

```crane digest [registry/image:tag]```

**Get image manifest**

```crane manifest [registry/image:tag]```

**Get image configuration**

```crane config [registry/image:tag]```

**Authenticate to registry**

```crane auth login [registry] -u [user] -p [password]```

# SYNOPSIS

**crane** _command_ [_options_] [_arguments_]

# DESCRIPTION

**crane** is a tool for interacting with container registries. It can pull, push, copy, and inspect container images without requiring a container runtime like Docker. Part of the go-containerregistry project.

# COMMANDS

**pull**
> Download image as tarball

**push**
> Upload tarball as image

**copy**
> Copy image between registries

**ls**
> List tags for repository

**digest**
> Get image digest

**manifest**
> Get image manifest

**config**
> Get image config

**catalog**
> List repositories in registry

**auth**
> Manage registry authentication

**append**
> Append layers to image

**flatten**
> Flatten image layers

**mutate**
> Modify image metadata

**validate**
> Validate image

**export**
> Export filesystem from image

# PARAMETERS

**--platform** _os/arch_
> Target platform (e.g., linux/amd64)

**--insecure**
> Allow insecure registry connections

**-v**, **--verbose**
> Verbose output

# CONFIGURATION

**~/.docker/config.json**
> Docker configuration file storing registry credentials used by crane for authentication.

# ENVIRONMENT

**DOCKER_CONFIG**
> Path to Docker config for credentials

# CAVEATS

Does not require Docker daemon. Uses OCI registry API directly. Credentials read from Docker config by default.

# SEE ALSO

[docker](/man/docker)(1), [skopeo](/man/skopeo)(1), [cosign](/man/cosign)(1)
