# TAGLINE

List Homebrew packages with available updates

# TLDR

**List outdated packages**

```brew outdated```

**List outdated formulae only**

```brew outdated --formula```

**List outdated casks only**

```brew outdated --cask```

**Show verbose version information**

```brew outdated --verbose```

**Output as JSON**

```brew outdated --json```

**Include auto-updating casks**

```brew outdated --greedy```

**Quiet mode (names only)**

```brew outdated --quiet```

# SYNOPSIS

**brew outdated** [_options_]

# DESCRIPTION

**brew outdated** lists installed formulae and casks that have newer versions available. By default, version information is shown in interactive shells.

The command uses locally cached package information. Run **brew update** first to ensure accurate results.

# PARAMETERS

**--formula**
> List outdated formulae only

**--cask**
> List outdated casks only

**--verbose, -v**
> Show detailed version information

**--quiet, -q**
> List names only (takes precedence over --verbose)

**--json**
> Output in JSON format (v2 includes both formulae and casks)

**-g, --greedy**
> Also include outdated casks with version :latest or auto_updates true

**--greedy-latest**
> Also include outdated casks including those with version :latest

**--greedy-auto-updates**
> Also include outdated casks including those with auto_updates true

**--fetch-HEAD**
> Fetch the upstream repository to detect outdated HEAD installations

# OUTPUT FORMAT

Default: package_name (installed_version) != available_version

Quiet mode: package_name only

JSON: Full metadata including versions and timestamps

# CAVEATS

Does not perform network requests; relies on local cache from brew update. Casks with auto_updates are excluded unless --greedy is specified. Some casks use :latest version which cannot be compared.

# SEE ALSO

[brew](/man/brew)(1), [brew-update](/man/brew-update)(1), [brew-upgrade](/man/brew-upgrade)(1), [brew-list](/man/brew-list)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/brew)```

```[Homepage](https://brew.sh)```

```[Documentation](https://docs.brew.sh)```

<!-- verified: 2026-06-19 -->
