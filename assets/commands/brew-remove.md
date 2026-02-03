# TLDR

**Remove a formula**

```brew remove [formula]```

**Remove a cask**

```brew remove --cask [cask]```

**Remove formula and dependencies** not used by other formulae

```brew remove --zap [formula]```

**Force removal** even if other formulae depend on it

```brew remove --force [formula]```

**Remove and ignore dependencies**

```brew remove --ignore-dependencies [formula]```

# SYNOPSIS

**brew** **remove** [_options_] _formula_|_cask_ [...]

# PARAMETERS

**--cask**
> Treat all named arguments as casks.

**--formula**
> Treat all named arguments as formulae.

**--force** **-f**
> Delete all installed versions.

**--zap**
> Remove all files associated with a cask, including preferences and caches.

**--ignore-dependencies**
> Do not fail uninstall if dependent formulae exist.

# DESCRIPTION

**brew remove** uninstalls a formula or cask. This is an alias for **brew uninstall**. It removes the installed files but by default preserves configuration files and does not remove dependencies.

For casks, use **--zap** to perform a more thorough removal including application preferences and caches.

# CAVEATS

Removing a formula that other formulae depend on will fail unless **--ignore-dependencies** is used. The **--zap** option for casks may remove user data.

# SEE ALSO

[brew](/man/brew)(1), [brew-uninstall](/man/brew-uninstall)(1), [brew-rm](/man/brew-rm)(1)
