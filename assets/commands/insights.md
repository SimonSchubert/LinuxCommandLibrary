# TAGLINE

Clang-based C++ source-to-source transformer that shows compiler-generated code

# TLDR

Transform a **C++ source file** the way Clang sees it

```insights [file.cpp] -- -std=c++17```

Pass **compiler flags** after `--`

```insights [file.cpp] -- -std=c++20 -I[include/path]```

Use a **compilation database**

```insights -p [build/] [file.cpp]```

Read source from **stdin** (the path is the virtual file name)

```insights --stdin [file.cpp] -- -std=c++17 < [file.cpp]```

Show **all implicit casts**

```insights --show-all-implicit-casts [file.cpp] -- -std=c++17```

Rewrite **range-based for-loops** as while-loops

```insights --alt-syntax-for [file.cpp] -- -std=c++17```

Show **object lifetimes** (educational; output often does not compile)

```insights --edu-show-lifetime [file.cpp] -- -std=c++20```

Show an educational **C++ to C** transformation

```insights --edu-show-cfront [file.cpp] -- -std=c++17```

Show an educational **coroutine** transformation

```insights --edu-show-coroutine-transformation [file.cpp] -- -std=c++20```

Use **libc++** instead of libstdc++

```insights --use-libc++ [file.cpp] -- -std=c++17```

Print the **version**

```insights --version```

# SYNOPSIS

**insights** [_options_] _file_ [**--**] [_compiler-options_]

# PARAMETERS

**-p** _path_
> Path to a compilation database (`compile_commands.json`).

**--stdin**
> Read the translation unit from stdin. Exactly one file path must still be given; it is used as the virtual file name.

**--use-libc++**
> Use libc++ (LLVM) instead of libstdc++ (GNU). Forced on Apple builds.

**--alt-syntax-for**
> Transform for-loops into equivalent while-loops.

**--alt-syntax-subscription**
> Transform array subscripts `E1[E2]` into `(*(E1 + E2))`.

**--show-all-implicit-casts**
> Show every implicit cast (can be noisy).

**--show-all-callexpr-template-parameters**
> Show all template parameters of each `CallExpr`.

**--edu-show-initlist**
> Educational transform of `std::initializer_list`. Resulting code most likely does not compile.

**--edu-show-noexcept**
> Educational transform of a `noexcept` function.

**--edu-show-padding**
> Show padding bytes in a struct or class.

**--edu-show-coroutine-transformation**
> Educational coroutine transform. Most of it is not present in the AST.

**--edu-show-cfront**
> Educational C++-to-C transform. Also enables lifetime display unless coroutine transformation is on.

**--edu-show-lifetime**
> Show object lifetimes. Also enables initializer-list transformation.

**--autocomplete**
> Print option names and descriptions for shell completion, then exit.

**--extra-arg** _arg_
> Extra argument appended to the compiler command line.

**--extra-arg-before** _arg_
> Extra argument prepended to the compiler command line.

**--version**
> Print the cpp-insights version, git revision, and the LLVM/Clang revisions it was built against.

**--**
> End of Insights options; remaining arguments are forwarded to Clang (`-std=`, `-I`, `--gcc-toolchain=`, and so on).

# DESCRIPTION

**insights** is the command-line interface of C++ Insights, a Clang LibTooling program by Andreas Fertig. It rewrites a C++ translation unit into source that makes compiler-generated details visible: implicit special member functions, **auto** and **decltype** deductions, range-based for-loop desugaring, lambda closure types, implicit casts, and operator calls.

The goal is compilable C++ that matches Clang's AST. That is not always possible. Educational flags (**--edu-***) emit hand-rolled approximations for teaching (lifetimes, padding, coroutines, a Cfront-style C transform) and are documented as not intended to compile.

A web frontend runs the same transformer at cppinsights.io. Local runs follow Clang-tool conventions: source files first, then **--**, then compiler flags. System header paths are taken from the Clang **insights** was built with; **scripts/getinclude.py** in the upstream tree can dump **-isystem** paths from **g++** (or another compiler) when those baked-in paths are wrong.

# CAVEATS

The view is Clang's, not GCC's. There is no optimizer stage, so `-O` flags do not change the rewrite. Educational `--edu-*` output is an approximation. On macOS the tool always selects libc++. `--stdin` still requires exactly one path.

# HISTORY

Andreas Fertig started C++ Insights in 2017 while teaching C++11–17 features (lambdas, range-based for, structured bindings). Releases are tagged in step with LLVM (for example **v_21.1** builds against LLVM 21). The project is MIT-licensed.

# INSTALL

```aur: yay -S cppinsights```

```brew: brew install cppinsights```

<!-- packages: 2026-10-03 -->

# SEE ALSO

[clang](/man/clang)(1), [clang-check](/man/clang-check)(1), [clang-tidy](/man/clang-tidy)(1), [clang++](/man/clang++)(1), [g++](/man/g++)(1), [c++filt](/man/c++filt)(1)

# RESOURCES

```[Source code](https://github.com/andreasfertig/cppinsights)```

```[Homepage](https://cppinsights.io/)```

```[Documentation](https://github.com/andreasfertig/cppinsights/blob/main/Readme.md)```

<!-- verified: 2026-10-03 -->
