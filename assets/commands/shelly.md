# TAGLINE

Unified Arch Linux package manager CLI

# TLDR

**Upgrade all packages** from every source (repo, AUR, Flatpak, AppImage)

```shelly upgrade-all```

**Install** a package from the repos

```shelly install [package]```

**Remove** an installed package and unused dependents

```shelly remove --cascade [package]```

**Search** available packages in the standard repositories

```shelly query --available [search_term]```

**Search** the AUR

```shelly aur search [search_term]```

**Remove orphaned packages** (installed as dependencies but no longer required)

```shelly purify --orphans```

**Install without confirmation prompts**

```shelly install --no-confirm [package]```

# SYNOPSIS

**shelly** [_options_] \<command\> [_args_]

# DESCRIPTION

**shelly** is the command-line interface for Shelly (Shelly-ALPM), a modern unified package manager for Arch Linux. It installs, updates, searches, and removes packages across standard ALPM repositories, the AUR, Flatpak, and AppImages from one CLI.

Direct subcommands cover the common lifecycle: **install**, **remove**, **upgrade**, **upgrade-all**, **query**, **update**, **downgrade**, **purify**, **sync**, **news**, and cache/keyring utilities. Grouped subcommands handle specialized sources: **shelly aur**, **shelly flatpak**, and **shelly appimage**. Configuration is managed with **shelly config**.

Global options such as **--no-confirm** (alias **-n**), **--json** (**-j**), **--verbose** (**-v**), and **--ui-mode** (**-U**) apply across subcommands. Optional shortcodes of the form **-\<Type\>\<Action\>…** map type letters (for example **S** standard, **A** AUR, **F** Flatpak) to verbs for compact invocations.

Shelly also ships a separate GUI; the CLI binary is the scriptable entry point documented here. On CachyOS it may be installable as the **shelly** package from the distribution repositories.

# PARAMETERS

**install** [_packages…_]
> Install packages from repositories, local files, or URLs.

**remove** [_packages…_]
> Remove packages. **--cascade** (**-c**) removes unneeded reverse dependencies; **--ripple** (**-i**) removes packages that depend on the target.

**upgrade**
> Perform a full system upgrade of standard packages.

**upgrade-all**
> Upgrade packages from every source (repo, AUR, Flatpak, AppImage). Use **--no-aur**, **--no-flatpak**, **--no-appimage**, or **--no-repo** to skip a source.

**query** [_package_]
> Query repositories and packages (installed and available by default). **--available** (**-a**), **--installed** (**-i**), **--detail**/**--info** (**-d**).

**aur search** \<query…\>
> Search the Arch User Repository.

**aur install** [_packages…_]
> Build and install AUR packages.

**flatpak** … / **appimage** …
> Manage Flatpak apps and AppImages respectively.

**purify**
> Remove corrupted packages; **--orphans** (**-o**) also removes orphaned dependencies.

**config get|set|list|reset|parallel**
> Read or change Shelly configuration values.

**--no-confirm**, **-n**
> Disable confirmation prompts.

**--json**, **-j**
> Emit JSON output for scripting.

**--version**
> Show version information.

# CAVEATS

Arch Linux (and derivatives with ALPM) only; not a general multi-distro package manager. AUR builds execute PKGBUILD scripts and need a working build toolchain. Privileged operations typically require root or a configured privilege helper. The GUI and CLI share branding with other unrelated "Shelly" projects (smart-home devices, SSH clients); this page documents the Arch package manager CLI from Seafoam Labs.

# INSTALL

```aur: yay -S shelly```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(8), [paru](/man/paru)(8), [flatpak](/man/flatpak)(1)

# RESOURCES

```[Source code](https://github.com/Seafoam-Labs/Shelly-ALPM)```

```[Documentation](https://www.seafoam-labs.org/shelly-alpm/docs/cli-reference/)```

<!-- verified: 2026-07-22 -->
