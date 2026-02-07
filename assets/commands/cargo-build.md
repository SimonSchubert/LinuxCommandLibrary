# TAGLINE

Compile a Rust package and its dependencies

# TLDR

**Build project**

```cargo build```

**Build with release optimizations**

```cargo build --release```

**Build specific package**

```cargo build -p [package]```

**Build all workspace members**

```cargo build --workspace```

**Build with specific features**

```cargo build --features [feature1,feature2]```

**Build all features**

```cargo build --all-features```

**Build for specific target**

```cargo build --target [x86_64-unknown-linux-gnu]```

**Build offline**

```cargo build --offline```

# SYNOPSIS

**cargo build** [_options_]

# DESCRIPTION

**cargo build** compiles a local package and all its dependencies. Creates executable in target/debug/ by default, or target/release/ with --release flag.

Debug builds compile faster but run slower. Release builds are optimized but take longer to compile.

# PARAMETERS

**-r**, **--release**
> Build with optimizations (release profile)

**--profile** _name_
> Build with specific profile

**-p**, **--package** _spec_
> Build only specified packages

**--workspace**
> Build all workspace members

**--all-targets**
> Build all targets (lib, bins, tests, benches, examples)

**--lib**
> Build library only

**--bins**
> Build all binaries

**--examples**
> Build all examples

**--target** _triple_
> Build for target platform

**--target-dir** _dir_
> Output directory

**-j**, **--jobs** _n_
> Parallel build jobs

**--features** _features_
> Enable specified features

**--all-features**
> Enable all features

**--no-default-features**
> Disable default features

**--offline**
> Build without network access

**--timings**
> Output build timing info

# OUTPUT LOCATIONS

**target/debug/**
> Debug builds (default)

**target/release/**
> Release builds (--release)

# CAVEATS

Same commands work across all operating systems. First build downloads and compiles dependencies.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-run](/man/cargo-run)(1), [cargo-check](/man/cargo-check)(1)
