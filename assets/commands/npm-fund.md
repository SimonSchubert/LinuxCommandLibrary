# TAGLINE

Retrieve funding information for project dependencies

# TLDR

**List all dependencies looking for funding**

```npm fund```

**Show funding info for a specific package**

```npm fund [package-name]```

**Output funding information as JSON**

```npm fund --json```

**Open a specific funding URL when multiple sources exist**

```npm fund [package-name] --which [1]```

**List funding info for a specific workspace**

```npm fund --workspace [workspace-name]```

# SYNOPSIS

**npm** **fund** [_package-spec_]

# PARAMETERS

_package-spec_
> Package to retrieve funding information for.

**--json**
> Output JSON data rather than the normal output.

**--which** _NUM_
> When there are multiple funding sources, specifies which 1-indexed source URL to open.

**--browser** _BROWSER_
> Browser to use for opening funding URLs. Set to false to print URLs to terminal instead.

**--unicode**
> Use unicode characters in tree output. When false, uses ASCII characters instead.

**--workspace** _WORKSPACE_
> Filter results to the specified workspace(s).

# DESCRIPTION

**npm fund** retrieves information on how to fund the dependencies of a given project. If no package name is provided, it lists all dependencies that are looking for funding in a tree structure showing the type of funding and URL to visit.

If a package name is provided, it tries to open its funding URL using the configured browser. If there are multiple funding sources for the package, the user will be instructed to pass the **--which** option to disambiguate.

# CAVEATS

Requires funding metadata in package.json. Opens browser for URLs by default. Funding is voluntary support for open source maintainers.

# HISTORY

**npm fund** was introduced in **npm 8** to help open source maintainers receive financial support from their users.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [npm-docs](/man/npm-docs)(1), [npm-ls](/man/npm-ls)(1), [npm-config](/man/npm-config)(1)

