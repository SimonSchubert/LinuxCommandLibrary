# TLDR

**Remove a formula**

```brew rm [formula]```

**Remove a cask**

```brew rm --cask [cask]```

**Force removal** of all versions

```brew rm --force [formula]```

**Remove with zap** (thorough cask removal)

```brew rm --zap [cask]```

# SYNOPSIS

**brew** **rm** [_options_] _formula_|_cask_ [...]

# PARAMETERS

**--cask**
> Treat all named arguments as casks.

**--formula**
> Treat all named arguments as formulae.

**--force** **-f**
> Delete all installed versions.

**--zap**
> Remove all files associated with a cask.

**--ignore-dependencies**
> Do not fail uninstall if dependent formulae exist.

# DESCRIPTION

**brew rm** is an alias for **brew uninstall** and **brew remove**. It uninstalls a formula or cask from the system.

All three commands (**rm**, **remove**, **uninstall**) are functionally identical.

# SEE ALSO

[brew](/man/brew)(1), [brew-remove](/man/brew-remove)(1), [brew-uninstall](/man/brew-uninstall)(1)
