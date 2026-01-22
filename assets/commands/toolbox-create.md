# TLDR

Create a Toolbx container for a **specific distribution**

```toolbox create -d [distribution]```

Create a container for a specific **release** of the current distribution

```toolbox create -r [release]```

Create a container with a **custom image**

```toolbox create -i [name]```

Create from a **custom Fedora image**

```toolbox create -i quay.io/fedora/fedora:[tag]```

Create using default image for a **specific Fedora release**

```toolbox create -d fedora -r f[version]```

# SYNOPSIS

**toolbox create** [_options_] [_container_]

# PARAMETERS

**-d**, **--distro** _distro_
> Create container for specified distribution

**-r**, **--release** _release_
> Create container for specified release version

**-i**, **--image** _image_
> Use specified container image

**-c**, **--container** _name_
> Assign custom name to the container

# DESCRIPTION

**toolbox create** creates a new Toolbx container based on an OCI image. By default, it creates a container matching the host system's distribution and release. Custom images can be specified for development environments or cross-distribution work.

The container is configured for seamless integration with the host, including home directory access, user permissions, and graphical application support.

# CAVEATS

Requires podman to be installed. The default image is pulled from the distribution's registry if not cached locally. Container names must be unique within toolbox.

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-enter](/man/toolbox-enter)(1), [toolbox-list](/man/toolbox-list)(1)
