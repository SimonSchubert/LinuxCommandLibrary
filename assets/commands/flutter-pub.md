# TAGLINE

Dart package dependency manager for Flutter

# TLDR

**Get dependencies**

```flutter pub get```

**Update dependencies**

```flutter pub upgrade```

**Add package**

```flutter pub add [package_name]```

**Remove package**

```flutter pub remove [package_name]```

**Run build runner**

```flutter pub run build_runner build```

# SYNOPSIS

**flutter pub** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: get, upgrade, add, remove, run, etc.

**get**
> Install dependencies from pubspec.yaml.

**upgrade**
> Update to latest compatible versions.

**add** _PACKAGE_
> Add package to dependencies.

**remove** _PACKAGE_
> Remove package from dependencies.

**run** _SCRIPT_
> Run package script.

**outdated**
> Show outdated packages.

**deps**
> Show dependency tree.

**--help**
> Display help information.

# DESCRIPTION

**flutter pub** manages Dart package dependencies for Flutter projects. It installs, updates, and resolves packages from pub.dev, the Dart package repository.

The tool reads pubspec.yaml for dependency specifications and generates pubspec.lock for reproducible builds. It handles transitive dependencies and version conflicts automatically.

flutter pub enables code reuse through thousands of community packages for networking, state management, UI components, and more.

# CONFIGURATION

**pubspec.yaml**
> Project configuration file defining dependencies, dev dependencies, and package metadata.

**pubspec.lock**
> Generated lock file ensuring reproducible dependency versions across environments.

# CAVEATS

Version conflicts may require manual resolution. Some packages are platform-specific. Large dependency trees slow first build.

# HISTORY

flutter pub wraps the **Dart pub** tool for Flutter development. The pub.dev repository serves both Dart and Flutter packages, managed through the shared package specification format.

# SEE ALSO

[flutter](/man/flutter)(1), [dart](/man/dart)(1)
