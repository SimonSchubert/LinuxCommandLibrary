# TAGLINE

Change a Rust package version in Cargo.toml

# TLDR

**Set** an exact version

```cargo set-version [1.0.0]```

**Bump major** version

```cargo set-version --bump major```

**Bump minor** version

```cargo set-version --bump minor```

**Bump patch** version

```cargo set-version --bump patch```

**Apply to whole workspace**

```cargo set-version --workspace --bump patch```

**Dry-run**

```cargo set-version -n --bump minor```

# SYNOPSIS

**cargo set-version** [*options*] [*TARGET*]

# DESCRIPTION

**cargo set-version** (from **cargo-edit**) changes the **version** field in a local **Cargo.toml**. You can set an absolute version or bump major/minor/patch. Workspace-wide updates are supported.

Install with **cargo install cargo-edit**.

# PARAMETERS

*TARGET*

> Absolute version to set (for example **1.2.3**), when not using **--bump**.

**--bump** major|minor|patch|...

> Increment the corresponding semver component.

**-m**, **--metadata** *METADATA*

> Set the version metadata field (for example build metadata).

**-p**, **--package** *PKGID*

> Select a package in a workspace.

**--workspace**

> Modify all packages in the workspace.

**--exclude** *EXCLUDE*

> Skip crates when using workspace mode.

**-n**, **--dry-run**

> Print changes without writing files.

**--manifest-path** *PATH*

> Path to the manifest to edit.

**--offline**

> Run without network access.

**--locked**

> Require Cargo.toml to be up to date with the lockfile as configured.

See **cargo set-version --help** for the complete flag set.

# CAVEATS

Does not publish crates; it only edits manifests. Coordinate version bumps with tags and changelog process separately. Workspace bumps can touch many crates at once; use **--dry-run** first.

# SEE ALSO

[cargo-upgrade](/man/cargo-upgrade)(1), [cargo-add](/man/cargo-add)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/killercup/cargo-edit)```

<!-- verified: 2026-07-19 -->
