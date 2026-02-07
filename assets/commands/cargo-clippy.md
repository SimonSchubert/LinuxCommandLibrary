# TAGLINE

Rust linter for catching common mistakes

# TLDR

**Run clippy lints**

```cargo clippy```

**Lint all targets**

```cargo clippy --all-targets```

**Lint with all features**

```cargo clippy --all-features```

**Fail on warnings (for CI)**

```cargo clippy -- -D warnings```

**Allow specific lint**

```cargo clippy -- -A clippy::[lint_name]```

**Warn on specific lint**

```cargo clippy -- -W clippy::[lint_name]```

**Automatically fix issues**

```cargo clippy --fix```

**Full CI check**

```cargo clippy --all-targets --all-features -- -D warnings```

# SYNOPSIS

**cargo clippy** [_options_] [-- _clippy_options_]

# DESCRIPTION

**cargo clippy** is the Rust linter that catches common mistakes and suggests improvements. Part of the Rust toolchain via rustup. Runs the default clippy::all lint group.

# PARAMETERS

**--all-targets**
> Lint all targets (lib, bin, tests, examples, benches)

**--all-features**
> Enable all available features

**--features** _features_
> Enable specified features

**--release**
> Lint in release mode

**--workspace**
> Lint all workspace members

**--fix**
> Automatically apply suggested fixes

**-- -A** _lint_
> Allow specified lint

**-- -W** _lint_
> Warn on specified lint

**-- -D** _lint_
> Deny specified lint (treat as error)

# LINT GROUPS

**clippy::correctness**
> Deny-by-default, catches outright bugs

**clippy::style**
> Idiomatic code suggestions

**clippy::complexity**
> Simplification suggestions

**clippy::perf**
> Performance improvements

**clippy::pedantic**
> Stricter, more opinionated lints

# INSTALLATION

Included with Rust toolchain. Install/update via:

```rustup component add clippy```

# CAVEATS

Some lints are opinionated. Use lint configuration to customize for your project. The --fix option modifies files in place.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-check](/man/cargo-check)(1), [rustfmt](/man/rustfmt)(1)
