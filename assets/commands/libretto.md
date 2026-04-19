# TAGLINE

AI toolkit for building and maintaining browser automations

# TLDR

**Scaffold a new Libretto project** in the current directory

```npm create libretto@latest```

**Install Libretto** into an existing Node project

```npm install libretto && npx libretto setup```

**Open a URL** in a controlled browser session

```npx libretto open [https://example.com]```

**Take a snapshot** (HTML + screenshot) and analyze it with an LLM

```npx libretto snapshot --objective "[find the login form]"```

**Execute Playwright TypeScript** against the current page

```npx libretto exec "[await page.click('button.submit')]"```

**Run a saved workflow file**

```npx libretto run [src/workflows/scrape-page.ts]```

**Target a named session** (multiple windows can coexist)

```npx libretto snapshot --session [checkout] --objective "[verify total]"```

# SYNOPSIS

**libretto** _command_ [_options_]

# COMMANDS

**setup**
> Download the bundled Chromium build and configure the snapshot model.

**open** _URL_
> Launch a browser and navigate to _URL_.

**snapshot** **--objective** _TEXT_
> Capture HTML and a PNG screenshot, then summarize the page against the stated objective.

**exec** _CODE_
> Run a snippet of Playwright TypeScript against the current page.

**run** _FILE_
> Execute a workflow file (TypeScript) that orchestrates multiple steps.

**help**
> Print the full command list.

# PARAMETERS

**--session** _NAME_
> Target a named browser session so that parallel workflows do not interfere.

**--objective** _TEXT_
> Natural-language goal passed to the model during a snapshot.

**--headless**
> Run Chromium without a visible window.

**--model** _NAME_
> Override the LLM used to analyze snapshots.

# DESCRIPTION

**Libretto** is a CLI and coding-agent skill built on **Playwright** that helps engineers author and maintain browser automations for systems with no proper API. Instead of hand-writing selectors, the developer points Libretto at a live page and asks the LLM for "token-efficient" summaries, network traces, and DOM excerpts that can be pasted into an agent prompt.

A typical workflow is: open a page with **libretto open**, capture context with **libretto snapshot**, iterate with **libretto exec**, and finally commit the steps to a TypeScript file that can be replayed with **libretto run**. All state is kept in a per-project _.libretto/_ directory (sessions, profiles, captured traffic).

# CONFIGURATION

Libretto reads an API key from a project **.env** file for whichever LLM provider is configured (OpenAI, Anthropic, etc.). The _.libretto/_ directory stores:

```
.libretto/
  sessions/         # Playwright user-data directories
  snapshots/        # captured HTML + PNG + summaries
  profiles/         # reusable configuration presets
```

# CAVEATS

Libretto needs Chromium and will download it during **libretto setup**; corporate proxies may block this. Because the tool routes page content through an LLM, be mindful of leaking secrets when snapshotting authenticated pages. Library version and Playwright API can change frequently — pin the version in _package.json_.

# HISTORY

Libretto is published by **Saffron Health** as an open-source toolkit to make browser-based integrations agent-friendly, combining Playwright with a model-aware CLI and **Model Context Protocol (MCP)** skill for coding assistants.

# SEE ALSO

[playwright](/man/playwright)(1), [npx](/man/npx)(1), [curl](/man/curl)(1), [puppeteer](/man/puppeteer)(1)
