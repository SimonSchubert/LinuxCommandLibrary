# TAGLINE

Manage multiple Python versions

# TLDR

**List available Python versions**

```pyenv install --list```

**Install a Python version**

```pyenv install [3.12.0]```

**List installed versions**

```pyenv versions```

**Set global Python version**

```pyenv global [3.12.0]```

**Set local Python version** (directory-specific)

```pyenv local [3.11.0]```

**Set shell-specific version**

```pyenv shell [3.10.0]```

**Unset shell version**

```pyenv shell --unset```

**Show current active version**

```pyenv version```

**Uninstall a version**

```pyenv uninstall [3.9.0]```

**Rehash shims** (after installing packages with executables)

```pyenv rehash```

# SYNOPSIS

**pyenv** _command_ [_args_]

# DESCRIPTION

**pyenv** manages multiple Python installations on a single system. It allows installing different Python versions and switching between them per-project, per-shell, or globally.

pyenv works by inserting a directory of shims into PATH. These shims intercept Python commands and redirect them to the appropriate Python version based on configuration hierarchy: shell > local > global.

The tool is essential for developers who need to test code against multiple Python versions or work on projects requiring different Python versions.

# PARAMETERS

**install** _version_
> Install a Python version.

**uninstall** _version_
> Remove a Python version.

**versions**
> List installed versions.

**version**
> Show current active version.

**global** _version_
> Set default version.

**local** _version_
> Set version for current directory.

**shell** _version_
> Set version for current shell.

**rehash**
> Rebuild shim executables.

**which** _command_
> Show full path of command.

**init**
> Configure shell for pyenv.

**root**
> Show pyenv installation root.

# CONFIGURATION

**~/.pyenv/**
> Root directory containing installed Python versions, shims, and pyenv plugins.

**.python-version**
> Per-directory file specifying the Python version to use, created by `pyenv local`.

**~/.pyenv/version**
> Global default Python version file, set by `pyenv global`.

**PYENV_ROOT**
> Environment variable overriding the default pyenv installation directory.

# CAVEATS

Requires shell initialization in profile (~/.bashrc or ~/.zshrc). Installing Python versions requires build dependencies. pyenv-virtualenv plugin needed for virtualenv integration. Some packages may need version-specific compilation.

# HISTORY

**pyenv** was created by **Yuu Yamashita** (yyuu) in **2012**, inspired by rbenv for Ruby. It addressed the common problem of managing multiple Python versions on development machines. The project has grown to include plugins for virtualenv management and became a standard tool in the Python ecosystem.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [virtualenv](/man/virtualenv)(1), [rbenv](/man/rbenv)(1)
