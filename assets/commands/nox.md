# TAGLINE

python automation tool similar to tox

# TLDR

**Run default session**

```nox```

**Run specific session**

```nox -s [tests]```

**List available sessions**

```nox -l```

**Run with Python version**

```nox -p [3.12]```

**Reuse virtualenv and skip install steps** (fast iteration)

```nox -R```

**Run with a specific venv backend**

```nox --force-venv-backend [uv]```

**Run with extra arguments passed to the session**

```nox -s [tests] -- [pytest-args]```

# SYNOPSIS

**nox** [_options_] [-- _args_]

# PARAMETERS

**-s**, **--sessions** _name_
> Run specific sessions.

**-l**, **--list**
> List available sessions and exit.

**-r**, **--reuse-existing-virtualenvs**
> Reuse existing virtualenvs instead of recreating them.

**-R**
> Reuse virtualenvs and skip install steps (combines -r and --no-install).

**-p**, **--python** _version_
> Filter sessions by Python version.

**-P**, **--force-python** _version_
> Override Python versions specified in the Noxfile.

**-f**, **--noxfile** _file_
> Nox configuration file (default: noxfile.py).

**-k** _expression_
> Filter sessions by keyword expression.

**-t**, **--tags** _tag_
> Filter sessions by tag.

**-x**, **--stop-on-first-error**
> Stop after the first session failure.

**--no-install**
> Skip install commands when reusing virtualenvs.

**-db**, **--default-venv-backend** _backend_
> Default venv backend: virtualenv, venv, uv, conda, mamba, micromamba, none.

**-fb**, **--force-venv-backend** _backend_
> Force a specific venv backend for all sessions.

**--envdir** _dir_
> Directory for virtualenvs (default: .nox).

**--report** _file_
> Output a JSON report of session results.

# DESCRIPTION

**Nox** is a Python automation tool that automates testing across multiple Python environments. Sessions are defined as Python functions in a **noxfile.py**, making configuration flexible and programmable compared to tox's INI-based approach.

Nox supports multiple virtualenv backends including virtualenv, venv, uv, conda, and mamba. The `-R` flag enables fast development iteration by reusing virtualenvs and skipping package installation.

# NOXFILE EXAMPLE

```python
import nox

@nox.session(python=["3.10", "3.11", "3.12", "3.13"])
def tests(session):
    session.install("pytest", ".")
    session.run("pytest")

@nox.session
def lint(session):
    session.install("flake8")
    session.run("flake8", "src")
```

# CAVEATS

Requires a noxfile.py in the working directory. Creates separate virtualenvs per session by default, which can be slow without `-r` or `-R`. Requires Python >= 3.9.

# HISTORY

Nox was created by **Thea Flowers** at Google as a more flexible alternative to tox, using Python functions for configuration instead of INI files.

# SEE ALSO

[tox](/man/tox)(1), [pytest](/man/pytest)(1), [virtualenv](/man/virtualenv)(1)
