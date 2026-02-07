# TAGLINE

Rust linter for catching common mistakes

# TLDR

**Run clippy on project**

```cargo clippy```

**Run clippy and fix** issues automatically

```cargo clippy --fix```

**Run clippy on all targets**

```cargo clippy --all-targets```

**Deny all warnings** (treat as errors)

```cargo clippy -- -D warnings```

**Allow specific lint**

```cargo clippy -- -A clippy::[lint_name]```

**Show all available lints**

```cargo clippy --list```

**Run clippy in release mode**

```cargo clippy --release```

# SYNOPSIS

**cargo clippy** [_options_] [-- _clippy_options_]

# DESCRIPTION

**clippy** is a collection of lints to catch common mistakes and improve Rust code. It provides hundreds of lints covering correctness, style, performance, complexity, and more.

Clippy integrates with Cargo and analyzes code during compilation, providing actionable warnings. Lints range from simple style suggestions to detecting subtle bugs and performance issues. Many lints include automatic fixes that can be applied with `--fix`.

# PARAMETERS

**--fix**
> Automatically apply lint suggestions.

**--all-targets**
> Check all targets including tests and examples.

**--all-features**
> Check with all features enabled.

**--release**
> Check in release mode.

**--list**
> List all available lints.

**-- -D** _lint_
> Deny specific lint (treat as error).

**-- -W** _lint_
> Warn on specific lint.

**-- -A** _lint_
> Allow (ignore) specific lint.

**-- -F** _lint_
> Forbid lint (cannot be overridden).

# LINT CATEGORIES

**clippy::correctness**: Likely bugs
**clippy::suspicious**: Questionable code
**clippy::style**: Style improvements
**clippy::complexity**: Overly complex code
**clippy::perf**: Performance improvements
**clippy::pedantic**: Stricter lints
**clippy::nursery**: Experimental lints

# CAVEATS

Some lints may have false positives. Pedantic lints can be noisy. Automatic fixes should be reviewed. May conflict with rustfmt on some suggestions.

# HISTORY

**clippy** was created by **Manish Goregaokar** and others starting in **2014** as a third-party tool. The name references Microsoft's Office assistant. It became an official Rust component in **2018**, distributed via rustup. Clippy has grown to include over 600 lints and is widely used in the Rust ecosystem.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [rustfmt](/man/rustfmt)(1), [rustup](/man/rustup)(1)
