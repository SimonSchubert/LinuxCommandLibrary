# TAGLINE

D language package manager and build tool

# TLDR

**Build project**

```dub build```

**Run project**

```dub run```

**Initialize new project**

```dub init [name]```

**Add dependency**

```dub add [package]```

**Update dependencies**

```dub upgrade```

**Run tests**

```dub test```

**Build documentation**

```dub build --build=docs```

**Fetch dependencies only**

```dub fetch [package]```

# SYNOPSIS

**dub** _command_ [_options_]

# SUBCOMMANDS

**build**
> Build project.

**run**
> Build and run.

**test**
> Run unit tests.

**init**
> Initialize new project.

**add**
> Add dependency.

**remove**
> Remove dependency.

**upgrade**
> Upgrade dependencies.

**fetch**
> Fetch package.

**clean**
> Clean build artifacts.

**describe**
> Show project description.

# CONFIGURATION

**dub.json** or **dub.sdl**
> Project configuration file defining dependencies, build settings, and metadata.

**~/.dub/settings.json**
> User-level DUB settings including custom registry URLs and default paths.

# DESCRIPTION

**dub** is the official package manager and build tool for the D programming language. It handles dependency management, project compilation, testing, and distribution, providing a complete project lifecycle management solution for D developers.

The tool uses a JSON or SDL (Simple Declarative Language) configuration file (dub.json or dub.sdl) to describe project structure, dependencies, build configurations, and metadata. Dependencies are automatically fetched from the DUB registry (code.dlang.org) and cached locally.

dub supports multiple build configurations (debug, release, unittest), allowing developers to define different compiler flags and dependencies for various scenarios. It can generate project files for IDEs and integrates with D compilers (dmd, ldc, gdc) automatically.

The package ecosystem revolves around semantic versioning, with dub resolving dependency trees and selecting compatible versions. Projects can specify exact versions, version ranges, or branch references for dependencies. The upgrade command updates dependencies while respecting version constraints.

# SEE ALSO

[dmd](/man/dmd)(1), [ldc](/man/ldc)(1)

