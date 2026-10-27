# TAGLINE

Compile a .NET assembly to a core WebAssembly module

# TLDR

Compile one **assembly** to a core Wasm module

```nwc -out:[application.wasm] -r:[NetWasm.CoreLib.dll] [App.dll]```

Write a **runtime layout** sidecar as well

```nwc -out:[application.wasm] -r:[NetWasm.CoreLib.dll] -runtimelayout:[layout.json] [App.dll]```

Compile a **library** (no managed entry point)

```nwc -target:library -out:[library.wasm] -r:[NetWasm.CoreLib.dll] [Lib.dll]```

Enter through one **static method**

```nwc -target:function -entry:[Namespace.Type::Method] -out:[module.wasm] -r:[NetWasm.CoreLib.dll] [App.dll]```

Package a linked core module as a **WASI component**

```nwc componentize -coremodule:[app.wasm] -wit:[service.wit] -out:[app.component.wasm] -manifest:[manifest.json]```

List **every option**

```nwc -help```

# SYNOPSIS

**nwc** [_options_] _input.dll_

**nwc componentize** [_options_]

# DESCRIPTION

**nwc** is the NetWasm compiler: it turns one managed assembly into a core WebAssembly module. NetWasm is an independent C# and .NET CIL to Wasm toolchain (compiler, CoreLib, runtime, and SDK). It is not a browser build of desktop .NET.

The command line follows **csc**. An option starts with `-` (or `/`) and takes its value after a colon. A switch ends in `+` or `-`. `@file` reads more options from a response file. The default command compiles. `nwc componentize` packages an already linked core module.

`-target:exe` (the default) compiles an executable from the assembly's entry point, `-target:library` a library, and `-target:function` a module entered through the static method `-entry:Namespace.Type::Method` names. `-export:name=Namespace.Type::Method` exports more static methods. `-r:` (or `-reference:`) names the closed reference closure; repeat it or separate files with `,` or `;`. `-platform:wasm32|wasm64` defaults to wasm32. `-optimize:` is None, O0, O1, O2, O3, Os, or Oz (default Oz).

Sidecars are written only when an option names them: `-interopmanifest`, `-runtimelayout`, `-compilermetadata`, `-exceptiontypemap`, and `-stacktracesymbols`. Native callbacks need `-runtimelayout`; their object file is the output's name with `.callbacks.o` unless `-callbackobject:` names it. `-wit` and `-world` select the WIT package and world. `-source` names a source file for stack traces.

Ordinary application work uses `dotnet build` / `dotnet publish`. After `dotnet restore`, the host-tools NuGet package supplies **nwc** as a native executable plus pinned Node, wasm-ld, wasm-merge, and wasm-opt. A source build of the compiler produces `nwc.dll` under `src/NetWasm.Compiler.Cli/bin/`.

`nwc` prints a banner unless `-nologo`. Failures are reported as `error NW1234: message` (the form MSBuild reads) and exit **1**. `nwc -help` (short form `-?`) lists every option and exits **0**.

# PARAMETERS

**-out:**_file_
> Write the core WebAssembly module to this path. Required for compile.

**-r:**_file_[,_file_...]
> Reference assemblies (short form of **-reference:**). Repeatable.

**-target:**_kind_
> **exe** (default), **library**, or **function**.

**-entry:**_Type::Method_
> Static method **-target:function** enters. Invalid with other targets.

**-export:**_name_=_Type::Method_
> Export a static method under _name_. Repeatable.

**-platform:**_arch_
> **wasm32** (default) or **wasm64**.

**-optimize:**_level_
> **None**, **O0**, **O1**, **O2**, **O3**, **Os**, or **Oz** (default).

**-wit:**_path_ / **-world:**_name_
> WIT package and world the application targets.

**-runtimelayout:**_file_
> Write the runtime layout sidecar. Required for native callbacks.

**-interopmanifest:**_file_ / **-compilermetadata:**_file_ / **-exceptiontypemap:**_file_ / **-stacktracesymbols:**_file_
> Optional sidecars. **-stacktracesymbols** also emits managed stack-trace instrumentation.

**-callbackobject:**_file_
> Native callback object. Default: the output path with `.callbacks.o`.

**-jsexportboundary**[+|-] / **-structureddiagnostics**[+|-]
> Toggles. `+` or a bare flag enables, `-` disables.

**-nologo**
> Suppress the compiler banner.

**-help**
> Print the option summary (short form **-?**).

**@**_file_
> Read more options from a response file.

# COMMANDS

**componentize** **-coremodule:**_file_ **-wit:**_path_ **-out:**_file_ **-manifest:**_file_ [**-runtimemodule:**_file_] [**-world:**_name_] [**-platform:**_arch_] [**-interopmanifest:**_file_] [**-jcoversion:**_ver_] [**-preview2shimversion:**_ver_] [**-optimize:**_level_] [**-managedinlininghints:**_value_]
> Package a linked core module as a component. Takes no positional input files. Current component output is wasm32 plus WASI 0.2. **wasm64** fails with **NW1010** rather than downgrading. **-managedinlininghints** is **Auto** (default), **Preserve**, or **IgnoreAggressive**.

# CAVEATS

One input assembly per compile. Missing **-out** or a second positional file is an error. Most named options may be given only once; **-r**, **-export**, **-source**, and **-importmodule** may repeat.

Without **-wasmtoolsnode**, **-wasmtoolscommand**, and **-wasmtoolsmodule** together, **nwc** runs **wasm-tools** from **PATH**. The three must be given together when any is set.

`-diagnosticlog:` writes JSON Lines. `-diagnostictrace:` writes a compiler support trace and, unless a log path is also set, the same log under `<path>.passes/compiler.log.jsonl`. Both are off by default.

This command does not generate C# from WIT. Use **netwasm-wit-bindgen** for that. An ordinary NetWasm SDK build invokes **nwc** through MSBuild; you do not need to call it by hand for `dotnet new netwasm-app`.

# HISTORY

NetWasm is an independent .NET-for-WebAssembly compiler, CoreLib, runtime, and SDK by **Zion Sati**. **nwc** is the compiler CLI (csc-shaped options, banner "NetWasm Compiler version ...", copyright 2026). Host-tools packages in the 0.4.x line ship it as a native executable named **nwc**.

# SEE ALSO

[netwasm-wit-bindgen](/man/netwasm-wit-bindgen)(1), [dotnet](/man/dotnet)(1), [wasmtime](/man/wasmtime)(1), [jco](/man/jco)(1)

# RESOURCES

```[Source code](https://github.com/zion-sati/NetWasm)```

```[Homepage](https://www.netwasm.com)```

```[Documentation](https://github.com/zion-sati/NetWasm/blob/main/docs/cli-build-deployment.md)```

<!-- verified: 2026-10-27 -->
