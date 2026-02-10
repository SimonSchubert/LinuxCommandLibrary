# TAGLINE

sets the process execution domain, affecting how the kernel handles the process

# TLDR

**Set execution domain**

```personality [domain] [command]```

**Run as Linux 32-bit**

```personality --addr-no-randomize [command]```

**Show current personality**

```personality```

**Run with address randomization disabled**

```setarch $(uname -m) -R [command]```

# SYNOPSIS

**personality** [_options_] [_command_ [_args_]]

# PARAMETERS

**ADDR_NO_RANDOMIZE**
> Disable ASLR.

**MMAP_PAGE_ZERO**
> Map page zero.

**ADDR_COMPAT_LAYOUT**
> Legacy memory layout.

**READ_IMPLIES_EXEC**
> Readable implies executable.

# DESCRIPTION

**personality** sets the process execution domain, affecting how the kernel handles the process. Used for compatibility with older programs or debugging.

# Disable ASLR for debugging
setarch $(uname -m) -R gdb ./program

# Run 32-bit binary
linux32 ./old_binary

# Check personality flags
personality
```

# SYSTEM CALL

```c
#include <sys/personality.h>

int personality(unsigned long persona);

/* Personality flags */
PER_LINUX       - Standard Linux
PER_LINUX32     - 32-bit mode
ADDR_NO_RANDOMIZE - Disable ASLR
```

# CAVEATS

Linux-specific. Disabling security features for compatibility reduces security. Most users should use setarch instead.

# HISTORY

personality(2) is a Linux system call for setting execution domain, dating back to early Linux 2.x for binary compatibility.

# SEE ALSO

[setarch](/man/setarch)(8), [linux32](/man/linux32)(8), [linux64](/man/linux64)(8)
