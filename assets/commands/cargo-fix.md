# TAGLINE

Automatically fix compiler warnings in Rust code

# TLDR

**Fix all warnings**

```cargo fix```

**Fix all targets**

```cargo fix --all-targets```

**Fix with all features enabled**

```cargo fix --all-features```

**Migrate to new edition**

```cargo fix --edition```

**Fix even with compiler errors**

```cargo fix --broken-code```

**Allow dirty working directory**

```cargo fix --allow-dirty```

**Allow uncommitted changes**

```cargo fix --allow-staged```

**Fix a specific package in a workspace**

```cargo fix -p [package_name]```

# SYNOPSIS

**cargo fix** [_options_]

# DESCRIPTION

**cargo fix** automatically applies rustc's suggested fixes to source code. Runs **cargo check** internally and applies machine-applicable suggestions from diagnostics.

# PARAMETERS

**--edition**
> Apply fixes for edition migration.

**--edition-idioms**
> Apply edition-specific idiom changes for the current edition.

**--broken-code**
> Fix code even with existing compiler errors. Leaves broken code for manual inspection.

**--allow-dirty**
> Allow fixes on a dirty working directory (including staged changes).

**--allow-staged**
> Allow fixes with staged changes.

**--allow-no-vcs**
> Allow fixes even if no version control system is detected.

**--all-targets**
> Fix all targets (lib, bins, tests, benches, examples).

**--all-features**
> Activate all available features.

**--no-default-features**
> Do not activate the default feature.

**-F**, **--features** _features_
> Space or comma-separated list of features to activate.

**--lib**
> Fix library only.

**--bins**
> Fix all binaries.

**--tests**
> Fix all test targets.

**--benches**
> Fix all benchmark targets.

**--examples**
> Fix all example targets.

**-p**, **--package** _spec_
> Fix specific packages.

**--workspace**
> Fix all workspace members.

**--exclude** _spec_
> Exclude specified packages (requires **--workspace**).

**--target** _triple_
> Fix for the specified target architecture.

**-j**, **--jobs** _N_
> Number of parallel jobs to run.

# EDITION MIGRATION

```cargo fix --edition```

Migrates code from one Rust edition to the next (e.g., 2021 to 2024). After running, update the **edition** field in **Cargo.toml** manually.

# CAVEATS

Can only fix normally compiled code. Conditionally compiled code requires appropriate **--features** or **--target** flags. Built into Cargo since Rust 1.29. By default, requires a clean VCS state; use **--allow-dirty** or **--allow-staged** to override.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-check](/man/cargo-check)(1), [cargo-clippy](/man/cargo-clippy)(1), [cargo-build](/man/cargo-build)(1)
