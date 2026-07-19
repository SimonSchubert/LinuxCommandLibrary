# TAGLINE

Upgrade dependency versions in Cargo.toml

# TLDR

**Upgrade all** dependencies to latest compatible versions

```cargo upgrade```

**Upgrade specific** crates to version requirements

```cargo upgrade -p [docopt@~0.9] -p [serde@>=0.9,<2.0]```

**Upgrade all except** listed crates

```cargo upgrade --exclude [docopt] --exclude [serde]```

**Dry-run** without writing Cargo.toml

```cargo upgrade -n```

**Allow incompatible** (breaking) upgrades

```cargo upgrade --incompatible allow```

# SYNOPSIS

**cargo upgrade** [*options*]

# DESCRIPTION

**cargo upgrade** (from the **cargo-edit** project) updates version *requirements* in **Cargo.toml** to newer releases. It differs from **cargo update**, which only refreshes **Cargo.lock** within existing requirements.

Install with **cargo install cargo-edit**. Note that **cargo add** and **cargo rm** were integrated into Cargo itself (1.62 and 1.66+); **upgrade** and **set-version** remain cargo-edit subcommands.

# PARAMETERS

**-n**, **--dry-run**

> Print planned changes without modifying manifests.

**-p**, **--package** *PKGID[@VERSION]*

> Limit upgrade to a crate, optionally with a target version requirement.

**--exclude** *PKGID*

> Skip a crate.

**--compatible** allow|ignore

> Whether to upgrade within compatible versions (default **allow**).

**-i**, **--incompatible** allow|ignore

> Whether to bump to latest incompatible versions (default **ignore**).

**--pinned** allow|ignore

> Whether to upgrade pinned requirements to latest incompatible (default **ignore**).

**--manifest-path** *PATH*

> Path to the Cargo.toml to edit.

**--recursive** true|false

> Recursively update locked dependencies.

**-v** / **-q**

> Increase / decrease verbosity.

See **cargo upgrade --help** for the full option list.

# CAVEATS

Incompatible upgrades can break builds; review the diff and run tests. Requires network access to the crate registry unless offline flags apply. Workspace members may need **--manifest-path** or package selection.

# SEE ALSO

[cargo-add](/man/cargo-add)(1), [cargo-update](/man/cargo-update)(1), [cargo-set-version](/man/cargo-set-version)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/killercup/cargo-edit)```

<!-- verified: 2026-07-19 -->
