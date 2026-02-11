# TAGLINE

Initialize a new pyproject.toml file

# TLDR

**Initialize interactively**

```poetry init```

**Non-interactive with defaults**

```poetry init -n```

**Specify name and description**

```poetry init --name [myproject] --description "[A cool project]"```

**With dependencies**

```poetry init --dependency [requests] --dev-dependency [pytest]```

# SYNOPSIS

**poetry init** [_options_]

# PARAMETERS

**-n**, **--no-interaction**
> Non-interactive mode.

**--name** _name_
> Package name.

**--description** _desc_
> Package description.

**--author** _author_
> Author name.

**--python** _version_
> Python version constraint.

**--dependency** _dep_
> Add dependency.

**--dev-dependency** _dep_
> Add dev dependency.

# DESCRIPTION

**poetry init** creates a new pyproject.toml file in the current directory. It can run interactively to gather project details or accept command-line arguments.

# EXAMPLES

```bash
# Interactive initialization
poetry init

# Non-interactive with values
poetry init -n --name myproject --author "Name <email>"

# With dependencies
poetry init --dependency requests --dependency click

# Specify Python version
poetry init --python "^3.9"

# Full non-interactive
poetry init -n \
  --name myproject \
  --description "My project" \
  --author "Me <me@example.com>" \
  --python "^3.10"
```

# OUTPUT (pyproject.toml)

```toml
[tool.poetry]
name = "myproject"
version = "0.1.0"
description = ""
authors = ["Name <email>"]

[tool.poetry.dependencies]
python = "^3.10"
```

# CAVEATS

Creates pyproject.toml only. Run poetry install to create environment.

# HISTORY

poetry init is part of **Poetry** by **Sébastien Eustace** for initializing Python projects with modern packaging.

# SEE ALSO

[poetry-install](/man/poetry-install)(1), [poetry-new](/man/poetry-new)(1), [poetry](/man/poetry)(1)
