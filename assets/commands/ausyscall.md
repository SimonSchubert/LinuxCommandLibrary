# TAGLINE

map between Linux system-call names and numbers

# TLDR

**Look up the number of a syscall** by name

```ausyscall [openat]```

**Look up the name** of a syscall by number

```ausyscall [257]```

**Dump the whole syscall table** for the current architecture

```ausyscall --dump```

**Dump the syscall table** for a specific architecture

```ausyscall [i386] --dump```

**Look up a syscall** on a specific architecture

```ausyscall [arm64] [connect]```

**Require an exact match** (no substring)

```ausyscall --exact [open]```

# SYNOPSIS

**ausyscall** [_arch_] _name_|_number_ [**--exact**]

**ausyscall** [_arch_] **--dump**

# PARAMETERS

_ARCH_
> Target architecture: `b32` / `b64` (biarch shortcuts) or an explicit name such as `i386`, `x86_64`, `aarch64`/`arm64`, `arm`, `ppc`, `ppc64le`, `s390x`, `riscv64`. Defaults to the running kernel's architecture.

_NAME_
> System-call name (e.g. `openat`, `execve`). A substring match is used unless `--exact` is given.

_NUMBER_
> Numeric system-call number.

**--dump**
> List every syscall name and number for the selected architecture.

**--exact**
> Require an exact name match instead of substring.

**-h**, **--help**
> Show help.

**-V**, **--version**
> Show version.

# DESCRIPTION

**ausyscall** is a small lookup utility from the **Linux audit** framework. It is the canonical place to translate syscall numbers seen in audit logs, `strace` output, `seccomp` filters, and BPF programs into their human-readable names (and vice-versa) for any supported architecture.

Syscall numbers differ between architectures — `openat` is 257 on x86_64 but 295 on i386 — so always pass the correct architecture when inspecting logs produced on a different machine.

# CAVEATS

Part of the **audit** package (`audit-userspace`). The syscall table is baked in at build time; very new syscalls may be missing on older audit builds. On multi-arch kernels, use `b32`/`b64` shortcuts to pick the right ABI.

# HISTORY

**ausyscall** ships with the Linux Audit user-space tools originally developed by **Red Hat** (primarily **Steve Grubb**). It uses the syscall tables maintained in the audit source tree alongside `auparse`.

# SEE ALSO

[auditctl](/man/auditctl)(8), [ausearch](/man/ausearch)(8), [aureport](/man/aureport)(8), [strace](/man/strace)(1)
