# TLDR

**Install from crates.io**

```cargo install [ripgrep]```

**Install specific version**

```cargo install [tokei@12.1.0]```

**Install from git repository**

```cargo install --git [https://github.com/user/repo]```

**Install from local path**

```cargo install --path [.]```

**Force reinstall**

```cargo install --force [package]```

**List installed packages**

```cargo install --list```

**Install to custom location**

```cargo install --root [~/.local] [package]```

# SYNOPSIS

**cargo install** [_options_] _crate_[@_version_]...

# DESCRIPTION

**cargo install** builds and installs Rust binary crates from crates.io, git repositories, or local paths. Binaries are installed to ~/.cargo/bin/ by default. Only packages with [[bin]] or [[example]] targets can be installed.

# PARAMETERS

**--version** _version_
> Version requirement (e.g., ~1.2, ^1.0)

**--git** _url_
> Install from git repository

**--branch** _branch_
> Git branch

**--tag** _tag_
> Git tag

**--rev** _sha_
> Git commit

**--path** _path_
> Install from local path

**--root** _dir_
> Installation directory

**-f**, **--force**
> Overwrite existing binaries

**--list**
> List installed packages

**--bins**
> Install all binaries

**--examples**
> Install all examples

**--no-track**
> Don't save tracking information

**--locked**
> Use Cargo.lock versions

**-j**, **--jobs** _n_
> Parallel build jobs

**--features** _features_
> Enable specified features

**--all-features**
> Enable all features

# INSTALLATION ROOT

Determined by (in order): --root, CARGO_INSTALL_ROOT, install.root config, CARGO_HOME, ~/.cargo

# CAVEATS

Compiles from source (slow). For prebuilt binaries, use cargo-binstall. Updates require reinstalling with --force.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-uninstall](/man/cargo-uninstall)(1), [cargo-binstall](/man/cargo-binstall)(1)
