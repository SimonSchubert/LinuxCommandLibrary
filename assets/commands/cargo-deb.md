# TAGLINE

Build Debian packages from Rust projects

# TLDR

**Create Debian package**

```cargo deb```

**Build and install locally**

```cargo deb --install```

**Specify output location**

```cargo deb --output [path/to/package.deb]```

**Build for specific target**

```cargo deb --target [x86_64-unknown-linux-gnu]```

**Set package revision**

```cargo deb --deb-revision [2]```

**Build without default features**

```cargo deb --no-default-features```

**Verbose output**

```cargo deb --verbose```

# SYNOPSIS

**cargo deb** [_options_]

# DESCRIPTION

**cargo deb** creates binary Debian packages (.deb) from Cargo projects automatically. Uses Cargo.toml metadata and optional [package.metadata.deb] configuration.

Output placed in target/debian/<name>_<version>-<revision>_<arch>.deb

# PARAMETERS

**--install**
> Build and install package immediately

**-o**, **--output** _path_
> Custom output file path

**--target** _triple_
> Build for specified target

**--deb-revision** _rev_
> Set Debian package revision

**--no-build**
> Skip cargo build step

**--no-strip**
> Don't strip debug symbols

**--separate-debug-symbols**
> Create separate debug package

**--fast**
> Skip some optimizations for faster build

**--variant** _name_
> Use variant-specific configuration

**-v**, **--verbose**
> Verbose output

# CONFIGURATION

Add to Cargo.toml:

```toml
[package.metadata.deb]
maintainer = "Name <email>"
depends = "$auto"
section = "utility"
priority = "optional"
assets = [
    ["target/release/bin", "usr/bin/", "755"],
]
```

# INSTALLATION

```cargo install cargo-deb```

Requires Rust 1.76+. Optional: dpkg, dpkg-dev, liblzma-dev.

# CAVEATS

Automatically uses Cargo fields for name, version, license, description. The $auto depends value auto-detects library dependencies on Debian systems.

# SEE ALSO

[cargo](/man/cargo)(1), [dpkg](/man/dpkg)(1), [dpkg-deb](/man/dpkg-deb)(1)
