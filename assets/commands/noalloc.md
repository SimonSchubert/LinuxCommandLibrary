# TAGLINE

Report heap allocations reachable from marked Go functions

# TLDR

**Check the current module** for allocations under `//noalloc:root`

```noalloc```

**Check one package**

```noalloc [./pkg]```

**Record the allocations found now** as a baseline

```noalloc -baseline [noalloc.txt] -start```

**Fail when the code and that baseline disagree**

```noalloc -baseline [noalloc.txt]```

**Drop baseline lines** that no longer allocate

```noalloc -baseline [noalloc.txt] -prune```

**Print the call path** behind each finding

```noalloc -report ./...```

**Check noalloc's own libraries from source** so their directives count

```noalloc -source [github.com/theconsensuslabs/noalloc/bounded] ./...```

**Treat a type's slices and maps as reused memory**

```noalloc -scratch [example.com/app.Page]```

# SYNOPSIS

**noalloc** [_options_] [_packages_]

# PARAMETERS

**-C** _dir_
> Directory to run in. Relative paths are read from here (default: `.`).

**-scratch** _type_
> Repeatable. A type whose slice and map fields are reused memory, written as `pkg/path.Name`.

**-allow** _file_
> Repeatable. Extra allowlist. Each line is `kind: function` and is added to the built-in list. The kind is `amortized`, `measured`, `debug`, or `profiling`.

**-source** _prefix_
> Repeatable. Import-path prefix of packages to check from source the way the module is, so directives in that code count. Pass this for noalloc's `bounded` package and for `encoding/json`.

**-baseline** _file_
> Hold findings to the allocations listed in this file. A listed line that no longer allocates fails until **-prune**.

**-exemptions** _file_
> Hold `//noalloc:exempt` comments to the list in this file.

**-kinds** _words_
> Comma-separated words an exemption reason must start with, before a colon.

**-line-only** _kinds_
> Comma-separated exemption kinds that cover their own line and not what that line calls.

**-start**
> Write the baseline from what is found now. Refuses when the file already exists. Requires **-baseline**.

**-prune**
> Delete baseline lines that no longer allocate. Leaves the file unchanged while new allocations remain. Requires **-baseline**.

**-restate**
> Update baseline lines whose Go statement was reworded. Requires **-baseline**.

**-write-exemptions**
> Rewrite the exemptions list from the code. Requires **-exemptions**.

**-report**
> Print every finding with the call path that reaches it, and every exemption.

Use only one of **-start**, **-prune**, and **-restate** at a time. Package patterns default to `./...` and must belong to one module.

# DESCRIPTION

**noalloc** reports each line that allocates on the heap in the code reachable from functions marked `//noalloc:root`. It is the checker from the module `github.com/theconsensuslabs/noalloc`. The same module's other command is **jsongen**, which writes allocation-free JSON methods. The module also ships fixed-capacity containers and allocation-free JSON, HTML, and URL helpers as libraries.

Run it inside a Go module. It calls **go** (`go list -m`, and `go build -gcflags=-m`) and walks the call tree from each root. A call outside the module is allowed when that function's own code allocates nothing. noalloc reads that from source, or from compiled code when the function is assembly or part of the runtime. Results for code outside the module are cached under a `noalloc` directory in the user cache, one file per build.

Exit status **0** means the check passed. Exit status **1** means it found an allocation, a baseline line that no longer matches, or an exemption list that disagrees with the source. Exit status **2** means it could not run (bad flags, **go** failed, a missing baseline, more than one module in the workspace). A workspace with more than one module needs `GOWORK=off` so **go list -m** returns a single module.

An allocation on a panic, or on a non-nil error that ends the root's call, is allowed. A branch that finds a field or package variable nil and sets it once is allowed. An error path that continues, a panic recovered inside a loop, and failures inside a callback passed to code outside the module are still reported.

# CONFIGURATION

Mark entry points in the Go source. `//noalloc:root` checks that function and everything it calls. `//noalloc:exempt`, then a reason, exempts the line it sits on and everything that line calls. On a line by itself, it applies to the next line. `//noalloc:fixed` on a type says its methods never grow its slices, so noalloc treats them as reused memory. `//noalloc:append` marks a function judged like a call to `append`.

A baseline file lists allocations that are not fixed yet: file, function, reason, and the line's Go tokens. Create it with **-start**. Remove a line by fixing the code and running **-prune**. **-restate** rewrites a line whose statement text changed.

An exemptions file lists every `//noalloc:exempt` comment as file, function, and reason. **-write-exemptions** regenerates it. **-report** prints, under each exemption, the allocations on its line and in what only that line calls. A change in what an exemption covers fails until the list is written again. A reached exemption that lets nothing through fails as well.

The built-in allowlist, plus every **-allow** file, names functions to treat as allocating nothing even when the check cannot see that in the code. The built-in list takes `sync` locks and wait groups as `amortized`. A `measured` line is for a function whose code cannot be followed; the module's `alloctest.Zero` helper checks it with `testing.AllocsPerRun` and skips that test under **go test -race**.

# CAVEATS

Requires **Go 1.27** or later. The checker parses the text of `go build -gcflags=-m`, and that text can change between Go releases. Pin the toolchain in `go.mod` and rerun after an upgrade.

noalloc trusts the allowlist, `//noalloc:fixed`, and every exemption. It only looks at code a root reaches, so each entry point needs its own `//noalloc:root`.

A call through a function value with no known target is reported. An interface call is checked against every method it can reach. When the concrete type is visible in the module, only that method is checked. Otherwise every implementation noalloc can find is checked, including ones in the module that no caller passes. Only packages the module imports are searched. A method of an unnamed interface, or of `error`, has no implementations to look up outside the module, so those calls are reported. A call through a register in assembly cannot be followed and counts as allocating.

The comparison against compiled code has gaps. A baseline cannot list those failures, and exemptions do not cover them. It sees one build: this platform, with the inlining this compiler chose. Calls inlined from other packages, calls on a line that also holds unchecked code, and runtime functions it cannot classify are counted and not compared.

The first run for a new toolchain, platform, set of build tags, or set of dependency versions rebuilds the out-of-module cache and is much slower than later runs. The project describes the tool as experimental.

# HISTORY

**noalloc** is published by Consensus Labs, LLC. The copyright line is **2026**. The license is MIT. Pieces adapted from the Go source keep Go's BSD license beside that code. Install the checker with `go install github.com/theconsensuslabs/noalloc/cmd/noalloc@latest`.

# SEE ALSO

[jsongen](/man/jsongen)(1), [go](/man/go)(1), [staticcheck](/man/staticcheck)(1), [govulncheck](/man/govulncheck)(1)

# RESOURCES

```[Source code](https://github.com/theconsensuslabs/noalloc)```

```[Documentation](https://github.com/theconsensuslabs/noalloc/blob/main/README.md)```

<!-- verified: 2026-10-29 -->
