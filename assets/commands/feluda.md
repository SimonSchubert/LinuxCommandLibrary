# TAGLINE

License usage detector for Rust dependencies

# TLDR

**Check** dependencies in current project

```feluda```

**Check** specific manifest

```feluda [path/to/Cargo.toml]```

**Output** in JSON format

```feluda --json```

# SYNOPSIS

**feluda** [_options_] [_manifest_]

# PARAMETERS

**--json**
> Output results in JSON format

**--include-dev**
> Include dev dependencies

**--include-build**
> Include build dependencies

**-h, --help**
> Display help and exit

**-V, --version**> Display version and exit

# DESCRIPTION

**feluda** is a Rust tool that analyzes project dependencies and detects their licenses. It helps developers understand the license composition of their Rust projects and identify potential compliance issues.

The tool reads Cargo.toml and Cargo.lock files to identify all dependencies and their associated licenses from crate metadata.

# OUTPUT

Displays a table of:
- Crate names
- Versions
- License identifiers
- License file paths

# CAVEATS

Relies on accurate license metadata in crates. License detection may miss custom or unusual licenses. Multiple license options (OR) are displayed separately. Requires Cargo.toml and Cargo.lock to be present.

# HISTORY

**feluda** was created to help Rust developers perform license audits on their projects, ensuring compliance with open source licensing requirements.

# SEE ALSO

[cargo-license](https://github.com/onur/cargo-license), [cargo-deny](https://github.com/EmbarkStudios/cargo-deny), [cargo-tree](https://doc.rust-lang.org/cargo/commands/cargo-tree.html)
