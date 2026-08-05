# TAGLINE

Local MCP server for cross-agent adversarial code review

# TLDR

**Install** from a clone

```pip install -e .```

Wire into **Claude Code** (reviews performed by Codex)

```claude mcp add paranoia -- paranoia-local --engine codex```

Wire into **Codex** (reviews performed by Claude Code)

```codex mcp add paranoia -- paranoia-local --engine claude```

**Run the MCP server** with a chosen review engine

```paranoia-local --engine codex```

```paranoia-local --engine claude```

**Custom audit log directory**

```paranoia-local --engine codex --log-dir [path]```

# SYNOPSIS

**paranoia-local** **--engine** {**codex**|**claude**} [**--log-dir** _DIR_]

# PARAMETERS

**--engine** **codex**|**claude**
> Required. Which local coding-agent CLI **performs** reviews — the *other* agent from the caller. From Claude Code use **codex**; from Codex use **claude**.

**--log-dir** _DIR_
> Audit-log directory (default **~/.paranoia/logs**). Class-closure lineage state does **not** follow this path; it lives under **~/.paranoia/lineages** (or **PARANOIA_STATE_ROOT**).

# DESCRIPTION

**paranoia-local** is a local Model Context Protocol (MCP) server that gets a cold, adversarial review of code, plans, and decisions from the *other* frontier coding agent. Installed into Claude Code, reviews are performed by Codex; installed into Codex, reviews are performed by Claude Code. The server builds the prompt, runs the reviewer CLI **read-only** with full repository access, and returns a structured critique.

MCP tools include **critique_branch**, **critique_plan**, **query**, **rebut**, and **arbitrate** (the last needs both vendor CLIs). Multi-round work can track defect **classes** across rounds (class closure / lineage state), so loops can converge instead of repeating the same findings. Optional project defaults live in **.paranoia.toml** at the repo root.

Reviewers are sandboxed: Codex under its OS **read-only** sandbox; Claude with a restricted tool allowlist and no write tools. No API keys are embedded — the server shells out to CLIs you are already signed into. Reviews consume subscription agentic-usage quota.

# CONFIGURATION

**CLI:** **--engine** (required), **--log-dir**.

**State on disk:**

- **~/.paranoia/logs/** — JSON audit records per call
- **~/.paranoia/lineages/** — class-closure state (not moved by **--log-dir**)
- **PARANOIA_STATE_ROOT** — relocate lineage (and related) state

**Repo file:** **.paranoia.toml** (or **[paranoia]** table) for defaults such as **base_ref**, **project_summary**, **stakes**, **isolate**, **converge**, **class_closure**, **model**, **effort**, **web_search**. Call arguments override the file.

**MCP client timeouts:** long reviews need raised tool/startup timeouts in the host config (e.g. Codex **tool_timeout_sec** / **startup_timeout_sec**).

# CAVEATS

Requires **Python 3.11+**, **git** on **PATH**, and at least one of **codex** (≥ 0.144 recommended) or **claude** installed and signed in; **arbitrate** needs both. Reviews can run for minutes and spend significant subscription quota. Host MCP timeouts that stay at short defaults will kill every call. Class-closure lineage keys must be unique when reviewing plans or non-branch refs.

# HISTORY

**paranoia-local** is written by **Andrew Hillel**, licensed **MIT**, and published as the PyPI / console script **paranoia-local**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [git](/man/git)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/subvertnormality/paranoia-local)```

```[Homepage](https://github.com/subvertnormality/paranoia-local)```

```[Documentation](https://github.com/subvertnormality/paranoia-local/tree/main/docs)```

<!-- verified: 2026-08-05 -->
