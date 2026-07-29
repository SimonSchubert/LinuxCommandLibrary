# TAGLINE

Read-only deep research CLI for cloud, code, and Kubernetes infrastructure

# TLDR

Ask an **interactive** infrastructure research question

```cynative "what in my cloud is publicly exposed that shouldn't be?"```

Run a **single non-interactive** task and exit

```cynative -p "which IAM roles can escalate to admin?"```

Pipe IaC into a **one-shot review**

```cat main.tf | cynative -p "review this Terraform for misconfigurations"```

**Validate** config and connectors without starting a session

```cynative doctor```

Probe the configured **LLM** as part of doctor

```cynative doctor --live-llm```

Auto-approve tool calls for **unattended** runs

```cynative -p "live cloud resources absent from IaC" --auto-approve```

# SYNOPSIS

**cynative** [_options_] [_"task"_]

**cynative** **-p**|_--print_ _"task"_

**cynative** **doctor** [_--live-llm_]

# PARAMETERS

**-p**, **--print** _task_
> Run one task non-interactively and exit (scripts and pipes)

**--auto-approve**
> Skip per-tool approval prompts (needed without a TTY)

**-v**
> Verbose mode (e.g. stream inner sandbox tool calls)

**doctor**
> Validate configuration and connector readiness

**--live-llm**
> With **doctor**, probe the configured model with a tool-less round-trip

**completion** _shell_
> Shell completion helpers (see `cynative completion <shell> --help`)

**--version**
> Print version, commit, build date, Go version, and platform

# DESCRIPTION

**cynative** is a read-only infrastructure research agent. It runs frontier language models against your live environment — AWS, GCP, Azure, Kubernetes (including EKS/GKE/AKS), GitHub, and GitLab — and returns evidence-backed answers with verification.

Unlike generic coding agents with MCP plugins, cynative is **read-only by construction**: every call is authorized against a security-audit style policy before credentials are attached, research code runs in a sandbox, secrets are redacted from model context, and every tool call is logged to a fail-closed JSONL audit log (`~/.cynative/audit.log` by default).

It uses credentials already present in your shell (no separate credential store). For bulk work it can write and run sandboxed JavaScript that fans out concurrent API calls. Interactive mode supports line editing and history; press Esc or Ctrl-C once to stop a running task gracefully.

Configure the LLM via environment variables such as `CYNATIVE_LLM_PROVIDER`, `CYNATIVE_LLM_MODEL`, and provider API keys, or via `~/.cynative/config.yaml`. Resource ceilings (`CYNATIVE_MAX_TOTAL_TOKENS`, `CYNATIVE_MAX_ITERATIONS`, etc.) bound unattended runs.

# CAVEATS

Always use least-privileged, read-only credentials. Hosted LLM providers receive prompts and tool results (after redaction). Token and iteration limits default high or unbounded — set ceilings for cron/CI. Operational footers (timing, tokens) go to **stderr** so stdout stays clean for piping.

# HISTORY

Open-source Go CLI (Apache-2.0) for sovereign, evidence-backed infrastructure research with built-in cloud/VCS connectors and an action gate that fails closed on writes.

# SEE ALSO

[aws](/man/aws)(1), [gcloud](/man/gcloud)(1), [az](/man/az)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/cynative/cynative)```

```[Documentation](https://github.com/cynative/cynative/tree/main/docs)```

<!-- verified: 2026-07-29 -->
