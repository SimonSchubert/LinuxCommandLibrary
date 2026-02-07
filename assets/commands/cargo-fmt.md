# TAGLINE

Format Rust source code with rustfmt

# TLDR

**Format current package**

```cargo fmt```

**Format all packages in workspace**

```cargo fmt --all```

**Check formatting without changes**

```cargo fmt --check```

**Format specific package**

```cargo fmt -p [package]```

**Show diff of changes**

```cargo fmt -- --emit diff```

**Format with verbose output**

```cargo fmt --verbose```

# SYNOPSIS

**cargo fmt** [_options_] [-- _rustfmt_options_]

# DESCRIPTION

**cargo fmt** formats all bin and lib files of the current crate using rustfmt. Formats .rs files in src/, tests/, examples/, and integration tests. Reformats code in-place by default.

# PARAMETERS

**--all**
> Format all packages in workspace

**--check**
> Check formatting without modifying files (for CI)

**-p**, **--package** _name_
> Format specific package

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

**-- --emit** _mode_
> Output mode: files, stdout, diff

**-- --edition** _year_
> Override Rust edition

# CONFIGURATION

Create rustfmt.toml or .rustfmt.toml in project root:

```toml
max_width = 100
tab_spaces = 4
edition = "2021"
```

# CI INTEGRATION

```cargo fmt --all -- --check```

Exits with non-zero code if formatting issues found.

# CAVEATS

Edition automatically read from Cargo.toml. Direct rustfmt defaults to 2015 edition. Set style_edition in config for consistency.

# SEE ALSO

[cargo](/man/cargo)(1), [rustfmt](/man/rustfmt)(1), [cargo-clippy](/man/cargo-clippy)(1)
