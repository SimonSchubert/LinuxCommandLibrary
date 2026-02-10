# TAGLINE

python package manager following PEP standards

# TLDR

**Initialize a new project**

```pdm init```

**Add a dependency**

```pdm add [requests]```

**Add a development dependency**

```pdm add -d [pytest]```

**Install all dependencies**

```pdm install```

**Update dependencies**

```pdm update```

**Run a command in environment**

```pdm run [python] [script.py]```

**List installed packages**

```pdm list```

**Build package**

```pdm build```

# SYNOPSIS

**pdm** _command_ [_options_] [_args_...]

# COMMANDS

**init**
> Create new project with pyproject.toml.

**add** _packages_
> Add dependencies.

**remove** _packages_
> Remove dependencies.

**install**
> Install dependencies from lock file.

**update** [_packages_]
> Update dependencies.

**lock**
> Generate or update lock file.

**sync**
> Sync packages with lock file.

**run** _command_
> Run command in project environment.

**list**
> List installed packages.

**build**
> Build distribution packages.

**publish**
> Publish to PyPI.

**use** _python_
> Switch Python interpreter.

**venv** create|list|remove
> Manage virtual environments.

**config** _key_ [_value_]
> Get or set configuration.

# PARAMETERS

**-d**, **--dev**
> Development dependency.

**-G**, **--group** _name_
> Dependency group.

**-L**, **--lockfile** _file_
> Custom lock file path.

**--no-sync**
> Don't sync after adding.

**--no-lock**
> Skip lock file update.

**--prod**, **--production**
> Exclude dev dependencies.

**-p**, **--project** _path_
> Project directory.

**-v**, **--verbose**
> Increase verbosity.

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**pdm** is a Python package manager following PEP standards. It manages dependencies, virtual environments, and builds using pyproject.toml.

**pdm init** creates a new project with pyproject.toml. It detects or creates a Python interpreter and optionally initializes a virtual environment.

Dependencies are declared in pyproject.toml and locked in pdm.lock. **add** modifies both; **install** reads the lock file. Dependency groups separate dev, test, and optional dependencies.

PDM supports PEP 582 (__pypackages__) as an alternative to virtual environments. Packages install to a local directory without activation. Enable with **pdm config python.use_venv false**.

**pdm run** executes commands with the project environment active. Scripts defined in pyproject.toml under [tool.pdm.scripts] provide shortcuts.

Build and publish follow PEP 517/518. **pdm build** creates wheels and sdists; **pdm publish** uploads to PyPI.

# CAVEATS

PEP 582 support varies by Python version and tools. Some older packages may not work with new standards. Lock file format is PDM-specific. Requires Python 3.8+.

# HISTORY

PDM was created by **Frost Ming** and first released in **2019**. It pioneered PEP 582 support and modern Python packaging standards. The project emphasizes standards compliance (PEP 517, 518, 621) over custom formats. PDM gained popularity as an alternative to pip, Poetry, and pipenv with its focus on PEP standards and performance.

# SEE ALSO

[pip](/man/pip)(1), [poetry](/man/poetry)(1), [pipenv](/man/pipenv)(1), [uv](/man/uv)(1)
