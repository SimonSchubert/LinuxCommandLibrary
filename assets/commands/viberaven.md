# TAGLINE

Production context CLI for AI-built applications

# TLDR

**Open the local Studio cockpit**

```viberaven```

**Install agent guidance** into project config files

```viberaven init --agents all```

**Check agent integration health**

```viberaven doctor --agents```

**Serve MCP resources** on stdio for connected agents

```viberaven --mcp```

# SYNOPSIS

**viberaven** [_options_]

**viberaven** _subcommand_ [_arguments_]

# DESCRIPTION

**viberaven** is the command-line entry point for VibeRaven, a local-first toolkit that gives AI coding agents production context before they edit a repository. It installs bounded rules and skills into files such as **AGENTS.md**, **CLAUDE.md**, and **.cursor/rules**, maintains production memory under **.viberaven/**, and launches a Studio UI for release diffs, provider boundaries, deployment evidence, and agent chat.

The CLI is distributed on npm and is typically run with **npx -y viberaven**. It focuses on the loop **route → ask → evidence → fix → verify → remember**, routing uncertain tasks to specialized skills for architecture planning, regression analysis, production context, and go-live checks. MCP mode exposes structured project resources so agents can fetch release and provider state without guessing from repo files alone.

# PARAMETERS

**init**
> Install VibeRaven agent rules and context files into the current project.

**--agents** _LIST_
> Target specific agent environments (for example `all`, or a comma-separated subset).

**--dry-run**
> Preview **init** changes without writing files.

**doctor**
> Validate installed agent guidance and integration health.

**--mcp**
> Run the Model Context Protocol server on standard input/output.

**validate-npm-package** _PACKAGE_
> Check an npm package before adding it as a dependency.

# CONFIGURATION

VibeRaven writes project-local state under **.viberaven/**, including **production-context.md**, **agent-context.md**, and optional **prp.json** for machine-readable production readiness data. Installed rules are wrapped in **<!-- VIBERAVEN:START -->** … **<!-- VIBERAVEN:END -->** markers so they can be updated or removed cleanly.

# CAVEATS

The open-source CLI and Studio are local-first and do not require login for basic use, but provider-specific proof (Supabase, Vercel, billing, auth) still depends on credentials and dashboards outside the repository. VibeRaven augments agent behavior; it does not replace tests, CI, or manual production verification.

# HISTORY

VibeRaven was created by **Ohad** (ohad6k) in 2026 as mission-control tooling for apps built primarily by AI agents, with the public repository serving as the agent discovery and installation surface.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [npx](/man/npx)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/ohad6k/VibeRaven)```

```[Homepage](https://viberaven.dev)```

<!-- verified: 2026-06-30 -->