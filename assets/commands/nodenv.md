# TAGLINE

Manage your app's Node.js environment

# TLDR

**List all available Node.js versions to install**

```nodenv install --list```

**Install a specific Node.js version**

```nodenv install [18.17.0]```

**Set the global default Node.js version**

```nodenv global [18.17.0]```

**Set a local application-specific Node.js version**

```nodenv local [16.20.0]```

**Show the currently active Node.js version**

```nodenv version```

**List all installed Node.js versions**

```nodenv versions```

**Uninstall a specific Node.js version**

```nodenv uninstall [16.20.0]```

**Rehash shim executables after installing npm packages**

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

**nodenv** manages multiple Node.js versions per-project. After injecting itself into your PATH, any invocation of `node`, `npm`, `npx`, or other Node.js executables first activates nodenv, which uses shims to intercept commands and route them to the correct version.

Version selection uses a hierarchy: NODENV_VERSION environment variable, `.node-version` file in current/parent directories, then the global version setting. This enables project-specific versions without manual switching.

The `nodenv install` command is provided by the **node-build** plugin, included by default in most installation methods (e.g., Homebrew). It downloads prebuilt binaries or compiles Node.js from source.

Shims are lightweight executables in `~/.nodenv/shims/` that determine the correct Node version before executing. After installing npm packages with executables, run `nodenv rehash` to create shims for them.

The `.node-version` file in a project root specifies the Node version. When you enter the directory, nodenv automatically uses that version.

# CAVEATS

Requires shell initialization in profile (`eval "$(nodenv init -)"` in .bashrc/.zshrc). New global packages need `nodenv rehash`. Building from source takes time and requires build dependencies. Not compatible with nvm. Shims add slight overhead to command startup.

# HISTORY

**nodenv** was created by **Will Farrington** and **Jason Karns** around **2014**, modeled after rbenv for Ruby. It brought rbenv's proven version management model to Node.js. The plugin architecture enables customization while keeping the core simple.

# SEE ALSO

[nvm](/man/nvm)(1), [fnm](/man/fnm)(1), [volta](/man/volta)(1), [asdf](/man/asdf)(1), [rbenv](/man/rbenv)(1)
