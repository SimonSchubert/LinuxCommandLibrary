# TLDR

**Run default session**

```nox```

**Run specific session**

```nox -s [tests]```

**List available sessions**

```nox -l```

**Run with Python version**

```nox -p [3.11]```

**Reuse existing virtualenv**

```nox -r```

**Run with extra arguments**

```nox -- [pytest-args]```

# SYNOPSIS

**nox** [_options_] [-- _args_]

# PARAMETERS

**-s**, **--sessions** _name_
> Run specific sessions.

**-l**, **--list**
> List sessions.

**-r**, **--reuse-existing-virtualenvs**
> Reuse virtualenvs.

**-p**, **--python** _version_
> Python version.

**-f**, **--noxfile** _file_
> Nox configuration file.

**-k** _expression_
> Filter sessions by keyword.

# DESCRIPTION

**Nox** is a Python automation tool similar to tox. It automates testing across multiple Python versions and manages virtual environments for test sessions.

Sessions are defined in noxfile.py using Python functions.

# NOXFILE EXAMPLE

```python
import nox

@nox.session(python=["3.9", "3.10", "3.11"])
def tests(session):
    session.install("pytest", ".")
    session.run("pytest")

@nox.session
def lint(session):
    session.install("flake8")
    session.run("flake8", "src")
```

# CAVEATS

Requires noxfile.py. Creates virtualenvs per session. Slower than direct pytest without -r.

# HISTORY

Nox was created by **Thea Flowers** at Google as a more flexible alternative to tox, using Python for configuration.

# SEE ALSO

[tox](/man/tox)(1), [pytest](/man/pytest)(1), [virtualenv](/man/virtualenv)(1)
