# TAGLINE

Rust-native Vite-compatible build tool for React apps

# TLDR

**Start the development server** (default port **5199**)

```oj dev```

Start the dev server for an **app in a subdirectory**

```oj dev [web]```

Start in **bundled** mode (registry-runtime bundle instead of unbundled ESM)

```oj dev --bundle```

Start with **streaming SSR** and client hydration

```oj dev --ssr [src/entry-server.tsx]```

Listen on **all interfaces**

```oj dev --host```

**Production build** into `./dist`

```oj build```

Build with **SSR**

```oj build --ssr```

**Preview** a production build locally (default port **4173**)

```oj preview```

Use a **specific config file**

```oj dev --config [path/to/oj.config.ts]```

# SYNOPSIS

**oj** _command_ [_root_] [_options_]

# PARAMETERS

**dev** [_root_]
> Start the development server. _root_ defaults to the current directory. Default port is **5199**.

**build** [_root_]
> Production build. Writes to `dist` unless **--outDir** is set.

**preview** [_root_]
> Serve a previous production build locally. Default port is **4173**.

**compile** _file_
> Compile a single source file to stdout. **--prod** selects production transforms.

**--port** _port_
> Listen port for **dev** and **preview**.

**--host** [_host_]
> Bind address. Bare **--host** listens on all interfaces.

**--bundle**
> (**dev**) Use bundled registry-runtime mode instead of unbundled ESM.

**--ssr** [_entry_]
> (**dev** / **build**) Server-render. In **dev**, _entry_ is the server module (for example `src/entry-server.tsx`). **build --ssr** emits a server bundle.

**-c**, **--config** _file_
> Config file. Otherwise **oj.config.*** or **vite.config.*** in the app root is used.

**-m**, **--mode** _mode_
> Env mode (`development` / `production`). Selects `.env.<mode>` and `import.meta.env.MODE`.

**--outDir**, **--out** _dir_
> (**build** / **preview**) Output directory (default `dist`).

**--base** _path_
> Public base path (default `/`).

**--emptyOutDir**
> (**build**) Empty outDir even when it is outside the project root.

**--assetsDir** _dir_
> (**build**) Directory under outDir for hashed assets (default `assets`).

**--assetsInlineLimit** _bytes_
> (**build**) Inline assets smaller than this as data URIs (default **4096**).

**--target** _target_
> (**build**) JS transpile target (default `baseline-widely-available`).

**--sourcemap** [_true_|_false_|_inline_|_hidden_]
> (**build**) Emit source maps (default off).

**--minify** [_minifier_]
> (**build**) Minify, or name the minifier (default **oxc**).

**--manifest** [_name_]
> (**build**) Write a Vite-style build manifest.

**--ssrManifest** [_name_]
> (**build**) Write an SSR manifest.

**--lazy**
> (**dev**) Compile modules on demand instead of eagerly crawling the graph on boot.

**--enable-cache** / **--no-cache**
> (**dev**) Experimental on-disk module cache (also `OJ_ENABLE_CACHE=1` / `OJ_NO_CACHE=1`). Off by default.

**--strictPort**
> (**preview**) Exit if the port is already in use.

**--open** [_path_]
> (**preview**) Open a browser on startup.

**--prod**
> (**compile**) Production transforms.

# DESCRIPTION

**oj** is a Rust CLI that aims to run existing **Vite + React** apps without changing their source. It reads `vite.config.{ts,js,mjs}` or `oj.config.*`, adopts `base`, `server.port` / `host`, `define`, and `resolve.alias` when its own config leaves them unset, and runs Vite/Rollup-style plugins through a persistent Node plugin host (`oj.plugins.mjs`, or the `plugins` array in `vite.config`).

The compiler is built on **Oxc**; production linking uses **Rolldown**. A small Node process is spawned only when plugins, SSR, or server modules need JavaScript. Dev SSR streams HTML with `renderToReadableStream` and hydrates through the normal HMR pipeline.

Pointed at a **TanStack Start** app, **oj** detects the framework and serves file-based routes with streaming SSR. `oj build` then emits a Node `server.mjs`, a Cloudflare `worker.mjs`, hashed client assets, and prerendered routes.

Install from crates.io with `cargo install oj --locked`, or run once with `nix run github:lovablelabs/oj -- dev`.

# CAVEATS

Experimental: compatibility with the full Vite plugin ecosystem is incomplete. **--watch** on **build** is accepted but not implemented. The default dev port is **5199**, not Vite's **5173**. The `oj` binary name also belongs to **online-judge-tools** (a competitive-programming CLI); installing both puts one of them first on **PATH**. A Node runtime is still required for Vite plugins, SSR, and the module runner.

# HISTORY

**oj** was created by **Raphael Amorim** in **2026** as a Rust-native Vite replacement, then moved to the **Lovable** GitHub organization (`lovablelabs/oj`). The name is nicknamed "Orange Juice" internally. MIT licensed.

# SEE ALSO

[vite](/man/vite)(1), [esbuild](/man/esbuild)(1), [webpack](/man/webpack)(1), [npm](/man/npm)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/lovablelabs/oj)```

<!-- verified: 2026-09-18 -->
