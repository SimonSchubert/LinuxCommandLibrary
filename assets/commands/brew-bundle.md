# TAGLINE

Manage Homebrew packages declaratively with a Brewfile

# TLDR

**Install all dependencies** from Brewfile

```brew bundle install```

**Add a formula and a cask** to the Brewfile

```brew bundle add [git] && brew bundle add --cask [firefox]```

**Install from a specific Brewfile**

```brew bundle --file=[path/to/Brewfile]```

**Dump installed packages** to Brewfile (overwriting an existing one)

```brew bundle dump --force```

**Check if all dependencies** are installed

```brew bundle check```

**Preview** packages not in Brewfile that would be removed

```brew bundle cleanup```

**Uninstall packages** not in Brewfile

```brew bundle cleanup --force```

**Run a command** in an environment limited to Brewfile dependencies

```brew bundle exec -- [make]```

**Use global Brewfile** (~/.Brewfile)

```brew bundle --global```

**Check and list** missing dependencies

```brew bundle check --verbose```

# SYNOPSIS

**brew bundle** [_subcommand_] [_options_]

# DESCRIPTION

**brew bundle** provides a declarative interface for managing Homebrew packages using a Brewfile. It can install, upgrade, and track Homebrew formulae, casks, and taps, as well as Mac App Store apps, VS Code (and fork) extensions, Go, Cargo, npm and uv packages, Krew plugins, Flatpak packages (Linux only) and WinGet packages (WSL only).

Brewfiles specify the desired state of installed packages, making it easy to replicate development environments or maintain consistent setups across machines.

# SUBCOMMANDS

**install**
> Install and upgrade all dependencies from Brewfile (default)

**upgrade**
> Shorthand for **install --upgrade**

**dump**
> Write installed packages to a Brewfile, with description comments by default

**cleanup**
> List packages not in Brewfile; uninstall them with **--force**

**check**
> Verify all Brewfile dependencies are installed (exit code suits scripts)

**list**
> List dependencies from Brewfile (formulae only unless **--all** or a type flag is given)

**add** _name_...
> Add entries to the Brewfile (formulae by default; **--cask**, **--tap**, etc. for other types)

**remove** _name_...
> Remove matching entries from the Brewfile

**edit**
> Open the Brewfile in your editor

**exec** _command_
> Run a command in an isolated environment based on Brewfile dependencies

**sh**
> Start a shell in the **exec** environment

**env**
> Print the environment variables that **exec** would set

# PARAMETERS

**--file** _path_
> Use specified Brewfile location (**--file=-** reads stdin / writes stdout). Also settable via **HOMEBREW_BUNDLE_FILE**.

**-g**, **--global**
> Use global Brewfile (**$HOMEBREW_BUNDLE_FILE_GLOBAL**, **$XDG_CONFIG_HOME/homebrew/Brewfile**, **~/.homebrew/Brewfile** or **~/.Brewfile**)

**-f**, **--force**
> **dump**: overwrite an existing Brewfile. **cleanup**: actually uninstall. **install**: pass **--force**/**--overwrite**.

**--no-describe**
> **dump**: omit description comments

**-v**, **--verbose**
> Print command output; with **check**, list missing dependencies

**--no-upgrade**
> Don't upgrade outdated dependencies (default if **HOMEBREW_BUNDLE_NO_UPGRADE** is set)

**--zap**
> Use **zap** instead of **uninstall** when cleaning up casks

**--all**
> **list**/**cleanup**: include all dependency types

# BREWFILE SYNTAX

```
tap "homebrew/services"
brew "git"
brew "node", args: ["--HEAD"]
cask "firefox"
mas "Xcode", id: 497799835
vscode "ms-python.python"
go "github.com/charmbracelet/glow"
```

# CAVEATS

Mac App Store packages (mas) require the mas CLI and being signed into the App Store. **cleanup** only lists what it would remove until run with **--force**. The **homebrew/cask** tap is no longer needed in Brewfiles. brew bundle used to live in the separate **Homebrew/homebrew-bundle** tap; it was merged into Homebrew itself in 2025. Some casks may require administrator privileges.

# SEE ALSO

[brew](/man/brew)(1), [brew-cask](/man/brew-cask)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/brew)```

```[Documentation](https://docs.brew.sh/Brew-Bundle-and-Brewfile)```

<!-- verified: 2026-11-23 -->
