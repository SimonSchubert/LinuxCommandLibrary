# TAGLINE

Upgrade installed Homebrew packages to newer versions

# TLDR

**Upgrade all installed formulae and casks**

```brew upgrade```

**Upgrade a specific formula**

```brew upgrade [formula]```

**Upgrade a specific cask**

```brew upgrade --cask [cask]```

**Dry run showing what would be upgraded without actually upgrading**

```brew upgrade --dry-run```

**Also upgrade casks that manage their own updates or track the latest version**

```brew upgrade --greedy```

**Upgrade without asking for confirmation**

```brew upgrade -y```

**Upgrade with verbose output showing verification and post-install steps**

```brew upgrade --verbose [formula]```

# SYNOPSIS

**brew upgrade** [_options_] [_formula|cask_] ...

# DESCRIPTION

**brew upgrade** upgrades outdated, unpinned packages using the same options they were originally installed with, plus any appended formula options. Without arguments, it upgrades all outdated packages. With arguments, it upgrades only the specified packages, unless they are pinned.

Unless **$HOMEBREW_NO_INSTALLED_DEPENDENTS_CHECK** is set, **brew upgrade** or **brew reinstall** will be run for outdated dependents and dependents with broken linkage, respectively.

Unless **$HOMEBREW_NO_INSTALL_CLEANUP** is set, **brew cleanup** will then be run for the upgraded formulae and casks or, every 30 days, for all packages.

# PARAMETERS

**--formula**, **--formulae**
> Treat all named arguments as formulae. If no named arguments are specified, upgrade only outdated formulae.

**--cask**, **--casks**
> Treat all named arguments as casks. If no named arguments are specified, upgrade only outdated casks.

**-n**, **--dry-run**
> Show what would be upgraded, but do not actually upgrade anything.

**-v**, **--verbose**
> Print the verification and post-install steps.

**-q**, **--quiet**
> Make some output more quiet.

**-d**, **--debug**
> If brewing fails, open an interactive debugging session with access to IRB or a shell inside the temporary build directory.

**--display-times**
> Print install times for each package at the end of the run. Enabled by default if **$HOMEBREW_DISPLAY_INSTALL_TIMES** is set.

**-y**, **--no-ask**, **--yes**
> Do not ask for confirmation before downloading and upgrading. Ask mode is the default. Enabled by default if **$HOMEBREW_NO_ASK** is set.

**--minimum-version** _version_
> Only upgrade a named formula or cask with an installed version below the given minimum version.

**--vulnerable**
> Only select outdated formulae with open vulnerabilities from OSV.dev. Implies **--formula**.

**--severity** _level_
> With **--vulnerable**, only select findings at or above low, medium, high or critical.

**-f**, **--force**
> Install formulae without checking for previously installed keg-only or non-migrated versions. When installing casks, overwrite existing files (binaries and symlinks are excluded, unless originally from the same cask).

**-g**, **--greedy**
> Also include casks with **version :latest** and **auto_updates true** casks that would otherwise be skipped. Enabled by default if **$HOMEBREW_UPGRADE_GREEDY** is set.

**--greedy-latest**
> Also include casks with **version :latest**.

**--greedy-auto-updates**
> Also include casks with **auto_updates true**.

**--fetch-HEAD**
> Fetch the upstream repository to detect if the HEAD installation of the formula is outdated. Otherwise, the repository's HEAD will only be checked for updates when a new stable or development version has been released.

**-s**, **--build-from-source**
> Compile formula from source even if a bottle is available.

**--force-bottle**
> Install from a bottle if it exists for the current or newest version of macOS, even if it would not normally be used for installation.

**-i**, **--interactive**
> Download and patch the formula, then open a shell.

**--debug-symbols**
> Generate debug symbols on build. Requires **--build-from-source**.

**--skip-cask-deps**
> Skip installing cask dependencies.

**--no-quit**
> Prevent running cask applications from being quit during upgrade.

**--[no-]binaries**
> Disable or enable linking of helper executables (default: enabled).

**--require-sha**
> Require all casks to have a checksum.

**--overwrite**
> Delete files that already exist in the prefix while linking.

**--keep-tmp**
> Retain the temporary files created during installation.

# ENVIRONMENT

**HOMEBREW_NO_INSTALLED_DEPENDENTS_CHECK**
> Skip upgrading outdated dependents and dependents with broken linkage.

**HOMEBREW_NO_INSTALL_CLEANUP**
> Skip automatic cleanup after upgrade.

**HOMEBREW_DISPLAY_INSTALL_TIMES**
> Enables **--display-times** by default.

**HOMEBREW_NO_ASK**
> Disables the default ask mode, like **--no-ask**.

**HOMEBREW_NO_UPGRADE_QUIT_CASKS**
> Enables **--no-quit** by default.

**HOMEBREW_UPGRADE_GREEDY**
> Enables **--greedy** by default.

# CAVEATS

Run **brew update** first to fetch the latest package definitions before upgrading. Cask upgrades may use an uninstall/reinstall or content replacement strategy depending on the cask. Pinned formulae are never upgraded; use **brew unpin** to allow upgrades.

# SEE ALSO

[brew](/man/brew)(1), [brew-update](/man/brew-update)(1), [brew-outdated](/man/brew-outdated)(1), [brew-install](/man/brew-install)(1), [brew-reinstall](/man/brew-reinstall)(1), [brew-cleanup](/man/brew-cleanup)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/brew)```

```[Homepage](https://brew.sh)```

```[Documentation](https://docs.brew.sh/Manpage)```

<!-- verified: 2026-11-09 -->
