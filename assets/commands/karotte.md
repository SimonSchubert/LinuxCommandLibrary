# TAGLINE

Build and run sandboxed RL evaluation environments

# TLDR

Install the CLI with **uv**

```uv tool install karotte```

**Create** an environment from the default template

```karotte create-env [my_env]```

**List** tasks in the current environment

```uv run karotte tasks list```

**Run** a task with a model

```uv run karotte run --task [example-task] --model [anthropic/claude-opus-5-5]```

Open a **transcript dashboard**

```uv run karotte dashboard [out/]```

**Build** the environment image

```uv run karotte build```

Print the **version**

```karotte --version```

# SYNOPSIS

**karotte** [_--version_] _command_ [_options_] [_args_]

# DESCRIPTION

**karotte** is a Python CLI for building robust RL environments used to train aligned agents. Console script **karotte** (`karotte.cli:entry`, Typer). Python **3.12+**. Install with **uv tool install karotte**. Runs go into a VM by default: Apple `container` on macOS, **Firecracker** on Linux; **docker** or **podman** also work. Package version in-tree is **3.0.0** (set on publish). MIT, with MIT-0 templates.

`karotte create-env` writes a project from stacked templates (default `default`). Inside that tree, `uv sync --extra dev` and optional `uv run setup_data.py`, then `karotte run`. **run** builds the image, executes the task, and writes a transcript (default `out/transcript.json`). **dashboard** visualizes transcripts in a Textual TUI.

# COMMANDS

**create-env** _DIR_
> Write an environment. **--template** (repeatable; default `default`). **--agent** (repeatable CLI agents baked into the image). **--vendor-karotte** copies karotte source for local testing

**update** [_DIR_]
> 3-way merge the project onto the latest templates. **--add-template**, **--with** _package_

**create-run-config** [_PATH_]
> Write `run_config.json` (default). **--model** (default `anthropic/claude-opus-5-5`), **--model-api-key**, **--task**

**run**
> Execute an evaluation. **-c**, **--config** JSON or file; without it **--task** and **--model** are required. **--transcript-file** (default `out/transcript.json` without **--config**). **--runtime** (Firecracker, docker, apple-container, …). **--n-parallel** / **-n** (containerized only). **--dev** bind-mounts `src/environment` and skips the image build. **--mount** `source:target[:ro]` (or `@file`). **--no-ui**, **--keep-containers**, **--prepare-only**, **--proxy** / **--no-proxy**. **--no-containerized** only inside a karotte image

**build**
> Build the environment image. **--runtime**, **--tag** (default `karotte`), **--build-context**, **--cache-from**, **--cache-to**, **--build-secret** `name=path`

**dashboard** _DIR_
> Visualize transcripts in _DIR_

**check** / **check confinement**
> Validate the environment (tasks, MCP tools, paths, credentials). **confinement** must run as root inside the sandbox. **--json**, **--hardware**

**tasks list** / **templates list** / **models list** / **agents list**
> Inspect tasks, shipped templates, the model catalog, and agents. Each accepts **--json**

**agents add** _name_ / **agents remove** _name_
> Edit `.manifest.json`. The next **build** installs or drops the CLI agent

**--version**
> Print the installed **karotte** package version

# CAVEATS

Python 3.12+ and **uv**. Linux runs default to Firecracker; that needs KVM and the Firecracker preflight. **--no-containerized** is refused on the host. **--n-parallel > 1**, **--dev**, **--mount**, and **--keep-containers** need containerization. **check confinement** must be root. API keys come from the environment (`ANTHROPIC_API_KEY`, `OPENAI_API_KEY`, …) or **--model-api-key**. SIGTERM is turned into KeyboardInterrupt so sandboxes tear down.

# HISTORY

**Karotte** is an MIT project by **Preference Model**. Templates under `src/karotte/templates/` are MIT-0. Docs at **karotte.dev**.

# SEE ALSO

[uv](/man/uv)(1), [python](/man/python)(1), [docker](/man/docker)(1), [podman](/man/podman)(1)

# RESOURCES

```[Source code](https://github.com/preferencemodel/karotte)```

```[Documentation](https://karotte.dev)```

<!-- verified: 2026-10-07 -->
