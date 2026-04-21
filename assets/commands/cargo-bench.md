# TAGLINE

Compile and run benchmarks for a Rust project

# TLDR

**Run all benchmarks**

```cargo bench```

**Run benchmarks whose name contains a substring**

```cargo bench [bench_name]```

**Compile benchmarks without running**

```cargo bench --no-run```

**Run benchmarks across the whole workspace**

```cargo bench --workspace```

**Continue running on benchmark failure**

```cargo bench --no-fail-fast```

**Benchmark a specific package**

```cargo bench -p [package]```

**Benchmark a specific bench target**

```cargo bench --bench [bench_target]```

**Pass arguments through to the bench binary**

```cargo bench -- --save-baseline [name]```

# SYNOPSIS

**cargo bench** [_options_] [_benchname_] [-- _bench-options_]

# DESCRIPTION

**cargo bench** compiles and executes benchmark targets of the current package. By default, it uses the `bench` profile (optimizations on, debug info minimal) and runs benchmarks serially.

Arguments after `--` are forwarded to the compiled benchmark binary, which is how Criterion and libtest options such as `--save-baseline` or `--test` are passed through.

# PARAMETERS

**--no-run**
> Compile benchmarks but do not execute them.

**--no-fail-fast**
> Run every benchmark even if earlier ones fail.

**--all-targets**
> Benchmark all targets (equivalent to `--lib --bins --tests --benches --examples`).

**--workspace**
> Benchmark all packages in the workspace.

**--exclude** _SPEC_
> Exclude packages from a `--workspace` run.

**-p**, **--package** _SPEC_
> Benchmark only the specified package(s).

**--lib**
> Benchmark only the library target.

**--bins**
> Benchmark all binary targets.

**--bin** _NAME_
> Benchmark only the named binary.

**--benches**
> Benchmark all `bench = true` targets.

**--bench** _NAME_
> Benchmark only the named bench target.

**--examples**
> Benchmark all example targets.

**--profile** _NAME_
> Build with a specific profile (defaults to `bench`).

**--target** _TRIPLE_
> Build for the given target triple.

**-j**, **--jobs** _N_
> Number of parallel build jobs (affects compilation, not benchmark execution).

**-F**, **--features** _FEATURES_
> Space- or comma-separated list of features to activate.

**--all-features**
> Activate all features of every selected package.

**--no-default-features**
> Do not activate the `default` feature.

**--manifest-path** _PATH_
> Path to `Cargo.toml`.

**--locked**
> Require `Cargo.lock` to remain unchanged.

**--offline**
> Do not access the network.

# BENCHMARKING FRAMEWORKS

**libtest bench**
> Built-in `#[bench]` harness, requires nightly Rust.

**Criterion**
> Popular stable harness with statistical analysis and baselines.

**Iai**
> Instruction-counting benchmarks using Cachegrind.

# CAVEATS

The built-in `#[bench]` attribute is unstable and requires nightly Rust; on stable, use a custom harness such as **Criterion** declared with `harness = false` in `Cargo.toml`. The `--jobs` flag controls build parallelism, not benchmark execution. Results can be noisy without CPU pinning and a quiet system.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-test](/man/cargo-test)(1), [cargo-build](/man/cargo-build)(1)
