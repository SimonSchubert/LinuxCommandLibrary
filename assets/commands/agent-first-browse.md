# TAGLINE

Drive a browser from the command line with a language-model agent

# TLDR

**Run** a task in the current engine

```agent-first-browse run "Open [url] and list the top three headings"```

Run with the **v2** engine

```agent-first-browse run --mode v2 "Open [url] and list the top three headings"```

Run the browser **headless**

```agent-first-browse run --headless "Open [url]"```

Open a browser for a **manual login**

```agent-first-browse login```

# SYNOPSIS

**agent-first-browse** [_command_] [_options_]

# PARAMETERS

**run** [_objective_]
> Give the agent a task in plain language. With no objective, a built-in login demo on a public test site is used.

**--mode** legacy|v2
> Browser engine. **v2** is the current engine. **legacy** is the frozen baseline. The default is the engine already selected in the environment.

**--headless**
> Do not open a visible browser window.

**login**
> Open a browser so you can sign in by hand. The agent is not started.

# DESCRIPTION

**agent-first-browse** is a Python console script that launches Chromium through Playwright and asks a language model to complete a web task: open a page, click, type, and stop when the objective is done. It is the autonomous entry point of the Agent-first-browse project. Keys for the model belong in a local environment file, copied from the project's example.

**login** is separate from **run**. It only opens a browser for an account you sign into yourself. The same install also provides **agent-eval**, a daemon that drives the browser without a model, and **agent-browse-mcp**, which exposes the browser to an MCP client.

Install the package, then install the Chromium build Playwright expects.

# CAVEATS

**run** sends the objective and page contents to the configured model provider. Headless mode needs a working Playwright browser. A visible window on a machine without a display needs a virtual framebuffer. With no subcommand, the script prints help.

# SEE ALSO

[agent-eval](/man/agent-eval)(1), [agent-browse-mcp](/man/agent-browse-mcp)(1)

# RESOURCES

```[Source code](https://github.com/SandeepAi369/Agent-first-browse)```

```[Documentation](https://github.com/SandeepAi369/Agent-first-browse/blob/main/README.md)```

<!-- verified: 2026-11-26 -->
