# TAGLINE

Meta-build system that generates Ninja files

# TLDR

**Generate** Ninja build files into an output directory

```gn gen [out/Default]```

**Generate** with build arguments inline

```gn gen [out/Default] --args='is_debug=true target_cpu="x64"'```

**Open** the args editor for an output directory

```gn args [out/Default]```

**List** all available build arguments and their defaults

```gn args [out/Default] --list```

**Describe** a build target (deps, sources, configs)

```gn desc [out/Default] [//base:base]```

**List** every build target known to the build

```gn ls [out/Default]```

**Check** include rules without writing build files

```gn check [out/Default]```

**Format** a BUILD.gn file in place

```gn format [path/to/BUILD.gn]```

# SYNOPSIS

**gn** _command_ [_options_]... [_args_]...

# PARAMETERS

**gen** _out_dir_ [**--args=**_string_]
> Generate Ninja build files for _out_dir_. **--args** sets build arguments inline; arguments are stored in _out_dir_/args.gn.

**args** _out_dir_ [**--list**[=_arg_]] [**--short**] [**--overrides-only**]
> Open _out_dir_/args.gn in **$EDITOR**, or list arguments. **--list** shows defaults and help text; pass an argument name for a single entry.

**desc** _out_dir_ _target_ [_what_]
> Print information about _target_. _what_ may be **sources**, **deps**, **configs**, **public**, **defines**, **include_dirs**, **runtime_deps**, etc.

**ls** _out_dir_ [_label_pattern_]
> List matching targets. Pattern supports wildcards such as **//base/\***.

**refs** _out_dir_ _target_ [**--all**]
> Show targets that depend on _target_.

**path** _out_dir_ _target1_ _target2_
> Show a dependency path between two targets.

**check** _out_dir_ [_label_pattern_]
> Run include-rule checking. Equivalent to **gn gen --check** without writing build files.

**format** [**--dry-run**] [**--stdin**] _file.gn_
> Reformat a GN file in canonical style.

**clean** _out_dir_
> Delete the contents of _out_dir_ except **args.gn**, then re-run **ninja** to repopulate.

**help** [_command_]
> Print general help, or detailed help for a single command, target type, or built-in.

**-q**
> Suppress informational output.

**--root=**_path_
> Override the source root (where the **.gn** file lives).

**--dotfile=**_path_
> Use a non-default **.gn** dotfile.

**--script-executable=**_path_
> Override the Python interpreter used by **exec_script**.

**--time**
> Print timing information for build steps.

**--tracelog=**_file_
> Write a Chrome-trace-format log of GN's execution.

# DESCRIPTION

**gn** is a meta-build system used by **Chromium**, **Fuchsia**, **V8**, **Skia**, **ANGLE**, **Dart**, and other large native projects. It reads **.gn** dotfiles and **BUILD.gn** files written in a small declarative language, then emits **Ninja** build files for fast incremental builds.

Targets are declared in **BUILD.gn** files using rules such as **executable**, **static_library**, **shared_library**, **source_set**, **group**, and **action**. Targets reference other targets via **deps** (private) and **public_deps**, and pull in compile flags via **configs**, **public_configs**, **defines**, **include_dirs**, and **sources**. Properties can be appended or removed per-target with **+=** and **-=**.

Build configuration lives in **args.gn** inside each output directory, allowing many parallel build configurations (debug, release, cross-compile, instrumented) without re-checking out the source tree. Cross-compilation is configured through **target_os** and **target_cpu** arguments.

# COMMON ARGS

```
is_debug          Debug vs. release build
is_component_build  Build with shared libraries
target_os         "linux", "mac", "win", "android", ...
target_cpu        "x64", "arm64", "x86", "arm", ...
symbol_level      0=none, 1=minimal, 2=full
treat_warnings_as_errors
```

Use **gn args [out/Default] --list** to see every argument exposed by the project.

# CONFIGURATION

Each project has a **.gn** dotfile at the source root that points to the **BUILDCONFIG.gn** file and other defaults. Per-build-directory configuration is stored in **<out_dir>/args.gn** and edited with **gn args**. The **gn format** command enforces a single canonical style for **BUILD.gn** files; many projects run it as a presubmit check.

# CAVEATS

**gn** does not run the build itself - it only generates Ninja files. Run **ninja -C [out/Default]** afterwards. The **BUILD.gn** language is **not** Python: although it looks similar, it is intentionally restricted (no classes, no recursion, deterministic execution). Editing **args.gn** by hand is supported, but running **gn gen** afterwards is required to regenerate Ninja files.

For Chromium and Chromium-derived projects, **gn** is shipped via **depot_tools**; system-wide installs may lag behind the version expected by the source tree.

# HISTORY

**GN** ("Generate Ninja") was created by **Brett Wilson** at **Google** as a faster replacement for **GYP** in the **Chromium** build. It first appeared in the Chromium tree around **2014** and progressively replaced GYP through **2017**. GN is now a standalone project hosted at **gn.googlesource.com/gn** and is used as the primary build system for Chromium, Fuchsia, V8, and several other large open-source codebases.

# INSTALL

```apt: sudo apt install generate-ninja```

```dnf: sudo dnf install gn```

```pacman: sudo pacman -S gn```

```apk: sudo apk add gn```

```zypper: sudo zypper install gn```

```nix: nix profile install nixpkgs#gn```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ninja](/man/ninja)(1), [cmake](/man/cmake)(1), [bazel](/man/bazel)(1), [meson](/man/meson)(1)
