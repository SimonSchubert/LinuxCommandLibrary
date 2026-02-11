# TAGLINE

Memory debugging and profiling framework

# TLDR

**Check for memory leaks**

```valgrind --leak-check=full [./program]```

**Run with detailed leak info**

```valgrind --leak-check=full --show-leak-kinds=all [./program]```

**Track memory origins**

```valgrind --track-origins=yes [./program]```

**Use cachegrind** for cache profiling

```valgrind --tool=cachegrind [./program]```

**Use callgrind** for call profiling

```valgrind --tool=callgrind [./program]```

**Use helgrind** for thread error detection

```valgrind --tool=helgrind [./program]```

**Generate suppressions** for known issues

```valgrind --gen-suppressions=all [./program]```

# SYNOPSIS

**valgrind** [**--tool=**_toolname_] [_options_] _program_ [_args_]

# PARAMETERS

**--tool=**_name_
> Select tool (memcheck, cachegrind, callgrind, helgrind, drd, massif)

**--leak-check=**_level_
> Check for memory leaks (no, summary, full)

**--show-leak-kinds=**_kinds_
> Which leaks to show (definite, indirect, possible, reachable, all)

**--track-origins=**_yes|no_
> Track origins of uninitialized values

**--log-file=**_file_
> Write output to file

**--xml=**_yes_
> Output in XML format

**--gen-suppressions=**_level_
> Generate suppression entries (no, yes, all)

**--suppressions=**_file_
> Use suppressions from file

**-v**, **--verbose**
> More verbose output

**-q**, **--quiet**
> Less verbose output

# TOOLS

**memcheck**: Memory error detector (default)
**cachegrind**: Cache and branch profiler
**callgrind**: Call-graph profiler
**helgrind**: Thread error detector
**drd**: Thread error detector (different algorithm)
**massif**: Heap profiler

# DESCRIPTION

**valgrind** is an instrumentation framework for dynamic analysis tools. The default tool, memcheck, detects memory management problems: leaks, use of uninitialized memory, buffer overflows, and invalid frees.

Programs run significantly slower under Valgrind (10-50x) as every memory access is instrumented. This is normal and expected.

Output indicates error type, location (with line numbers if compiled with **-g**), and call stack. "Definitely lost" memory is a real leak; "still reachable" may be acceptable cleanup deferred to exit.

Other tools profile performance (cachegrind, callgrind), detect threading issues (helgrind, drd), or analyze heap usage (massif).

# CAVEATS

Compile programs with **-g** for line numbers and **-O0** or **-O1** for accurate debugging (high optimization confuses source mapping).

False positives occur, especially with system libraries. Use suppression files to ignore known issues.

Valgrind doesn't work well with JIT compilers or custom memory allocators without additional configuration.

# SEE ALSO

[gdb](/man/gdb)(1), [strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [asan](/man/asan)(7)
