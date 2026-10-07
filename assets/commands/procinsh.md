# TAGLINE

Read-only Linux x86-64 process inspector with a local web UI

# TLDR

**Start** the inspector on loopback (default `127.0.0.1:8080`)

```sudo procinsh```

Listen on a **specific loopback port**

```sudo procinsh --listen [127.0.0.1:9090]```

Allow a **non-loopback** bind (no auth or TLS)

```sudo procinsh --listen [0.0.0.0:8080] --allow-non-loopback```

Print the **version**

```procinsh --version```

# SYNOPSIS

**procinsh** [**--listen** _ADDR_] [**--allow-non-loopback**]

# PARAMETERS

**--listen** _ADDR_
> Bind address as `host:port`. Default **127.0.0.1:8080**. A non-loopback host is refused unless **--allow-non-loopback** is also set

**--allow-non-loopback**
> Permit listening on a non-loopback address. The UI then exposes process memory and environment variables with no authentication or TLS

**--help**
> Print usage and exit

**--version**
> Print the crate version and exit

# DESCRIPTION

**procinsh** (Process in the Shell) is a local, read-only process inspector for **Linux x86-64**. It is a Rust binary that starts an HTTP server and serves a browser UI so you can inspect running processes: memory, stacks, and related kernel state. The crate description is "A local, read-only Linux x86-64 process inspector". The published crate version is **0.1.11** (MIT).

The server is Axum. Logs go to stderr through **env_logger** (default filter `info`; override with **RUST_LOG**). The binary **compile_error**s on any target other than Linux x86-64.

Install from crates.io with **cargo install procinsh --locked**, or build from a clone (`npm ci`, `npm run build:web`, `cargo build --release --locked`). Native build needs Rust, a C compiler, clang with the BPF backend, bpftool, pkg-config, libelf and zlib development files, and BTF at `/sys/kernel/btf/vmlinux`. WSL2 support is limited; the README recommends a source build there.

The process needs **CAP_SYS_PTRACE**, **CAP_BPF**, **CAP_PERFMON**, and **CAP_DAC_READ_SEARCH**. Run it with **sudo**, or grant those capabilities with **setcap** on the binary and run it as a normal user.

# CAVEATS

Linux x86-64 only. Binding off loopback without authentication exposes process memory and environment variables to the network. The README has not tested Docker or other containers. Ubuntu's `bpftool` wrapper can fail on WSL2 when the kernel version does not match the tools package; set **BPFTOOL** to the packaged executable.

# HISTORY

**procinsh** is an MIT-licensed Rust project by **akawashiro**. The crates.io crate is **procinsh**. The name plays on *Ghost in the Shell*.

# SEE ALSO

[procs](/man/procs)(1), [htop](/man/htop)(1), [glances](/man/glances)(1), [bpftool](/man/bpftool)(8), [setcap](/man/setcap)(8), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/akawashiro/procinsh)```

```[Homepage](https://akawashiro.com/articles/procinsh-en)```

<!-- verified: 2026-10-07 -->
