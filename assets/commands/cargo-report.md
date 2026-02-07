# TAGLINE

Display build reports and diagnostics

# TLDR

**Show future incompatibility report**

```cargo report future-incompatibilities --id [1]```

**Show report after build**

```cargo build --future-incompat-report```

# SYNOPSIS

**cargo report** _type_ [_options_]

# DESCRIPTION

**cargo report** generates diagnostic reports about the project. Currently its primary subcommand is `future-incompatibilities`, which displays warnings about code patterns in dependencies that will be rejected in future Rust versions.

When Cargo detects future-incompatible warnings during a build, it stores a report and displays a notification with instructions to view the full details. These warnings indicate patterns that may exhibit undefined behavior, are scheduled for removal, or lack well-defined semantics. Reviewing these reports helps maintainers proactively update their dependencies before breaking changes land.

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

**.cargo/config.toml**
> Controls report frequency via `[future-incompat-report]` section (e.g., `frequency = "always"`).

# RESOLVING ISSUES

1. Update dependencies to versions with fixes
2. Work with dependency maintainers
3. Consider alternatives if unmaintained

# CAVEATS

Report is not a lint and doesn't interact with -Dwarnings. These warnings don't fail builds but indicate future breakage.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-build](/man/cargo-build)(1)
