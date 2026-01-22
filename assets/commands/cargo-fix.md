# TLDR

**Fix all warnings**

```cargo fix```

**Fix all targets**

```cargo fix --all-targets```

**Fix with all features enabled**

```cargo fix --all-features```

**Migrate to new edition**

```cargo fix --edition```

**Fix even with compiler errors**

```cargo fix --broken-code```

**Allow dirty working directory**

```cargo fix --allow-dirty```

**Allow uncommitted changes**

```cargo fix --allow-staged```

# SYNOPSIS

**cargo fix** [_options_]

# DESCRIPTION

**cargo fix** automatically applies rustc's suggested fixes to source code. Runs cargo check internally and applies machine-applicable suggestions from diagnostics.

# PARAMETERS

**--edition**
> Apply fixes for edition migration

**--edition-idioms**
> Apply edition-specific idiom changes

**--broken-code**
> Fix code even with existing compiler errors

**--allow-dirty**
> Allow fixes on dirty working directory

**--allow-staged**
> Allow fixes with staged changes

**--all-targets**
> Fix all targets (lib, bins, tests, benches, examples)

**--all-features**
> Enable all features

**--features** _features_
> Enable specified features

**--lib**
> Fix library only

**--bins**
> Fix all binaries

**--tests**
> Fix all tests

**-p**, **--package** _spec_
> Fix specific packages

**--workspace**
> Fix all workspace members

# EDITION MIGRATION

```cargo fix --edition```

Migrates code from one Rust edition to the next (e.g., 2018 to 2021).

# CAVEATS

Can only fix normally compiled code. Conditionally compiled code requires appropriate --features or --target flags. Built into Cargo since Rust 1.29.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-check](/man/cargo-check)(1), [cargo-clippy](/man/cargo-clippy)(1)
