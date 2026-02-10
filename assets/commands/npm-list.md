# TAGLINE

displays the dependency tree of installed packages

# TLDR

**List installed packages**

```npm list```

**List global packages**

```npm list -g```

**List only top-level packages**

```npm list --depth=0```

**List as JSON**

```npm list --json```

**List specific package**

```npm list [package-name]```

**List production dependencies**

```npm list --prod```

# SYNOPSIS

**npm** **list** [_package_] [_options_]

# PARAMETERS

**-g**, **--global**
> List global packages.

**--depth** _n_
> Dependency tree depth.

**--json**
> Output as JSON.

**--prod**
> Production dependencies only.

**--dev**
> Development dependencies only.

**--all**
> Show all packages.

# DESCRIPTION

**npm list** displays the dependency tree of installed packages. Shows versions and relationships. Use depth=0 for top-level only. Alias: npm ls.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1)

