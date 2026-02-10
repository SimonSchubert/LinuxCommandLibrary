# TAGLINE

removes packages not in dependencies

# TLDR

**Remove extraneous packages**

```npm prune```

**Remove dev dependencies**

```npm prune --production```

**Dry run**

```npm prune --dry-run```

**JSON output**

```npm prune --json```

# SYNOPSIS

**npm** **prune** [_options_]

# PARAMETERS

**--production**
> Remove devDependencies.

**--dry-run**
> Show what would be removed.

**--json**
> JSON output format.

**--help**
> Display help information.

# DESCRIPTION

**npm prune** removes packages not in dependencies. Cleans up extraneous packages.

The command removes unlisted modules. Useful after dependency changes.

# CAVEATS

Removes packages. Use dry-run first. Production mode removes dev deps.

# HISTORY

npm prune provides **dependency cleanup** by removing packages not listed in package.json.

# SEE ALSO

[npm](/man/npm)(1), [npm-ls](/man/npm-ls)(1), [npm-dedupe](/man/npm-dedupe)(1)

