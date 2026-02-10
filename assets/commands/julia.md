# TAGLINE

high-level, high-performance programming language for technical computing

# TLDR

**Start the Julia REPL**

```julia```

**Run a Julia script**

```julia [script.jl]```

**Run with multiple threads**

```julia --threads [4] [script.jl]```

**Evaluate an expression**

```julia -e '[println("Hello")]'```

**Run in quiet mode** (no banner)

```julia -q```

**Start with a specific project**

```julia --project=[path/to/project]```

**Install a package** (from REPL)

```julia -e 'using Pkg; Pkg.add("[PackageName]")'```

**Precompile packages**

```julia -e 'using Pkg; Pkg.precompile()'```

# SYNOPSIS

**julia** [_options_] [_script.jl_] [_args ..._]

# PARAMETERS

**-e** _expr_
> Evaluate expression.

**-E** _expr_
> Evaluate and display result.

**-p**, **--procs** _n_
> Start n worker processes.

**-t**, **--threads** _n_
> Enable n threads (or "auto").

**--project** _path_
> Set project/environment directory.

**-q**, **--quiet**
> Suppress startup banner.

**-i**
> Interactive mode after script.

**-L**, **--load** _file_
> Load file at startup.

**-J**, **--sysimage** _file_
> Use custom system image.

**--startup-file** _yes|no_
> Load ~/.julia/config/startup.jl.

**--history-file** _yes|no_
> Load/save command history.

**-O**, **--optimize** _level_
> Optimization level (0-3).

**--compile** _yes|no|all|min_
> Compilation mode.

**--code-coverage** _none|user|all_
> Enable code coverage.

**--track-allocation** _none|user|all_
> Track memory allocations.

**--depwarn** _yes|no|error_
> Deprecation warnings.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**Julia** is a high-level, high-performance programming language for technical computing. It combines the ease of dynamic languages like Python with the speed of compiled languages like C, achieved through just-in-time (JIT) compilation via LLVM.

The REPL (Read-Eval-Print Loop) provides an interactive environment with tab completion, help system (type ?), shell mode (type ;), and package mode (type ]). The package manager Pkg handles dependencies through Project.toml and Manifest.toml files.

Julia excels at numerical and scientific computing, offering native support for multi-dimensional arrays, complex numbers, and mathematical operations. Parallel computing is built-in through threads, distributed computing, and GPU support.

The type system enables both high performance (through type inference) and flexibility (multiple dispatch allows functions to behave differently based on argument types). This makes Julia suitable for both rapid prototyping and production deployment.

Package environments isolate dependencies per project. The --project flag activates a specific environment. Packages are installed from the General registry or Git repositories.

# CAVEATS

First run is slow due to JIT compilation (time-to-first-plot problem). Package precompilation takes time after updates. Memory usage can be higher than Python for simple tasks. Some Python libraries lack Julia equivalents. Thread-safety requires attention when parallelizing.

# HISTORY

**Julia** was created by Jeff Bezanson, Stefan Karpinski, Viral B. Shah, and Alan Edelman at MIT, with development starting in **2009** and public release in **2012**. Version 1.0 was released in **August 2018**, marking language stability. Julia has gained significant adoption in scientific computing, data science, and machine learning.

# SEE ALSO

[python](/man/python)(1), [R](/man/R)(1), [matlab](/man/matlab)(1), [octave](/man/octave)(1)
