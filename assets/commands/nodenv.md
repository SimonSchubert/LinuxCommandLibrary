# TLDR

**List available Node versions**

```nodenv install --list```

**Install Node version**

```nodenv install [18.17.0]```

**Set global Node version**

```nodenv global [18.17.0]```

**Set local Node version** (current directory)

```nodenv local [16.20.0]```

**Show current Node version**

```nodenv version```

**List installed versions**

```nodenv versions```

**Uninstall Node version**

```nodenv uninstall [16.20.0]```

**Rehash shims** (after installing packages)

```nodenv rehash```

# SYNOPSIS

**nodenv** _command_ [_options_] [_arguments_]

# PARAMETERS

**install** _VERSION_
> Install Node version.

**uninstall** _VERSION_
> Uninstall Node version.

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

**which** _COMMAND_
> Show path for command.

**whence** _COMMAND_
> List versions with command.

**root**
> Show nodenv root directory.

**init**
> Shell initialization.

**install --list**
> List available versions.

**install --list-all**
> List all versions including old.

# DESCRIPTION

**nodenv** manages multiple Node.js versions per-project. It uses shims to intercept Node commands and route them to the correct version.

Version selection uses a hierarchy: NODENV_VERSION environment variable, .node-version file in current/parent directories, global version setting. This enables project-specific versions without manual switching.

Installation requires the node-build plugin, included by default in most installation methods. It compiles Node.js from source or downloads binaries.

Shims are lightweight executables in ~/.nodenv/shims/ that determine the correct Node version before executing. After installing npm packages with executables, run `nodenv rehash` to create shims for them.

The .node-version file in a project root specifies the Node version. When you enter the directory, nodenv automatically uses that version. Version managers like package.json's "engines" can complement this.

# CAVEATS

Requires shell initialization in profile. New global packages need rehash. Building from source takes time. Not compatible with nvm. Some systems need build dependencies. Shims add slight overhead.

# HISTORY

**nodenv** was created by **Will Farrington** and **Jason Karns** around **2014**, modeled after rbenv for Ruby. It brought rbenv's proven version management model to Node.js. The plugin architecture enables customization while keeping the core simple.

# SEE ALSO

[nvm](/man/nvm)(1), [fnm](/man/fnm)(1), [volta](/man/volta)(1), [asdf](/man/asdf)(1), [rbenv](/man/rbenv)(1)
