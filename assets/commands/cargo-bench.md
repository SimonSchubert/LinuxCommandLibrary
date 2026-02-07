# TAGLINE

Compile and run benchmarks for a Rust project

# TLDR

**Run all benchmarks**

```cargo bench```

**Run specific benchmark**

```cargo bench [bench_name]```

**Compile without running**

```cargo bench --no-run```

**Run all benchmarks in workspace**

```cargo bench --workspace```

**Continue on failure**

```cargo bench --no-fail-fast```

**Benchmark specific package**

```cargo bench -p [package]```

**Benchmark all targets**

```cargo bench --all-targets```

# SYNOPSIS

**cargo bench** [_options_] [_benchname_] [-- _bench-options_]

# DESCRIPTION

**cargo bench** compiles and executes benchmarks. By default, it uses the bench profile with optimizations enabled and debugging disabled. Benchmarks are run serially in a single thread.

The working directory is set to the package root directory.

# PARAMETERS

**--no-run**
> Compile but don't run benchmarks

**--no-fail-fast**
> Run all benchmarks regardless of failures

**--all-targets**
> Benchmark lib, bins, tests, benches, examples

**--workspace**
> Benchmark all workspace members

**-p**, **--package** _spec_
> Benchmark only specified packages

**--lib**
> Benchmark library

**--bins**
> Benchmark all binaries

**--benches**
> Benchmark all bench targets

**--profile** _name_
> Build with specific profile

**-j**, **--jobs** _n_
> Number of parallel build jobs

**--features** _features_
> Enable specified features

**--all-features**
> Enable all features

**--no-default-features**
> Disable default features

# BENCHMARKING FRAMEWORKS

**libtest bench**
> Built-in, requires nightly Rust

**Criterion**
> Popular stable harness, feature-rich

**Iai**
> Instruction-counting benchmarks

# CAVEATS

Built-in benchmarking requires nightly Rust. The --jobs flag affects build parallelism, not benchmark execution. Consider Criterion for stable Rust.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-test](/man/cargo-test)(1), [cargo-build](/man/cargo-build)(1)
