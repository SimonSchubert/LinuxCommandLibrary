# TLDR

**Create virtual environment and install packages**

```pipenv install [requests]```

**Install dev dependencies**

```pipenv install --dev [pytest]```

**Install from Pipfile**

```pipenv install```

**Activate virtual environment**

```pipenv shell```

**Run command in virtual environment**

```pipenv run [python script.py]```

**Generate requirements.txt**

```pipenv requirements > requirements.txt```

**Show dependency graph**

```pipenv graph```

**Remove virtual environment**

```pipenv --rm```

# SYNOPSIS

**pipenv** _command_ [_options_] [_packages_]

# PARAMETERS

**install** [_packages_]
> Install packages and add to Pipfile.

**uninstall** _packages_
> Remove packages from environment.

**lock**
> Generate Pipfile.lock.

**sync**
> Install packages from Pipfile.lock.

**shell**
> Spawn shell in virtual environment.

**run** _command_
> Run command in virtual environment.

**graph**
> Show dependency graph.

**check**
> Check for security vulnerabilities.

**requirements**
> Generate requirements.txt output.

**update** [_packages_]
> Update packages.

**clean**
> Remove packages not in Pipfile.lock.

**--dev**, **-d**
> Include dev dependencies.

**--python** _VERSION_
> Specify Python version.

**--venv**
> Show virtual environment path.

**--rm**
> Remove virtual environment.

**--where**
> Show project home.

**--three** / **--two**
> Use Python 3 / Python 2.

**--site-packages**
> Enable system site-packages.

# DESCRIPTION

**pipenv** combines pip and virtualenv into a single workflow. It manages project dependencies with Pipfile/Pipfile.lock files, similar to npm's package.json or Ruby's Bundler.

The Pipfile replaces requirements.txt with a more structured format. It separates production and development dependencies. The Pipfile.lock ensures deterministic builds by pinning exact versions and hashes.

Virtual environments are created automatically per project. The shell command activates the environment, while run executes commands within it without manual activation. Environment location is determined by the project directory.

Security features include hash verification of packages and vulnerability scanning via check command. The graph command visualizes the dependency tree, helping understand transitive dependencies.

Pipenv integrates with .env files, automatically loading environment variables. This keeps secrets separate from code while making them available during development.

# CAVEATS

Lock resolution can be slow for complex dependencies. Not as fast as newer tools like Poetry or uv. Hash verification requires packages have published hashes. Some edge cases in dependency resolution. May conflict with system-wide pip packages.

# HISTORY

**pipenv** was created by **Kenneth Reitz** (author of requests) around **2017**. It aimed to bring the developer experience of npm/Bundler to Python. PyPA endorsed it as a recommended tool. While newer alternatives like Poetry have emerged, pipenv remains widely used for its simplicity and integration with pip.

# SEE ALSO

[pip](/man/pip)(1), [poetry](/man/poetry)(1), [virtualenv](/man/virtualenv)(1), [uv](/man/uv)(1)
