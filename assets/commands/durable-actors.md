# TAGLINE

Local CLI for Durable Actors TypeScript and Python projects

# TLDR

**Create** a sample actor project

```npx durable-actors init [my-actors]```

Create a **Python** project

```npx durable-actors init [my-actors] --template python```

Start the **local runtime** and reload on change

```npx durable-actors dev```

Pick a **port** (0 means an ephemeral port)

```npx durable-actors dev --port [7100]```

**Generate** typed clients from the running server

```npx durable-actors generate```

Generate from a **source file** into a directory

```npx durable-actors generate [src/actors.ts] --out-dir [generated] --language typescript```

Open the **observability UI**

```npx durable-actors observe```

Print the **version**

```npx durable-actors --version```

# SYNOPSIS

**durable-actors** _command_ [_options_] [_args_]

# DESCRIPTION

**durable-actors** is the npm CLI for **Durable Actors**, an open-source runtime for stateful serverless actors (serialized execution and persisted fields) in TypeScript and Python. The package **durable-actors** (Commander) installs the binary **durable-actors** (`dist/cli.js`). Version **0.7.16**. MIT. Node **^20.19.0 || >=22.12.0**. Running with no arguments prints help.

`init` copies a template (`actor` default; also `chat`, `ai-chat`, `documents`, `python`) into a new directory that must not exist, then rewrites `package.json` name from the folder. `dev` loads `src/actors.ts`, or `src/actors.py` when only that file exists, starts the Rust local runtime, and reloads on change unless **--no-watch**. Default listen port **7100** (**DURABLE_ACTORS_PORT**, or **0** for a free port). `generate` builds typed clients from the running control plane or from an explicit entrypoint. `observe` serves the local observer UI on loopback and opens a browser unless **--no-open**. `start` runs the production control-plane server.

# COMMANDS

**init** _directory_
> Create a sample project. **--template** `actor`|`chat`|`ai-chat`|`documents`|`python` (default `actor`)

**dev**
> Run local actors and reload. **--no-watch**. **--port** _n_ (0–65535, default 7100)

**generate** [_entrypoint_]
> Generate clients. Default output directory `generated`. **--out-dir**, **--language** `typescript`|`python` (inferred from the contract if omitted), **--config** _tsconfig_ (local TypeScript source only), **--control-plane-url** (cannot combine with an entrypoint)

**observe**
> Open the observability UI. **--no-open** prints the URL only

**start**
> Start the production control plane (downloaded Rust runtime, no extra flags)

# CONFIGURATION

Run **dev** from the actor project directory. Optional `.env` / `.env.local`:

**DURABLE_ACTORS_PROJECT**
> Project directory (default `.`)

**DURABLE_ACTORS_ENTRYPOINT**
> Actor source relative to the project (default `src/actors.ts` or `src/actors.py`)

**DURABLE_ACTORS_PORT**
> Same as **--port**

**DURABLE_ACTORS_PROJECT_ID** / **DURABLE_ACTORS_SECRET**
> Project id (default `local`) and optional API key

**DURABLE_ACTORS_DATA_DIR** / **DURABLE_ACTORS_STORAGE**
> Data directory; storage `local` (default) or `gcs`

**DURABLE_ACTORS_PYTHON**
> Python interpreter for `.py` projects; otherwise **dev** uses the project `.venv`

**DURABLE_ACTORS_CONTROL_PLANE_URL**
> Control-plane origin for **generate** / **observe**

# CAVEATS

**init** fails if the destination exists. Python projects need **uv** (`uv sync`) and **pnpm exec durable-actors dev**. Self-hosting the production runtime on GCP is separate from this CLI (`docs/self-hosting.md` in the repository). **observe** binds 127.0.0.1 only and rejects cross-site requests.

# HISTORY

**Durable Actors** is an MIT project by **Terse**. npm package **durable-actors** **0.7.16**. It is positioned as an open-source alternative to Cloudflare Durable Objects.

# SEE ALSO

[npx](/man/npx)(1), [npm](/man/npm)(1), [node](/man/node)(1), [python](/man/python)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/TerseAI/durable-actors)```

```[Documentation](https://github.com/TerseAI/durable-actors/blob/main/docs/reference/typescript-guide.md)```

<!-- verified: 2026-10-07 -->
