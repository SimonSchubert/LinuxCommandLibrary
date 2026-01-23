# TLDR

**Build a target**

```buck build //[path/to:target]```

**Run a binary target**

```buck run //[path/to:target]```

**Run tests**

```buck test //[path/to:target]```

**Query target dependencies**

```buck query "deps(//[path/to:target])"```

**List all targets** in a package

```buck targets //[path/to/package]:```

**Build with specific configuration**

```buck build //[target] --config [section.option=value]```

**Clean build artifacts**

```buck clean```

**Show build output path**

```buck build //[target] --show-output```

# SYNOPSIS

**buck** _command_ [_options_] [_targets_]

**buck2** _command_ [_options_] [_targets_]

# DESCRIPTION

**Buck** is a fast, multi-language build system developed by Facebook (Meta). It uses a dependency graph to determine which targets need rebuilding, enabling incremental builds. Buck2 is the rewritten successor with improved performance.

Build rules are defined in BUCK files (or BUILD for Buck2) using a Python-like syntax. Targets are referenced using the //path/to/package:name convention. Buck caches build artifacts and can distribute builds across machines.

Buck supports many languages including C++, Java, Python, Go, Rust, and others through its extensible rule system. It's designed for large monorepo codebases with complex dependency graphs.

# PARAMETERS

**build** _targets_
> Build specified targets.

**run** _target_
> Build and run a binary target.

**test** _targets_
> Build and run tests.

**clean**
> Delete build artifacts.

**targets** _pattern_
> List targets matching pattern.

**query** _expression_
> Query the target graph.

**audit** _subcommand_
> Audit build configuration.

**install** _target_
> Build and install (mobile apps).

**--config** _key=value_
> Override configuration values.

**--show-output**
> Show output file paths.

**--no-cache**
> Ignore cached results.

**-j** _jobs_
> Number of parallel jobs.

**-v** _verbosity_
> Verbosity level (0-10).

**--help**
> Show help information.

# CAVEATS

Requires Java runtime (Buck1) or standalone binary (Buck2). Build files must be in specific format. Large dependency graphs can cause slow initial analysis. Remote execution setup requires additional infrastructure. Buck2 is not fully backward compatible with Buck1.

# HISTORY

**Buck** was developed at **Facebook** starting around **2013** to handle the company's large codebase. It was open-sourced and used by companies like Uber and Airbnb. **Buck2** was announced in **2022** as a complete rewrite in Rust, offering significant performance improvements. Buck2 was open-sourced in **April 2023** and is now the recommended version.

# SEE ALSO

[bazel](/man/bazel)(1), [make](/man/make)(1), [ninja](/man/ninja)(1), [gradle](/man/gradle)(1)
