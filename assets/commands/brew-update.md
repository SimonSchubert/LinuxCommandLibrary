# TAGLINE

Fetch the latest Homebrew and package definitions

# TLDR

**Update Homebrew and package definitions**

```brew update```

**Update with verbose output**

```brew update --verbose```

**Update only if needed (for scripts)**

```brew update-if-needed```

**Always do a full update check**

```brew update --force```

**Reset Homebrew and taps to origin**

```brew update-reset```

# SYNOPSIS

**brew update** [_options_]

# DESCRIPTION

**brew update** fetches the newest version of Homebrew and all formulae from GitHub using git, and performs any necessary migrations.

This command does not upgrade installed packages - use **brew upgrade** for that.

Aliases: **brew up**

# PARAMETERS

**-v**, **--verbose**
> Print the directories checked and git operations performed

**-d**, **--debug**
> Display a trace of all shell commands as they are executed

**-f**, **--force**
> Always do a slower, full update check (even if unnecessary)

**--auto-update**
> Run on auto-updates (e.g. before brew install). Skips some slower steps

**-q**, **--quiet**
> Make some output more quiet

# AUTO-UPDATE

Homebrew auto-updates before some commands, e.g. **brew install**, **brew upgrade** or **brew tap**. Configure with:

**HOMEBREW_AUTO_UPDATE_SECS**
> Seconds between auto-updates. Default: 86400 (24 hours), 3600 (1 hour) if a developer command has been run, or 300 (5 minutes) if HOMEBREW_NO_INSTALL_FROM_API is set

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

Only updates definitions, not installed software. For installed packages, run **brew upgrade** after updating. Auto-update may slow down install commands; disable with environment variable if needed. **brew update-reset** destroys all uncommitted or committed local changes in the repositories it resets.

# SEE ALSO

[brew](/man/brew)(1), [brew-upgrade](/man/brew-upgrade)(1), [brew-outdated](/man/brew-outdated)(1), [brew-cleanup](/man/brew-cleanup)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/brew)```

```[Homepage](https://brew.sh)```

```[Documentation](https://docs.brew.sh/Manpage)```

<!-- verified: 2026-11-09 -->
