# TAGLINE

Package manager for macOS and Linux

# TLDR

**Install** package

```brew install [wget]```

**Search** for packages

```brew search [node]```

**Update** Homebrew

```brew update```

**Upgrade** packages

```brew upgrade```

**List** installed packages

```brew list```

**Uninstall** package

```brew uninstall [package]```

**Show** package info

```brew info [package]```

# SYNOPSIS

**brew** _command_ [_options_] [_formula_]

# DESCRIPTION

**brew** (Homebrew) is a package manager for macOS and Linux. It installs software from source or pre-compiled binaries, managing dependencies and versions. Homebrew has become the de facto standard package manager for macOS.

The tool simplifies software installation and maintenance on Unix-like systems.

# PARAMETERS

**install** _formula_
> Install package

**uninstall** _formula_
> Remove package

**update**
> Update Homebrew itself

**upgrade** [_formula_]
> Upgrade packages

**search** _query_
> Search for packages

**list**
> List installed packages

**info** _formula_
> Show package information

**doctor**
> Check system for problems

**cleanup**
> Remove old versions

# CONCEPTS

**Formula**
> Package definition (e.g., wget, node)

**Cask**
> macOS GUI application (e.g., firefox, slack)

**Tap**
> Third-party repository

**Cellar**
> Where packages are installed (/usr/local/Cellar)

# COMMON OPERATIONS

```bash
# Install package
brew install node

# Install GUI app (macOS)
brew install --cask firefox

# Update package database
brew update

# Upgrade all packages
brew upgrade

# Show outdated
brew outdated

# Cleanup old versions
brew cleanup

# Add third-party tap
brew tap homebrew/cask-fonts
```

# SERVICES

```bash
# Start service
brew services start postgresql

# List services
brew services list

# Stop service
brew services stop redis
```

# CAVEATS

macOS system updates can break Homebrew. Requires Xcode Command Line Tools on macOS. Can conflict with system Python. Upgrades all dependencies (not minimal updates). Large download sizes for some packages.

# HISTORY

**Homebrew** was created by Max Howell in **2009** to provide a simple, Git-based package manager for macOS, becoming the most popular macOS package manager.

# SEE ALSO

[brew-install](/man/brew-install)(1), [brew-services](/man/brew-services)(1), [apt](/man/apt)(8)
