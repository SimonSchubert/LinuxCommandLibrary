# TAGLINE

Remove Python bytecode files and tool leftovers

# TLDR

**Clean bytecode** in the current directory tree

```pyclean .```

**Explain** what is removed

```pyclean -v [directory]```

**Preview** a cleanup without deleting anything

```pyclean -n -v [directory]```

Also remove **tool debris** (caches, build and test artifacts)

```pyclean . --debris```

Remove debris for **specific tools**

```pyclean . --debris [mypy] [tox]```

Remove **empty directories** as well

```pyclean -f [directory]```

**Skip** a directory

```pyclean . -i [directory]```

Delete files matching a **glob pattern**, without prompting

```pyclean . --erase '[tmp/**/*]' [tmp/] --yes```

Run without installing it

```uvx pyclean .```

# SYNOPSIS

**pyclean** [_options_] _directory_ [_directory_...]

# PARAMETERS

_DIRECTORY_
> Directory tree to traverse for bytecode and debris.

**-d**, **--debris** [_TOPIC_...]
> Remove leftovers from Python development tools. Default topics: **cache**, **coverage**, **package**, **pytest**, **ruff**. Optional: **all**, **complexipy**, **jupyter**, **mypy**, **pyright**, **tox**.

**-e**, **--erase** _PATTERN_...
> Delete files or folders matching a glob pattern. Interactive unless **--yes** is used.

**-f**, **--folders**
> Remove empty directories.

**-g**, **--git-clean**
> Run git clean to remove untracked files. Interactive unless **--yes** is used.

**-i**, **--ignore** _DIRECTORY_...
> Directory to ignore, in addition to the defaults (**.direnv**, **.git**, **.hg**, **.svn**, **.tox**, **.venv**, **node_modules**, **venv**).

**-n**, **--dry-run**
> Show what would be done.

**-q**, **--quiet**
> Be quiet.

**-v**, **--verbose**
> Be more verbose.

**-y**, **--yes**
> Assume yes for interactive questions. Only valid with **--erase** or **--git-clean**.

**--version**
> Show the version.

# DESCRIPTION

**pyclean** removes Python bytecode files (**.pyc**) and **__pycache__** directories from one or more directory trees, on any platform. It can also clear caches, build output and test artifacts left behind by common Python development tools.

Since Python regenerates bytecode files automatically on import, removing them has no lasting effect beyond a slower next import.

# CAVEATS

**--erase** and **--git-clean** can delete work that cannot be recovered. Use **--dry-run** first.

The name is also used by an older Debian tool from the **python-minimal** package, which cleaned Python 2 bytecode and accepted **-p** _PACKAGE_ for a Debian package. Current Debian ships **py3clean** in **python3-minimal** instead.

# HISTORY

**pyclean** was written by **Peter Bittner** as a cross-platform tool inspired by the scripts Debian ships for Python package maintenance. It is distributed on PyPI and conda-forge.

# SEE ALSO

[python](/man/python)(1), [py3clean](/man/py3clean)(1), [git-clean](/man/git-clean)(1), [find](/man/find)(1)

# RESOURCES

```[Source code](https://github.com/bittner/pyclean)```

<!-- verified: 2026-11-09 -->
