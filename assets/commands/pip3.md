# TAGLINE

Python 3 package installer

# TLDR

**Install package**

```pip3 install [package]```

**Install specific version**

```pip3 install [package]==[version]```

**Upgrade package**

```pip3 install --upgrade [package]```

**Uninstall package**

```pip3 uninstall [package]```

**List installed packages**

```pip3 list```

# SYNOPSIS

**pip3** [_command_] [_options_] [_packages_...]

# PARAMETERS

**install** _package_
> Install package.

**uninstall** _package_
> Remove package.

**list**
> List installed packages.

**freeze**
> Output installed packages in requirements format.

**show** _package_
> Show package details.

**--user**
> Install to user site-packages.

**-r** _file_
> Install from requirements file.

# DESCRIPTION

**pip3** is the Python 3 package installer. Functionally identical to **pip** but explicitly targets the Python 3 environment. On systems with both Python 2 and Python 3, pip3 ensures packages install to the correct interpreter.

pip3 downloads packages from the **Python Package Index** (PyPI) by default. It handles dependency resolution, version constraints, and can install from local files, version control URLs, or requirements files. Use **pip3 install -r requirements.txt** to install from a requirements file.

# CAVEATS

Use virtual environments (**venv**) to avoid system package conflicts. The **--user** flag installs to user directory without root. On some systems, using pip3 outside a virtual environment requires **--break-system-packages** flag.

# HISTORY

pip was created by **Ian Bicking** in **2008** as a replacement for easy_install. It became the standard Python package installer, bundled with Python since version **3.4**.

# SEE ALSO

[pip](/man/pip)(1), [python3](/man/python3)(1)

