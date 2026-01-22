# TLDR

**Build** a Flatpak and export to a new repository

```flatpak-builder [path/to/build_directory] [path/to/manifest.json]```

Build a Flatpak and export to a **specified repository**

```flatpak-builder --repo [repository_name] [path/to/build_directory] [path/to/manifest.json]```

Build a Flatpak and **install it locally**

```flatpak-builder --install [path/to/build_directory] [path/to/manifest.json]```

Build and **sign** a Flatpak with GPG

```flatpak-builder --gpg-sign [key_id] --repo [repository_name] [path/to/build_directory] [path/to/manifest.json]```

**Run a shell** inside the application sandbox without installing

```flatpak-builder --run [path/to/build_directory] [path/to/manifest.json] sh```

Show **dependencies** required by the manifest

```flatpak-builder --show-deps [path/to/manifest.json]```

Build with **ccache** enabled for faster rebuilds

```flatpak-builder --ccache [path/to/build_directory] [path/to/manifest.json]```

# SYNOPSIS

**flatpak-builder** [_options_] _directory_ _manifest_

**flatpak-builder** **--run** [_options_] _directory_ _manifest_ _command_

**flatpak-builder** **--show-deps** [_options_] _manifest_

# PARAMETERS

**--repo** _name_
> Export the build to the specified repository

**--install**
> Install the built application locally for the current user

**--gpg-sign** _key_id_
> Sign the commit with the specified GPG key

**--arch** _arch_
> Specify target architecture

**--ccache**
> Enable compiler caching for faster rebuilds

**--disable-cache**
> Disable build cache, forcing full rebuild

**--force-clean**
> Erase previous build directory contents

**--run** _command_
> Run a command inside the build sandbox

**--build-shell** _module_
> Open interactive shell at specified module for debugging

**--stop-at** _module_
> Stop build after completing specified module

**--show-deps**
> Display dependencies required by the manifest

**--show-manifest**
> Display the processed manifest

# DESCRIPTION

**Flatpak-builder** is a build automation tool that constructs Flatpak applications from manifest files. It wraps the core **flatpak build** command, providing a streamlined workflow for compiling applications and their dependencies within the Flatpak sandbox.

The tool processes JSON or YAML manifests that define application metadata, runtime requirements, and module build instructions. It follows the standard **./configure && make && make install** pattern automatically and caches intermediate results for efficient incremental builds.

Build stages include: downloading sources, initializing the application directory, building and installing each module, cleanup, and finalization. Results are cached per-module, allowing quick rebuilds when only specific components change.

# CAVEATS

Requires a valid Flatpak runtime and SDK to be installed. Large applications with many dependencies can take significant time and disk space on first build. The **--run** option provides a sandboxed environment that may not have full system access. Manifests must correctly specify all dependencies or builds will fail.

# HISTORY

Flatpak-builder was developed alongside **Flatpak** by Alexander Larsson at Red Hat, with initial releases around **2015-2016**. It emerged from the xdg-app project and became the standard tool for building Flatpak applications from source, enabling reproducible builds across different Linux distributions.

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-build](/man/flatpak-build)(1), [flatpak-install](/man/flatpak-install)(1)
