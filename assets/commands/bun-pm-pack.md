# TAGLINE

Create a tarball of the package

# TLDR

**Pack the current package** into a .tgz archive

```bun pm pack```

**Pack without writing** to disk (dry run)

```bun pm pack --dry-run```

**Pack to a specific directory**

```bun pm pack --destination [path/to/dir]```

**Pack with a custom filename**

```bun pm pack --filename [package.tgz]```

**Pack with minimal output** (only print tarball name)

```bun pm pack --quiet```

# SYNOPSIS

**bun** **pm** **pack** [**--dry-run**] [**--destination** _dir_] [**--filename** _name_] [**--ignore-scripts**] [**--gzip-level** _0-9_] [**--quiet**]

# PARAMETERS

**--dry-run**
> Perform all tasks except writing the tarball to disk.

**--destination** _dir_
> Specify an output directory for the tarball. Cannot be combined with **--filename**.

**--filename** _name_
> Set the exact filename for the tarball. Cannot be combined with **--destination**.

**--ignore-scripts**
> Skip running prepack, postpack, and prepare scripts.

**--gzip-level** _0-9_
> Set gzip compression level. Default is **9** (maximum compression).

**--quiet**
> Only output the tarball filename, suppressing verbose output.

# DESCRIPTION

**bun pm pack** creates a compressed .tgz archive containing all files that would be published to npm, following the same inclusion and exclusion rules as npm pack. This is useful for inspecting what will be published before running **bun publish**, testing local packages, or sharing packages without a registry.

The command respects the **files** field in package.json, **.npmignore**, and **.gitignore** when determining which files to include.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1), [bun-publish](/man/bun-publish)(1)
