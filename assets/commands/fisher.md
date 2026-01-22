# TLDR

**Install plugin**

```fisher install [jorgebucaran/nvm.fish]```

**List installed plugins**

```fisher list```

**Update all plugins**

```fisher update```

**Remove plugin**

```fisher remove [jorgebucaran/nvm.fish]```

**Update specific plugin**

```fisher update [jorgebucaran/nvm.fish]```

# SYNOPSIS

**fisher** _command_ [_plugins_...]

# PARAMETERS

_COMMAND_
> Operation: install, remove, update, list.

_PLUGINS_
> Plugin names (github/repo format).

**install** _PLUGIN_
> Install one or more plugins.

**remove** _PLUGIN_
> Uninstall plugins.

**update**
> Update installed plugins.

**list**
> List installed plugins.

# DESCRIPTION

**fisher** is a plugin manager for the fish shell. It installs plugins from GitHub repositories, local directories, or URLs, extending fish with themes, functions, and completions.

The manager is minimal with no configuration file required. It stores plugin references in a fish_plugins file for version control and can bulk install from this file.

fisher handles plugin dependencies and provides fast installation through parallel downloads.

# CAVEATS

Fish shell only. Some plugins may conflict. No automatic dependency resolution.

# HISTORY

fisher was created by **Jorge Bucaran** as a minimal, fast plugin manager for fish. It replaced the older Oh My Fish framework approach with a simpler, more direct installation method.

# SEE ALSO

[fish](/man/fish)(1), [omf](/man/omf)(1)
