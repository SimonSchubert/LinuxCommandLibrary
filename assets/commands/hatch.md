# TLDR

**Create new project**

```hatch new [project-name]```

**Build package**

```hatch build```

**Run tests**

```hatch run test```

**Enter environment**

```hatch shell```

**Publish to PyPI**

```hatch publish```

**Show project info**

```hatch status```

# SYNOPSIS

**hatch** [_options_] _command_ [_args_]

# PARAMETERS

**new** _name_
> Create new project.

**build**
> Build distributions.

**publish**
> Publish to package index.

**run** _cmd_
> Run command in environment.

**shell**
> Enter project environment.

**env** _subcommand_
> Manage environments.

**test**
> Run tests across environments.

**fmt**
> Format code.

**version**
> Show/bump version.

**clean**
> Remove build artifacts.

# DESCRIPTION

**Hatch** is a modern Python project manager. It handles project creation, building, publishing, environment management, and testing in a unified tool.

Hatch uses pyproject.toml for configuration and supports PEP standards. It provides reproducible environments and multi-environment testing.

# PYPROJECT.TOML

```toml
[build-system]
requires = ["hatchling"]
build-backend = "hatchling.build"

[project]
name = "myproject"
version = "0.1.0"

[tool.hatch.envs.default]
dependencies = ["pytest"]

[tool.hatch.envs.default.scripts]
test = "pytest {args}"
```

# CAVEATS

Relatively new; ecosystem still growing. Different workflow from pip/setuptools. Environment management differs from virtualenv. Some plugins may be needed.

# HISTORY

Hatch was created by **Ofek Lev** as a modern replacement for traditional Python packaging tools. It follows current PEP standards and aims to simplify the Python project lifecycle.

# SEE ALSO

[pip](/man/pip)(1), [poetry](/man/poetry)(1), [flit](/man/flit)(1), [pdm](/man/pdm)(1)
