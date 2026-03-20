# TAGLINE

Fast, scalable multi-language build system

# TLDR

**Build** target

```bazel build [//path/to:target]```

**Run** binary

```bazel run [//path/to:binary]```

**Test** targets

```bazel test [//path/to:tests]```

**Query** dependencies

```bazel query "deps([//path/to:target])"```

**Clean** build artifacts

```bazel clean```

Build **all** targets recursively

```bazel build //...```

**Info** about build environment

```bazel info```

# SYNOPSIS

**bazel** _command_ [_options_] [_targets_]

# DESCRIPTION

**bazel** is a fast, scalable build system that supports multi-language projects and massive codebases. Developed by Google based on their internal Blaze system, it provides reproducible builds, remote caching, and distributed execution.

The tool is designed for monorepos and projects requiring strict dependency management and incremental builds.

# PARAMETERS

**build** _target_
> Build specified targets

**run** _target_
> Build and run executable target

**test** _target_
> Build and run tests

**query** _expression_
> Query build graph

**cquery** _expression_
> Query configured build graph (post-analysis)

**aquery** _expression_
> Query action graph

**clean**
> Remove build artifacts

**fetch** _target_
> Fetch external dependencies

**coverage** _target_
> Generate code coverage report for tests

**version**
> Print Bazel version

**shutdown**
> Stop the Bazel server

**info**
> Show build environment info

**--jobs** _n_
> Number of parallel jobs

**--config** _name_
> Use configuration from .bazelrc

**--remote_cache** _url_
> Remote cache URL

**--disk_cache** _path_
> Disk cache location

**--compilation_mode** (_-c_) _mode_
> Compilation mode: fastbuild, dbg, or opt

**--keep_going** (_-k_)
> Continue building after errors

**--verbose_failures**
> Show full command line for failed commands

# TARGET SYNTAX

- **//path/to:target** - Specific target
- **//path/to:all** - All targets in package
- **//...** - All targets recursively
- **@repo//path:target** - External repository

# FEATURES

- Incremental builds
- Remote caching
- Distributed execution
- Hermetic builds
- Multi-language support (Java, C++, Go, Python, etc.)
- Dependency analysis
- Reproducible builds

# BUILD FILES

BUILD or BUILD.bazel files define targets:
```python
cc_binary(
    name = "hello",
    srcs = ["hello.cc"],
)
```

# CONFIGURATION

**~/.bazelrc**
> User-level build options and configuration flags.

**WORKSPACE** or **WORKSPACE.bazel** (or **MODULE.bazel** for Bzlmod)
> Root file that defines external dependencies and the project boundary.

**.bazelrc**
> Project-level build options, config groups, and default flags.

# CAVEATS

Steep learning curve. Requires BUILD files throughout project. Initial setup complex. Can be overkill for small projects. Build times include analysis phase. JVM-based (high memory usage).

# HISTORY

**Bazel** was released by Google in **2015** as an open-source version of their internal Blaze build system, designed to handle massive multi-language monorepos.

# SEE ALSO

[make](/man/make)(1), [cmake](/man/cmake)(1), [ninja](/man/ninja)(1), [gradle](/man/gradle)(1), [buck](/man/buck)(1)
