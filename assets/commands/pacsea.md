# TAGLINE

TUI package searcher for Arch Linux repositories and AUR

# TLDR

**Launch the package search TUI**

```pacsea```

**Search packages from the CLI**

```pacsea -s [query]```

**Install packages directly**

```pacsea -i [package1] [package2]```

**Install packages listed in a file**

```pacsea -I [packages.txt]```

**Update official and AUR packages**

```pacsea -u```

**List explicitly installed packages**

```pacsea -l --exp```

**Remove packages** with a confirmation prompt

```pacsea -r [package]```

**Update the system and refresh mirrors** first

```pacsea -u --mirrors```

**Show unread Arch news** in the terminal

```pacsea -n --unread```

**Search with JSON output** for scripting

```pacsea -s [query] --json```

**Preview operations without making changes**

```pacsea --dry-run```

# SYNOPSIS

**pacsea** [_options_] [_query_ | _package_...]

# PARAMETERS

**-s**, **--search** _query_
> Search for packages in official repositories and the AUR.

**-i**, **--install** _package_...
> Install one or more packages.

**-I** _file_
> Install packages listed in a file (supports `#` comments).

**-r**, **--remove** _package_...
> Remove packages with a confirmation prompt.

**-R** _file_
> Remove packages listed in a file.

**-u**, **--update**
> System update (sync and upgrade official and AUR packages).

**--mirrors**
> With **--update**, refresh pacman mirrors first using `selected_countries` and `mirror_count` from settings.conf.

**-l**, **--list** [**--exp** | **--imp** | **--all**]
> List installed packages (explicit, implicit, or all).

**-n**, **--news** [**--read** | **--unread** | **-a**, **--all-news**]
> Print the Arch Linux news feed to the terminal.

**--json**
> Output machine-readable JSON on stdout (with **--search**, **--list**, and **--news**).

**--config-dir** _dir_
> Use an alternative configuration directory (default: `~/.config/pacsea`), also used for caches, lists, and logs.

**--clear-cache**
> Remove all cache files (dependencies, files, services, sandbox) and exit.

**--dry-run**
> Preview operations without making actual changes.

**-v**, **--verbose**
> Enable verbose output (equivalent to `--log-level debug`).

**--log-level** _level_
> Set the log level: trace, debug, info (default), warn, error.

**--no-color**
> Disable colored output.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Show the help message.

# DESCRIPTION

**pacsea** is a fast, Rust-based terminal user interface for searching, inspecting, and queueing packages from both the official Arch Linux repositories and the AUR. It offers keyboard-first, Vim-friendly navigation across reorderable panels showing search results, package details, PKGBUILD previews, and AUR comments.

In addition to the interactive TUI, pacsea exposes a CLI for direct search, installation, removal, and upgrade operations. It includes an integrated news feed combining Arch news, security advisories, and update notifications, plus optional AUR security scanning using tools such as ClamAV, Trivy, Semgrep, ShellCheck, VirusTotal, and aur-sleuth. Operations run inside the TUI with live output, using **sudo** or **doas** for privilege escalation.

# CONFIGURATION

**~/.config/pacsea/settings.conf**
> App behavior: layout, defaults, scans, news, privilege tool (`privilege_tool`: auto, sudo, doas) and `auth_mode`.

**~/.config/pacsea/theme.conf**
> Colors and styling.

**~/.config/pacsea/keybinds.conf**
> Keyboard shortcuts.

**~/.config/pacsea/repos.conf**
> Optional third-party sync repositories included in search.

# CAVEATS

Only works on Arch Linux and Arch-based distributions. Requires an AUR helper such as **paru** or **yay** for AUR package installation. Security scanners are optional and must be installed separately.

# HISTORY

**pacsea** was created by **Firstp1ck** and is written in **Rust**. It is MIT-licensed and distributed via `cargo install pacsea` and the AUR (**pacsea-bin**, **pacsea-git**).

# SEE ALSO

[pacman](/man/pacman)(8), [pacseek](/man/pacseek)(1), [paru](/man/paru)(1), [yay](/man/yay)(1)

# RESOURCES

```[Source code](https://github.com/Firstp1ck/Pacsea)```

```[Homepage](https://firstp1ck.github.io/Pacsea/)```

```[Documentation](https://github.com/Firstp1ck/Pacsea/wiki)```

<!-- verified: 2026-11-23 -->
