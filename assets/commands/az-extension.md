# TLDR

**List installed extensions**

```az extension list```

**List available extensions**

```az extension list-available```

**Install an extension** by name

```az extension add --name [extension_name]```

**Install a specific version** of an extension

```az extension add --name [extension_name] --version [1.2.3]```

**Update an extension**

```az extension update --name [extension_name]```

**Remove an extension**

```az extension remove --name [extension_name]```

**Install from a local wheel file**

```az extension add --source [path/to/extension.whl]```

**Show extension details**

```az extension show --name [extension_name]```

# SYNOPSIS

**az extension** _subcommand_ [_options_]

# DESCRIPTION

**az extension** is a subcommand of the Azure CLI that manages CLI extensions. Extensions add new command groups and capabilities to the Azure CLI without updating the core installation.

Extensions are Python packages distributed as wheel files. They can be installed from the official Azure extension index, URLs, or local files. Some Azure services require extensions before their commands are available.

Extensions are installed per-user and can have different versions than what is bundled with the CLI. Dynamic installation can be enabled to automatically prompt for extension installation when using unavailable commands.

# PARAMETERS

**list**
> Show currently installed extensions.

**list-available**
> Show extensions available for installation.

**add**
> Install an extension.

**update**
> Update an extension to latest version.

**remove**
> Uninstall an extension.

**show**
> Display details about an installed extension.

**list-versions**
> List available versions of an extension.

**--name** _name_
> Extension name.

**--source** _path_
> Path or URL to wheel file.

**--version** _version_
> Specific version to install.

**--yes**
> Do not prompt for confirmation.

**--upgrade**
> Update if already installed.

**--pip-extra-index-urls** _urls_
> Additional PyPI index URLs.

# CAVEATS

Extensions may have version compatibility requirements with the Azure CLI. Updating the CLI may require updating extensions. Some extensions are in preview and may have breaking changes. Extensions installed from third-party sources should be verified for security. Installing from source requires the wheel to match Python version.

# HISTORY

The Azure CLI extension system was introduced with **Azure CLI 2.0** in **2017** to enable modular functionality without bloating the core installation. The extension index has grown to include hundreds of extensions covering preview services, experimental features, and partner integrations. **Dynamic install** was added to automatically suggest extensions when commands are not found.

# SEE ALSO

[az](/man/az)(1), [pip](/man/pip)(1), [az-config](/man/az-config)(1)
