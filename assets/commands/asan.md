# TAGLINE

Detect memory errors at runtime via compiler instrumentation.

# TLDR

**Compile a C program with AddressSanitizer**

```gcc -fsanitize=address -g [program.c] -o [program]```

**Compile a C++ program with ASan**

```g++ -fsanitize=address -g [program.cpp] -o [program]```

**Compile with ASan using Clang**

```clang -fsanitize=address -g [program.c] -o [program]```

**Run with custom ASan options**

```ASAN_OPTIONS=detect_leaks=1:verbosity=1 ./[program]```

**Compile with ASan and UBSan combined**

```gcc -fsanitize=address,undefined -g [program.c] -o [program]```

**Compile for debugging with frame pointers**

```gcc -fsanitize=address -g -fno-omit-frame-pointer [program.c] -o [program]```

# SYNOPSIS

**gcc** **-fsanitize=address** [_options_] _source_files_

# PARAMETERS

**-fsanitize=address**
> Enable AddressSanitizer instrumentation.

**-g**
> Include debug information for meaningful stack traces.

**-fno-omit-frame-pointer**
> Preserve frame pointers for better stack traces.

**-O1**
> Compile with at least -O1 for reasonable performance and readable stack traces.

**-fno-optimize-sibling-calls**
> Disable tail-call elimination for complete, accurate stack traces.

**-fsanitize-recover=address**
> Continue execution after detecting errors (required for ASAN_OPTIONS=halt_on_error=0).

**-static-libasan**
> Link the ASan runtime statically (GCC; Clang uses **-static-libsan**). GCC defaults to a shared runtime, Clang to a static one.

# ENVIRONMENT VARIABLES

**ASAN_OPTIONS**
> Runtime options for AddressSanitizer (colon-separated key=value pairs).

**detect_leaks=1**
> Enable memory leak detection (default on x86_64 Linux).

**detect_stack_use_after_return=1**
> Detect use of stack memory after the function returns (default on Linux).

**halt_on_error=0**
> Continue after a recoverable error (only effective when compiled with -fsanitize-recover=address; default is to halt).

**abort_on_error=1**
> Call abort() instead of _exit() on error, producing a core dump.

**log_path=**_path_
> Write reports to _path_.pid instead of stderr.

**verbosity=1**
> Increase output verbosity.

**symbolize=1**
> Enable symbolization of stack traces.

**print_stats=1**
> Print memory usage statistics at exit.

**ASAN_SYMBOLIZER_PATH**
> Path to llvm-symbolizer used to resolve addresses to source locations.

# DESCRIPTION

**AddressSanitizer (ASan)** is a fast memory error detector built into GCC and Clang. It detects buffer overflows, use-after-free, use-after-return, memory leaks, and other memory corruption bugs at runtime with relatively low overhead.

When enabled via **-fsanitize=address**, the compiler instruments memory accesses and allocations. The instrumented program maintains shadow memory that tracks the state of each byte. Memory errors are detected immediately when they occur, with detailed reports including stack traces for both the error location and the allocation/deallocation points.

ASan typically adds 2x slowdown and 3x memory overhead, making it suitable for testing and development but not production use. Compile with **-g** for source locations in reports.

# CAVEATS

ASan cannot be combined with other sanitizers except UBSan. The program must be recompiled; ASan cannot analyze existing binaries. False positives are rare but possible with custom allocators. Memory overhead may cause out-of-memory conditions on memory-constrained systems. Not all platforms support all ASan features.

# HISTORY

AddressSanitizer was developed at **Google** and first released with **LLVM 3.1** in **2012**, later added to GCC 4.8 in **2013**. It was designed by Konstantin Serebryany and others as a faster alternative to Valgrind for memory error detection. ASan has since found thousands of bugs in major software projects including Chrome, Firefox, and the Linux kernel.

# SEE ALSO

[valgrind](/man/valgrind)(1), [gcc](/man/gcc)(1), [clang](/man/clang)(1)

# RESOURCES

```[Source code](https://github.com/google/sanitizers)```

```[Documentation](https://clang.llvm.org/docs/AddressSanitizer.html)```

<!-- verified: 2026-06-16 -->
