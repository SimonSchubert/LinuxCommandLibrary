# TLDR

**Print** machine architecture

```arch```

# SYNOPSIS

**arch**

# DESCRIPTION

**arch** prints the machine hardware architecture. On Linux, this is typically equivalent to **uname -m**.

Common outputs include:
- **x86_64**: 64-bit Intel/AMD
- **aarch64** or **arm64**: 64-bit ARM
- **i686** or **i386**: 32-bit Intel
- **armv7l**: 32-bit ARM

# CAVEATS

Output varies by system and may differ from CPU marketing names. Some systems may return different strings for compatibility modes.

# HISTORY

**arch** has been available on Unix systems since BSD. On Linux, it's part of coreutils and provides a simple wrapper around uname.

# SEE ALSO

[uname](/man/uname)(1), [hostnamectl](/man/hostnamectl)(1)
