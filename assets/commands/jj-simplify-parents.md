# TAGLINE

removes redundant parent edges from merge commits

# TLDR

**Simplify parents** of all mutable revisions reachable from the working copy

```jj simplify-parents```

**Simplify a specific revision**

```jj simplify-parents -r [revision]```

Simplify a revision **and all its descendants**

```jj simplify-parents -s [revision]```

# SYNOPSIS

**jj** **simplify-parents** [_options_]

# PARAMETERS

**-r**, **--revision** _revsets_
> Simplify the specified revision(s). Can be repeated.

**-s**, **--source** _revsets_
> Simplify the specified revision(s) together with their descendants. Can be repeated.

# DESCRIPTION

**jj simplify-parents** removes redundant parent edges from merge commits. If a revision A has parents B and C, and C is already an ancestor of B, A is rewritten to have only B as its parent.

This never changes the contents of any revision, including the working copy. Without **-r** or **-s**, it uses the **revsets.simplify-parents** setting, or **reachable(@, mutable())** if unset.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-rebase](/man/jj-rebase)(1), [jj-parallelize](/man/jj-parallelize)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-simplify-parents)```

<!-- verified: 2026-09-29 -->
