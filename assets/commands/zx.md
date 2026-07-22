# TAGLINE

JavaScript toolchain for writing shell scripts

# TLDR

**Run** a zx script file

```zx [script.mjs]```

**Run** inline with npx

```npx zx [script.mjs]```

**Install** the package

```npm install -g zx```

Example script header and command execution:

```js
#!/usr/bin/env zx
await $`git status`
const branch = await $`git branch --show-current`
```

# SYNOPSIS

**zx** [*options*] *script*

# DESCRIPTION

**zx** (from Google) makes writing complex shell scripts in JavaScript pleasant. It wraps Node's **child_process** with the **$`cmd`** tagged template for safe argument escaping, sensible defaults, and cross-platform behavior. Scripts can use async/await, **Promise.all** for parallel tasks, and the usual npm ecosystem.

Works with Node.js, Bun, Deno, and similar runtimes. Documentation and setup variants (including a lite build) are at https://google.github.io/zx/.

# PARAMETERS

*script*

> Path to a **.mjs**/**.js** (or TypeScript when supported) script. Often starts with **#!/usr/bin/env zx**.

**-h**, **--help** / **--version**

> Help and version (see **zx --help** for the installed CLI flags).

Inside scripts, the primary API is **$`command`** plus helpers documented upstream (**cd**, **fetch**, **question**, **sleep**, **nothrow**, etc.).

# CAVEATS

Not an officially supported Google product. Requires a JS runtime on PATH. Prefer quoting/escaping via **$** templates rather than string concatenation to avoid injection. Behavior of the host shell still matters for complex pipelines.

# INSTALL

```brew: brew install zx```

```nix: nix profile install nixpkgs#zx```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[node](/man/node)(1), [bash](/man/bash)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/google/zx)```

```[Homepage](https://google.github.io/zx/)```

```[Documentation](https://google.github.io/zx/)```

<!-- verified: 2026-07-19 -->
