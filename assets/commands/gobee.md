# TAGLINE

Transpile a subset of Go into BPF C

# TLDR

**Translate** a Go BPF program and emit C plus typed bindings

```gobee translate --bindings-dir [./bpf] [./bpf/src]```

**Install** the latest release

```go install github.com/boratanrikulu/gobee/cmd/gobee@latest```

**Diagnose** a verifier error against the generated sourcemap

```gobee diagnose [verifier.log]```

# SYNOPSIS

**gobee** _subcommand_ [_options_] [_paths_]

# DESCRIPTION

**gobee** is a pure-Go transpiler that converts a strict subset of Go into BPF (Berkeley Packet Filter) C source code, together with typed Go bindings for the resulting programs. It targets developers who want to author eBPF programs without writing C directly, while keeping the resulting object compatible with **libbpf** and **clang**'s BPF backend.

The primary subcommand, **translate**, reads Go source files describing BPF programs and produces three artifacts in the target directory: a **.bpf.c** file, a sourcemap (**.bpf.c.map**) used for error attribution, and **\*_bindings.go** files exposing typed loaders and program handles. **clang** with BPF target support is required to compile the generated C into an object file; **gobee** itself only depends on Go.

The tool also exposes typed stubs for the **libbpf** v1.5.0 helper set, performs kernel-version gating with **bpfvet**, and can map verifier errors back to the original Go positions for offline debugging.

# PARAMETERS

**translate**
> Transpile Go BPF sources to C and generate Go bindings.

**diagnose**
> Map verifier output back to source positions using the generated sourcemap.

**--bindings-dir  _dir_**
> Output directory for the generated Go bindings.

# CAVEATS

Only a strict subset of Go is accepted; idiomatic Go features such as goroutines, interfaces with dynamic dispatch, and the full standard library are not available in transpiled code. Building loadable BPF objects still requires **clang** with the **bpf** target, and loading them at runtime requires elevated privileges.

# SEE ALSO

[clang](/man/clang)(1), [bpftool](/man/bpftool)(8), [bpftrace](/man/bpftrace)(8)
