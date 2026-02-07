# TAGLINE

Update the Azure CLI to the latest version

# TLDR

**Upgrade** Azure CLI

```az upgrade```

Upgrade **without prompting**

```az upgrade --yes```

**Check** for updates only

```az upgrade --dry-run```

# SYNOPSIS

**az upgrade** [_options_]

# DESCRIPTION

**az upgrade** updates the Azure CLI to the latest version. It checks for available updates and installs them, ensuring you have access to the newest features and bug fixes.

The command handles the upgrade process automatically, including dependency updates.

# PARAMETERS

**-y**, **--yes**
> Don't prompt for confirmation

**--dry-run**
> Check for updates without installing

**--all**
> Update all installed components

# WORKFLOW

```bash
# Check for updates
az upgrade --dry-run

# Upgrade with confirmation
az upgrade

# Upgrade without prompts
az upgrade --yes
```

# CAVEATS

Requires sufficient permissions to modify installation directory. May require restart of shell for changes to take effect. Extension updates handled separately. Not available on all installation methods (some package managers handle updates).

# HISTORY

**az upgrade** was added to Azure CLI in **2020** to provide a built-in update mechanism, replacing manual update procedures.

# SEE ALSO

[az](/man/az)(1), [az-version](/man/az-version)(1), [az-extension](/man/az-extension)(1)
