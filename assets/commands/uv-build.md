# TAGLINE

Build Python packages from source

# TLDR

**Build package**

```uv build```

**Build wheel only**

```uv build --wheel```

**Build sdist only**

```uv build --sdist```

**Build to specific directory**

```uv build --out-dir [dist]```

**Build both sdist and wheel**

```uv build --sdist --wheel```

**Build a specific package** in a workspace

```uv build --package [mypackage]```

**Build from a specific source directory**

```uv build [src/]```

# SYNOPSIS

**uv** **build** [_options_] [_src_]

# PARAMETERS

**--wheel**
> Build wheel (binary distribution) only.

**--sdist**
> Build source distribution only.

**--out-dir** _dir_
> Output directory. Default: dist/.

**--no-build-isolation**
> Disable build isolation (use existing environment).

**--package** _name_
> Build a specific package within the current workspace.

**--build-constraint** _requirement_
> Constrain versions of build requirements.

**--require-hashes**
> Require hashes for build dependencies for reproducibility.

**--python** _version_
> Python interpreter to use for build.

**--config-setting** _KEY=VALUE_
> Pass settings to the PEP 517 build backend.

**--all-packages**
> Build all packages in the workspace.

# DESCRIPTION

**uv build** builds Python packages from source into distributable wheel and/or source distribution packages. It supports PEP 517/518 build systems.

By default, uv build builds the project in the current directory and places artifacts in a dist/ subdirectory. Both wheel and sdist are produced by default; use **--wheel** or **--sdist** to build only one.

Build isolation is enabled by default, installing build dependencies in an isolated environment. Use **--no-build-isolation** to build using the existing environment instead.

# SEE ALSO

[uv](/man/uv)(1), [uv-publish](/man/uv-publish)(1), [pip](/man/pip)(1), [build](/man/build)(1)

