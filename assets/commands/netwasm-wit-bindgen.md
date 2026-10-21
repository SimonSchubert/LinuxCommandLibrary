# TAGLINE

Generate reflection-free C# bindings from a WIT world

# TLDR

Generate bindings from a **single-world WIT file**

```netwasm-wit-bindgen --wit [service.wit] --output [Bindings.g.cs]```

Select a **named world** in a WIT package

```netwasm-wit-bindgen --wit [service.wit] --world [example:service@1.0.0/service] --output [Bindings.g.cs]```

Mark generated types **internal**

```netwasm-wit-bindgen --wit [service.wit] --world [example:service@1.0.0/service] --output [Bindings.g.cs] --accessibility internal```

Read a **WIT package directory** instead of one file

```netwasm-wit-bindgen --wit [path/to/wit] --world [example:service@1.0.0/service] --output [Bindings.g.cs]```

Install the **.NET global tool**

```dotnet tool install --global NetWasm.Wit.Bindings.Tool```

Generate a **worker client** from a contract file

```netwasm-wit-bindgen --worker-contract [contract.bin] --output [Client.cs] --javascript-output [client.mjs] --namespace [MyApp] --class [WorkerClient] --javascript-module [./host.mjs] --worker-client-module [./client.mjs]```

# SYNOPSIS

**netwasm-wit-bindgen** **--wit** _path_ [**--world** _id_] **--output** _file_ [**--accessibility** _mode_]

**netwasm-wit-bindgen** **--worker-contract** _path_ **--output** _file_ **--javascript-output** _file_ **--namespace** _ns_ **--class** _name_ **--javascript-module** _module_ **--worker-client-module** _module_

# DESCRIPTION

**netwasm-wit-bindgen** is the standalone WIT binding generator for NetWasm, an independent C# and .NET CIL to WebAssembly compiler. It converts one selected WIT world into deterministic, reflection-free C# source. The NetWasm compiler then consumes that ordinary managed assembly; it does not run or discover this tool during `dotnet build`.

Install it as a .NET global tool (`NetWasm.Wit.Bindings.Tool`). The package ships NetWasm's pinned platform-neutral **wasm-tools** module and drives it through Node.js. A native `wasm-tools` binary and Emscripten are not required.

WIT imports become static wrapper methods that lower managed values to the Component Model canonical ABI. WIT exports become partial managed methods plus generated ABI entry points. Records, variants, `option`, `result`, lists, tuples, enums, flags, and resources map to generated C# types. Asynchronous WIT functions and `future`/`stream` types are not supported by this generator.

Regenerate the output whenever the selected world changes. Commit the generated file or add an explicit generation step to the build.

# PARAMETERS

**--wit** _path_
> WIT file or package directory. Required in the default mode.

**--world** _id_
> World to generate, for example `example:service@1.0.0/service`. Optional when the input contains exactly one world.

**--output** _file_
> Path of the generated C# source file. Required.

**--accessibility** _mode_
> Accessibility of generated top-level declarations: **public** (default) or **internal**.

**--worker-contract** _path_
> Switch to worker-client generation and read this contract file. When present, every worker flag below is required and the WIT flags are not used.

**--javascript-output** _file_
> Path of the generated JavaScript companion (worker-client mode).

**--namespace** _ns_
> C# namespace for the generated worker client.

**--class** _name_
> C# class name for the generated worker client.

**--javascript-module** _module_
> JavaScript module specifier used by the generated client.

**--worker-client-module** _module_
> Worker-client module specifier written into the generated sources.

# ENVIRONMENT

**NETWASM_NODE_PATH**
> Absolute path of the Node.js executable. Used when `node` is not on **PATH**.

**EMSDK_NODE**
> Fallback Node.js path, after **NETWASM_NODE_PATH**.

# CAVEATS

Requires **Node.js 24** or newer, found on **PATH** or through **NETWASM_NODE_PATH** / **EMSDK_NODE**. Installing the tool requires a **.NET SDK** that can run `dotnet tool` (NetWasm documents SDK 10.0.303 or newer).

The packaged wasm-tools process is sandboxed. Run from the WIT package directory or pass absolute paths. A relative path that leaves the working directory, such as `../contracts/service.wit`, can fail with an insufficient-capabilities error.

The tool does not download imported WIT packages. Keep every referenced package in the input's standard WIT dependency layout. Selecting a world that includes a missing package fails with **NW1009**.

Flags are option/value pairs. There is no `--help` or `--version`; an unknown option is an error. Each option may be given only once.

An ordinary NetWasm SDK build does not invoke this command.

# HISTORY

NetWasm is an independent .NET-for-WebAssembly compiler, CoreLib, runtime, and SDK by Zion Sati. `netwasm-wit-bindgen` is packaged separately as `NetWasm.Wit.Bindings.Tool` so WIT binding generation stays an explicit source step rather than a compiler mode.

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-tool](/man/dotnet-tool)(1), [wasmtime](/man/wasmtime)(1), [jco](/man/jco)(1)

# RESOURCES

```[Source code](https://github.com/zion-sati/NetWasm)```

```[Homepage](https://www.netwasm.com)```

```[Documentation](https://github.com/zion-sati/NetWasm/blob/main/docs/wit-bindings.md)```

<!-- verified: 2026-10-21 -->
