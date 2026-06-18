# TAGLINE

Instant Linux sandbox running on a WASM RISC-V VM

# TLDR

**Start an interactive shell** using the default snapshot

```vpod```

**Start a shell** from a specific snapshot

```vpod start [alpine:latest]```

**Download a snapshot** so it is available locally

```vpod pull [alpine:latest]```

**List** the snapshots already available

```vpod list```

**Install** with the official script

```curl -fsSL https://install.vpod.sh | sh```

# SYNOPSIS

**vpod** [_command_] [_snapshot_]

# DESCRIPTION

**vpod** gives an untrusted process an instant, throwaway Linux environment. Each vpod is a RISC-V virtual machine (the RV64GC instruction set) compiled to WebAssembly, so the whole sandbox runs inside a portable WASM runtime rather than relying on the host kernel, containers, or hardware virtualization.

When started, a vpod boots from a snapshot, a saved VM state that is ready in under a second, and drops the user into an interactive shell. Because execution stays inside the WebAssembly sandbox, code running in a vpod is isolated from the host and behaves the same on Linux, macOS, and Windows without per-platform setup.

In addition to the command-line tool, the project ships a Python SDK (installable with **pip install vpod**) that creates persistent sandboxes programmatically, which is aimed at running AI-agent generated or otherwise untrusted code safely.

# PARAMETERS

**start** _SNAPSHOT_
> Start an interactive shell from the named snapshot instead of the default.

**pull** _SNAPSHOT_
> Download a snapshot and store it locally for later use.

**list**
> List the snapshots that are available locally.

# CAVEATS

There is no hardware acceleration, so CPU-intensive workloads run slower than native execution. GPU and accelerator interfaces (CUDA, Metal, ML accelerators) are not available inside the sandbox.

# HISTORY

**vpod** is developed by capsulerun and released under the Apache License 2.0. It is written primarily in Rust, with the RISC-V guest executed through a WebAssembly runtime.

# SEE ALSO

[bubblewrap](/man/bubblewrap)(1), [docker](/man/docker)(1), [firejail](/man/firejail)(1), [qemu](/man/qemu)(1), [wasmtime](/man/wasmtime)(1)

# RESOURCES

```[Source code](https://github.com/capsulerun/vpod)```

<!-- verified: 2026-06-18 -->
