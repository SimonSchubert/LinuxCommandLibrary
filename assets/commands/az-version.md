# TAGLINE

Display Azure CLI version information

# TLDR

**Show** Azure CLI version

```az version```

Show version in **JSON** format

```az version -o json```

Show version in **table** format

```az version --output table```

# SYNOPSIS

**az version** [**-o**|**--output** _format_]

# PARAMETERS

**-o**, **--output** _format_
> Output format. Accepted values: **json**, **jsonc**, **none**, **table**, **tsv**, **yaml**, **yamlc**. Default: **json**.

# DESCRIPTION

**az version** displays version information for the Azure CLI and all installed extensions. It shows the core CLI version, Python version, and individual extension versions.

The command is useful for troubleshooting and verifying installations.

# OUTPUT

Information displayed:
- Azure CLI core version
- Python version and platform
- Installed extensions and their versions

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

Output format may vary between Azure CLI versions. Extension versions are listed separately from the core CLI version. The default output format is JSON.

# HISTORY

**az version** has been available since Azure CLI 2.0 in **2017** as a diagnostic command for version information.

# SEE ALSO

[az](/man/az)(1), [az-upgrade](/man/az-upgrade)(1), [az-extension](/man/az-extension)(1), [az-login](/man/az-login)(1)
