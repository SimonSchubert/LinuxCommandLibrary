# TLDR

**List installed PHP versions**

```phpenv versions```

**Show current version**

```phpenv version```

**Set global PHP version**

```phpenv global [8.2.0]```

**Set local PHP version**

```phpenv local [8.1.0]```

**Set shell-specific version**

```phpenv shell [8.0.0]```

**Install PHP version**

```phpenv install [8.2.0]```

**List available versions**

```phpenv install --list```

**Rehash shims**

```phpenv rehash```

# SYNOPSIS

**phpenv** [_install_] [_global_] [_local_] [_shell_] [_versions_] [_options_] [_version_]

# PARAMETERS

**install** _VERSION_
> Install PHP version.

**install --list**
> List available versions.

**versions**
> List installed versions.

**version**
> Show current version.

**global** [_VERSION_]
> Set/show global version.

**local** [_VERSION_]
> Set/show local version.

**shell** [_VERSION_]
> Set shell-specific version.

**rehash**
> Rebuild shim executables.

**which** _CMD_
> Show path for command.

**root**
> Show phpenv root.

# DESCRIPTION

**phpenv** manages multiple PHP versions per-project. It uses shims to intercept PHP commands and route them to the correct version.

Version selection follows a hierarchy: PHPENV_VERSION environment variable, .php-version file in current/parent directories, global version setting.

The local command creates a .php-version file in the current directory. When entering that directory, phpenv automatically uses the specified version.

Installation requires php-build plugin, which compiles PHP from source. Build dependencies must be installed first.

After installing PHP extensions or PEAR packages, run rehash to create shims for new executables.

The architecture mirrors rbenv for Ruby, providing familiar version management for polyglot developers.

# CAVEATS

Compiling PHP requires build dependencies. Build times can be significant. Shell initialization required. Some extensions may need manual configuration.

# HISTORY

**phpenv** was modeled after **rbenv** to provide similar version management for PHP. It uses the same shim-based approach and plugin architecture, making PHP version management consistent with other language environments.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1), [rbenv](/man/rbenv)(1), [php-build](/man/php-build)(1)
