# TAGLINE

C++23 module-first build tool and package manager

# TLDR

**Create** a new modular C++ project

```mcpp new [project_name]```

**Build** the project in the current directory

```mcpp build```

**Build and run** the default target

```mcpp run```

**Run tests** (auto-discovered under tests/)

```mcpp test```

**Add a dependency** from the package index

```mcpp add [package]```

**Install a bundled toolchain** (e.g. GCC 16)

```mcpp toolchain install gcc 16```

**Package** a release tarball (vendored mode by default)

```mcpp pack```

**Diagnose** the local environment

```mcpp self doctor```

# SYNOPSIS

**mcpp** [_global-options_] _command_ [_args_]

# DESCRIPTION

**mcpp** is a modern C++ build tool aimed at C++23 module-first development. It creates, builds, tests, and packages projects that use `import std`, module interface units, and module partitions, with automatic module dependency analysis and file-level incremental builds.

Projects are described by a **mcpp.toml** manifest. By convention, `src/main.cpp` becomes a binary target and tests under `tests/` are discovered by **mcpp test**. The first build downloads a host-aware default toolchain (GCC or LLVM depending on platform) into an isolated sandbox under **~/.mcpp/**, so system compilers are not required.

Dependency management resolves SemVer constraints against package indices (default: mcpp-index / mcpplibs), writes a lockfile, and can pull modules from index, Git, or local paths. Multi-package workspaces share one lockfile and target directory. **mcpp pack** produces distributable artifacts (system, vendored, self-contained, or fully static musl builds on Linux).

The tool is early-stage and self-hosted (written in pure C++23 modules). Full option lists for each subcommand are available via **mcpp** _command_ **--help**.

# PARAMETERS

**new** _name_
> Scaffold a modular project (optional **--template** for library-provided templates).

**build**
> Compile the project (incremental; Ninja backend).

**run** [**--** _args_]
> Build and run the default target.

**test** [_pattern_]
> Discover, build, and run tests; filter by name pattern.

**clean**
> Remove build outputs under the target directory.

**add** / **remove** / **update**
> Manage dependencies declared in mcpp.toml.

**search**
> Search configured package indices.

**pack**
> Bundle a release package (**--mode** system | vendored | self-contained | static).

**publish**
> Publish a package to a configured index.

**toolchain** _install_|_list_|_default_ ...
> Install, list, or select sandboxed compiler toolchains.

**cache** / **index**
> Manage BMI/build cache and package indices.

**self** _doctor_|_version_|_env_|_config_|_explain_ ...
> Environment checks and self-maintenance commands.

**why** [_toolchain_|_runtime_|_deps_]
> Explain resolved build decisions.

**explain** _CODE_
> Print a detailed explanation for an error code.

**--offline**
> Use only already available local state (no downloads or index refresh). Also **MCPP_OFFLINE=1**.

**--version**
> Print the mcpp version.

# CAVEATS

Name clash: many Linux/Homebrew distributions ship an unrelated **mcpp** C preprocessor. Package names for this build tool are often **mcpp-m** / **mcpp-bin** (AUR) or the Homebrew tap formula **mcpp-m**, while the installed command remains **mcpp**. Prefer the install paths from the project README if **which mcpp** points at the preprocessor.

Early-stage software: interfaces and behavior may change between releases. The first build can take a long time while toolchains download into **~/.mcpp/**.

# CONFIGURATION

Project manifest: **mcpp.toml** (package metadata, dependencies, toolchains, workspaces).

Lockfile: **mcpp.lock**.

Per-user data and sandboxed toolchains: **~/.mcpp/** (registry, caches, install layout).

# HISTORY

mcpp is a community project under mcpp-community focused on native C++23 modules and self-hosting. It builds on the xlings toolchain/package foundation and is inspired by tools such as Cargo, xmake, and Ninja.

# INSTALL

```aur: yay -S mcpp-bin```

```brew: brew install mcpp-community/mcpp/mcpp-m```

<!-- packages: 2026-08-08 -->

# SEE ALSO

[xmake](/man/xmake)(1), [cargo](/man/cargo)(1), [ninja](/man/ninja)(1), [cmake](/man/cmake)(1), [meson](/man/meson)(1)

# RESOURCES

```[Source code](https://github.com/mcpp-community/mcpp)```

```[Documentation](https://github.com/mcpp-community/mcpp/tree/main/docs)```

<!-- verified: 2026-08-08 -->
