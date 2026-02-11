# TAGLINE

Automate Python testing across versions

# TLDR

**Run all test environments**

```tox```

**Run specific environment**

```tox -e [py39]```

**Run multiple environments**

```tox -e [py38,py39,lint]```

**List available environments**

```tox -l```

**Recreate environments**

```tox -r```

**Run in parallel**

```tox -p```

**Pass arguments to test command**

```tox -- [--verbose]```

**Recreate and run**

```tox -r -e [py39]```

# SYNOPSIS

**tox** [_-e envs_] [_-r_] [_-p_] [_-l_] [_options_] [_-- test_args_]

# PARAMETERS

**-e** _ENVLIST_, **--envlist** _ENVLIST_
> Environments to run.

**-r**, **--recreate**
> Recreate virtual environments.

**-p**, **--parallel**
> Run environments in parallel.

**-l**, **--list**
> List environments.

**-a**, **--listenvs-all**
> List all environments including generated.

**--devenv** _PATH_
> Create development environment.

**-c** _FILE_, **--conf** _FILE_
> Configuration file path.

**--skip-missing-interpreters**
> Skip environments without interpreter.

**-v**, **--verbose**
> Verbose output.

**-q**, **--quiet**
> Quiet output.

**--notest**
> Install but don't test.

**--sdistonly**
> Only create source distribution.

**--result-json** _FILE_
> Write results as JSON.

**--**
> Pass remaining args to test command.

# DESCRIPTION

**tox** automates testing Python packages across multiple Python versions and environments. It creates isolated virtualenvs, installs packages, and runs tests.

Configuration in tox.ini or pyproject.toml defines environments. Each environment specifies: Python version, dependencies, and commands to run. Common setups test multiple Python versions (py38, py39, py310) plus linting environments.

Environment creation installs the package in development mode plus test dependencies. This catches installation issues early. Recreate mode (-r) rebuilds environments from scratch.

Parallel mode (-p) runs environments simultaneously, speeding up multi-version testing on machines with multiple cores. Output is collected and displayed after completion.

Beyond testing, tox runs any command: linting (flake8, mypy), documentation builds (sphinx), formatting checks. Multiple commands chain in sequence.

The double-dash (--) passes arguments to the test command, enabling pytest flags or test selection without modifying tox.ini.

# CAVEATS

Python versions must be installed for their environments. Initial environment creation downloads dependencies. Parallel mode may hit resource limits. Complex configurations can be hard to debug. Some CI systems prefer simpler approaches.

# HISTORY

**tox** was created by **Holger Krekel** (creator of pytest) around **2010** to solve multi-Python testing. It became the standard tool for Python package testing, used by major projects. Version 4 (2022) brought significant improvements and pyproject.toml support.

# SEE ALSO

[pytest](/man/pytest)(1), [nox](/man/nox)(1), [virtualenv](/man/virtualenv)(1), [hatch](/man/hatch)(1)
