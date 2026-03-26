# TAGLINE

Execute package binaries

# TLDR

**Run a package binary**, auto-installing if not present

```bun exec [package]```

**Run a specific version** of a package binary

```bun exec [package]@[version]```

**Force execution with Bun runtime** instead of Node.js

```bun exec --bun [package]```

**Specify package when binary name differs** from package name

```bun exec -p [package] [binary] [args...]```

**Run without installing** if package is not already available

```bun exec --no-install [binary]```

# SYNOPSIS

**bun** **exec** [_options_] _package_[@_version_] [_args..._]

# DESCRIPTION

**bun exec** auto-installs and runs a package binary from npm. It is an alias for **bun x** and **bunx**, Bun's equivalent of **npx**.

If the package binary is found in the local **node_modules/.bin**, that version is used. Otherwise, the package is downloaded into a global shared cache and executed from there.

By default, Bun respects **#!/usr/bin/env node** shebangs in executables and runs them with Node.js. Use **--bun** to override this and run with Bun's runtime instead.

# PARAMETERS

**--bun**
> Force the executable to run with Bun's runtime instead of Node.js, even if it contains a Node shebang. Must appear before the package name.

**-p**, **--package** _name_
> Specify the package to install when the binary name differs from the package name.

**--no-install**
> Do not auto-install the package; exit with an error if it is not already available.

**--silent**
> Suppress installation output.

**--verbose**
> Enable verbose output during installation.

# SEE ALSO

[bun](/man/bun)(1), [bun-x](/man/bun-x)(1), [bun-run](/man/bun-run)(1), [npx](/man/npx)(1)
