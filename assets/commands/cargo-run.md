# TAGLINE

Build and execute a local package binary

# TLDR

**Build and run project**

```cargo run```

**Run with release optimizations**

```cargo run --release```

**Run specific binary**

```cargo run --bin [binary_name]```

**Run example**

```cargo run --example [example_name]```

**Pass arguments to binary**

```cargo run -- [arg1] [arg2]```

**Run with features enabled**

```cargo run --features [feature1,feature2]```

**Run specific package**

```cargo run -p [package]```

# SYNOPSIS

**cargo run** [_options_] [-- _args_]

# DESCRIPTION

**cargo run** builds and executes a binary target of the current package. It automatically recompiles the project when source files have changed, then runs the resulting executable. Any arguments placed after `--` are forwarded directly to the binary rather than being interpreted by Cargo.

If the package contains multiple binary targets, a specific one must be selected with `--bin` or `--example`, or a default can be configured via the `default-run` field in Cargo.toml. The binary's working directory is set to the current shell directory.

# PARAMETERS

**--bin** _name_
> Run specified binary

**--example** _name_
> Run specified example

**-r**, **--release**
> Run with release profile optimizations

**--profile** _name_
> Build with specific profile

**-p**, **--package** _spec_
> Run from specified package

**--target** _triple_
> Run for target platform

**-j**, **--jobs** _n_
> Parallel build jobs

**--features** _features_
> Enable specified features

**--all-features**
> Enable all features

**--no-default-features**
> Disable default features

**-v**, **--verbose**
> Verbose output

# WORKING DIRECTORY

Sets binary working directory to current directory (same as shell execution).

# DEFAULT BINARY

Set default-run in Cargo.toml [package] section to choose default binary.

# CAVEATS

Errors if multiple binaries exist without --bin flag. Use default-run manifest key to set default.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-build](/man/cargo-build)(1), [cargo-test](/man/cargo-test)(1)
