# TLDR

**Display information about a formula**

```brew info [formula]```

**Display information about a cask**

```brew info --cask [cask]```

**Output formula info as JSON**

```brew info --json=v2 [formula]```

**Show info for all installed formulae**

```brew info --installed```

**Show verbose analytics data**

```brew info --analytics [formula]```

**Show installed formula sizes**

```brew info --size [formula]```

# SYNOPSIS

**brew info** [_options_] [_formula|cask_]

# DESCRIPTION

**brew info** displays information about a formula or cask including name, version, description, homepage, dependencies, installation status, and available options.

For disabled and deprecated formulae, it also provides an explanation of the status.

# PARAMETERS

**--json** _version_
> Output as JSON (v1 for formula default, v2 for formula and cask)

**--installed**
> Show info for installed formulae only

**--all**
> Evaluate all available formulae and casks

**--formula**
> Treat all arguments as formulae

**--cask**
> Treat all arguments as casks

**--analytics**
> Show verbose analytics data

**--size**
> Show size of installed formulae and casks

**--variations**
> Include variations hash in JSON output

**--github-packages-manifest**
> Fetch GitHub Packages manifest for extra information

# CAVEATS

JSON output format may vary between Homebrew versions. Analytics data requires network access to GitHub. Some information may not be available for all formulae.

# SEE ALSO

[brew](/man/brew)(1), [brew-search](/man/brew-search)(1), [brew-list](/man/brew-list)(1), [brew-install](/man/brew-install)(1)
