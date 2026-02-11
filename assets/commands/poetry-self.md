# TAGLINE

Manage Poetry installation and plugins

# TLDR

**Update Poetry**

```poetry self update```

**Add Poetry plugin**

```poetry self add [plugin]```

**Remove Poetry plugin**

```poetry self remove [plugin]```

**Show Poetry info**

```poetry self show```

# SYNOPSIS

**poetry self** _command_ [_options_]

# PARAMETERS

**update**
> Update Poetry itself.

**add** _PKG_
> Add Poetry plugin.

**remove** _PKG_
> Remove plugin.

**show**
> Show installed plugins.

# DESCRIPTION

**poetry self** manages the Poetry installation itself, separate from project dependencies. The **update** subcommand upgrades Poetry to the latest version, while **add** and **remove** manage Poetry plugins.

The **show** subcommand lists installed plugins and their versions. Plugins extend Poetry's functionality with additional commands or behaviors. This operates on Poetry's own environment, not the project's virtual environment.

# CAVEATS

Modifies Poetry installation. Not project dependencies.

# HISTORY

poetry self provides **self-management** capabilities for Poetry.

# SEE ALSO

[poetry](/man/poetry)(1)

