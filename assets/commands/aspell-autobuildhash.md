# TAGLINE

Rebuild aspell dictionary hash files

# TLDR

**Rebuild** all aspell hash files

```sudo aspell-autobuildhash```

**Force** a rebuild of every hash file

```sudo aspell-autobuildhash --force```

**Preview** what would be done without changing anything

```sudo aspell-autobuildhash --dry-run```

# SYNOPSIS

**aspell-autobuildhash** [_--force_]

# DESCRIPTION

**aspell-autobuildhash** manages the autobuilding of aspell hash files for dictionary packages. It is part of the **dictionaries-common** package and is normally invoked automatically by dpkg triggers after a dictionary is installed or upgraded.

For each aspell dictionary configured to use it, the script decides whether the hash file must be rebuilt based on the aspell compatibility level, then regenerates the hash files used for fast spell checking.

# PARAMETERS

**--force**
> Rebuild the hash file for all dicts providing a compat file, regardless of the compatibility levels found.

**--dry-run**
> Show what would be done, but make no actual changes.

**--debug**
> Show extra info about the script's internal work; also enables aspell affix validation.

**--triggered**
> Tell the script that it is running in the dpkg triggers stage.

# CAVEATS

Requires root privileges to write to system dictionary directories. Automatically run by package managers after dictionary installation.

# HISTORY

**aspell-autobuildhash** is provided by the Debian **dictionaries-common** package, written by Agustin Martin, to automatically regenerate aspell hash files after dictionary updates.

# INSTALL

```apt: sudo apt install aspell```

```dnf: sudo dnf install aspell```

```pacman: sudo pacman -S aspell```

```apk: sudo apk add aspell```

```zypper: sudo zypper install aspell```

```brew: brew install aspell```

```nix: nix profile install nixpkgs#aspell```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[aspell](/man/aspell)(1), [aspell-import](/man/aspell-import)(1)

# RESOURCES

```[Documentation](https://manpages.debian.org/testing/dictionaries-common/aspell-autobuildhash.8.en.html)```

<!-- verified: 2026-06-17 -->
