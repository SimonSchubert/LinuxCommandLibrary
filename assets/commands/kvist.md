# TAGLINE

Statically typed Lisp compiler targeting Odin

# TLDR

**Compile and run** a program (needs the Odin toolchain)

```kvist run [hello.kvist]```

Type-check and compile through Odin **without running**

```kvist check [hello.kvist]```

Start the **native REPL**, using a source file as package context

```kvist repl [hello.kvist]```

Write generated **Odin** instead of building it

```kvist compile [hello.kvist] -o [hello.odin]```

**Build** a native binary

```kvist build [hello.kvist] --out [dist/app]```

Run **tests**, optionally by name

```kvist test [tests.kvist] --names [test_one,test_two]```

**Evaluate** a form against a file's imports and declarations

```kvist eval [hello.kvist] '(+ 1 1)'```

Print **macro-expanded** Kvist, or the **generated Odin** for a form

```kvist macroexpand [hello.kvist] '[form]'```

```kvist expand [hello.kvist] '[form]'```

Show inferred **ownership** at procedure boundaries

```kvist lifetimes [hello.kvist]```

Start an **nREPL** server for Calva, CIDER, or Conjure

```kvist nrepl [hello.kvist]```

Print the resolved **package root**

```kvist root```

# SYNOPSIS

**kvist** _file.kvist_ [**-o** _output.odin_] [**--map** _output.map_] [**--eval** _form_]

**kvist** **compile** _file.kvist_ [**-o** _output.odin_] [**--map** _output.map_] [**--packages**]

**kvist** **build** _file.kvist_ [**--out** _binary_] [**--generated** _output.odin_]

**kvist** **check**|**run** _file.kvist_ [**--generated** _output.odin_] [**--reload**]

**kvist** **test** _file.kvist_ [**--names** _name,..._] [**--track-memory**]

**kvist** **eval** _file.kvist_ _form_ [**--check**] [**--no-print**] [**--save** _name_]

**kvist** **repl** _file.kvist_ [**--protocol** jsonl] [**--attach** _endpoint-dir_]

**kvist** **nrepl** _file.kvist_ [**--port** _port_] [**--port-file** _path_] [**--no-port-file**]

# COMMANDS

**compile**
> Lower Kvist to Odin and write the generated source. **--packages** also writes the generated package tree. Does not invoke the Odin compiler.

**build**
> Compile through Odin to a native binary. **--out** sets the binary path.

**check**
> Authoritative validation: compile through Odin without running the program.

**frontend-check**
> Stop after the Kvist frontend (before Odin). Useful for compiler diagnostics; **check** remains the source of truth.

**run**
> Compile through Odin and execute. **--reload** generates a live-reload application.

**test**
> Compile and run tests. **--names** selects tests; **--track-memory** reports allocation.

**eval**
> Compile and run a form using the file as context. **--check** validates without running; **--no-print** suppresses automatic result printing; **--save** stores evaluation output in the cache.

**expand**
> Print the generated Odin for a form (or write it with **-o**).

**macroexpand**
> Print Kvist after macro expansion (or write it with **-o**). **--map** writes a source map.

**repl**
> Persistent native REPL. Each submission is type-checked, lowered, compiled, loaded, and executed as native code. **--protocol jsonl** is the editor-neutral protocol; **--attach** connects to a running application's local endpoint.

**nrepl**
> Experimental nREPL adapter (loopback only) for Calva, CIDER, and Conjure. Not a Clojure runtime. Writes `.nrepl-port` unless **--no-port-file**.

**dev**
> Reload-oriented development: **kvist dev --reload** _file.kvist_ [**--rebuild**] [**--watch**] [**--generated-dir** _dir_] [**--print-paths**] [**--json**].

**doc**, **lookup**, **complete**, **xref**, **symbols**
> Human-readable documentation (**doc**) and editor-oriented symbol queries against a source file. Machine-oriented commands print tab-separated rows (kind, name, location, signature, documentation, file).

**editor-symbols**, **imported-symbols**, **package-symbols**, **builtin-symbols**
> Extra symbol indexes for editors: identifiers in a file, imported names, a `kvist:*` package (optional alias), or language builtins.

**lifetimes**
> Report inferred ownership at procedure boundaries (parameters borrowed or consumed; results borrowed, owned, or unknown).

**root**
> Print the active Kvist package root used for `kvist:*` imports.

**cache**
> **path** _name_, **list**, **rm** _name_, **inspect**, and **clear** [_file.kvist_] manage the compile/eval cache (default `.kvist-cache`).

Passing a `.kvist` file with no subcommand is the legacy compile path (`-o`, `--map`, `--eval`).

# PARAMETERS

**-o** _path_
> Output path for generated Odin (**compile**, **expand**) or expanded Kvist (**macroexpand**).

**--out** _path_
> Native binary path for **build**.

**--generated** _path_
> Keep generated Odin from **build**, **check**, **run**, **test**, or **eval** instead of discarding it.

**--generated-dir** _dir_
> Directory for generated sources in reload mode.

**--map** _path_
> Write a source map (**compile**, **macroexpand**). Cannot be combined with **--eval**.

**--packages**
> **compile**: also emit the generated package tree.

