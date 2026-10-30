# TAGLINE

Compile Lean 4 programs to WebAssembly for Node, edge, WASI, and the browser

# TLDR

**Run** a Lean file (dev build, then Node)

```lasm [Main.lean]```

**Build** a release for Node into `dist/`

```lasm build [Main.lean]```

Build for a **deploy target**

```lasm build [Main.lean] --target [workers]```

**Watch**, rebuild, and restart on source changes

```lasm dev [Main.lean]```

**Scaffold** a new project

```lasm init [my-app] --template [hono]```

Pass **program arguments** after `--`

```lasm [Main.lean] -- [arg1] [arg2]```

Print the **compiler version**, Lean version, and host

```lasm --version```

# SYNOPSIS

**lasm** _Main.lean_ [**--release**] [**--** _args_...]

**lasm** **build** _Main.lean_ [**--output** _dir_] [**--target** _name_] [**--dev**] [**--rebuild**] [**--verbose**]

**lasm** **dev** [_Main.lean_] [**--target** _name_] [**--release**] [**--** _args_...]

**lasm** **init** _directory_ [**--template** _name_] [**--deploy** _name_]

**lasm** **package** [_dist_] **--target** _name_

**lasm** **editor** [_project-directory_]

**lasm** **cache** **repair**

# DESCRIPTION

**lasm** compiles ordinary Lean 4 programs ahead of time to WebAssembly. One codebase can become a Node (or Bun or Deno) server, a serverless or edge function, a WASI or Fastly module, or a browser app. The CLI is the **lasm** binary from npm package `@lasm/cli` (also invokable as `npx @lasm/cli`). It installs Lean, Lake, and the link toolchain itself; you need Node 24 or newer (Bun 1.4+ and Deno 2.x are also tested).

`lasm Main.lean` is a **dev** build (faster, not for deployment) that then runs the program. `lasm build` defaults to a **release** build (optimized and meant to be reproducible) and writes `dist/` unless **--output** is set. Function-platform targets package that output the way `lasm package` would. Application arguments are accepted only by run/dev and must follow `--`.

Lean at run time is restricted: elaboration, `#eval`-style evaluation, loading `.olean` files, and Lean's kernel are build-time only. Node builds keep Lean's full runtime (threads, files, processes, sockets). Edge, Bun/Deno, WASI, and browser builds are single-threaded and drop sockets and processes (and files, except on WASI).

# COMMANDS

**run** (default)
> `lasm Main.lean` builds (dev profile unless **--release**) and runs the program with Node, or with Bun/Deno when the CLI itself is running there.

**build**
> Compile without running. Default target is **node** (or **bun** / **deno** when the CLI runs on those). Other targets: **lambda**, **lambda-edge**, **vercel**, **netlify**, **azure**, **gcf**, **workers**, **vercel-edge**, **netlify-edge**, **deno-deploy**, **supabase-edge**, **wasi**, **fastly**, **wasi-http**, **browser**.

**dev**
> Watch sources, rebuild, and restart. Optional **--target** among node, bun, deno, workers, vercel-edge, netlify-edge, deno-deploy, supabase-edge, browser.

**init**
> Create a project directory. Templates: **plain**, **express**, **hono**, **fastify**, **std-http**, **web**, **fetch**, **fullstack**. `npm create @lasm@latest` is the same flow.

**package**
> Package an existing `dist/` for **lambda**, **lambda-edge**, **vercel**, **netlify**, **azure**, **gcf**, or **browser**.

**editor**
> Point the Lean editor at this project's toolchain so `import Lasm.*` resolves.

**cache repair**
> Verify managed tools, remove invalid ones, and clean leftover staging directories.

# PARAMETERS

**--target** _name_
> Build (and, for function platforms, package) for that platform. Aliases include **cloudflare** for **workers**, **aws** for **lambda**, **web** for **browser**, **spin** for **wasi-http**. Only with **lasm build**.

**--output** _dir_
> Output directory (default **dist**). Only with **lasm build**.

**--release** / **--dev**
> Choose the profile. Mutually exclusive. **build** defaults to release; **run** defaults to dev.

**--rebuild**
> Rebuild even when the cache would reuse a previous result.

**--verbose**
> Extra compiler and linker progress.

**--suspend** **none**|**jspi**
> Browser builds only. **none** (default) means blocking waits stop the instance; **jspi** suspends in browsers that have JSPI.

**--bundler**
> Browser builds only: leave npm imports as imports so Vite, esbuild, or webpack can bundle them.

**--allow-dev**
> Package a **dev** build for a non-Node target anyway. Without it, `lasm build --dev --target` for a function platform is refused.

**-h**, **--help**
> Print usage.

**-v**, **--version**
> Print package version, Lean version, JS runtime, and host.

# CAVEATS

Node 24 or newer is required; older Node exits before the compiler loads.

`--target`, `--output`, `--suspend`, and `--bundler` apply only to the commands noted above. Putting program flags before `--` is an error.

A `.json` argument to **build** is a binding configuration, not a Lean application; `--target` / `--dev` / `--release` do not apply to it.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [bun](/man/bun)(1), [deno](/man/deno)(1), [wasm-opt](/man/wasm-opt)(1), [wasmtime](/man/wasmtime)(1), [emcc](/man/emcc)(1), [zig](/man/zig)(1)

# RESOURCES

```[Source code](https://github.com/Millillion/lasm)```

```[Documentation](https://github.com/Millillion/lasm/blob/main/README.md)```

<!-- verified: 2026-10-30 -->
