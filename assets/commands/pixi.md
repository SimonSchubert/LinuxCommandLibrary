# TAGLINE

Fast cross-platform conda package manager

# TLDR

**Initialize new project**

```pixi init [project_name]```

**Add dependency**

```pixi add [numpy]```

**Add dev dependency**

```pixi add --dev [pytest]```

**Run a task**

```pixi run [test]```

**Install dependencies**

```pixi install```

**Activate shell**

```pixi shell```

**Create global tool installation**

```pixi global install [ruff]```

**Show project info**

```pixi info```

# SYNOPSIS

**pixi** _command_ [_options_] [_arguments_]

# PARAMETERS

**init** [_name_]
> Initialize new project with pixi.toml.

**add** _packages_
> Add dependencies to project.

**remove** _packages_
> Remove dependencies.

**install**
> Install all dependencies.

**run** _task_
> Run a project task.

**shell**
> Activate environment shell.

**task** _subcommand_
> Manage project tasks.

**project** _subcommand_
> Manage project configuration.

**global** _subcommand_
> Manage global tool installations.

**update**
> Update dependencies.

**list**
> List project dependencies.

**tree**
> Show dependency tree.

**info**
> Show project information.

**--dev**, **-d**
> Operate on dev dependencies.

**--platform** _PLATFORM_
> Target platform.

**--feature** _FEATURE_
> Target feature.

**--manifest-path** _PATH_
> Path to pixi.toml.

**--frozen**
> Use existing lockfile without updates.

**--locked**
> Require lockfile to be up to date.

# DESCRIPTION

**pixi** is a fast, cross-platform package manager built on the conda ecosystem. It manages Python and native dependencies together, providing reproducible environments from a single lockfile.

Projects use pixi.toml for configuration, similar to Cargo.toml. Dependencies from conda-forge, PyPI, and custom channels can be mixed. The lockfile (pixi.lock) pins exact versions for reproducibility.

Multi-platform support generates separate lockfiles per platform, enabling the same project to work on Linux, macOS, and Windows without manual intervention.

Tasks defined in pixi.toml provide npm-like scripting. Commands like test, build, and lint are configured once and run with pixi run. Task dependencies chain commands together.

Global installations (pixi global install) work like pipx, creating isolated environments for CLI tools. This keeps development tools separate from project dependencies.

# CONFIGURATION

**pixi.toml**
> Project configuration file defining dependencies, tasks, and channels.

**pixi.lock**
> Lockfile with pinned versions for reproducible environments per platform.

**~/.pixi/config.toml**
> Global configuration for default channels, authentication, and cache settings.

**PIXI_HOME**
> Override the default Pixi home directory.

# CAVEATS

Newer tool, ecosystem still growing. Some conda packages may not work perfectly. Mixing PyPI and conda dependencies requires care. Large environments take time to solve. Platform-specific packages need proper feature flags.

# HISTORY

**pixi** was created by **prefix.dev** (makers of mamba) and released in **2023**. Written in Rust, it aims to combine the best of conda, pip, and cargo into a unified tool. It leverages the fast dependency resolver from rattler-build and integrates with the conda ecosystem while adding modern project management features.

# SEE ALSO

[conda](/man/conda)(1), [mamba](/man/mamba)(1), [poetry](/man/poetry)(1), [cargo](/man/cargo)(1)
