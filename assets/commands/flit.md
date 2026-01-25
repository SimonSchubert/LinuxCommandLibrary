# TLDR

**Initialize new project**

```flit init```

**Build package**

```flit build```

**Install in development mode**

```flit install --symlink```

**Publish to PyPI**

```flit publish```

**Check project configuration**

```flit check```

# SYNOPSIS

**flit** [_options_] _command_ [_args_]

# PARAMETERS

**init**
> Create pyproject.toml interactively.

**build**
> Build wheel and sdist.

**install**
> Install locally.

**--symlink**
> Symlink for development.

**--pth-file**
> Use .pth file for development.

**publish**
> Upload to PyPI.

**--repository** _name_
> Target repository (pypi, testpypi).

**check**
> Validate project configuration.

# DESCRIPTION

**flit** is a simple Python packaging tool that uses pyproject.toml for configuration. It handles building wheels and source distributions and publishing to PyPI with minimal setup.

Flit is designed for pure Python packages with simple needs. It reads package metadata from the module's docstring and __version__ attribute, requiring minimal configuration.

# PYPROJECT.TOML EXAMPLE

```toml
[build-system]
requires = ["flit_core"]
build-backend = "flit_core.buildapi"

[project]
name = "mypackage"
authors = [{name = "Me"}]
dynamic = ["version", "description"]

[project.scripts]
mycli = "mypackage:main"
```

# CAVEATS

Best for pure Python packages without complex build requirements. No support for compiled extensions. Requires module docstring for description. Publishing needs PyPI credentials.

# HISTORY

flit was created by **Thomas Kluyver** as a simpler alternative to setuptools for pure Python packages. It helped drive the adoption of pyproject.toml and was an early implementation of PEP 517/518 build standards.

# SEE ALSO

[pip](/man/pip)(1), [poetry](/man/poetry)(1), [hatch](/man/hatch)(1), [twine](/man/twine)(1)
