# TAGLINE

Generate allocation-free JSON methods for Go types

# TLDR

**Write and read methods** for two types in the current package

```jsongen -write Reply -read Request```

**Several types** on one flag, separated by commas

```jsongen -write Reply,Item -read Request```

**Choose the output file**

```jsongen -write Reply -o [out.go]```

**Generate into another directory**

```jsongen -read Request [./api]```

Run it from **go generate**

```//go:generate go run github.com/theconsensuslabs/noalloc/cmd/jsongen -write Reply -read Request```

# SYNOPSIS

**jsongen** [**-write** _types_] [**-read** _types_] [**-o** _file_] [_dir_]

# PARAMETERS

**-write** _types_
> Comma-separated types to give a `WriteJSON` method. Every struct type of the package that those types hold gets one too.

**-read** _types_
> Comma-separated types to give a `ReadJSON` method, including struct types of the package they hold.

**-o** _file_
> File to write in the package directory. The default name joins `json` and `gen.go` with an underscore.

_dir_
> Package directory to read and to write into (default: `.`).

# DESCRIPTION

**jsongen** writes `WriteJSON` and `ReadJSON` methods that encode and decode JSON through `github.com/theconsensuslabs/noalloc/encoding/json` without allocating. It is the code generator from the **noalloc** module. For the types it accepts, the bytes match what `encoding/json` writes and reads.

`WriteJSON` writes through a `Writer` into memory the caller keeps and reuses, flushing to an `io.Writer` as that buffer fills. `ReadJSON` reads through a `Reader`. Strings land in the reader's arena, over memory the caller provides, and stay valid until that memory is reused. A slice decodes into the capacity it already has. A pointer decodes into the value it already points at. Past either limit, the decode fails with `Full` instead of allocating.

A time keeps its instant and decodes in UTC, without the offset it was written with. The command prints errors as `jsongen:` on standard error and exits **1**. A successful write exits **0**. The output file mode is `0644`.

The usual call site is a `//go:generate` line, or `go run github.com/theconsensuslabs/noalloc/cmd/jsongen`. Install a binary with `go install github.com/theconsensuslabs/noalloc/cmd/jsongen@latest`. The checker that enforces `//noalloc:root` is **noalloc**.

# CAVEATS

**jsongen** refuses types it cannot encode or decode without allocating, and it names the reason. That includes maps, interfaces, channels, functions, complex numbers, and generic types (a named struct such as `type Jobs List[Job]` stands in for the generic). It also refuses a type that already has `MarshalJSON`, `UnmarshalJSON`, or only `MarshalText`. A type with `AppendText` and no `MarshalText` is refused because `encoding/json` writes that as text only under the jsonv2 experiment. For reading, it refuses slices of bytes, embedded pointers, and fields whose tag is `,string`.

A type can supply its own `WriteJSON` or `ReadJSON` instead of generated methods. Give a text-writing type `AppendText`, or write the JSON methods by hand, when the generator refuses it.

The generator's own source keeps Go's BSD license where it was adapted from the Go tree. The rest of the module is MIT. It needs the same Go toolchain as **noalloc** (**Go 1.27** or later).

# HISTORY

**jsongen** ships in the **noalloc** module from Consensus Labs, LLC, copyright **2026**. The README's JSON section is the usage reference, including how generated methods compare with other Go JSON libraries.

# SEE ALSO

[noalloc](/man/noalloc)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/theconsensuslabs/noalloc)```

```[Documentation](https://github.com/theconsensuslabs/noalloc/blob/main/README.md#encoding-and-decoding-json)```

<!-- verified: 2026-10-29 -->