**--reload**
> Generate and execute a live-reload application (**build**, **check**, **run**). Incompatible with **--timings** and with **--out** / **--generated**.

**--names** _name,..._
> **test**: comma-separated test names to run.

**--track-memory**
> **test**: enable memory tracking.

**--check**
> **eval**: validate the form without running it.

**--no-print**
> **eval** / **expand**: do not print the result.

**--save** _name_
> **eval**: store evaluation output under this cache name.

**--protocol** jsonl
> **repl**: speak the editor-neutral JSONL protocol instead of the terminal client.

**--attach** _endpoint-dir_
> **repl**: attach to a running application's private local endpoint (typically with **--protocol jsonl**).

**--port** _port_
> **nrepl**: listen on this port (otherwise an available loopback port is chosen).

**--port-file** _path_
> **nrepl**: write the chosen port here (default `.nrepl-port` in the current directory).

**--no-port-file**
> **nrepl**: do not write a port file.

**--ownership-audit**
> Include conservative ownership warnings that are hidden by default (compilation commands).

**--explain-cache**
> Explain compile-cache hits and misses (**check**, **run**, **build**, **test**, **frontend-check**).

**--timings**
> Print phase timings (Kvist compilation, cache, Odin, and program runtime where applicable).

**--timings-json** _path_
> Write the same timings as JSON. Not supported with reload mode.

**-h**, **--help**, **help**
> Print usage and exit.

# DESCRIPTION

**kvist** is the compiler and toolchain for Kvist, a practical Lisp for native software. Source uses Clojure-inspired s-expressions, source macros, and data-oriented programming, then lowers to readable Odin. Ordinary values are statically typed with Odin-like representation and ownership: allocation and mutation stay explicit, and generated programs need no VM or garbage collector. Kvist and Odin files may share a package; Odin `core:*` and `vendor:*` packages import directly.

When the shape of the data is itself data, first-class **Data** provides EDN in memory (maps, vectors, sets, lists, keywords, symbols, tagged values) without making every runtime value dynamic. Collection pipelines fuse to direct loops rather than lazy sequences.

**check**, **build**, **run**, and **test** invoke Odin. **compile** and **frontend-check** stop in the Kvist frontend. Diagnostics map back to Kvist source when a source map is available.

The REPL is native, not an interpreter: a submission is read, macro-expanded, type- and ownership-checked, lowered, compiled, loaded, and executed. Successful definitions and supported typed values persist; compatible redefinitions update later calls. `:reset` replaces the worker; `:quit` ends the session. Value-producing forms rotate `*1`, `*2`, and `*3`. A clean **check**, **test**, or **run** is the reproducible program; REPL history is development state.

Shipped language packages (`kvist:arr`, `kvist:test`, `kvist:data`, and others) resolve from **$KVIST_ROOT**, the package root beside an installed `bin/kvist`, or `src/kvist` next to a source-built compiler. The compiler does not search the current application repository for those packages. Optional official packages (io, json, cli, html, http) are separate repositories imported as ordinary directories.

# CONFIGURATION

**$KVIST_ROOT**
> Package root for `kvist:*` imports. When unset, an installed `bin/kvist` uses the layout beside the binary; a compiler built in the repository uses `src/kvist`.

**$KVIST_CACHE_DIR**
> Compile-cache directory (default `.kvist-cache` in the working directory).

**$KVIST_NO_COMPILE_CACHE**
> Set to **1** to force fresh translation and ignore the compile cache.

**$KVIST_REPL_ENDPOINT**
> Directory for an application-private live-reload REPL endpoint (for example `.olive/repl` with **kvist run** **--reload**). Attach with **kvist repl** **--attach**.

# CAVEATS

Building and running programs requires a working **Odin** toolchain on the host. The CLI is tested on macOS and Linux; the core CLI also runs on Windows, but the full test suite and POSIX `scripts/` helpers are not covered there.

There is no language server in the compiler itself. Editor support is the JSONL REPL protocol, the Emacs client, and an experimental nREPL adapter. nREPL is a compatibility layer: it is not Clojure, has no namespaces, listens only on `127.0.0.1`, accepts one TCP client at a time, and **interrupt** replaces the native worker (clearing retained REPL state).

Attached evaluation runs native code inside the application process. A panic in submitted code can kill the host; clients cannot force-interrupt arbitrary native code safely.

Ownership warnings from **--ownership-audit** are conservative. Pointer, foreign-view, and opaque resource results may render once in the REPL without being retained.

# HISTORY

Kvist is developed by **Andreas Flakstad** and contributors under the **kvist-lang** organization. The public repository was created in **May 2026** (MIT License). The language compiles to Odin rather than a bytecode VM, and was shown on Hacker News in **August 2026** as a Lisp for systems programming.

# SEE ALSO

[clojure](/man/clojure)(1), [sbcl](/man/sbcl)(1), [guile](/man/guile)(1), [racket](/man/racket)(1), [zig](/man/zig)(1), [nim](/man/nim)(1), [gcc](/man/gcc)(1)

# RESOURCES

```[Source code](https://github.com/kvist-lang/kvist)```

```[Homepage](https://kvist-lang.org/)```

```[Documentation](https://kvist-lang.org/docs/)```

<!-- verified: 2026-09-01 -->
