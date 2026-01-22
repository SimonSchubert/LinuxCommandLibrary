# TLDR

**Install all dependencies** from Brewfile

```brew bundle install```

**Install from a specific Brewfile**

```brew bundle --file=[path/to/Brewfile]```

**Dump installed packages** to Brewfile

```brew bundle dump```

**Dump with descriptions** as comments

```brew bundle dump --describe```

**Check if all dependencies** are installed

```brew bundle check```

**Uninstall packages** not in Brewfile

```brew bundle cleanup```

**Preview cleanup** without removing

```brew bundle cleanup --dry-run```

**Use global Brewfile** (~/.Brewfile)

```brew bundle --global```

# SYNOPSIS

**brew bundle** [_subcommand_] [_options_]

# DESCRIPTION

**brew bundle** provides a declarative interface for managing Homebrew packages using a Brewfile. It can install, upgrade, and track packages from Homebrew formulae, Casks, Mac App Store, taps, and other sources.

Brewfiles specify the desired state of installed packages, making it easy to replicate development environments or maintain consistent setups across machines.

# SUBCOMMANDS

**install**
> Install/upgrade all dependencies from Brewfile (default)

**dump**
> Write installed packages to a Brewfile

**cleanup**
> Uninstall packages not in Brewfile

**check**
> Verify Brewfile matches installed packages

**list**
> List all dependencies from Brewfile

**exec**
> Run command in isolated Brewfile environment

# PARAMETERS

**--file** _path_
> Use specified Brewfile location

**--global**
> Use global Brewfile (~/.Brewfile or XDG location)

**--describe**
> Add description comments when dumping

**--force**
> Force cleanup/dump even if dependencies exist

**--dry-run**
> Show what would happen without making changes

**--verbose**
> Print detailed output

**--no-upgrade**
> Don't upgrade already-installed packages

# BREWFILE SYNTAX

```
tap "homebrew/cask"
brew "git"
brew "node", args: ["--HEAD"]
cask "firefox"
mas "Xcode", id: 497799835
vscode "ms-python.python"
```

# CAVEATS

Mac App Store packages (mas) require the mas CLI and being signed into the App Store. Cleanup removes packages not in Brewfile; use **--dry-run** first. Some casks may require administrator privileges.

# SEE ALSO

[brew](/man/brew)(1), [brew-cask](/man/brew-cask)(1), [mas](/man/mas)(1)
