# TAGLINE

Remove dependencies from a uv project

# TLDR

**Remove dependency**

```uv remove [package]```

**Remove dev dependency**

```uv remove --dev [package]```

**Remove from optional group**

```uv remove --optional [group] [package]```

# SYNOPSIS

**uv** **remove** [_options_] _packages_...

# PARAMETERS

**--dev**
> Remove the package from the **[tool.uv.dev-dependencies]** group.

**--optional** _GROUP_
> Remove from the named optional dependency group in **pyproject.toml**.

**--group** _GROUP_
> Remove from the named PEP 735 dependency group.

**--script** _SCRIPT.PY_
> Operate on the dependency block of a single-file PEP 723 script instead of the project.

**--package** _PACKAGE_
> In a workspace, target the package member named _PACKAGE_.

**--frozen**
> Update **pyproject.toml** but leave **uv.lock** unchanged.

**--locked**
> Fail if **uv.lock** would need to change (CI guard).

**--no-sync**
> Skip syncing the project's virtual environment after the change.

# DESCRIPTION

**uv remove** removes dependencies from a Python project. Updates pyproject.toml and uv.lock. Automatically syncs the virtual environment.

# INSTALL

```dnf: sudo dnf install uv```

```pacman: sudo pacman -S uv```

```apk: sudo apk add uv```

```brew: brew install uv```

```nix: nix profile install nixpkgs#uv```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[uv](/man/uv)(1), [uv-add](/man/uv-add)(1), [uv-sync](/man/uv-sync)(1)

