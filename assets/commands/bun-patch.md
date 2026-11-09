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

**Check a commit** without writing anything

```bun patch --commit [package-name] --dry-run```

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
> Print what the command would do, with or without **--commit**, and leave the project as it is.

**--ignore-scripts**
> Skip lifecycle scripts for all packages, including the project's package.json and trusted dependencies.

**-f, --force**
> Always request the latest versions from the registry and reinstall all dependencies

**--verbose**
> Enable verbose logging output

# DESCRIPTION

**bun patch** allows you to persistently patch node_modules in a maintainable, git-friendly way. It extracts a package for editing, and after making changes, **--commit** creates a .patch file that is applied on future installs.

Patch files are stored in a patches directory and tracked via "patchedDependencies" in the root package.json. **bun patch-commit** is available as an alias of **bun patch --commit** for pnpm compatibility. They can be committed to your repository and reused across multiple installs, projects, and machines.

You can supply a package name, a precise version (if multiple versions are installed), or the path to the package in node_modules.

# CAVEATS

Always run **bun patch** before editing: it replaces the package in node_modules with an unlinked copy, otherwise edits may change the global cache. **bun install** fails if a file listed in "patchedDependencies" is missing. Patches may break when the package is updated.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [bun-add](/man/bun-add)(1), [bun-update](/man/bun-update)(1)

# RESOURCES

```[Source code](https://github.com/oven-sh/bun)```

```[Homepage](https://bun.com)```

```[Documentation](https://bun.com/docs/pm/cli/patch)```

<!-- verified: 2026-11-09 -->
