# TAGLINE

Fetch the latest Homebrew and package definitions

# TLDR

**Update Homebrew and package definitions**

```brew update```

**Update with verbose output**

```brew update --verbose```

**Update only if needed (for scripts)**

```brew update --auto-update```

**Force update from latest commit**

```brew update --force```

**Reset Homebrew and taps to origin**

```brew update-reset```

# SYNOPSIS

**brew update** [_options_]

# DESCRIPTION

**brew update** fetches the newest version of Homebrew and all formulae definitions from GitHub. It updates Homebrew itself and refreshes the list of available packages.

This command does not upgrade installed packages - use **brew upgrade** for that.

Aliases: **brew up**

# PARAMETERS

**--verbose, -v**
> Show detailed update information

**--debug, -d**
> Show debugging information

**--force**
> Always do a slower full update

**--auto-update**
> Run only when needed (fast no-op otherwise)

**--merge**
> Use git merge instead of git rebase

**--quiet, -q**
> Suppress output

# AUTO-UPDATE

Homebrew auto-updates before **brew install** by default. Configure with:

**HOMEBREW_AUTO_UPDATE_SECS**
> Seconds between auto-updates

**HOMEBREW_NO_AUTO_UPDATE=1**
> Disable auto-update entirely

# WORKFLOW

```
brew update      # Fetch latest definitions
brew outdated    # See what can be upgraded
brew upgrade     # Install newer versions
brew cleanup     # Remove old versions
```

# CAVEATS

Only updates definitions, not installed software. For installed packages, run **brew upgrade** after updating. Auto-update may slow down install commands; disable with environment variable if needed.

# SEE ALSO

[brew](/man/brew)(1), [brew-upgrade](/man/brew-upgrade)(1), [brew-outdated](/man/brew-outdated)(1)
