# TLDR

**List available tools**

```go tool```

**Run pprof**

```go tool pprof [profile.pb.gz]```

**Run trace**

```go tool trace [trace.out]```

**Run compile**

```go tool compile [file.go]```

**Run objdump**

```go tool objdump [binary]```

# SYNOPSIS

**go tool** [_tool_] [_arguments_]

# PARAMETERS

_TOOL_
> Tool name to run.

_ARGUMENTS_
> Tool-specific arguments.

**pprof**
> Profile viewer.

**trace**
> Execution tracer.

**compile**
> Go compiler.

**link**
> Go linker.

**objdump**
> Object file disassembler.

**--help**
> Display help information.

# DESCRIPTION

**go tool** runs Go toolchain programs. It provides access to low-level tools like the compiler, linker, profiler, and tracer that underlie go build.

The command is used for advanced debugging, profiling, and understanding compiler behavior. Each tool has its own options and usage.

go tool exposes the Go toolchain internals.

# CAVEATS

Low-level tools. May change between versions. For advanced users.

# HISTORY

go tool provides access to **Go** toolchain internals, supporting debugging and optimization workflows.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)
