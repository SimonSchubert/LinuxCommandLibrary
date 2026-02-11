# TAGLINE

Install project dependencies from lock file

# TLDR

**Install all dependencies**

```poetry install```

**Install without dev dependencies**

```poetry install --without dev```

**Install only specific groups**

```poetry install --only main,test```

**Install with extras**

```poetry install --extras "[extra1 extra2]"```

**Sync environment exactly**

```poetry install --sync```

# SYNOPSIS

**poetry install** [_options_]

# PARAMETERS

**--without** _groups_
> Exclude dependency groups.

**--only** _groups_
> Install only these groups.

**--extras**, **-E** _extras_
> Install extras.

**--sync**
> Sync environment (remove unlisted).

**--no-root**
> Don't install project itself.

**--dry-run**
> Show what would be installed.

**-v**, **-vv**, **-vvv**
> Verbosity levels.

# DESCRIPTION

**poetry install** reads pyproject.toml and poetry.lock to install project dependencies. It creates a virtual environment if needed and ensures reproducible installations.

# EXAMPLES

```bash
# Install everything
poetry install

# Production only
poetry install --without dev,test

# Only dev dependencies
poetry install --only dev

# Don't install the project itself
poetry install --no-root

# Synchronize (remove extras)
poetry install --sync

# Dry run
poetry install --dry-run
```

# LOCK FILE

- poetry.lock ensures reproducible installs
- Generated on first install
- Updated by poetry lock or poetry update

# CAVEATS

Requires pyproject.toml. Creates virtual environment by default. Use --sync to match lock exactly.

# HISTORY

poetry install is part of **Poetry** by **Sébastien Eustace**, providing deterministic Python dependency installation.

# SEE ALSO

[poetry-add](/man/poetry-add)(1), [poetry-update](/man/poetry-update)(1), [poetry-lock](/man/poetry-lock)(1)
