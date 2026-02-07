# TAGLINE

Remove a Rust binary installed by cargo install

# TLDR

**Uninstall package**

```cargo uninstall [package]```

**Uninstall specific binary**

```cargo uninstall [package] --bin [binary]```

**Uninstall from custom root**

```cargo uninstall [package] --root [~/.local]```

**Uninstall multiple packages**

```cargo uninstall [pkg1] [pkg2]```

# SYNOPSIS

**cargo uninstall** [_options_] [_spec_...]

# DESCRIPTION

**cargo uninstall** removes packages that were previously installed with `cargo install`. By default it removes all binaries associated with the package. The `--bin` flag can be used to remove only a specific binary while leaving others from the same package in place.

The installation root is determined by the `--root` flag, the `CARGO_INSTALL_ROOT` environment variable, the `install.root` configuration value, or `$CARGO_HOME` (defaulting to `~/.cargo`). Only the installed binaries are removed; cached build artifacts in the target directory are not cleaned up.

# PARAMETERS

**-p**, **--package** _spec_
> Package to uninstall

**--bin** _name_
> Only uninstall specified binary

**--example** _name_
> Only uninstall specified example

**--root** _dir_
> Directory to uninstall from

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# INSTALLATION ROOT

Determined by (in order):
1. --root option
2. CARGO_INSTALL_ROOT environment variable
3. install.root config value
4. CARGO_HOME environment variable
5. ~/.cargo

# CAVEATS

Only removes binaries, not cached build artifacts. Package spec can be name or name@version.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-install](/man/cargo-install)(1)
