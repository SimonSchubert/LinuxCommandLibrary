# TLDR

**Build documentation**

```cargo doc```

**Build and open in browser**

```cargo doc --open```

**Build without dependencies**

```cargo doc --no-deps```

**Include private items**

```cargo doc --document-private-items```

**Build for all workspace members**

```cargo doc --workspace```

**Build with release profile**

```cargo doc --release```

**Build with all features**

```cargo doc --all-features```

# SYNOPSIS

**cargo doc** [_options_]

# DESCRIPTION

**cargo doc** builds documentation for the local package and all dependencies using rustdoc. Output placed in target/doc/ in HTML format.

# PARAMETERS

**--open**
> Open documentation in browser after building

**--no-deps**
> Don't build documentation for dependencies

**--document-private-items**
> Include non-public items (default for binaries)

**-r**, **--release**
> Build with release profile

**--workspace**
> Document all workspace members

**--exclude** _spec_
> Exclude packages (with --workspace)

**-p**, **--package** _spec_
> Document specific packages

**--lib**
> Document library only

**--bins**
> Document all binaries

**--target** _triple_
> Document for target architecture

**-j**, **--jobs** _n_
> Parallel jobs (default: CPU count)

**--features** _features_
> Enable specified features

**--all-features**
> Enable all features

**--no-default-features**
> Disable default features

# ENVIRONMENT

**BROWSER**
> Browser to use with --open

# OUTPUT

Documentation generated in target/doc/<crate_name>/index.html

# CAVEATS

Skips binaries with same name as library. Skips binaries with missing required features.

# SEE ALSO

[cargo](/man/cargo)(1), [rustdoc](/man/rustdoc)(1)
