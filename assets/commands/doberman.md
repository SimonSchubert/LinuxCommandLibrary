# TAGLINE

Runtime guardrails that gate AI coding-agent tool calls

# TLDR

**Install** the CLI from PyPI (package name is **doberman-core**)

```pip install doberman-core```

**Wire** Claude Code hooks (mode, guardrails, settings)

```doberman setup```

**Check** that hooks, policy, and the decision database are healthy

```doberman doctor```

**Set** the local password used to approve policy weakenings

```doberman password set```

**Show** recent redacted verdicts

```doberman log```

**Proxy** an MCP tool server so every call is decided first

```doberman serve -- [npx -y @modelcontextprotocol/server-filesystem ~/project]```

**Replay** canned attacks through the real engine (nothing is executed)

```doberman demo```

# SYNOPSIS

**doberman** [**-V**] _command_ [_options_]

# DESCRIPTION

**doberman** is the command-line interface for Doberman, an adaptive authorization layer for coding agents. It sits on the execution path (a host **PreToolUse** hook or a transparent **MCP** proxy) and gives every tool call one verdict before the call runs: **PASS** (allow), **AUTH** (pause for human approval), or **BLOCK** (never execute). Uncertainty denies. Policy can auto-tighten; a permanent loosening needs an enrolled possession factor (TOTP if set up, otherwise the local Doberman password).

The PyPI distribution is **doberman-core**. The bare **doberman** name on PyPI is an unrelated, abandoned project. After install the command and import name are still **doberman**. Python **3.11+** is required. Status is alpha (package **0.18.1** at documentation time). Apache-2.0.

**doberman setup** is the Claude Code path: pick a mode, persist preference weights, and write hooks into **.claude/settings.json** (or **~/.claude/settings.json** with **--global**). **doberman install-hooks --host codex** wires Codex CLI instead. For Claude Desktop, Cursor, or any MCP client, register **doberman serve --** _downstream-server_ as the MCP command; the agent client spawns the proxy. OpenClaw uses **doberman hook openclaw** via the in-repo adapter.

Modes are **light**, **balanced** (default), **strict**, and **paranoid**. Hard blocks (secret exfiltration, destructive commands, role-boundary violations, confirmed read-then-send) are the same in every mode. The mode dial only changes when ambiguous or high-risk actions step up to AUTH. Orthogonal to mode is the enforcement dial: **enforce** (default), **monitor** (record discretionary verdicts, do not prompt), or **off** (skip the discretionary layer). The objective floor stays live in every state. Hand-editing **enforcement: off** in **policies.yaml** without a matching ledger entry is clamped back to **enforce**.

Verdicts are colour-coded (**BLOCK** red, **AUTH** amber, **PASS** green) on **review**, **status**, **log**, the TUI, and **demo**. Colour is dropped when output is piped or **NO_COLOR** is set. Diagnostics use **error:**, **warning:**, and **note:** prefixes.

# COMMANDS

**setup** [**-y**] [**-m** _mode_] [**-g**] [**-p** _path_]

> First-run wizard for Claude Code: choose mode, optionally tune preference weights, write hooks. **-y** accepts **balanced** and project-scope hooks with no prompts.

**install-hooks** [**-g**] [**--local**] [**--host** _claude_|_codex_] [**-p** _path_] [**--dry-run**]

> Idempotent hook install. Default host is Claude Code (**PreToolUse**, **PostToolUse**, **SessionStart**). **--host codex** writes **doberman hook codex-pre** into **hooks.json**.

**uninstall-hooks** [**-g**] [**--local**] [**--host** _claude_|_codex_] [**-p** _path_] [**--dry-run**]

