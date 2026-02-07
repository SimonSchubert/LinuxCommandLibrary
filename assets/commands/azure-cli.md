# TAGLINE

Manage Azure cloud resources from the command line.

# TLDR

**Install** via pip

```pip install azure-cli```

**Update** Azure CLI

```pip install --upgrade azure-cli```

**Verify** installation

```az --version```

# SYNOPSIS

**azure-cli** package installation and management

# DESCRIPTION

**azure-cli** is the Python package for the Azure command-line interface. It provides the `az` command and all associated modules for managing Azure resources.

The package can be installed via pip, OS package managers, or standalone installers.

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

# SEE ALSO

[az](/man/az)(1), [pip](/man/pip)(1), [az-extension](/man/az-extension)(1)
