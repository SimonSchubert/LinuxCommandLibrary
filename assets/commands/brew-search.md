# TAGLINE

Search for available Homebrew packages

# TLDR

**Search for formula or cask**

```brew search [text]```

**Search formulae only**

```brew search --formula [text]```

**Search casks only**

```brew search --cask [text]```

**Search using regular expression**

```brew search /[regex]/```

**List all available formulae**

```brew search```

**Search and output as JSON**

```brew search --json [text]```

**Search with descriptions**

```brew search --desc [text]```

# SYNOPSIS

**brew search** [_options_] [_text|/regex/_]

# DESCRIPTION

**brew search** queries the local Homebrew repository for formulae and casks matching the search term. It searches package names, tokens, and descriptions. The search extends online to homebrew/core and homebrew/cask repositories.

Without arguments, it lists all locally available formulae.

# PARAMETERS

**--formula**
> Search only formulae (CLI packages)

**--cask**
> Search only casks (GUI applications)

**--desc**
> Include package descriptions in search

**--json**
> Output results in JSON format

**--pull-request**
> Search for GitHub pull requests containing text

**--open**
> Search only open pull requests

**--closed**
> Search only closed pull requests

# REGULAR EXPRESSIONS

Wrapping search term in slashes enables regex:

```brew search /^python@/```

Searches for packages starting with "python@"

# CAVEATS

Search results include both installed and available packages. Use brew info for detailed information about specific packages. The search is case-insensitive by default.

# SEE ALSO

[brew](/man/brew)(1), [brew-info](/man/brew-info)(1), [brew-install](/man/brew-install)(1), [brew-list](/man/brew-list)(1)
