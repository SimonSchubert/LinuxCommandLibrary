# TAGLINE

Update the Azure CLI to the latest version

# TLDR

**Upgrade** Azure CLI and installed extensions

```az upgrade```

Upgrade **without prompting** to review release notes

```az upgrade --yes```

Upgrade the **CLI only**, leaving extensions untouched

```az upgrade --all false```

Include **preview** extension packages when upgrading

```az upgrade --allow-preview true```

# SYNOPSIS

**az upgrade** [_options_]

# DESCRIPTION

**az upgrade** upgrades the Azure CLI and, by default, its installed extensions to the latest available version. It checks for available updates and installs them, ensuring you have access to the newest features and bug fixes.

The command handles the upgrade process automatically, including dependency updates. This command is in **preview**.

# PARAMETERS

**-y**, **--yes**
> Do not prompt for checking release notes.

**--all** _{false, true}_
> Enable updating extensions as well. Default: **true**.

**--allow-preview**, **--allow-preview-extensions** _{false, true}_
> Include preview packages for extension installation, if any exist.

# WORKFLOW

```bash
# Upgrade CLI and extensions with confirmation
az upgrade

# Upgrade without the release-notes prompt
az upgrade --yes

# Upgrade only the CLI, skipping extensions
az upgrade --all false
```

# CAVEATS

Requires sufficient permissions to modify the installation directory. May require restarting the shell for changes to take effect. The command works for installations done via the official installers (MSI, Homebrew, apt/yum, etc.); some system package managers handle updates separately and may not be supported. There is no flag to only check for updates without installing.

# HISTORY

**az upgrade** was added to Azure CLI **2.11** in **August 2020** to provide a built-in update mechanism, replacing manual update procedures. It remains a preview command.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [az-version](/man/az-version)(1), [az-extension](/man/az-extension)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/reference-index#az-upgrade)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
