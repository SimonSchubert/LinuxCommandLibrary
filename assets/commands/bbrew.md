# TAGLINE

CLI tool for searching Homebrew and Linuxbrew formulae and casks

# TLDR

**Search for a formula**

```bbrew search [query]```

**Search with descriptions hidden**

```bbrew search --no-desc [query]```

**Search formulae only** (exclude casks)

```bbrew search --no-casks [query]```

**Search casks only** (exclude formulae)

```bbrew search --no-formulae [query]```

**Display help**

```bbrew --help```

# SYNOPSIS

**bbrew** **search** [_options_] [_query_]

# PARAMETERS

**search** _query_
> Search for formulae and casks matching the query.

**-h**, **--help**
> Show help information.

**-d**, **--desc** / **--no-desc**
> Show or hide formula descriptions in results (shown by default).

**-c**, **--casks** / **--no-casks**
> Include or exclude cask results (included by default on macOS).

**-f**, **--formulae** / **--no-formulae**
> Include or exclude formulae results (included by default).

# DESCRIPTION

**bbrew** is a command-line tool that provides a faster way to search Homebrew and Linuxbrew package repositories. Rather than invoking the local Homebrew installation, it queries the formulae.brew.sh API directly, fetching metadata for both core formulae and casks. Results are filtered client-side with case-insensitive matching against package names, aliases, and descriptions.

Built with Node.js and the oclif CLI framework, bbrew supports both macOS (Homebrew) and Linux (Linuxbrew). On macOS, cask searching is enabled by default. The tool uses file-based caching via keyv to speed up repeated queries by avoiding redundant API calls.

# CAVEATS

The tool does not manage or install packages. It is a search-only interface that queries the Homebrew API. Requires Node.js to be installed. The project is at version 0.0.1 and has minimal documentation.

# SEE ALSO

[brew](/man/brew)(1), [npm](/man/npm)(1)
