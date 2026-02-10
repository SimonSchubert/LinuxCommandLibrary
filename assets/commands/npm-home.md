# TAGLINE

opens package homepage in browser

# TLDR

**Open package homepage**

```npm home [package-name]```

**Open current project homepage**

```npm home```

**Open multiple package homepages**

```npm home [package1] [package2]```

# SYNOPSIS

**npm** **home** [_packages_]

# PARAMETERS

_PACKAGES_
> Package names.

**--help**
> Display help information.

# DESCRIPTION

**npm home** opens package homepage in browser. Uses homepage field from package.json.

The command navigates to project website. Alias for npm docs.

# CAVEATS

Requires browser. Falls back to npm registry. Uses package.json homepage.

# HISTORY

npm home provides **quick access** to package homepages from the command line.

# SEE ALSO

[npm](/man/npm)(1), [npm-docs](/man/npm-docs)(1), [npm-repo](/man/npm-repo)(1)

