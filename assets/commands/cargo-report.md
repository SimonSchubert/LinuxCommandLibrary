# TLDR

**Show future incompatibility report**

```cargo report future-incompatibilities --id [1]```

**Show report after build**

```cargo build --future-incompat-report```

# SYNOPSIS

**cargo report** _type_ [_options_]

# DESCRIPTION

**cargo report** generates various reports about the project. Currently supports future-incompatibilities reports which show code patterns that will be rejected in future Rust versions.

# SUBCOMMANDS

**future-incompatibilities**
> Display future incompatibility report

# PARAMETERS

**--id** _id_
> Report ID from previous build

**--package** _spec_
> Package to report on

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# FUTURE INCOMPATIBILITIES

Cargo checks dependencies for patterns that:
- May exhibit undefined behavior
- Are scheduled for removal from Rust
- Do not have well-defined semantics

When detected, a warning appears after build with instructions to view the full report.

# CONFIGURATION

Configure in .cargo/config.toml:

```toml
[future-incompat-report]
frequency = "always"
```

# RESOLVING ISSUES

1. Update dependencies to versions with fixes
2. Work with dependency maintainers
3. Consider alternatives if unmaintained

# CAVEATS

Report is not a lint and doesn't interact with -Dwarnings. These warnings don't fail builds but indicate future breakage.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-build](/man/cargo-build)(1)
