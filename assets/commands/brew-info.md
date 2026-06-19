# TAGLINE

Display details about a Homebrew package

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

```brew info --sizes [formula]```

**Open the formula source page on GitHub**

```brew info --github [formula]```

# SYNOPSIS

**brew info** [_options_] [_formula|cask_]

# DESCRIPTION

**brew info** displays information about a formula or cask including name, version, description, homepage, dependencies, installation status, and available options.

For disabled and deprecated formulae, it also provides an explanation of the status.

# PARAMETERS

**--json** _version_
> Print a JSON representation. The default version is v1 for formula, use v2 for formula and cask

**--installed**
> Output a human-readable inventory of installed formulae and casks

**--formula**
> Treat all arguments as formulae

**--cask**
> Treat all arguments as casks

**--analytics**
> Show global analytics data instead of formula or cask info

**--days** _count_
> Show analytics over the given period, one of 30, 90 or 365 days

**--github**
> Open the GitHub source page for the formula or cask in a browser

**--sizes**
> Show the size of installed formulae and casks

**--variations**
> Include the variations hash in each formula's JSON output

# CAVEATS

JSON output format may vary between Homebrew versions. Analytics data requires network access to GitHub. Some information may not be available for all formulae.

# SEE ALSO

[brew](/man/brew)(1), [brew-search](/man/brew-search)(1), [brew-list](/man/brew-list)(1), [brew-install](/man/brew-install)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/brew)```

```[Homepage](https://brew.sh)```

```[Documentation](https://docs.brew.sh)```

<!-- verified: 2026-06-19 -->
