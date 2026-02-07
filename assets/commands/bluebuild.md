# TAGLINE

Build custom immutable Linux images

# TLDR

**Build a custom image** from a recipe file

```bluebuild build [recipe.yml]```

**Build and push** to a container registry

```bluebuild build --push [recipe.yml]```

**Generate GitHub Actions workflow** for the recipe

```bluebuild generate [recipe.yml]```

**Initialize a new BlueBuild project**

```bluebuild template```

**Validate a recipe file**

```bluebuild validate [recipe.yml]```

**Build with a specific tag**

```bluebuild build --tag [my-image:latest] [recipe.yml]```

**Rebase to a BlueBuild image** (on an existing system)

```bluebuild rebase [image-name]```

# SYNOPSIS

**bluebuild** [_command_] [_options_] [_recipe_]

# PARAMETERS

**build** _recipe_
> Build a container image from the specified recipe file.

**generate** _recipe_
> Generate GitHub Actions workflow files for automated builds.

**template**
> Create a new BlueBuild project with starter files.

**validate** _recipe_
> Check recipe file for syntax errors and valid configuration.

**rebase** _image_
> Switch the current system to a different image (rpm-ostree systems).

**--push**
> Push the built image to the configured container registry.

**--tag** _name_
> Specify the image tag (default: from recipe).

**--registry** _url_
> Override the container registry URL.

**--no-cache**
> Build without using cached layers.

**--squash**
> Squash all layers into a single layer.

**-v**, **--verbose**
> Enable verbose output.

**--help**
> Display help information.

# DESCRIPTION

**BlueBuild** is a tool for creating custom immutable Linux images based on Universal Blue and Fedora Atomic. It uses YAML recipe files to declaratively define image customizations including packages, scripts, and system configurations.

The tool simplifies the process of building custom rpm-ostree images that can be deployed on Fedora Silverblue, Kinoite, or other atomic Fedora variants. Recipes can specify base images, add/remove packages, include custom scripts, and configure system settings.

BlueBuild integrates with GitHub Actions for automated CI/CD builds. The **generate** command creates workflow files that automatically build and push images when recipe changes are committed. Images are typically hosted on GitHub Container Registry (ghcr.io).

Users can switch to BlueBuild images on existing Fedora Atomic systems using rpm-ostree rebase. The project provides a library of reusable modules for common customizations like adding Flatpak repositories, configuring fonts, or setting up development tools.

# CAVEATS

Requires Podman or Docker for local builds. GitHub Actions integration requires repository write access and container registry credentials. Recipe changes may require complete image rebuilds. Images built locally may differ from CI-built images due to architecture or environment differences.

# HISTORY

**BlueBuild** emerged from the Universal Blue community in **2023** as a way to simplify custom image creation for Fedora Atomic desktops. It was inspired by the growing interest in immutable Linux distributions and the need for user-friendly customization tools. The project provides a higher-level abstraction over raw Containerfile/Dockerfile builds.

# SEE ALSO

[podman](/man/podman)(1), [rpm-ostree](/man/rpm-ostree)(1), [docker](/man/docker)(1), [buildah](/man/buildah)(1)
