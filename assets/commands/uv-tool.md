# TAGLINE

Install and run Python CLI tools

# TLDR

**Run a tool without installing**

```uv tool run [tool]```

**Run a tool from a specific package**

```uv tool run --from [package] [command]```

**Install a tool globally**

```uv tool install [tool]```

**Install a tool with extra dependencies**

```uv tool install [tool] --with [extra_package]```

**List installed tools**

```uv tool list```

**Upgrade a specific tool**

```uv tool upgrade [tool]```

**Upgrade all installed tools**

```uv tool upgrade --all```

**Uninstall a tool**

```uv tool uninstall [tool]```

# SYNOPSIS

**uv** **tool** _command_ [_options_]

# PARAMETERS

**run** _tool_
> Run a tool in a temporary isolated environment. Alias: **uvx**.

**install** _tool_
> Install a tool globally in an isolated virtual environment.

**uninstall** _tool_
> Remove an installed tool and its environment.

**list**
> List installed tools and their executables.

**upgrade** _tool_
> Upgrade an installed tool.

**upgrade** **--all**
> Upgrade all installed tools.

**dir**
> Show the tools installation directory.

**update-shell**
> Add the tool executable directory to the PATH in shell configuration files.

**--from** _package_
> Specify the package to install or run the command from.

**--with** _package_
> Include additional packages in the tool environment.

**--python** _version_
> Specify the Python interpreter or version to use.

# DESCRIPTION

**uv tool** manages Python CLI tools in isolated virtual environments. Each tool gets its own environment with dependencies, keeping the system clean. Similar to **pipx** but significantly faster due to uv's Rust-based resolver and installer.

Tools can be run temporarily with **uv tool run** (aliased as **uvx**), which creates a disposable environment, or installed persistently with **uv tool install** for permanent PATH availability. The **--from** option allows running a specific command from a named package, and **--with** adds extra dependencies to the tool environment. Tool upgrades respect version constraints set during installation.

# SEE ALSO

[uv](/man/uv)(1), [uv-run](/man/uv-run)(1), [uv-pip](/man/uv-pip)(1), [uvx](/man/uvx)(1), [pipx](/man/pipx)(1)

