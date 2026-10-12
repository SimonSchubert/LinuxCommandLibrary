# TAGLINE

Joke language whose pointers are Docker containers

# TLDR

**Run** a `.dr` program (needs a working Docker daemon)

```doiter [samples/hello-world.dr]```

Keep the **containers** so you can inspect them

```doiter --no-cleanup [samples/hello-world.dr]```

**Print the AST** and exit without running

```doiter --print-ast [samples/hello-world.dr]```

**Delete every** container this tool created

```doiter --cleanup-all```

Watch **what it is doing** while it runs

```RUST_LOG=doiter=info doiter [samples/hello-world.dr]```

# SYNOPSIS

**doiter** [**--no-cleanup**] [**--cleanup-all**] [**--print-ast**] [_file_]

# DESCRIPTION

**doiter** compiles and runs **Doiter**, a parody "cloud-native" language that uses the Docker daemon as virtual memory. Each allocation and stack frame becomes a container; each field is a file inside that container. There are two primitive types, **byte** and **char**. Conditionals use **when**. Every structure is a nullable pointer.

The crate name and binary are both **doiter** (version **0.1.0**). Flags come from **bpaf**. Build with `cargo build --release`; the executable lands in `target/release/doiter`. The language is a hackathon joke: `samples/hello-world.dr` implements a linked-list string, spawns **51** containers, and takes about a **minute** on a typical machine. The author describes the allocator as "missile allocation": nothing is collected during the run, then every container is removed when the program finishes (unless **--no-cleanup**).

# PARAMETERS

**--no-cleanup**
> Leave this run's containers in place after the program finishes so they can be inspected with **docker ps** and **docker exec**

**--cleanup-all**
> Remove every container created by doiter and exit. Does not run a source file

**--print-ast**
> Parse the file, print the AST, and exit without type-checking or running

_file_
> Path to a `.dr` source file. Required unless **--cleanup-all**. bpaf offers filename completion for `*.dr`

**-h**, **--help**
> Print usage (bpaf)

# ENVIRONMENT

**RUST_LOG**
> Tracing filter. `doiter=info` prints a hierarchical log of what the interpreter is doing

# CAVEATS

This is not a language to use for real work. It requires a running **Docker** daemon and will create dozens of containers for trivial programs. **--cleanup-all** removes every container doiter created, not only the current run. If a run is killed, leftover containers may remain until **--cleanup-all**. There is no string or array type: those are built as linked lists, so each character is its own container.

# HISTORY

**Doiter** was written by GitHub user **simvux** as an October hackathon language whose gimmick is using Docker as RAM. It is MIT-licensed. The same author also works on the separate **Lumina** language.

# SEE ALSO

[docker](/man/docker)(1), [cargo](/man/cargo)(1), [rustc](/man/rustc)(1)

# RESOURCES

```[Source code](https://github.com/simvux/doiter)```

<!-- verified: 2026-10-12 -->
