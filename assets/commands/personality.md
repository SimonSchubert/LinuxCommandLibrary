# TAGLINE

Set the process execution domain via system call

# TLDR

**Disable ASLR for debugging (via setarch)**

```setarch $(uname -m) -R [command]```

**Run a command with uname reporting a 32-bit architecture**

```linux32 [command]```

**Run a command with uname reporting a 64-bit architecture**

```linux64 [command]```

**Set legacy memory layout**

```setarch $(uname -m) -L [command]```

# SYNOPSIS

```c
#include <sys/personality.h>

int personality(unsigned long persona);
```

# PARAMETERS

**PER_LINUX**
> Standard Linux execution domain.

**PER_LINUX32**
> uname(2) reports the name of the 32-bit architecture (i686 instead of x86_64).

**ADDR_NO_RANDOMIZE**
> Disable Address Space Layout Randomization (ASLR).

**MMAP_PAGE_ZERO**
> Map the zero page (for SVr4 binaries).

**ADDR_COMPAT_LAYOUT**
> Use legacy virtual memory layout.

**READ_IMPLIES_EXEC**
> Readable mappings become executable (PROT_READ implies PROT_EXEC).

**ADDR_LIMIT_32BIT**
> Limit address space to 32 bits.

**STICKY_TIMEOUTS**
> Use SVr4-style timeout handling in select(2).

# DESCRIPTION

**personality**(2) is a Linux system call that sets the process execution domain, telling the kernel to emulate behavior of other UNIX flavors or to toggle compatibility flags. Passing 0xffffffff returns the current persona without changing it. It is primarily invoked indirectly through wrapper commands such as **setarch**, **linux32**, and **linux64**.

Common use cases include disabling ASLR to produce reproducible memory addresses during debugging, making legacy 32-bit software see a 32-bit architecture under a 64-bit kernel, and emulating older UNIX memory layouts for compatibility.

# CAVEATS

Linux-specific. There is no standalone **personality** CLI binary; use **setarch**(8) or its aliases. Disabling security features such as ASLR reduces security and should be limited to debugging contexts.

# HISTORY

The personality(2) system call appeared in Linux 1.1.20, with a glibc wrapper since 2.3, to support binary compatibility with SCO, SVr4, Solaris, and other UNIX systems whose binaries could run under Linux via iBCS2.

# SEE ALSO

[setarch](/man/setarch)(8), [linux32](/man/linux32)(8), [linux64](/man/linux64)(8)

# RESOURCES

```[Documentation](https://man7.org/linux/man-pages/man2/personality.2.html)```

<!-- verified: 2026-11-09 -->
