# TAGLINE

kernel random number generator interface

# TLDR

**Get random bytes (shell)**

```head -c [16] /dev/urandom | xxd```

**Get random bytes (C function)**

```getrandom(buffer, length, flags)```

# SYNOPSIS

**#include <sys/random.h>**

**ssize_t getrandom(void** \*_buf_, **size_t** _buflen_, **unsigned int** _flags_**);**

# PARAMETERS

_buf_
> Buffer to receive random bytes.

_buflen_
> Number of bytes to read.

_flags_
> GRND_RANDOM (use /dev/random) or GRND_NONBLOCK.

# DESCRIPTION

**getrandom()** is a Linux system call that fills a buffer with random bytes from the kernel's random number generator. It's the recommended interface for obtaining random data in programs.

Unlike reading from /dev/urandom, getrandom() blocks during early boot until the entropy pool is initialized, ensuring strong randomness.

# FLAGS

```
0             - Default, blocks until entropy available
GRND_RANDOM   - Use /dev/random pool (may block)
GRND_NONBLOCK - Don't block, return error instead
```

# SHELL ALTERNATIVES

```bash
# Read random bytes
dd if=/dev/urandom bs=16 count=1

# Generate random hex
openssl rand -hex 16

# Generate random base64
openssl rand -base64 16
```

# CAVEATS

System call, not a command. Available since Linux 3.17. On older systems, read from /dev/urandom. May block at early boot.

# HISTORY

The getrandom() system call was added to Linux kernel **3.17** in **2014** by Theodore Ts'o to address issues with /dev/urandom returning weak random data before the entropy pool was initialized.

# SEE ALSO

[random](/man/random)(4), [urandom](/man/urandom)(4), [openssl-rand](/man/openssl-rand)(1)
