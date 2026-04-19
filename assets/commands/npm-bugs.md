# TAGLINE

opens the package's bug tracker URL in a web browser

# TLDR

**Open package bugs page**

```npm bugs [package-name]```

**Open bugs for current project**

```npm bugs```

# SYNOPSIS

**npm** **bugs** [_package_...]

**npm** **issues** [_package_...]

# PARAMETERS

**--browser** _BROWSER_
> Browser to use; set to `false` to print the URL instead.

**--registry** _URL_
> npm registry URL (default: https://registry.npmjs.org/).

**-w**, **--workspace** _NAME_
> Run in the context of a specific workspace.

**--workspaces**
> Run across all configured workspaces.

**--include-workspace-root**
> Include the root project when using workspaces.

# DESCRIPTION

**npm bugs** guesses the package's bug tracker URL (or support email `mailto:`) from package metadata and opens it in a web browser. If no package is specified, it uses the `package.json` in the current directory. The alias **npm issues** does the same thing.

# SEE ALSO

[npm](/man/npm)(1), [npm-docs](/man/npm-docs)(1), [npm-repo](/man/npm-repo)(1)

