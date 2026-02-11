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
> Dependency group (e.g., dev, test).

**--optional**
> Add as optional dependency.

**--dry-run**
> Show what would happen.

**--editable**, **-e**
> Add as editable.

**--extras** _extras_
> Install package extras.

**--source** _source_
> Use specific source.

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
