# TAGLINE

Patch installed packages locally

# TLDR

**Prepare a package for patching**

```bun patch [package-name]```

**Apply patches** after modifications

```bun patch --commit [package-name]```

# SYNOPSIS

**bun** **patch** [_options_] _package-name_

# PARAMETERS

**--commit**
> Commit the patch after making modifications.

# DESCRIPTION

**bun patch** allows you to make local modifications to installed packages. It extracts a package to a temporary directory for editing. After making changes, use **--commit** to create a patch file that will be applied on future installs.

This is useful for fixing bugs in dependencies without forking or waiting for upstream fixes.

# CAVEATS

Patches are stored in a patches directory and must be committed to version control. Patches may break when the package is updated.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1)
