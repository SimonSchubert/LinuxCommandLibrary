# TAGLINE

Check for Rust toolchain updates

# TLDR

**Check** for available updates to installed toolchains and rustup itself

```rustup check```

# SYNOPSIS

**rustup** **check**

# DESCRIPTION

**rustup check** queries the official Rust repositories and displays a comparison of installed and available versions for all Rust toolchains managed by rustup. It shows whether updates are available for each installed toolchain (stable, beta, nightly) and for rustup itself, without downloading or installing anything. This makes it useful for quickly determining if a **rustup update** is needed.

The command requires an internet connection to check for the latest versions.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-update](/man/rustup-update)(1), [rustup-show](/man/rustup-show)(1), [rustup-toolchain](/man/rustup-toolchain)(1), [rustc](/man/rustc)(1), [cargo](/man/cargo)(1)

