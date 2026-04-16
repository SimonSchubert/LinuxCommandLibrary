# TAGLINE

Manage Pixi project settings and platforms

# TLDR

**Add a platform**

```pixi project platform add [platform]```

**List configured platforms**

```pixi project platform list```

**Add a channel**

```pixi project channel add [channel]```

**Bump project version**

```pixi project version bump [major|minor|patch]```

**Set project description**

```pixi project description set "[description]"```

**Export environment to conda-env YAML**

```pixi project export conda-environment [path/to/env.yml]```

# SYNOPSIS

**pixi** **project** _subcommand_ [_options_]

# PARAMETERS

**channel** _cmd_
> Manage project channels (add, list, remove).

**platform** _cmd_
> Manage supported platforms (add, list, remove).

**description** _cmd_
> Get or set the project description.

**environment** _cmd_
> Manage pixi environments (add, list, remove).

**export** _cmd_
> Export the project to other formats (conda-environment, conda-explicit-spec).

**name** _cmd_
> Get or set the project name.

**version** _cmd_
> Manage project version (get, set, bump, major, minor, patch).

# DESCRIPTION

**pixi project** manages Pixi project configuration stored in **pixi.toml** (or the `[tool.pixi]` section of **pyproject.toml**). Subcommands configure channels, supported platforms, environments, the project name/description/version, and can export the manifest to conda-compatible formats.

Use **pixi init** to create a new project; **pixi project** operates on an existing manifest within the current working directory.

# SEE ALSO

[pixi](/man/pixi)(1), [pixi-config](/man/pixi-config)(1)

