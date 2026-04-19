# TAGLINE

Add dependencies to a Poetry project

# TLDR

**Add a dependency**

```poetry add [package]```

**Add specific version**

```poetry add [package]@[1.0.0]```

**Add development dependency**

```poetry add --group dev [package]```

**Add from git**

```poetry add git+https://github.com/[user]/[repo].git```

**Add multiple packages**

```poetry add [package1] [package2]```

# SYNOPSIS

**poetry add** [_options_] _packages_...

# PARAMETERS

**--group**, **-G** _group_
> Dependency group to add the package to (e.g., dev, test).

**--dev**, **-D**
> Shortcut for `--group dev`.

**--optional**
> Add as an optional dependency to an extra.

**--dry-run**
> Output the operations without executing them.

**--editable**, **-e**
> Add vcs/path dependencies as editable.

**--extras**, **-E** _extras_
> Extras to activate for the dependency (multiple values allowed).

**--source** _source_
> Name of the source to use to install the package.

**--python** _version_
> Python version constraint for which the dependency must be installed.

**--platform** _platform_
> Platforms for which the dependency must be installed.

**--markers** _markers_
> Environment markers describing when the dependency should be installed.

**--allow-prereleases**
> Accept prereleases.

**--lock**
> Do not perform install; only update the lockfile.

# DESCRIPTION

**poetry add** adds dependencies to pyproject.toml and installs them. It resolves version constraints and updates the lock file automatically.

# EXAMPLES

```bash
# Add latest version
poetry add requests

# Add with version constraint
poetry add "django>=4.0"

# Add dev dependency
poetry add --group dev pytest

# Add from git branch
poetry add git+https://github.com/user/repo.git#branch

# Add with extras
poetry add fastapi --extras all

# Add local package
poetry add ../my-package --editable
```

# VERSION CONSTRAINTS

```
package         - Latest
package@1.0.0   - Exact version
package@^1.0    - Compatible (>=1.0 <2.0)
package@~1.0    - Approximately (>=1.0 <1.1)
```

# CAVEATS

Modifies pyproject.toml and poetry.lock. Use --dry-run to preview changes.

# HISTORY

poetry add is part of **Poetry**, the Python dependency manager created by **Sébastien Eustace**.

# SEE ALSO

[poetry-remove](/man/poetry-remove)(1), [poetry-install](/man/poetry-install)(1), [poetry](/man/poetry)(1)
