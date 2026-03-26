# TAGLINE

Patch installed packages locally

# TLDR

**Prepare a package for patching**

```bun patch [package-name]```

**Prepare a specific version** for patching

```bun patch [package-name]@[1.2.3]```

**Commit patches** after making modifications

```bun patch --commit [package-name]```

**Commit with a custom patches directory**

```bun patch --commit [package-name] --patches-dir=[mypatches]```

**Patch using the path** to the package in node_modules

```bun patch --commit node_modules/[package-name]```

# SYNOPSIS

**bun** **patch** [_options_] _package-name_

# PARAMETERS

**--commit** _path-or-pkg_
> Generate a .patch file from modifications. Accepts package name, name@version, or path to patched package.

**--patches-dir** _dir_
> Directory to store patch files (only with --commit). Default: patches.

**-p, --production**
> Don't install devDependencies

**--frozen-lockfile**
> Disallow changes to the lockfile

**--dry-run**
> Don't install anything, only show what would be done

**--ignore-scripts**
> Skip lifecycle scripts in the project's package.json

**-f, --force**
> Always request the latest versions from the registry and reinstall all dependencies

**--verbose**
> Enable verbose logging output

# DESCRIPTION

**bun patch** allows you to persistently patch node_modules in a maintainable, git-friendly way. It extracts a package for editing, and after making changes, **--commit** creates a .patch file that is applied on future installs.

Patch files are stored in a patches directory and tracked via "patchedDependencies" in package.json. They can be committed to your repository and reused across multiple installs, projects, and machines.

You can supply a package name, a precise version (if multiple versions are installed), or the path to the package in node_modules.

# CAVEATS

Patches are stored in a patches directory and must be committed to version control. Patches may break when the package is updated.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [bun-add](/man/bun-add)(1), [bun-update](/man/bun-update)(1)
