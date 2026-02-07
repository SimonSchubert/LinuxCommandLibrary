# TAGLINE

Build Python packages for distribution

# TLDR

**Build a Python package**

```python -m build```

**Build only source distribution**

```python -m build --sdist```

**Build only wheel**

```python -m build --wheel```

**Build with specific output directory**

```python -m build --outdir [dist/]```

**Build with verbose output**

```python -m build -v```

**Build without isolation** (use current environment)

```python -m build --no-isolation```

# SYNOPSIS

**python -m build** [_options_] [_source_directory_]

# PARAMETERS

**--sdist**
> Build a source distribution only.

**--wheel**
> Build a wheel only.

**--outdir** _directory_
> Output directory for built packages (default: dist/).

**--no-isolation**
> Build without creating isolated environment.

**--skip-dependency-check**
> Skip dependency verification.

**--config-setting** _key=value_
> Pass settings to the build backend.

**-v**, **--verbose**
> Increase output verbosity.

**-C** _setting_
> Short form of --config-setting.

# DESCRIPTION

**build** is the standard Python package builder that creates source distributions (sdist) and wheels from Python projects. It is the recommended way to build packages for distribution on PyPI, replacing direct calls to **setup.py sdist bdist_wheel**.

By default, build creates an isolated virtual environment with only build dependencies installed, ensuring reproducible builds. It reads configuration from **pyproject.toml** and delegates to the configured build backend (setuptools, flit, hatch, etc.).

The output is placed in a **dist/** directory containing a **.tar.gz** source distribution and a **.whl** wheel file. These can be uploaded to PyPI with **twine** or installed directly with **pip**.

# CAVEATS

Requires a **pyproject.toml** file with build system configuration. The isolated build environment downloads dependencies on each build; use **--no-isolation** for faster repeated builds during development. Some legacy packages without proper pyproject.toml may fail to build.

# HISTORY

The **build** package was created by the Python Packaging Authority (PyPA) as part of modernizing Python packaging. It was first released in **2020** to provide a simple, standardized way to build packages according to PEP 517 and PEP 518 specifications. It replaced the older practice of running **python setup.py** commands directly, supporting any PEP 517 compliant build backend.

# SEE ALSO

[pip](/man/pip)(1), [twine](/man/twine)(1), [setuptools](/man/setuptools)(1), [flit](/man/flit)(1), [hatch](/man/hatch)(1)
