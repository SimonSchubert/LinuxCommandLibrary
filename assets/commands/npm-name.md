# TAGLINE

checks if package names are available on npm

# TLDR

**Check if name available**

```npm-name [package-name]```

**Check multiple names**

```npm-name [name1] [name2] [name3]```

**Check scoped name**

```npm-name [@scope/name]```

# SYNOPSIS

**npm-name** [_names_]

# PARAMETERS

_NAMES_
> Package names to check.

**--help**
> Display help information.

# DESCRIPTION

**npm-name** checks if package names are available on the npm registry. It queries the npm registry API and reports whether each name is free to use or already taken. Supports scoped packages (@scope/name). Useful before publishing a new package to avoid name conflicts.

# CAVEATS

Third-party tool; install with **npm install -g npm-name-cli**. Requires network access to query the npm registry. Does not check for trademark conflicts or similar names.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1)

