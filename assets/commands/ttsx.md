# TAGLINE

execute TypeScript with full-project type checking first

# TLDR

**Run** a TypeScript entry file

```ttsx src/index.ts```

**Run** with arguments passed to the script

```ttsx src/cli.ts -- --flag value```

**Type-check then execute** via **npx**

```npx ttsx src/main.ts```

# SYNOPSIS

**ttsx** _file_ [_script_args_...]

# DESCRIPTION

**ttsx** is the execution companion to **ttsc**. Like **tsx** or **ts-node**, it runs a TypeScript file without a separate compile step, but it type-checks the **whole project** first. If type checking fails, the process exits before any user code runs.

It uses the same **typescript-go** toolchain and plugin pipeline as **ttsc**, so compiler plugins (transforms, **typia**, lint diagnostics, and so on) apply on every run. Install with **npm install -D ttsc typescript** (the **ttsx** binary ships with the **ttsc** package) and invoke via **npx ttsx** or a package script.

# PARAMETERS

_file_
> TypeScript entry file to type-check and execute

_script_args_
> Arguments forwarded to the running program (often after **--** when using **npx**)

# CAVEATS

Type-checking the full project adds startup latency compared with transpile-only runners. Project configuration must be valid (**tsconfig.json** discoverable). Behavior depends on the installed **ttsc** version and any enabled plugins. For pure build/check without execution, use **ttsc** instead.

# HISTORY

Part of the **ttsc** toolchain by Jeongho Nam (**samchon**), positioned as a type-safe alternative to **tsx** and **ts-node** on top of **typescript-go**.

# SEE ALSO

[ttsc](/man/ttsc)(1), [tsx](/man/tsx)(1), [ts-node](/man/ts-node)(1), [tsc](/man/tsc)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/samchon/ttsc)```

```[Homepage](https://ttsc.dev)```

```[Documentation](https://ttsc.dev/docs/ttsc/execute/)```

<!-- verified: 2026-07-17 -->
