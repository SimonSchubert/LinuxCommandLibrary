# TLDR

**Install an application**

```brew install --cask [firefox]```

**List installed casks**

```brew list --cask```

**Search for a cask**

```brew search --cask [application-name]```

**Get information** about a cask

```brew info --cask [firefox]```

**Upgrade a cask**

```brew upgrade --cask [firefox]```

**Upgrade all casks** including self-updating apps

```brew upgrade --cask --greedy```

**Uninstall a cask**

```brew uninstall --cask [firefox]```

**Uninstall and remove** all associated files

```brew uninstall --cask --zap [firefox]```

**Install to custom directory**

```brew install --cask --appdir=[~/Applications] [firefox]```

# SYNOPSIS

**brew** [_--cask_] _command_ [_cask-name_] [_options_]

# DESCRIPTION

**brew --cask** (formerly Homebrew Cask) manages the installation of macOS applications distributed as binary packages (.dmg, .pkg, .app). It automates downloading, installing to /Applications, and removing GUI applications.

Cask extends Homebrew's command-line workflow to desktop applications like browsers, editors, and utilities that would normally require manual drag-and-drop installation.

# COMMANDS

**install --cask**
> Install a cask application

**uninstall --cask**
> Remove a cask application

**upgrade --cask**
> Upgrade installed casks

**list --cask**
> List installed casks

**info --cask**
> Show information about a cask

**search --cask**
> Search available casks

**outdated --cask**
> List casks with available updates

# PARAMETERS

**--appdir** _path_
> Install applications to specified directory (default: /Applications)

**--fontdir** _path_
> Install fonts to specified directory

**--greedy**
> Include self-updating apps in upgrade

**--zap**
> Remove all files associated with cask (including preferences)

**--force**
> Force install even if already installed

**--no-quarantine**
> Disable macOS quarantine attribute

# CAVEATS

Many applications auto-update and are excluded from **brew upgrade** by default; use **--greedy** to include them. The **--zap** option may remove files shared with other applications. Some casks require administrator privileges for installation.

# HISTORY

Homebrew Cask was created as a separate project in **2012** by **phinze** (Alfred Perlstein) to extend Homebrew to macOS GUI applications. It was integrated into core Homebrew in **2020**, changing the command from **brew cask install** to **brew install --cask**.

# SEE ALSO

[brew](/man/brew)(1), [brew-bundle](/man/brew-bundle)(1), [mas](/man/mas)(1)
