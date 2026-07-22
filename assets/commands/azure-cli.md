# TAGLINE

Manage Azure cloud resources from the command line.

# TLDR

**Sign in** interactively (opens a browser)

```az login```

**Verify** the installed version

```az --version```

**List** your subscriptions

```az account list --output table```

**Set** the active subscription

```az account set --subscription [name_or_id]```

**Create** a resource group

```az group create --name [name] --location [eastus]```

**Query** output with JMESPath

```az vm list --query "[].{name:name, rg:resourceGroup}" --output table```

**Install** via pip

```pip install azure-cli```

**Update** Azure CLI in place

```az upgrade```

# SYNOPSIS

**az** [_group_] [_subgroup_] _command_ [_options_]

# DESCRIPTION

**azure-cli** is the cross-platform command-line interface for Microsoft Azure. It provides the `az` command, which manages Azure resources through a tree of command groups (for example `az vm`, `az storage`, `az group`, `az aks`, `az network`) and is distributed as a Python package with associated service modules.

Commands follow the pattern `az <group> <subgroup> <command>`. Output defaults to JSON but can be switched to a table, TSV, YAML, or none, and JMESPath `--query` expressions filter and reshape results. Additional functionality is added through extensions managed by `az extension`.

The package can be installed via pip, OS package managers, or standalone installers.

# PARAMETERS

**-o**, **--output** _format_
> Output format: json (default), jsonc, table, tsv, yaml, yamlc, or none.

**--query** _jmespath_
> JMESPath query string to filter and project the response.

**--subscription** _name_or_id_
> Name or ID of the subscription to target for this command.

**-h**, **--help**
> Show help for the command or group.

**--verbose**
> Increase logging verbosity.

**--debug**
> Show full debug logs, useful when filing issues.

**--only-show-errors**
> Suppress warnings and show only errors.

# COMMON COMMANDS

**az login** / **az logout**
> Sign in to or out of Azure.

**az account**
> Manage subscriptions and the active context.

**az group**
> Manage resource groups.

**az upgrade**
> Update the CLI and installed extensions to the latest version.

**az extension**
> Install and manage CLI extensions.

**az interactive**
> Start an interactive shell with autocompletion and examples.

**az config**
> Manage persisted CLI defaults (replaces `az configure` for defaults).

# INSTALLATION METHODS

**Python pip**
```bash
pip install azure-cli
```

**macOS Homebrew**
```bash
brew install azure-cli
```

**Ubuntu/Debian**
```bash
curl -sL https://aka.ms/InstallAzureCLIDeb | sudo bash
```

**Windows**
> Download MSI installer from Microsoft

**Docker**
```bash
docker run -it mcr.microsoft.com/azure-cli
```

# COMPONENTS

The package includes:
- Core CLI (`az` command)
- All service modules
- Extensions framework
- Auto-completion support
- Telemetry (can be disabled)

# CONFIGURATION

**~/.azure/config**
> User-specific Azure CLI configuration file for defaults, output format, and extension settings.

# CAVEATS

Requires Python 3.8+. Large installation size (hundreds of MB). Regular updates needed for new features. Some older Linux distributions need manual dependency installation. Extensions installed separately.

# HISTORY

**azure-cli** (version 2.0+) was released in **2017** as a complete rewrite in Python, replacing the Node.js-based version 1.0.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [az-login](/man/az-login)(1), [az-account](/man/az-account)(1), [az-extension](/man/az-extension)(1), [azcopy](/man/azcopy)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
