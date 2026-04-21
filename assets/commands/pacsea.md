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

**Preview operations without making changes**

```pacsea --dry-run```

**Refresh the package database before launching**

```pacsea -y```

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

**-u**, **--update**
> Update official and AUR packages.

**-l** [**--exp** | **--imp** | **--all**]
> List installed packages (explicit, implicit, or all).

**-n** [**--read** | **--unread** | **--all**]
> Display Arch Linux news feed.

**-y**, **--refresh**
> Refresh the package database before launching the TUI.

**--clear-cache**
> Remove all cached files.

**--dry-run**
> Preview operations without making actual changes.

**-v**, **--verbose**
> Enable verbose output.

**--log-level** _level_
> Set the log level (trace, debug, info, warn, error).

**--no-color**
> Disable colored output.

**--version**
> Display version information.

**--help**
> Show the help message.

# DESCRIPTION

**pacsea** is a fast, Rust-based terminal user interface for searching, inspecting, and queueing packages from both the official Arch Linux repositories and the AUR. It offers keyboard-first, Vim-friendly navigation across reorderable panels showing search results, package details, PKGBUILD previews, and AUR comments.

In addition to the interactive TUI, pacsea exposes a CLI for direct search, installation, removal, and upgrade operations. It includes an integrated news feed combining Arch news, security advisories, and update notifications, plus optional AUR security scanning using tools such as ClamAV, Trivy, Semgrep, ShellCheck, and VirusTotal.

# CAVEATS

Only works on Arch Linux and Arch-based distributions. Requires an AUR helper such as **paru** or **yay** for AUR package installation. Security scanners are optional and must be installed separately.

# HISTORY

**pacsea** was created by **Firstp1ck** and is written in **Rust**. It is distributed via `cargo install pacsea` and the AUR.

# SEE ALSO

[pacman](/man/pacman)(8), [pacseek](/man/pacseek)(1), [paru](/man/paru)(1), [yay](/man/yay)(1)
