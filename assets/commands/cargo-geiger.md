# TAGLINE

Detect unsafe Rust code in dependency tree

# TLDR

**Scan** the current project for unsafe code

```cargo geiger```

**Output** in JSON format

```cargo geiger --output-format json```

**Include only build dependencies**

```cargo geiger --build-dependencies```

**Scan** without default features

```cargo geiger --no-default-features```

# SYNOPSIS

**cargo geiger** [_options_]

# PARAMETERS

**--all-dependencies**
> Include all dependencies in the scan.

**--build-dependencies**
> Include build dependencies.

**--dev-dependencies**
> Include development dependencies.

**--output-format** _FORMAT_
> Output format: ascii-tree (default) or json.

**--no-default-features**
> Do not activate the default feature.

**--features** _FEATURES_
> Space or comma separated list of features to activate.

**--update-readme**
> Update a safety report in the project README.

**--forbid-only**
> Only report crates that don't use `#![forbid(unsafe_code)]`.

# DESCRIPTION

**cargo-geiger** is a Cargo subcommand that scans a Rust project's dependency tree to detect and report usage of **unsafe** Rust code. It counts unsafe expressions, function declarations, trait implementations, and method calls in both the project and all its dependencies.

The output shows a tree view of the dependency graph annotated with counts of unsafe code usage, helping developers assess the safety profile of their dependency chain. Crates using `#![forbid(unsafe_code)]` are clearly marked as verified safe.

The name is a reference to a **Geiger counter**, which detects radiation — similarly, cargo-geiger detects potentially dangerous unsafe code.

# CAVEATS

Analysis is based on source-level detection and may not catch all forms of unsafe behavior (e.g., unsafe code hidden behind macros or generated at build time). Large dependency trees can take significant time to analyze. Requires the source code of all dependencies to be available.

# HISTORY

**cargo-geiger** was created by **Anders Kaseorg** and the Rust community as a security auditing tool. It addresses the concern that Rust's safety guarantees only hold for safe code, and that unsafe blocks in dependencies can undermine the safety of the entire application.

# SEE ALSO

[cargo](/man/cargo)(1)
