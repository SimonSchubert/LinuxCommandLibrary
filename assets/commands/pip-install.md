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

**pip install** installs Python packages from PyPI or other sources. Supports version specifiers, requirements files, local paths, Git URLs, and wheel files. The primary method for adding Python dependencies.

# SEE ALSO

[pip](/man/pip)(1), [pip-uninstall](/man/pip-uninstall)(1), [pip-download](/man/pip-download)(1)

