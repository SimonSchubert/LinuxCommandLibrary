# TAGLINE

Resolve and lock project dependencies

# TLDR

**Create or update** the lockfile

```uv lock```

**Upgrade all packages** to latest compatible versions

```uv lock --upgrade```

**Upgrade a specific package** to its latest version

```uv lock --upgrade-package [package]```

**Check if the lockfile is up-to-date** without modifying it

```uv lock --check```

**Lock with a specific Python version**

```uv lock --python [3.12]```

# SYNOPSIS

**uv** **lock** [_options_]

# PARAMETERS

**--upgrade**
> Allow all packages to be upgraded to their latest compatible versions.

**--upgrade-package** _pkg_
> Allow a specific package to be upgraded.

**--check**
> Check if the lockfile is up-to-date; error if it needs updating.

**--frozen**
> Use the existing lockfile without checking if it is up-to-date.

**--locked**
> Assert that the lockfile matches pyproject.toml; error otherwise.

**--no-sources**
> Ignore the tool.uv.sources table when resolving dependencies.

**--python** _VERSION_
> Resolve for a specific Python version.

# DESCRIPTION

**uv lock** resolves project dependencies declared in pyproject.toml and writes exact pinned versions to a uv.lock file. The lockfile ensures reproducible installations across environments. Run after modifying pyproject.toml dependencies.

Locking is automatic when running **uv sync**, **uv run**, or **uv add**, but can be run explicitly to update the lockfile without installing packages.

# SEE ALSO

[uv](/man/uv)(1), [uv-sync](/man/uv-sync)(1), [uv-add](/man/uv-add)(1)
