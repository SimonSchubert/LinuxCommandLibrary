# TAGLINE

Headless Roslyn indexer that emits a C# semantic graph as JSON

# TLDR

**Index a solution** into a Graphify-compatible JSON document

```graphify-csharp --input [src/MyProduct.sln] --root [.] --configuration [Release] --output [graphify-out/csharp.json]```

Index a **single project**

```graphify-csharp --input [src/Lib/Lib.csproj] --root [.] --output [graphify-out/csharp.json]```

Index an **SDK file-based C# app**

```graphify-csharp --input [src/App.cs] --root [.] --configuration [Release] --output [graphify-out/csharp.json]```

Pick one **target framework** on a multi-target project

```graphify-csharp --input [src/Lib/Lib.csproj] --root [.] --target-framework [net10.0] --output [graphify-out/csharp.json]```

**Rebuild** from scratch, ignoring the incremental cache

```graphify-csharp --input [src/MyProduct.sln] --root [.] --configuration [Release] --output [graphify-out/csharp.json] --rebuild```

Keep a **warm watcher** that refreshes in the background

```graphify-csharp --input [src/MyProduct.sln] --root [.] --configuration [Release] --output [graphify-out/csharp.json] --watch```

**Query methods** out of the JSON with jq

```jq '.nodes[] | select(.properties.node_kind == "method")' [graphify-out/csharp.json]```

Show **help**

```graphify-csharp --help```

# SYNOPSIS

**graphify-csharp** [**-i** | **--input**] _path_ [**-r** | **--root** _path_] [**-o** | **--output** _path_] [**-c** | **--configuration** _name_] [**-f** | **--target-framework** _tfm_] [**--rebuild**] [**--watch**] [**--watch-scan-interval** _timespan_] [**-h** | **--help**]

# PARAMETERS

**-i** _path_, **--input** _path_
> Solution (**.sln** / **.slnx**), project (**.csproj**), or SDK file-based **.cs** app to extract. Required. A bare positional path is treated as the same value.

**-r** _path_, **--root** _path_
> Repository root used for stable, machine-independent symbol keys and source paths. Defaults to the current working directory.

**-o** _path_, **--output** _path_
> Destination for the complete JSON graph. Defaults to **graphify-out/graph.json** under the repository root. The parent directory is created as needed. Incremental cache and watcher lease files live in a sibling **.graphify-csharp/** directory.

**-c** _name_, **--configuration** _name_
> MSBuild configuration passed into the workspace (for example **Debug** or **Release**). Default **Debug**.

**-f** _tfm_, **--target-framework** _tfm_
> Select one target framework when the input project is multi-targeted. Single-target projects do not need this. The tool refuses to merge different compilations silently.

**--rebuild**
> Discard the incremental cache and extract every project again. Safe to use with or without **--watch**.

**--watch**
> Keep a warm Roslyn workspace, subscribe to input changes, and serve later one-shot invocations as refresh barriers against the same analysis configuration and exact output path. Stop with Ctrl-C.

**--watch-scan-interval** _timespan_
> Backup metadata inventory interval while watching. Default **00:05:00**. Requires **--watch**. Must parse as a positive **TimeSpan** (for example **00:02:00**).

**-h**, **--help**
> Print usage and exit.

# DESCRIPTION

**graphify-csharp** is a headless C# indexer. It loads a solution, project, or file-based app through **MSBuild** and **Roslyn**, then writes one complete JSON document of compiler-resolved declarations and relationships. The file contains **nodes**, **edges**, and **hyperedges**, plus a **graphify_csharp.diagnostics** array for workspace-load and recoverable extraction issues.

Each node carries a stable, project- and TFM-aware **symbol_key**, along with namespace, repository-relative project path, selected target framework, and a **declaration_kind** (class, method, property, local, and so on). Edges are directed from the declaration where a relationship was observed to the symbol Roslyn actually bound. Direct evidence kinds include **calls**, **references**, **implements**, **inherits**, and **overrides**. Locations on each edge record where the relationship appeared in source.

The catalog covers source namespaces, named types, constructors, methods, operators, local functions, properties, indexers, fields, enum members, events, parameters, locals, type parameters, aliases, labels, and query range variables. Cross-project calls keep overload-aware identity. Unsupported Roslyn shapes are reported as diagnostics instead of dropping the rest of the graph.

A first run does a cold extraction and stores contribution state under **.graphify-csharp/** beside the output. Later one-shot runs reuse unchanged project contributions and still publish one complete document. With **--watch**, a matching later invocation waits until a current snapshot is written atomically; if no watcher owns that exact output and configuration, the same command falls back to a one-shot refresh.

The command is a **.NET global tool** published as NuGet package **Graphify.CSharp**. Install with **dotnet tool install --global Graphify.CSharp --framework net10.0** (Roslyn 5.9 / C# 14) or **--framework net11.0** (C# 15 preview). It does not require an IDE, a compiled project DLL, or a database, and it does not invoke Graphify. The JSON can be read by an agent, **jq**, or any other consumer.

# CAVEATS

The graph is static evidence, not a runtime reachability proof. Reflection, dependency injection, P/Invoke, native callbacks, dynamic invocation, and code excluded from the loaded compilation can exist at runtime without appearing as edges. Zero inbound references means zero **observed** static references.

The machine must have the matching .NET SDK plus the repository's own SDKs, packages, and MSBuild inputs. **--target-framework** is required when a project has more than one TFM. A live watcher owns its exact output path; a refresh with a different input, configuration, or TFM against that same file fails with an ownership conflict instead of overwriting it.

The watcher does not honor **.gitignore**. Conventional noise directories such as **obj/**, **bin/**, and **.git/** are pruned unless an evaluated project input points at a file there. Stop the watcher before deleting **.graphify-csharp/**, or use **--rebuild**.

# HISTORY

**graphify-csharp** is the CLI for **Graphify C#**, written by **Zach Saw** and released under the MIT license. Version **0.1.0** shipped the deterministic project/TFM-aware symbol identity, Roslyn/MSBuild catalog, and Graphify-compatible JSON. **0.1.5** added warm incremental indexing, a resilient file watcher, and dual **net10.0** / **net11.0** tool assets. The current NuGet package is **0.1.6**.

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-tool](/man/dotnet-tool)(1), [csc](/man/csc)(1), [msbuild](/man/msbuild)(1), [jq](/man/jq)(1), [ast-grep](/man/ast-grep)(1)

# RESOURCES

```[Source code](https://github.com/zachsaw/graphify-csharp)```

```[Documentation](https://github.com/zachsaw/graphify-csharp/blob/main/docs/USAGE.md)```

<!-- verified: 2026-09-12 -->
