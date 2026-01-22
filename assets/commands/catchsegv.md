# TLDR

**Run program with segfault catching**

```catchsegv [./program]```

**Run with arguments**

```catchsegv [./program] [arg1] [arg2]```

# SYNOPSIS

**catchsegv** _program_ [_args_...]

# DESCRIPTION

**catchsegv** intercepts segmentation faults and prints a symbolic backtrace. Uses LD_PRELOAD to load libSegFault.so which installs a SIGSEGV handler.

Part of glibc debug utilities.

# ENVIRONMENT

**SEGFAULT_OUTPUT_NAME**
> Output file (default: stderr)

**SEGFAULT_SIGNALS**
> Signals to handle: segv, ill, bus, stkflt, abrt, fpe

**SEGFAULT_USE_ALTSTACK**
> Use alternate stack for handler

# DEBUG SYMBOLS

Compile with -g flag for function names and line numbers in backtrace:

```gcc -g -o program program.c```

Without debug symbols, only memory addresses are shown.

# CAVEATS

Removed from glibc 2.35+. Modern alternatives include out-of-process debuggers and post-mortem analysis tools. Uses non-async-signal-safe functions in handler.

# ALTERNATIVES

- GDB with core dumps
- AddressSanitizer (-fsanitize=address)
- Custom signal handlers with backtrace()
- Valgrind

# SEE ALSO

[gdb](/man/gdb)(1), [addr2line](/man/addr2line)(1), [backtrace](/man/backtrace)(3)
