# TLDR

**Install application in isolated environment**

```pipx install [httpie]```

**Run application without installing**

```pipx run [black] [file.py]```

**List installed applications**

```pipx list```

**Upgrade an application**

```pipx upgrade [youtube-dl]```

**Upgrade all applications**

```pipx upgrade-all```

**Uninstall application**

```pipx uninstall [ansible]```

**Inject additional package into app environment**

```pipx inject [ipython] [matplotlib]```

**Reinstall all applications**

```pipx reinstall-all```

# SYNOPSIS

**pipx** _command_ [_options_] [_package_]

# PARAMETERS

**install** _PACKAGE_
> Install package in isolated environment.

**run** _PACKAGE_ [_args_]
> Run app in temporary environment.

**uninstall** _PACKAGE_
> Uninstall package.

**upgrade** _PACKAGE_
> Upgrade package.

**upgrade-all**
> Upgrade all installed packages.

**list**
> List installed applications.

**inject** _APP_ _PACKAGES_
> Add packages to app's environment.

**uninject** _APP_ _PACKAGES_
> Remove injected packages.

**reinstall** _PACKAGE_
> Reinstall package.

**reinstall-all**
> Reinstall all packages.

**ensurepath**
> Add pipx directories to PATH.

**--include-deps**
> Include dependencies' executables.

**--python** _PYTHON_
> Python interpreter to use.

**--system-site-packages**
> Include system packages.

**--pip-args** _ARGS_
> Arguments to pass to pip.

**--force**
> Force installation.

**--verbose**
> Verbose output.

# DESCRIPTION

**pipx** installs Python command-line applications in isolated virtual environments. Each application gets its own environment, preventing dependency conflicts while keeping executables available globally.

Unlike pip install, pipx creates separate environments for each tool. This means applications like black, flake8, and ansible can coexist even if they require conflicting package versions.

The run command executes applications without permanent installation. It downloads, runs, and cleans up - perfect for one-time use or trying new tools. Frequently run packages are cached for speed.

Inject adds extra packages to an application's environment. This is useful when an application has plugins or optional dependencies that need to be installed together.

The ensurepath command configures shell PATH to include pipx binary locations. This is typically needed once after initial pipx installation.

# CAVEATS

Only for command-line applications, not libraries. Each app uses disk space for its environment. Injected packages may cause conflicts. Python version is fixed at install time. Some apps may need system dependencies.

# HISTORY

**pipx** was created by **Chad Smith** around **2018** to address the problem of installing Python CLI tools cleanly. It was inspired by npx from the Node.js ecosystem. The project became a PyPA recommended tool for installing applications, while pip remains recommended for libraries.

# SEE ALSO

[pip](/man/pip)(1), [pipenv](/man/pipenv)(1), [poetry](/man/poetry)(1), [virtualenv](/man/virtualenv)(1)
