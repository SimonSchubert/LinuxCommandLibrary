# TAGLINE

Node.js JavaScript runtime built on Chrome's V8 engine

# TLDR

**Run** a JavaScript file

```node [script.js]```

**Start the REPL** (interactive shell)

```node```

**Evaluate** an expression and print the result

```node -e "[console.log('hello')]"```

**Pass arguments** to a script (available via `process.argv`)

```node [script.js] [arg1] [arg2]```

**Run** a script with the inspector enabled and break on first line

```node --inspect-brk [script.js]```

**Syntax-check** without running

```node --check [script.js]```

**Watch and restart** on file changes (Node.js 18+)

```node --watch [script.js]```

**Run TypeScript** with a custom loader

```node --import [tsx] [script.ts]```

**Print version**

```node --version```

# SYNOPSIS

**node** [_options_] [_v8-options_] [_script_ | _-_ | -e _string_] [_arguments_]

# PARAMETERS

**-e**, **--eval** _CODE_
> Evaluate _code_ as JavaScript without loading a file.

**-p**, **--print** _CODE_
> Like **-e** but prints the result to stdout.

**-r**, **--require** _MODULE_
> Preload _module_ before running the main script (CommonJS only).

**--import** _MODULE_
> Preload an ES module before running the main script.

**-c**, **--check**
> Parse the script and check for syntax errors without executing it.

**-i**, **--interactive**
> Force the REPL even if stdin is not a TTY.

**--inspect**[=_host:port_]
> Enable the V8 inspector on the given host/port (default 127.0.0.1:9229).

**--inspect-brk**[=_host:port_]
> Like **--inspect** but break before user code starts.

**--watch**
> Restart the process when watched files change. (Node.js 18+)

**--watch-path** _PATH_
> Additional path to watch when **--watch** is enabled.

**--enable-source-maps**
> Use source maps for stack traces.

**--no-warnings**
> Silence all process warnings (including deprecations).

**--max-old-space-size** _MB_
> Set the V8 old-generation heap size in megabytes.

**--experimental-vm-modules**
> Enable the experimental ES module API in the `vm` module.

**-v**, **--version**
> Print Node.js version.

**-h**, **--help**
> Print Node.js command-line help.

# CONFIGURATION

**NODE_OPTIONS**
> Space-separated list of CLI options applied before any explicit ones (e.g. `NODE_OPTIONS="--enable-source-maps"`).

**NODE_PATH**
> Colon-separated list of additional directories searched for CommonJS modules.

**NODE_ENV**
> Convention used by many frameworks; not interpreted by Node itself.

**package.json**
> The presence of `"type": "module"` switches `.js` files to ES modules; `"main"` and `"exports"` define entry points.

# DESCRIPTION

**node** is the Node.js JavaScript and (with `--experimental-wasi`) WebAssembly runtime built on the V8 engine. It executes scripts on the server, exposing an event-driven, non-blocking I/O model and a large standard library (`fs`, `http`, `crypto`, `stream`, `child_process`, etc.).

Node supports both CommonJS (`require`) and ECMAScript modules (`import`). Module type is determined by the file extension (`.cjs`/`.mjs`) or by the nearest `package.json`'s `"type"` field. Built-in modules can be imported with the `node:` specifier (e.g. `import fs from 'node:fs/promises'`).

The interpreter ships with **npm** and **npx** for package management, a built-in test runner (`node --test`), worker threads for CPU-bound parallelism, and a built-in debugger and profiler accessible through `--inspect`.

# CAVEATS

The default event loop is single-threaded — CPU-heavy work blocks all I/O unless offloaded to **worker_threads** or a child process. Long-term-support (LTS) and current release lines have different feature sets; check `node --version` and the docs before relying on flags such as **--watch** or **--import**. Some long-standing flags (like `--loader`) have been replaced by `--import`/`--experimental-loader`.

# HISTORY

Node.js was created by **Ryan Dahl** in **2009**. It is now stewarded by the **OpenJS Foundation** and follows a release schedule of even-numbered LTS lines (e.g. 18, 20, 22) supported for ~30 months and odd-numbered current releases that bring newer V8 features.

# SEE ALSO

[npm](/man/npm)(1), [npx](/man/npx)(1), [deno](/man/deno)(1), [bun](/man/bun)(1)

