# TAGLINE

Patch installed packages locally

# TLDR

**Prepare a package for patching**

```bun patch [package-name]```

**Apply patches** after modifications

```bun patch --commit [package-name]```

**Commit with custom patches directory**

```bun patch --commit [package-name] --patches-dir=[mypatches]```

**Patch a specific version**

```bun patch [package-name]@[1.2.3]```

# SYNOPSIS

**bun** **patch** [_options_] _package-name_

# PARAMETERS

**--commit** _path-or-pkg_
> Generate a .patch file from modifications. Accepts package name or path to patched package.

**--patches-dir** _dir_
> Directory to store patch files. Default: patches.

# DESCRIPTION

**bun patch** allows you to persistently patch node_modules in a maintainable, git-friendly way. It extracts a package for editing, and after making changes, **--commit** creates a .patch file that is applied on future installs.

Patch files are stored in a patches directory and tracked via "patchedDependencies" in package.json. They can be committed to your repository and reused across multiple installs, projects, and machines.

You can supply a package name, a precise version (if multiple versions are installed), or the path to the package in node_modules.

# CAVEATS

Patches are stored in a patches directory and must be committed to version control. Patches may break when the package is updated.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1)
