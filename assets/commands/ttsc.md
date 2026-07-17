# TAGLINE

TypeScript-go compiler with plugins, lint, and transforms

# TLDR

**Build** the project (drop-in for **tsc**)

```ttsc```

**Type-check** without emitting files

```ttsc --noEmit```

**Watch** and rebuild on save

```ttsc --watch```

**Apply lint autofixes** and format

```ttsc fix```

**Format** only (no behavioral changes)

```ttsc format```

# SYNOPSIS

**ttsc** [_options_] [_project_options_]

**ttsc** **fix** | **format**

# DESCRIPTION

**ttsc** is a TypeScript toolchain built on **typescript-go**. It is a drop-in replacement for **tsc**: it reads the same **tsconfig.json**, accepts the same compiler flags, and emits the same JavaScript, then runs compiler-powered plugins during the type-check pass.

Plugins can add transforms, extra checks, or type-driven code generation (for example **typia** validators). With **@ttsc/lint** installed, lint and format rules run inside the same compile so violations appear as compiler diagnostics. Subcommands **fix** and **format** apply autofixes and formatting in place.

Install as a dev dependency (**npm install -D ttsc typescript**) and invoke via **npx ttsc** or a package script. Pair with **ttsx** to execute TypeScript after a full project type-check.

# PARAMETERS

Most **tsc** flags are supported, including:

**--noEmit**
> Type-check only; do not write output files

**--watch**, **-w**
> Watch input files and rebuild on changes

**--project**, **-p** _path_
> Compile the project given by the configuration file

**--pretty**
> Stylize errors and messages using color and context (default as in **tsc**)

**fix**
> Apply lint autofixes and format edits

**format**
> Apply format edits only; never change program behavior

# CAVEATS

Requires **typescript** alongside **ttsc**. Plugin and lint behavior depends on installed **@ttsc/**\* packages and project config (for example **lint.config.ts**). Not every third-party **tsc** wrapper flag may map one-to-one; prefer documented **ttsc** setup guides for bundler and Metro integrations.

# HISTORY

Created by Jeongho Nam (**samchon**) as a modern successor to transformer toolchains such as **ttypescript** and **ts-patch**, targeting the **typescript-go** compiler and integrating lint, format, and MCP code-graph tooling.

# SEE ALSO

[ttsx](/man/ttsx)(1), [tsc](/man/tsc)(1), [tsx](/man/tsx)(1), [ts-node](/man/ts-node)(1)

# RESOURCES

```[Source code](https://github.com/samchon/ttsc)```

```[Homepage](https://ttsc.dev)```

```[Documentation](https://ttsc.dev/docs)```

<!-- verified: 2026-07-17 -->
