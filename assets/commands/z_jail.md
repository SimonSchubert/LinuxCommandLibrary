# TAGLINE

Multi-layer Linux sandbox for native code execution

# TLDR

**Run a program** inside an isolated root filesystem with seccomp enforcement

```sudo z_jail --root=[path/to/rootfs] --seccomp-enforce -- [program] [args...]```

**Verify binary integrity** before execution

```sudo z_jail --root=[path/to/rootfs] --seccomp-enforce --self-hash=[blake2b_hex] -- [program]```

**Suppress audit JSON** output

```sudo z_jail --root=[path/to/rootfs] --quiet -- [program]```

**Build** the ~130 KiB PIE binary from source

```make```

# SYNOPSIS

**z_jail** **--root=**_dir_ [_options_] **--** _program_ [_args_]

# PARAMETERS

**--root=**_dir_
> Sandbox root directory containing the target binary and dependencies (required).

**--seccomp-enforce**
> Enable seccomp-BPF whitelist (**whitelist-v1**, 15 syscalls).

**--self-hash=**_hex_
> Refuse to run unless the **z_jail** binary matches the given BLAKE2b-256 hash.

**--quiet**
> Suppress JSON audit output.

**--verbose**
> Enable debug logging.

**--version**
> Print build ID and exit.

**--help**
> Show usage and exit.

# DESCRIPTION

**z_jail** is a lightweight C99 sandbox for executing untrusted native binaries on Linux. It combines seven defence layers with no runtime dependencies beyond the standard C toolchain: Truthimatics verdict engine, mount/PID/net/IPC/UTS namespaces, **pivot_root**, capability dropping with locked securebits, **PR_SET_NO_NEW_PRIVS**, seccomp-BPF syscall whitelisting, and JSON audit logging with BLAKE2b content fingerprints.

The parent process clones isolated namespaces, applies resource limits, pivots into **--root**, installs the seccomp filter, and **execve**s the target. After the child exits, an audit record is written describing verdict, duration, sandbox settings, and executable hash.

Designed for CI pipelines, CTF jails, and lightweight code evaluation, **z_jail** sits between minimal tools like **bwrap** and heavier sandboxes such as **nsjail** or **gVisor**.

# CAVEATS

**z_jail** requires **CAP_SYS_ADMIN** (typically root) to create namespaces and **pivot_root**. The default seccomp whitelist allows only 15 syscalls — many programs need a custom policy or will be killed. Dynamic binaries require libraries inside **--root**; static binaries need only the executable. Kernel exploits and hardware side channels are outside the stated threat model.

# HISTORY

**Z-Jail** was developed by **Division-36** and released as **v1** in **2026**, targeting Linux kernel **5.4+** with a single **make** build and no external libraries.

# SEE ALSO

[bwrap](/man/bwrap)(1), [nsjail](/man/nsjail)(1), [firejail](/man/firejail)(1), [chroot](/man/chroot)(8)

# RESOURCES

```[Source code](https://github.com/Division-36/Z-Jail)```

```[Documentation](https://github.com/Division-36/Z-Jail/tree/main/docs)```

<!-- verified: 2026-07-02 -->