# TLDR

**Query dependencies**

```npm query "[name=lodash]"```

**Find dev dependencies**

```npm query ":type(dev)"```

**Find outdated**

```npm query ":outdated(major)"```

**Find vulnerabilities**

```npm query ":vuln"```

**Complex query**

```npm query "[name^=@babel]"```

# SYNOPSIS

**npm** **query** _selector_

# PARAMETERS

_SELECTOR_
> CSS-like query selector.

**--help**
> Display help information.

# DESCRIPTION

**npm query** queries dependency graph with selectors. CSS-like syntax for packages.

The command filters dependencies. Powerful package searching.

npm query searches packages.

# CAVEATS

CSS selector syntax. Added in npm 8.16. Complex queries possible.

# HISTORY

npm query was added to provide **CSS-like querying** of the dependency tree.

# SEE ALSO

[npm](/man/npm)(1), [npm-ls](/man/npm-ls)(1), [npm-explain](/man/npm-explain)(1)

