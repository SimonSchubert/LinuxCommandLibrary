# TAGLINE

shows why a package is installed

# TLDR

**Explain why a package is installed**

```npm why [package-name]```

**Explain a specific version**

```npm why [package-name]@[version]```

**JSON output**

```npm why [package-name] --json```

**Limit depth** of the dependency tree

```npm why [package-name] --long```

**Target a specific workspace**

```npm why [package-name] --workspace=[workspace-name]```

# SYNOPSIS

**npm** **why** _package-spec_...

# PARAMETERS

_PACKAGE-SPEC_
> Package name, optionally with version range (e.g., lodash@^4).

**--json**
> Output results in JSON format.

**--long**
> Show extended information.

**--workspace** _NAME_
> Limit to a named workspace or path.

**--include-workspace-root**
> Include root project in addition to workspaces.

**--help**
> Display help information.

# DESCRIPTION

**npm why** shows why a package is installed. Alias for npm explain.

The command traces dependency paths. Shows all routes to package.

# CAVEATS

Alias for npm explain. Shows all dependency paths. Requires installed package.

# HISTORY

npm why provides **dependency tracing** to understand package relationships.

# SEE ALSO

[npm](/man/npm)(1), [npm-explain](/man/npm-explain)(1), [npm-ls](/man/npm-ls)(1)

