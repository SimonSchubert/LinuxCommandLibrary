# TAGLINE

Build custom immutable Linux images

# TLDR

**Build a custom image** from a recipe file

```bluebuild build [recipe.yml]```

**Build and push** to a container registry

```bluebuild build --push [recipe.yml]```

**Generate a Containerfile** from the recipe

```bluebuild generate [recipe.yml]```

**Start a new BlueBuild project** in a new directory

```bluebuild new [project-name]```

**Initialize a BlueBuild project** in the current empty directory

```bluebuild init```

**Validate a recipe file** for errors

```bluebuild validate [recipe.yml]```

**Build locally and rebase** the running system onto the image

```bluebuild switch [recipe.yml]```

**Upgrade the running system** to the latest BlueBuild image

```bluebuild upgrade```

# SYNOPSIS

**bluebuild** [_command_] [_options_] [_recipe_]

# PARAMETERS

**build** _recipe_
> Template out the files and build the image with Docker, Podman, or Buildah.

**generate** _recipe_
> Generate the Containerfile used to build the recipe and print or write it out.

**new** _name_
> Create a new BlueBuild project in a new directory, based on the official template.

**init**
> Set up a new BlueBuild project in the current empty directory.

**validate** _recipe_
> Check a recipe and its modules for errors before building.

**switch** _recipe_
> Build the image locally, export it as an oci-archive tarball, and rebase or upgrade the running system onto it. Runs as a normal user, asking for sudo only when needed.

**rebase** _recipe_
> Build locally and rebase the current rpm-ostree system onto the resulting image.

**upgrade** _recipe_
> Build locally and upgrade the current rpm-ostree system to the resulting image.

**generate-iso** _recipe_
> Generate an offline ISO installation image from the recipe.

**completions** _shell_
> Print shell completions for bash, zsh, fish, and others to stdout.

**upgrade** (no recipe)
> Upgrade the bluebuild CLI itself to the latest version.

**--push**
> Push the built image to the configured container registry (build command).

**--registry** _url_
> Override the container registry to push to (build command).

**--rechunk**
> Rechunk the image layers for more efficient updates (build command).

**-v**, **--verbose**
> Enable verbose output.

**--help**
> Display help information.

# DESCRIPTION

**BlueBuild** is a tool for creating custom immutable Linux images based on Universal Blue and Fedora Atomic. It uses YAML recipe files to declaratively define image customizations including packages, scripts, and system configurations.

The tool simplifies the process of building custom rpm-ostree images that can be deployed on Fedora Silverblue, Kinoite, or other atomic Fedora variants. Recipes can specify base images, add/remove packages, include custom scripts, and configure system settings.

BlueBuild integrates with GitHub Actions for automated CI/CD builds via a reusable GitHub Action; the **generate** command produces the Containerfile that the build uses. Images are typically hosted on GitHub Container Registry (ghcr.io).

Users can switch their existing Fedora Atomic system onto a locally built image with **bluebuild switch**, or onto a published image with **rebase** and **upgrade**. The project provides a library of reusable modules for common customizations like adding Flatpak repositories, configuring fonts, or setting up development tools.

# CAVEATS

Requires Podman or Docker for local builds. GitHub Actions integration requires repository write access and container registry credentials. Recipe changes may require complete image rebuilds. Images built locally may differ from CI-built images due to architecture or environment differences.

# HISTORY

**BlueBuild** emerged from the Universal Blue community in **2023** as a way to simplify custom image creation for Fedora Atomic desktops. It was inspired by the growing interest in immutable Linux distributions and the need for user-friendly customization tools. The project provides a higher-level abstraction over raw Containerfile/Dockerfile builds.

# SEE ALSO

[podman](/man/podman)(1), [rpm-ostree](/man/rpm-ostree)(1), [docker](/man/docker)(1), [buildah](/man/buildah)(1)

# RESOURCES

```[Source code](https://github.com/blue-build/cli)```

```[Homepage](https://blue-build.org/)```

```[Documentation](https://blue-build.org/how-to/setup/)```

<!-- verified: 2026-06-19 -->
