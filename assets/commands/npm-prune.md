# TAGLINE

removes packages not in dependencies

# TLDR

**Remove extraneous packages**

```npm prune```

**Remove devDependencies**

```npm prune --omit=dev```

**Dry run to see what would be removed**

```npm prune --dry-run```

**Output results as JSON**

```npm prune --json```

**Prune a specific package**

```npm prune [package_name]```

# SYNOPSIS

**npm** **prune** [[_@scope/_]_pkg_...] [_options_]

# PARAMETERS

**--omit** _type_
> Dependency types to omit: dev, optional, or peer. Can be set multiple times.

**--dry-run**
> Show what would be removed without making changes.

**--json**
> Output results in JSON format.

**--production**
> Deprecated alias for --omit=dev.

# DESCRIPTION

**npm prune** removes extraneous packages not listed in the project's dependency tree. Extraneous packages are those installed but not referenced in **package.json** or any dependency's package.json.

If **--omit=dev** is specified or the **NODE_ENV** environment variable is set to **production**, devDependencies are also removed. This is useful for preparing production deployments.

When a package name is provided, only that package is pruned if it is extraneous.

# CAVEATS

Use **--dry-run** first to verify what will be removed. The **--production** flag is deprecated in favor of **--omit=dev**.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [npm-ls](/man/npm-ls)(1), [npm-dedupe](/man/npm-dedupe)(1)