> Remove only Doberman hook entries. Does not delete **.doberman/** or device-wide auth. Run this **before** **pip uninstall doberman-core**.

**uninstall** [**-p** _path_] [**-y**] [**--dry-run**]

> Project-scoped removal of project/local hooks **and** **.doberman/**. Requires a possession factor; **-y** skips the typed directory-name confirm, never the factor check. Leaves **--global** hooks and **~/.doberman/** alone.

**doctor** [**-p** _path_] [**--json**]

> Read-only health check (hooks, config, decision DB, 2FA, enforcement, fingerprint key). Exit **1** if a critical check fails.

**status** [**-p** _path_] [**--json**]

> Role, mode, prefs, policy summary, hook install state, taint, elevations, last decisions.

**scan** [**-p** _path_] [**-q**] [**--json**] [**--mcp**]

> Read-only capability risk map (sensitive files by name only). **--mcp** statically admits repository MCP configs; reports pattern classes, never raw URLs or env values.

**review** [**-p** _path_] [**-y**]

> Print the recommended policy checklist. **-y** writes **.doberman/policies.yaml**. Core hard blocks cannot be disabled here.

**mode** [_light_|_balanced_|_strict_|_paranoid_] [**-p** _path_]

> Print or set security mode. Lowering requires a possession factor; raising applies immediately.

**enforcement** [_enforce_|_monitor_|_off_] [**-p** _path_]

> Print or set the enforcement dial. Softening is gated and ledger-verified.

**prefs** [_dimension_ _value_] [**-p** _path_]

> Print the SL5 weights (**confidentiality**, **reversibility**, **interruption_tolerance**, **blast_radius**, each in **[0, 1]**) or set one. Lowering a weight is gated. The objective floor never moves.

**role enable-default** / **role disable-default** [**-p** _path_]

> Opt in to (or gated opt out of) the packaged least-privilege coding-assistant role when no **.doberman/role.yaml** exists.

**policy-history** [**-n** _n_] [**-p** _path_] [**--json**]

> Append-only policy-change ledger, including denied weakenings.

**log** [**-n** _n_] [**-p** _path_] [**--jsonl**]

> Recent redacted decisions (path class, reason codes, verdict, auth result). No raw targets or secrets.

**tui** [**-p** _path_]

> Interactive log browser. Needs **pip install "doberman-core[tui]"**.

**dash** [**--port** _n_] [**-p** _path_]

> Localhost-only dashboard (default **127.0.0.1:8642**) with a single-use URL token. Needs **pip install "doberman-core[dash]"**.

**demo** [**-p** _path_] [**--mode** _mode_] [**--fast**]

> Scripted attack reel through the real engine. Nothing is executed or prompted. Exit **1** if an expected verdict mismatches.

**session-summary**

> Print-and-exit device-wide lifetime rollup from **~/.doberman/metrics.db**. Always exits **0**. Hidden alias: **dashboard**.

**serve** [**-p** _path_] **--** _server_ [_args_...]

> MCP stdio proxy in front of _server_. Logs go to stderr; stdout is the MCP channel. Do not run this by hand to "start" an agent — the MCP client spawns it.

**hook pre** / **hook post** / **hook openclaw** / **hook codex-pre**

> Host hook entrypoints (JSON on stdin). Wired by **install-hooks**; not meant to be typed interactively.

**password set** [**--force**]

> Enroll or rotate the local password possession factor.

**2fa setup** [**--force**] / **2fa remove** / **2fa reset-lockout**

> Enroll TOTP (prints a provisioning URI), drop it (proves the current code), or clear a lockout (proves the password).

**taint clear** [**-p** _path_]

> Gated wipe of this repo's secret-read taint and read-vs-send fingerprints.

**tools approve** _name_ [**-p** _path_]

> Gated re-pin of a changed MCP tool schema after out-of-band review.

**memory** [**-p** _path_] / **memory reset** [**--entity** _id_] / **memory prune --older-than-days** _n_

> Redacted learned-memory summary; gated wipe; ungated retention prune (does not touch the decision log).

**tune** [**-p** _path_] [**--json**] [**--last** _n_] [**--min-occurrences** _n_] [**--accept** _id_]

> Friction report. **--accept** grants a time-limited standing elevation through the same weaken gate. Reverse with **revoke**.

**revoke** _elevation-id_ [**-p** _path_]

> Revoke an active role elevation (see **status**).

**version**

> Print the installed version (same as **-V**).

# PARAMETERS

**-V**, **--version**

> Print the installed version and exit (eager).

**-p**, **--path** _dir_

> Repository root whose **.doberman/** policy governs the command (default **.**). On **serve**, the same flag selects the policy root.

**-y**, **--yes**

> Accept defaults / skip typed confirm on **setup**, **review**, and **uninstall**. Never skips a possession-factor check.

**--json** / **--jsonl**

> Machine-readable output on **doctor**, **status**, **scan**, **policy-history**, **tune** (**--json**) or **log** (**--jsonl**).

**--host** _claude_|_codex_

> Which harness **install-hooks** / **uninstall-hooks** edit.

**--install-completion**

> Typer shell completion installer (after **pip install**).

# CONFIGURATION

**.doberman/**
> Per-repo control plane (not committed). **policies.yaml** holds mode, enforcement, preference weights, and the policy checklist. **role.yaml** is an optional explicit role (wins over **role enable-default**). Decision DB, taint, and tool pins live here too.

**.doberman/audit_webhook.yaml**
> Optional HTTPS sink for redacted decision records. **auth_env** names an environment variable sent as **Authorization**. Delivery is best-effort and never blocks a verdict.

**.doberman/artifact_pins.yaml**
> Optional post-fetch sha256 pins. Unpinned artifacts are not verified.

**~/.doberman/**
> Device-wide password / TOTP enrollment, fingerprint key, and **metrics.db**. Shared across every project on the machine.

**DOBERMAN_TURN_GATE**
> Set to **off** to disable the optional pre-inference turn gate (MCP-proxy deployments without a host pre-inference hook already omit it).

**DOBERMAN_EXPLAIN_LLM**
> Set to **1** (and install **doberman-core[explain]** with **ANTHROPIC_API_KEY**) to let the TUI rewrite a verdict's "why" in plainer language. The model is a narrator only; any failure falls back to the offline template.

**NO_COLOR**
> Non-empty value drops colour from CLI output.

# CAVEATS

This is the fu351 agent-guardrail CLI, not an unrelated PyPI project also named **doberman**. Host hooks run only the deterministic objective floor (no adaptive/subjective layer); that layer currently requires the MCP proxy path. Static egress classification can miss runtime-built hosts, nested shells, DNS-label exfil, and **/dev/tcp**. Unanswered AUTH times out to a denial (2 minutes for the desktop dialog, 20 minutes as the backstop). A human at the keyboard can still disable host hooks. Uninstall the hooks before uninstalling the package, or every gated tool call fails with **doberman: command not found**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [openclaw](/man/openclaw)(1), [cursor](/man/cursor)(1), [pip](/man/pip)(1), [npx](/man/npx)(1)

# RESOURCES

```[Source code](https://github.com/fu351/Doberman-Core)```

```[Documentation](https://github.com/fu351/Doberman-Core/blob/main/docs/SETUP.md)```

<!-- verified: 2026-08-18 -->
