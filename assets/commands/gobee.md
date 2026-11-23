# TAGLINE

Transpile a subset of Go into BPF C

# TLDR

**Translate** a Go BPF program and emit C plus typed bindings

```gobee translate --bindings-dir [./bpf] [./bpf/src]```

**Install** the latest release

```go install github.com/boratanrikulu/gobee/cmd/gobee@latest```

**Write the .bpf.c** to a separate output directory

```gobee translate -o [./bpf/out] [./bpf/src]```

**Annotate** a verifier log with Go source positions using the sourcemap

```gobee diagnose -m [./bpf/src/prog.bpf.c.map] < [verifier.log]```

# SYNOPSIS

**gobee translate** [_options_] _input-dir_

**gobee diagnose** **-m** _sourcemap_ < _verifier.log_

# DESCRIPTION

**gobee** is a pure-Go transpiler that converts a strict subset of Go into BPF (Berkeley Packet Filter) C source code, together with typed Go bindings for the resulting programs. It targets developers who want to author eBPF programs without writing C directly; the generated C is compiled by **clang**'s BPF backend and the bindings sit on top of **cilium/ebpf**.

The primary subcommand, **translate**, reads the Go BPF sources in a directory and produces a **.bpf.c** file, a sourcemap (**.bpf.c.map**) used for error attribution, and, with **--bindings-dir**, a **\*_bindings.go** file exposing typed loaders (**Load<Stem>**), **Attach<Name>**/**AttachAll** functions, and the kernel-side types re-published in Go. **clang** with BPF target support is required to compile the generated C into an object file; **gobee** itself only depends on Go.

It ships about 200 typed Go stubs for the **libbpf** v1.5.0 helper set and supports XDP, tracepoint, kprobe/kretprobe, uprobe/uretprobe, sock_ops, TC, cgroup_skb and LSM programs. The generated loaders run **bpfvet** to fail fast on kernels that are too old and annotate verifier errors with Go file:line:col positions automatically; **diagnose** does the same offline.

# PARAMETERS

**translate** _input-dir_
> Transpile kernel-side Go to BPF C and optionally generate Go bindings.

**-o**, **--output** _dir_
> Output directory for the generated **.bpf.c** (default: the input directory).

**--bindings-dir** _dir_
> Directory for the typed Go bindings file; the package name is the directory's base name. Without it, no bindings are generated.

**diagnose**
> Read a BPF verifier log on stdin and write a copy annotated with Go source positions.

**-m**, **--map** _file_
> Path to the **.bpf.c.map** sourcemap (required for **diagnose**).

# CAVEATS

Only a strict subset of Go is accepted; idiomatic Go features such as goroutines, interfaces with dynamic dispatch, and the full standard library are not available in transpiled code. Building loadable BPF objects still requires **clang** with the **bpf** target, and loading them at runtime requires Linux (amd64 or arm64) and elevated privileges. gobee does not run clang for you; compiling, embedding and loading remain user-owned, as with **bpf2go**. Apple's bundled clang lacks the BPF target, so on macOS use Homebrew **llvm**.

# HISTORY

**gobee** was created in **2026** by **Bora Tanrikulu**, written in **Go** and released under the MIT license. It was inspired by the Go-to-C transpiler Solod and the Rust eBPF framework Aya.

# SEE ALSO

[clang](/man/clang)(1), [bpftool](/man/bpftool)(8), [bpftrace](/man/bpftrace)(8)

# RESOURCES

```[Source code](https://github.com/boratanrikulu/gobee)```

```[Documentation](https://github.com/boratanrikulu/gobee/tree/main/docs)```

<!-- verified: 2026-11-23 -->
