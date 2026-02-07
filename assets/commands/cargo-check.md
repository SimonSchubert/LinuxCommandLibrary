# TAGLINE

Check a Rust package for errors without compiling

# TLDR

**Check project for errors**

```cargo check```

**Check with release profile**

```cargo check --release```

**Check all workspace members**

```cargo check --workspace```

**Check specific package**

```cargo check -p [package]```

**Check all targets**

```cargo check --all-targets```

**Check including tests**

```cargo check --profile test```

**Check with specific features**

```cargo check --features [feature1,feature2]```

# SYNOPSIS

**cargo check** [_options_]

# DESCRIPTION

**cargo check** checks a package and dependencies for errors without performing code generation. Faster than cargo build because it skips the final compilation step. Saves metadata for incremental compilation.

# PARAMETERS

**-r**, **--release**
> Check with release profile optimizations

**--profile** _name_
> Check with specific profile

**-p**, **--package** _spec_
> Check only specified packages

**--workspace**
> Check all workspace members

**--all-targets**
> Check all targets (lib, bins, tests, benches, examples)

**--lib**
> Check library only

**--bins**
> Check all binaries

**--tests**
> Check test targets

**--target** _triple_
> Check for target platform

**-j**, **--jobs** _n_
> Parallel jobs

**--features** _features_
> Enable specified features

**--all-features**
> Enable all features

**--no-default-features**
> Disable default features

# CAVEATS

Some errors only appear during full code generation and won't be caught by cargo check. For complete error checking, use cargo build. The --profile test enables test cfg and checks test code.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-build](/man/cargo-build)(1), [cargo-fix](/man/cargo-fix)(1)
