# TAGLINE

CLI for simulation testing and monitoring of voice agents

# TLDR

**Sign in** (opens a browser device-approval page)

```egma login```

Sign in to a **self-hosted** instance

```egma login --url [http://localhost:3101]```

**Initialize** this repository against the logged-in project

```egma init```

**Pull** remote agents, suites, and tests (keeps local drafts)

```egma pull```

**List personas**, then **create a suite** directory

```egma persona list```

```egma suite create [receptionist-core] --name ["Receptionist core"]```

**Push** the repository index and tests (validates first)

```egma push```

**Start a run** of one suite against an agent connection

```egma run create [receptionist-core] --agent [agt_...] --connection [con_...] --name ["Release check"]```

**Cancel** a run

```egma run cancel [run_...]```

Start the **self-hosted** platform from an Egma checkout

```egma self-host up```

# SYNOPSIS

**egma** _command_ [_options_]

# PARAMETERS

**login**
> Browser device login. **--url** _URL_ selects Cloud or a self-hosted origin. Only **login**, **logout**, and **init** accept **--url**.

**logout**
> Revoke the saved device-login key for one origin. Does not revoke **EGMA_API_KEY** or change `egma/` in the repo.

**init**
> Bind this repository to a project and pull its agents, connections, suites, and tests into `egma/`. **--project** _ID_ is only needed for credentials that do not already identify one project.

**pull**
> Refresh the remote index, suites, and tests. Local unpushed test drafts are kept.

**push**
> Validate, then upload the complete authored state. There is no separate public `validate` command.

**agent register**
> Register an Egma agent identity. **--platform** `retell`|`livekit`, optional **--name** (default: repository directory name).

**agent connection options**
> Print the platform's connection catalog (and, for Retell, discover provider agents). Needs the provider key on first discovery.

**agent connection add**
> Add a simulation connection to an existing agent. Access and modality are explicit flags; provider secrets come from canonical environment variables or **--credentials-stdin**.

**agent monitoring setup**|**stop**
> Start or stop production call pulls for an agent (**--agent**, **--platform**).

**persona list**
> List personas available to the project.

**suite create** _DIR_ **--name** _NAME_
> Create a suite. Tests are Markdown files under `egma/tests/`_DIR_`/`.

**suite delete** _DIR_
> Delete the remote suite, then the local directory.

**test delete** _PATH_
> Delete a remote test, then the local Markdown file.

**run create** _DIR_ **--agent** _ID_ **--connection** _ID_
> Push, then start a run of every active test in that suite directory. Prints the run ID and results URL and returns.

**run cancel** _RUN_ID_
> Cancel an in-progress run.

**project api-key create** **--name** _NAME_
> Create a project-scoped API key. The secret is printed once and not stored.

**self-host up**
> Start local Egma services. Run this from an Egma **platform** checkout, not from a voice-agent repository.

# DESCRIPTION

**egma** is the command-line client for Egma, an open-source platform that simulation-tests voice agents and monitors them in production. The npm package is **egma-cli**; it installs the **egma** binary. Node.js **22** or newer is required.

The CLI is built for both humans and coding agents: each invocation is one named operation with no wizard, no JSON mode, and no interactive setup state machine. Workflow (which agent to connect, which tests to write) stays in the repository and in optional agent skills (`integrate-egma`, `write-egma-tests`).

Tests are ordinary Markdown files that live next to the voice-agent source. A file is one test: scenario, expected behaviors, personas, optional `## Mock tools`, and optional `## Env`. Suites are directories. **egma push** is the publish step; **egma run create** always pushes first and creates no run if that push fails.

Egma Cloud is the default origin. Self-hosting uses the same CLI against `--url` (local default port **3101**). LiveKit workers pointed at a self-hosted instance need **EGMA_URL** and a project-scoped **EGMA_API_KEY**.

# CONFIGURATION

Repository-local, non-secret selectors live in **`egma/config.yaml`** (format 4): platform origin, project id, and agent/connection ids. Provider agent ids, credentials, and connection secrets are **not** stored there; Egma seals those on the platform.

Machine-local login state defaults to **`~/.egma/`**. Set **EGMA_HOME** to move it. **EGMA_API_KEY**, when set, takes precedence over a saved device login.

Provider keys used only during setup:

**EGMA_RETELL_API_KEY**
> Retell API key for first-time discovery and the first Retell connection.

**EGMA_LIVEKIT_API_KEY** / **EGMA_LIVEKIT_API_SECRET**
> LiveKit project credentials when adding a project-credentials connection.

**EGMA_LIVEKIT_TOKEN_ENDPOINT_HEADERS**
> JSON headers for a LiveKit token-endpoint connection.

On the platform checkout, copy **`.env.example`** to **`.env`** (mode `600`) before **egma self-host up**. That command also writes internal secrets to **`.egma-platform/platform.env`**; keep that file with database backups.

# CAVEATS

Requires **Node.js 22+**. Output is prose only; there is no `--json` flag.

**login** / **init** / **logout** are the only commands that take **--url**. Every other repository command reads origin and project from `egma/config.yaml` and will refuse to run without it.

Do not put provider secrets in CLI arguments. Prefer the canonical environment variables or **--credentials-stdin** (a JSON object on stdin). Arguments show up in shell history and process listings.

A real **phone** run can incur carrier and model cost. The CLI does not prompt for that approval; the docs require a human to confirm before the coding agent starts it.

**egma self-host up** is the only public command that expects the Egma platform workspace rather than a voice-agent repository.

The GitHub repository is MIT except the **`ee`** directories.

# HISTORY

**Egma** is an open-source voice-agent testing and monitoring platform from **egma-ai**, first published on GitHub in **August 2026**. The CLI is distributed as the **egma-cli** npm package and is meant to be driven by developers or coding agents from the agent repository.

# SEE ALSO

[pytest](/man/pytest)(1), [playwright](/man/playwright)(1), [locust](/man/locust)(1), [newman](/man/newman)(1)

# RESOURCES

```[Source code](https://github.com/egma-ai/egma)```

```[Homepage](https://app.egma.ai)```

```[Documentation](https://docs.egma.ai/skills-cli-sdks/skills-and-cli)```

<!-- verified: 2026-09-10 -->
