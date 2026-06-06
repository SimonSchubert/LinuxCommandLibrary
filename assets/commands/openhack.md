# TAGLINE

Agentic open-source security scanner for codebases

# TLDR

**Launch** the interactive TUI

```openhack```

**Scan** the current directory headlessly (CI-friendly)

```openhack scan```

**Scan** a specific repository path

```openhack scan [path/to/repo]```

**List** saved scan sessions

```openhack sessions```

**Resume** an interrupted scan

```openhack resume [session-id]```

**Classify** frameworks without LLM calls

```openhack classify [path]```

# SYNOPSIS

**openhack** [_options_]

**openhack** **scan** [_path_]

**openhack** **sessions**

**openhack** **resume** _session-id_

**openhack** **classify** [_path_]

**openhack** **login**

**openhack** **setup**

# PARAMETERS

**--help**
> Show usage information.

# DESCRIPTION

**openhack** is an agentic security scanner that runs a multi-stage pipeline against a codebase: **recon** (builds a project model), **hunters** (category- and feature-specific vulnerability search), **validation** (confirms or rejects candidates), and optional **verification** (sandbox or browser exploitation tests). It is designed as an open-source alternative to proprietary agentic security tools and uses open-source models via the OpenHack inference API.

The interactive TUI is the default entry point. On first run, **openhack setup** walks through account login (browser OAuth, includes free credits) or API key configuration. Inside the TUI, slash commands drive the workflow: **/scan** _path_ starts a scan, the **Trace** tab shows live agent activity, and the **Findings** tab lists confirmed issues with severity, CVSS score, file location, vulnerable code, and recommended fixes.

Headless mode (**openhack scan**) runs the same pipeline for scripts and CI, printing progress to stdout and writing a JSON report to **~/.openhack/scans/**_session-id_**.json**. Scans are checkpointed after each stage; **openhack resume** continues from the last checkpoint if interrupted.

Optional **/verify sandbox** (requires Docker) spins up the application and attempts live HTTP exploitation. **/verify browser** adds headless-browser checks for client-side issues such as XSS and CSRF. Source code is processed locally; only LLM tokens are sent to the inference API, not raw files.

# CONFIGURATION

**~/.openhack/config**
> Persistent configuration including the API bearer token (mode **0600**).

**OPENHACK_API_KEY**
> Environment variable override for the inference API token.

**OPENHACK_DEV=1**
> Point the CLI at local development servers for self-hosted setups.

# CAVEATS

Sandbox and browser verification require a running Docker daemon. The TUI captures mouse events by default; hold **Option** (macOS) or **Shift** (Linux) while dragging to select text, or run **/mouse** to disable capture. AGPL-3.0 licensing applies; commercial use without AGPL obligations requires a separate license from the project maintainers.

# SEE ALSO

[semgrep](/man/semgrep)(1), [trivy](/man/trivy)(1), [grype](/man/grype)(1)