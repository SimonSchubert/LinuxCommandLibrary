# TLDR

**Show** Azure CLI version

```az version```

Show version in **JSON**

```az version -o json```

# SYNOPSIS

**az version** [_options_]

# DESCRIPTION

**az version** displays version information for the Azure CLI and all installed extensions. It shows the core CLI version, Python version, and individual extension versions.

The command is useful for troubleshooting and verifying installations.

# OUTPUT

Information displayed:
- Azure CLI core version
- Python version and executable
- Installed extensions and versions
- System information

# WORKFLOW

```bash
# Show all version info
az version

# JSON output for parsing
az version -o json

# Check specific extension
az version -o json | jq '.extensions."some-extension"'
```

# CAVEATS

Output format may change between versions. Extension versions listed separately from core version.

# HISTORY

**az version** has been available since Azure CLI 2.0 in **2017** as a diagnostic command for version information.

# SEE ALSO

[az](/man/az)(1), [az-upgrade](/man/az-upgrade)(1), [az-extension](/man/az-extension)(1)
