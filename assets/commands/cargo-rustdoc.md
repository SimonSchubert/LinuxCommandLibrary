# TLDR

**Build docs with rustdoc options**

```cargo rustdoc -- [rustdoc_flags]```

**Document with private items**

```cargo rustdoc -- --document-private-items```

**Output JSON format (nightly)**

```cargo rustdoc -Z unstable-options --output-format json```

**Document specific binary**

```cargo rustdoc --bin [name] -- [flags]```

**Build docs for all features**

```cargo rustdoc --all-features```

# SYNOPSIS

**cargo rustdoc** [_options_] [-- _args_]

# DESCRIPTION

**cargo rustdoc** builds documentation and passes extra options directly to rustdoc. Arguments after -- are passed to the final rustdoc invocation only.

Similar to cargo doc but allows direct rustdoc flag control.

# PARAMETERS

**--open**
> Open docs in browser after building

**--lib**
> Document library only

**--bin** _name_
> Document specified binary

**--bins**
> Document all binaries

**--example** _name_
> Document specified example

**--examples**
> Document all examples

**-p**, **--package** _spec_
> Package to document

**--target** _triple_
> Document for target platform

**-j**, **--jobs** _n_
> Parallel jobs

**--features** _features_
> Enable features

**--all-features**
> Enable all features

**--no-default-features**
> Disable default features

# OUTPUT FORMATS

**html**
> HTML documentation (default)

**json**
> JSON format (nightly, experimental)

# CAVEATS

Only one target can be documented when passing extra arguments. Use target filters to select.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-doc](/man/cargo-doc)(1), [rustdoc](/man/rustdoc)(1)
