# TAGLINE

Install Python packages from PyPI and other sources

# TLDR

**Install package**

```pip install [package]```

**Install specific version**

```pip install [package]==[version]```

**Install from requirements file**

```pip install -r requirements.txt```

**Install in editable mode**

```pip install -e [path]```

**Upgrade package**

```pip install --upgrade [package]```

**Install to user directory**

```pip install --user [package]```

# SYNOPSIS

**pip** **install** [_options_] _packages_...

# PARAMETERS

**-r**, **--requirement** _file_
> Install from requirements file.

**-e**, **--editable** _path_
> Install in editable/develop mode.

**-U**, **--upgrade**
> Upgrade package to newest version.

**--user**
> Install to user site-packages.

**--no-deps**
> Don't install dependencies.

**--pre**
> Include pre-release versions.

**-i**, **--index-url** _url_
> Use custom package index.

**--extra-index-url** _url_
> Additional package index.

**-t**, **--target** _dir_
> Install to specific directory.

**--force-reinstall**
> Reinstall even if up-to-date.

# DESCRIPTION

**pip install** installs Python packages from the Python Package Index (PyPI) and other sources. It handles dependency resolution, downloading, building from source if needed, and placing packages into the target environment.

Packages can be specified by name, version constraints (**==**, **>=**, **~=**), requirements files, local directories, Git URLs, or wheel files. Use **-e** for editable installs during development, which creates a link to the source directory rather than copying files. The **--user** flag installs to the user site-packages directory without requiring root privileges.

By default, pip resolves and installs all dependencies. Use **--no-deps** to skip dependency installation for tighter control. The **--pre** flag includes pre-release and development versions in the resolution process. Custom package indexes can be specified with **-i** for private registries.

# SEE ALSO

[pip](/man/pip)(1), [pip-uninstall](/man/pip-uninstall)(1), [pip-download](/man/pip-download)(1)

