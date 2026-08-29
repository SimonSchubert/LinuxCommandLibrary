# TAGLINE

Experimental C/C++ package manager and build tool driven by composition.json

# TLDR

**Initialize** a project in the current directory

```flint init```

**Add** a Git dependency (remote must ship its own composition.json)

```flint add [https://github.com/user/example_lib]```

**Sync** dependencies declared in composition.json (including Flint Cherts)

```flint sync```

**Add** a local library path

```flint add-lib [path/to/lib]```

**Add** compiler flags to the manifest

```flint add-flag [-Wall] [-O2]```

**Build** the project

```flint build```

**Build and run** the executable

```flint run```

**Write** compile_commands.json for clangd and other language servers

```flint gen```

# SYNOPSIS

**flint** _command_ [_args_]

# PARAMETERS

**init**
> Create a new Flint project in the current directory (expected layout: **src/**, **include/**, **composition.json**).

**add** _url_
> Clone _url_ into **deps/** and register it. The remote repository must contain a **composition.json** that lists its sources and include paths.

**add-lib** [_path_...]
> Register one or more local libraries.

**add-flag** [_flag_...]
> Append compiler/build flags to the project configuration.

**build**
> Compile the project and its dependencies with the compiler named in **composition.json**.

**run**
> Build if needed, then run the project executable.

**gen**
> Generate **compile_commands.json** for editor and LSP tooling.

**sync**
> Fetch or update libraries declared under **dependencies** in **composition.json**, including entries taken from Flint Cherts compositions.

With no command, **flint** prints a short usage summary and exits **1**. Unknown commands also exit **1**. Success is **0**.

# DESCRIPTION

**flint** is a Linux-only C/C++ build system and Git-based package manager. A project is a directory tree plus a **composition.json** manifest: language, compiler path, source and include directories, flags, library links, and Git remotes. **add** clones a dependency into **deps/**. Flint then aggregates sources and include paths from the root project and every dependency and invokes **gcc** or **clang**.

A dependency is compatible if it has its own **composition.json**, or if you paste a published **chert** composition into **dependencies** and run **sync**. Chert listings live on the Flint Cherts site. Layout conventions: **src/** and **include/** for local code, **deps/** for cloned libraries, **static/** for **.a** files, **shared/** for **.so** files.

The documented installer clones the repository, compiles **flint** with **-O3**, and either copies the binary to **/usr/local/bin** or leaves **flint** in the current directory. There is no versioned release archive; the binary is whatever **main** builds.

# CONFIGURATION

**composition.json**
> Project manifest in the project root. Typical keys: **project_name**, **project_language** (**c** or similar), **version**, **compiler_path** (for example **/usr/bin/gcc**), **executable**, **flags**, **lib_links**, **include_paths**, **src**, and **dependencies** (name to **version** plus Git **remote**).

# CAVEATS

Marked **BETA** and **Linux-only**. Dependency names are not disambiguated: two libraries that share a directory or project name can collide. The curl-pipe installer compiles from **main** and may prompt for sudo to install into **/usr/local/bin**. No SPDX license is declared on the repository.

# HISTORY

Written in C by **mainak55512**. The GitHub repository was created **2026-01-11**. Dependencies are vendored in-tree (yyjson, arena, CString, container). CLI reference: **https://mainak55512.github.io/flint-cherts/**.

# SEE ALSO

[meson](/man/meson)(1), [cmake](/man/cmake)(1), [conan](/man/conan)(1), [vcpkg](/man/vcpkg)(1), [xmake](/man/xmake)(1), [ninja](/man/ninja)(1), [gcc](/man/gcc)(1), [bear](/man/bear)(1)

# RESOURCES

```[Source code](https://github.com/mainak55512/flint)```

```[Documentation](https://mainak55512.github.io/flint-cherts/)```

<!-- verified: 2026-08-30 -->
