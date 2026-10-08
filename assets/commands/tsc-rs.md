# TAGLINE

Rust port of the TypeScript 7 compiler

# TLDR

**Type-check** a project from `tsconfig.json`

```npx tsc-rs -p [tsconfig.json]```

Type-check **without emitting** JavaScript

```npx tsc-rs --noEmit```

Compile in **watch mode**

```npx tsc-rs -w```

**Build** a project-references graph

```npx tsc-rs -b```

Print the **TypeScript version** this binary ports

```npx tsc-rs --version```

Show **help** (same flags as `tsc`)

```npx tsc-rs --help```

# SYNOPSIS

**tsc-rs** [_options_] [_file_...]

# PARAMETERS

**-p**, **--project** _path_
> Compile the project described by `tsconfig.json` at _path_

**-b**, **--build**
> Build the project-references graph (same as `tsc -b`)

**-w**, **--watch**
> Watch input files and recompile on changes

**-t**, **--target** _version_
> ECMAScript target version

**--outDir** _directory_
> Redirect emit output to _directory_

**--strict**
> Enable all strict type-checking options

**--noEmit**
> Type-check only; do not write JavaScript

**--sourceMap**
> Generate `.map` source map files

**--declaration**
> Generate `.d.ts` declaration files

**--incremental**
> Enable incremental compilation

**--init**
> Write a `tsconfig.json`

**-h**, **--help**
> Show help

**--version**
> Print the TypeScript version this port is pinned to (not the npm package version)

# DESCRIPTION

**tsc-rs** is a Rust port of Microsoft's native TypeScript 7 compiler (the Go `tsc` / former typescript-go). It keeps that compiler's algorithms and command line, so flags match **tsc**. The npm package is named **tsc-rs** so it does not clash with **typescript**.

Install with `npm install -D tsc-rs` and run `npx tsc-rs`. Releases also ship a standalone archive per platform: a `tsc` binary with the `lib` files beside it. Linux x64 (static) and macOS arm64 are published; Windows and Linux arm64 are not.

When `compilerOptions.plugins` includes `@effect/language-service`, **tsc-rs** runs Effect diagnostics (codes 377xxx) in the same check. The rules follow Effect-TS/tsgo 0.46.1. Editor-only language-service features (quick fixes, refactors, hover, completions) are not ported.

`--version` prints the TypeScript version the port tracks (for example 7.1.0-dev), which is what `typesVersions` is matched against.

# CAVEATS

This is an early release. In some monorepos a workspace package is reachable both through `node_modules` and a direct import; **tsc-rs** may emit extra files and report TS6059 for them. With `tsc -b`, a project that imports another project's output without a project reference can see stale or missing modules (TS2305 / TS2307); add the reference. `tsc -b --watch` can stop with an internal error (exit 70) after some edits. The VS Code TypeScript 7 extension looks for the `typescript` package, so point `js/ts.tsdk.path` at the platform package's `lib` directory (for example `node_modules/@tsc-rs/linux-x64/lib`).

# HISTORY

**ts-rust** (the **tsc-rs** CLI) is an experimental port of TypeScript 7 to Rust, published by pingdotgg. It is pinned to a microsoft/TypeScript revision (formerly typescript-go) and compared against that Go compiler.

# SEE ALSO

[tsc](/man/tsc)(1), [node](/man/node)(1), [npm](/man/npm)(1), [bun](/man/bun)(1), [esbuild](/man/esbuild)(1), [swc](/man/swc)(1), [rustc](/man/rustc)(1)

# RESOURCES

```[Source code](https://github.com/pingdotgg/ts-rust)```

```[Documentation](https://github.com/pingdotgg/ts-rust/blob/main/npm/tsc-rs-readme.md)```

<!-- verified: 2026-10-08 -->
