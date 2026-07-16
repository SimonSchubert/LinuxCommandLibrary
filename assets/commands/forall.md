# TAGLINE

spec-driven coding agent with machine-checkable proofs

# TLDR

**Install** the CLI (requires a published release)

```curl -fsSL https://forall.astrio.app/install.sh | bash```

Check the **version**

```forall --version```

**Initialize** Forall in a git repository

```forall init```

Start the **interactive agent**

```forall```

# SYNOPSIS

**forall** [_COMMAND_] [_OPTIONS_]

# DESCRIPTION

**forall** is a terminal coding agent from Astrio that aims to generate software from specifications together with machine-checkable proofs. It runs as an interactive CLI: after install, sign in with a Forall account API key or bring your own model key (OpenAI / OpenRouter), run **forall init** inside a git repository, and work through the agent workflow in the terminal.

Supported languages currently include TypeScript, Java, and Rust. For teams that prefer another editor agent, Forall also offers a verify-only MCP server (**@astrio/forall-mcp**) that reports verification results without replacing the main coding agent.

# CAVEATS

Install succeeds only when a binary is available on GitHub Releases. The agent needs network access and an API key for model inference. Proof and verification coverage depend on project language and tooling; treat generated proofs as part of a review process, not a substitute for testing.

# HISTORY

**forall** is developed by **Astrio Labs** and released under the Apache-2.0 license.

# SEE ALSO

[git](/man/git)(1), [cargo](/man/cargo)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/astrio-labs/forall)```

```[Homepage](https://forall.astrio.app)```

```[Documentation](https://github.com/astrio-labs/forall/blob/main/docs/getting-started.md)```

<!-- verified: 2026-07-16 -->
