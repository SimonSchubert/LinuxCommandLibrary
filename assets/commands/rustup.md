# TAGLINE

Rust toolchain installer and manager

# TLDR

**Install Rust toolchain**

```rustup install [stable]```

**Set default toolchain**

```rustup default [stable]```

**Update all toolchains**

```rustup update```

**Show installed toolchains**

```rustup show```

**Add a component**

```rustup component add [rustfmt]```

**Add a target** for cross-compilation

```rustup target add [x86_64-unknown-linux-musl]```

**Run command with specific toolchain**

```rustup run [nightly] [cargo build]```

**Override toolchain** for current directory

```rustup override set [nightly]```

**Install nightly**

```rustup install nightly```

**Uninstall a toolchain**

```rustup uninstall [nightly]```

# SYNOPSIS

**rustup** [_options_] _command_ [_args_]

# DESCRIPTION

**rustup** is the Rust toolchain installer and version manager. It installs and manages multiple Rust versions (stable, beta, nightly), components (rustfmt, clippy), and cross-compilation targets.

Toolchains are installed per-user in ~/.rustup. Rustup manages the active toolchain, allowing easy switching between versions globally or per-project using rust-toolchain.toml files.

rustup also handles updating Rust, ensuring all installed toolchains stay current with a single command.

# PARAMETERS

**install** _toolchain_
> Install a toolchain.

**uninstall** _toolchain_
> Remove a toolchain.

**update**
> Update installed toolchains.

**default** _toolchain_
> Set default toolchain.

**show**
> Show installed toolchains.

**run** _toolchain_ _command_
> Run command with specific toolchain.

**override set** _toolchain_
> Set directory-specific override.

**override unset**
> Remove directory override.

**component add** _name_
> Add component to toolchain.

**component list**
> List available components.

**target add** _target_
> Add compilation target.

**target list**
> List available targets.

**self update**
> Update rustup itself.

**doc**
> Open Rust documentation.

# CONFIGURATION

**~/.rustup/**
> Root directory for all rustup data including installed toolchains, components, and metadata.

**rust-toolchain.toml**
> Per-project file specifying the required Rust toolchain version, components, and targets. Rustup automatically installs the specified toolchain when entering the directory.

**RUSTUP_HOME**
> Environment variable overriding the default rustup installation directory.

**RUSTUP_TOOLCHAIN**
> Environment variable overriding the active toolchain for the current session.

# CAVEATS

Nightly may have breaking changes or bugs. Some components not available for all toolchains. Cross-compilation targets may need additional linkers. Disk space usage grows with multiple toolchains.

# HISTORY

**rustup** was developed by **Brian Anderson** and the Rust team, released in **2016** as the official Rust installer, replacing multirust. It unified Rust installation across platforms and simplified version management. Rustup became the recommended way to install Rust, replacing distribution packages for most developers.

# SEE ALSO

[rustc](/man/rustc)(1), [cargo](/man/cargo)(1), [rustfmt](/man/rustfmt)(1), [clippy](/man/clippy)(1)
