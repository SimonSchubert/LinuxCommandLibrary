# TLDR

**Create shrinkwrap file**

```npm shrinkwrap```

**Include dev dependencies**

```npm shrinkwrap --dev```

# SYNOPSIS

**npm** **shrinkwrap** [_options_]

# PARAMETERS

**--dev**
> Include devDependencies.

**--help**
> Display help information.

# DESCRIPTION

**npm shrinkwrap** creates npm-shrinkwrap.json. Locks dependency versions for publishing.

The command creates publishable lockfile. Unlike package-lock.json, included in package.

npm shrinkwrap locks versions.

# CAVEATS

Published with package. Overrides package-lock.json. Use for libraries.

# HISTORY

npm shrinkwrap provides **version locking** that travels with published packages.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [package-lock.json](/man/package-lock.json)(5)

