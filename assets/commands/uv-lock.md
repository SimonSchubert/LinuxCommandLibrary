# TLDR

**Create/update lockfile**

```uv lock```

**Lock with upgrade**

```uv lock --upgrade```

**Lock specific package upgrade**

```uv lock --upgrade-package [package]```

# SYNOPSIS

**uv** **lock** [_options_]

# PARAMETERS

**--upgrade**
> Update all packages.

**--upgrade-package** _pkg_
> Update specific package.

**--frozen**
> Error if lock needs update.

# DESCRIPTION

**uv lock** resolves dependencies and creates uv.lock file. Lockfile pins exact versions for reproducible installations. Run after modifying pyproject.toml dependencies.

# SEE ALSO

[uv](/man/uv)(1), [uv-sync](/man/uv-sync)(1), [uv-add](/man/uv-add)(1)

