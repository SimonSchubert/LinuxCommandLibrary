# TAGLINE

Flutter version manager

# TLDR

**Install Flutter version**

```fvm install [3.0.0]```

**Use version in** project

```fvm use [3.0.0]```

**List installed versions**

```fvm list```

**Set global default**

```fvm global [3.0.0]```

**Show available releases**

```fvm releases```

# SYNOPSIS

**fvm** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: install, use, list, global, remove, etc.

**install** _VERSION_
> Install Flutter version.

**use** _VERSION_
> Set project Flutter version.

**global** _VERSION_
> Set global default.

**list**
> List installed versions.

**releases**
> Show available versions.

**remove** _VERSION_
> Uninstall version.

**--help**
> Display help information.

# CONFIGURATION

**.fvm/fvm_config.json**
> Project-level Flutter version pinning.

**~/.fvm/versions**
> Directory containing cached Flutter SDK versions.

# DESCRIPTION

**fvm** (Flutter Version Management) manages multiple Flutter SDK versions. It enables per-project version pinning, avoiding conflicts between projects requiring different Flutter versions.

The tool downloads and caches Flutter versions, creating symlinks for fast switching. Project settings are stored in .fvm directory. IDE integration provides seamless development.

fvm is essential for maintaining multiple Flutter projects with different SDK requirements.

# CAVEATS

Requires significant disk space per version. IDE configuration needed for integration. Some versions may be deprecated.

# HISTORY

fvm was created to solve Flutter version management challenges faced by developers working on multiple projects or teams with different SDK requirements.

# SEE ALSO

[flutter](/man/flutter)(1), [dart](/man/dart)(1)
