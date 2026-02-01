# TLDR

**Update the plugin index**

```kubectl krew update```

**Search for a plugin**

```kubectl krew search [keyword]```

**Install a plugin**

```kubectl krew install [plugin-name]```

**List installed plugins**

```kubectl krew list```

**Show plugin information**

```kubectl krew info [plugin-name]```

**Upgrade all plugins**

```kubectl krew upgrade```

**Upgrade a specific plugin**

```kubectl krew upgrade [plugin-name]```

**Uninstall a plugin**

```kubectl krew uninstall [plugin-name]```

# SYNOPSIS

**kubectl krew** _command_ [_options_]

# COMMANDS

**install** _plugin_
> Install a kubectl plugin.

**uninstall** _plugin_
> Remove an installed plugin.

**upgrade** [_plugin_]
> Upgrade installed plugins. Upgrades all if no plugin specified.

**update**
> Update the local copy of the plugin index.

**search** [_keyword_]
> Search for available plugins.

**list**
> List installed kubectl plugins.

**info** _plugin_
> Show detailed information about a plugin.

**index** _subcommand_
> Manage custom plugin indexes.

**version**
> Show krew version and diagnostics.

**completion** _shell_
> Generate shell completion script.

**help**
> Help about any command.

# PARAMETERS

**-v**, **--v** _level_
> Log level verbosity (0-4).

**-h**, **--help**
> Show help information.

# DESCRIPTION

**krew** is the plugin manager for kubectl, the Kubernetes command-line tool. It simplifies discovering, installing, and managing kubectl plugins across macOS, Linux, and Windows.

Krew maintains a central index of available plugins. Use **kubectl krew update** to sync the local index with the remote repository. The **search** command finds plugins by name or keyword, and **info** shows detailed plugin descriptions and usage.

Plugins are installed to **~/.krew/bin**, which must be in your PATH. After installation, plugins are invoked as **kubectl plugin-name** (without the "krew" prefix).

Krew itself is a kubectl plugin, enabling self-updates via **kubectl krew upgrade krew**. Custom plugin indexes can be added with **kubectl krew index add** for private or third-party plugin repositories.

Popular plugins include **ctx** (context switching), **ns** (namespace switching), **neat** (clean YAML output), and **tree** (resource hierarchy visualization).

# CAVEATS

Requires kubectl v1.12 or later. The ~/.krew/bin directory must be added to PATH manually after installation. Plugin updates require explicit **upgrade** commands; they don't auto-update. Some plugins may have additional dependencies.

# HISTORY

Krew was created by the **Kubernetes SIG CLI** team to address the need for a standardized kubectl plugin distribution mechanism. It was inspired by package managers like Homebrew and apt. The project has grown to host hundreds of community-contributed plugins, becoming the de facto standard for kubectl plugin management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1), [helm](/man/helm)(1)
