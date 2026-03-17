# TAGLINE

Heap consistency checking for malloc

# TLDR

**Enable heap checking in a C program** (call before any malloc)

```mcheck(NULL)```

**Enable heap checking with a custom error handler**

```mcheck([handler_func])```

**Enable pedantic checking on every allocation**

```mcheck_pedantic(NULL)```

**Check all allocated blocks immediately**

```mcheck_check_all()```

**Explicitly check a specific allocated block**

```mprobe([ptr])```

**Link with mcheck to enable automatic checking**

```cc [program.c] -lmcheck```

# SYNOPSIS

```c
#include <mcheck.h>

int mcheck(void (*abortfunc)(enum mcheck_status mstatus));
int mcheck_pedantic(void (*abortfunc)(enum mcheck_status mstatus));
void mcheck_check_all(void);
enum mcheck_status mprobe(void *ptr);
```

# PARAMETERS

**mcheck** _abortfunc_
> Install debugging hooks for malloc. Pass NULL to use the default handler that prints a message and calls abort(). Must be called before the first malloc().

**mcheck_pedantic** _abortfunc_
> Like mcheck(), but performs consistency checks on all allocated blocks on every call to malloc(), realloc(), or free(). Very slow.

**mcheck_check_all**
> Trigger an immediate consistency check on all allocated blocks. Only effective if mcheck() was called first.

**mprobe** _ptr_
> Explicitly check the block pointed to by ptr for consistency.

# DESCRIPTION

The **mcheck** family of functions installs debugging hooks for the **malloc**(3) memory allocation functions in glibc. These hooks perform consistency checks on the heap, detecting common errors such as double-free, buffer overruns that corrupt malloc bookkeeping data, and use of freed memory.

The **mcheck()** function must be called before the first call to malloc(). Linking the program with **-lmcheck** inserts an implicit call to mcheck(NULL) before the first allocation, which is easier than modifying source code.

The **mprobe()** function returns a status indicating the block's state: **MCHECK_OK** (no inconsistency), **MCHECK_HEAD** (memory before the block was clobbered), **MCHECK_TAIL** (memory after the block was clobbered), or **MCHECK_FREE** (the block was freed twice).

# CAVEATS

The **mcheck()** function must be called before any memory allocation; otherwise it returns -1. These functions are glibc-specific and non-portable. The **MALLOC_CHECK_** environment variable provides similar functionality without recompilation. The **mcheck_pedantic()** function is very slow and should only be used for targeted debugging. Deprecated in newer glibc versions in favor of **MALLOC_CHECK_** and tools like valgrind.

# HISTORY

The **mcheck** functions are part of the **GNU C Library** (glibc) and originate from early Unix malloc debugging facilities. They are documented in the glibc manual under "Heap Consistency Checking".

# SEE ALSO

[valgrind](/man/valgrind)(1)