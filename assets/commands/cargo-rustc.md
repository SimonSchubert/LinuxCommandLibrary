# TLDR

**Compile with extra rustc flags**

```cargo rustc -- [rustc_flags]```

**Compile specific binary with flags**

```cargo rustc --bin [name] -- [flags]```

**Compile library with flags**

```cargo rustc --lib -- [-C opt-level=3]```

**Enable specific codegen option**

```cargo rustc -- -C [target-cpu=native]```

**Add link arguments**

```cargo rustc -- -C [link-arg=-fuse-ld=lld]```

# SYNOPSIS

**cargo rustc** [_options_] [-- _args_]

# DESCRIPTION

**cargo rustc** compiles the current package and passes extra options directly to rustc. Arguments after -- are passed to the final compiler invocation only, not to dependencies.

# PARAMETERS

**--lib**
> Compile library only

**--bin** _name_
> Compile specified binary

**--bins**
> Compile all binaries

**--example** _name_
> Compile specified example

**--test** _name_
> Compile specified test

**--bench** _name_
> Compile specified benchmark

**-r**, **--release**
> Use release profile

**--profile** _name_
> Use specified profile

**-p**, **--package** _spec_
> Package to compile

**--target** _triple_
> Target platform

**-j**, **--jobs** _n_
> Parallel jobs

**--features** _features_
> Enable features

**--all-features**
> Enable all features

# RUSTC OPTIONS

Common rustc flags:
- **-C opt-level=N**: Optimization level
- **-C target-cpu=NAME**: Target CPU
- **-C link-arg=ARG**: Linker argument
- **--emit=TYPE**: Output type (asm, llvm-ir, obj)

# ENVIRONMENT

**RUSTFLAGS**
> Pass flags to all rustc invocations

# CAVEATS

Only one target can be compiled when passing extra arguments. Use filters (--lib, --bin) to select target.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [cargo-build](/man/cargo-build)(1)
