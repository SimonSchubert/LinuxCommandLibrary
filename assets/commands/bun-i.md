# TLDR

**Install all dependencies** from package.json

```bun i```

**Install a specific package**

```bun i [package]```

**Install a package** as a dev dependency

```bun i -d [package]```

**Install a specific version**

```bun i [package]@[version]```

**Install packages globally**

```bun i -g [package]```

**Install without updating lockfile**

```bun i --frozen-lockfile```

# SYNOPSIS

**bun** **i** [_options_] [_packages..._]

# PARAMETERS

**-d**, **--dev**
> Install as a development dependency.

**-g**, **--global**
> Install packages globally.

**--frozen-lockfile**
> Don't update the lockfile.

**--no-save**
> Don't save to package.json.

**--production**
> Don't install devDependencies.

# DESCRIPTION

**bun i** is an alias for **bun install**. It installs dependencies for a project from package.json, or adds new packages to the project.

Bun's package manager is significantly faster than npm or yarn due to its native implementation and efficient caching.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [bun-remove](/man/bun-remove)(1)
