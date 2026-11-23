# TAGLINE

AI toolkit for building and maintaining browser automations

# TLDR

**Scaffold a new Libretto project** in the current directory

```npm create libretto@latest```

**Install Libretto** into an existing Node project

```npm install libretto && npx libretto setup```

**Open a URL** in a controlled browser session

```npx libretto open [https://example.com]```

**Capture a snapshot** (screenshot + compact accessibility tree) of the current page

```npx libretto snapshot --session [name]```

**Execute Playwright TypeScript** against the current page

```npx libretto exec "[await page.click('button.submit')]"```

**Run a saved workflow file**

```npx libretto run [./integration.ts] --headless```

**Pass JSON parameters** to a workflow

```npx libretto run [./integration.ts] --params '[{"query": "shoes"}]'```

**Close the browser** of a session

```npx libretto close --session [name]```

**Check workspace readiness**

```npx libretto status```

# SYNOPSIS

**libretto** _command_ [_options_]

# COMMANDS

**setup** [**--skip-browsers**]
> Create the _.libretto/_ directory, install the agent skills and download Playwright Chromium.

**status**
> Check whether the workspace is set up and ready.

**update**
> Update an existing Libretto installation.

**open** [_URL_]
> Launch a browser and navigate to _URL_ (default: about:blank).

**connect** _CDP_URL_
> Attach to an existing browser through its Chrome DevTools Protocol endpoint.

**pages**
> List the open pages in the session.

**snapshot** [_ref_]
> Capture a screenshot and a compact accessibility snapshot; pass an element ref to show only that subtree.

**exec** _CODE_
> Run a snippet of Playwright TypeScript against the current page.

**readonly-exec** _CODE_
> Run read-only Playwright inspection code.

**run** _FILE_
> Run the default-exported workflow from a TypeScript file. Successful runs close the browser; failed or paused runs stay open for inspection.

**resume**
> Resume a paused workflow in the current session.

**save** _PROFILE_
> Save the current browser session (cookies, storage) as a reusable profile.

**close** [**--all**]
> Close the session's browser, or all sessions.

**cloud** _subcommand_
> Deploy workflows to and manage Libretto Cloud (deploy, jobs, schedules, credentials and more).

**help**
> Print the full command list.

# PARAMETERS

**--session** _NAME_
> Target a named browser session so that parallel workflows do not interfere. Required for session-scoped commands.

**--headed**, **--headless**
> Run Chromium with or without a visible window (**open**, **run**).

**--viewport** _WxH_
> Viewport size, for example 1920x1080.

**-p**, **--provider** _NAME_
> Browser provider: local, kernel, browserbase or steel.

**--auth-profile** _NAME_
> Load a saved auth profile before opening the browser (**open**, local sessions only).

**--read-only**, **--write-access**
> Create the session in read-only or write-access mode.

**--params** _JSON_, **--params-file** _FILE_
> Inline JSON or a JSON file with workflow parameters (**run**).

**--stay-open-on-success**
> Keep the browser open after a successful **run** so it can be inspected.

**--cdp** _URL_
> Run a workflow against an existing browser instead of launching one (**run**).

**-v**, **--version**
> Print the version.

# DESCRIPTION

**Libretto** is a CLI and coding-agent skill built on **Playwright** that helps engineers author and maintain browser automations for systems with no proper API. It gives a coding agent a live browser and a token-efficient CLI to inspect pages, capture network traffic to reverse-engineer site APIs, record user actions and replay them as scripts, and debug broken workflows against the real site.

A typical workflow is: open a page with **libretto open**, inspect it with **libretto snapshot**, iterate with **libretto exec**, and finally commit the steps to a TypeScript file that can be replayed with **libretto run**. All state is kept in a per-project _.libretto/_ directory (config, sessions, profiles, captured traffic).

# CONFIGURATION

The _.libretto/_ directory at the project root stores:

```
.libretto/
  config.json       # project settings (provider, viewport, ...)
  sessions/<name>/  # state, logs, network and action captures, snapshots
  profiles/         # saved browser auth profiles
```

CLI telemetry can be disabled with **LIBRETTO_TELEMETRY_DISABLED=1** or **DO_NOT_TRACK=1**.

# CAVEATS

Libretto needs Chromium and will download it during **libretto setup** (skip with **--skip-browsers**); corporate proxies may block this. Snapshots and captured network traffic of authenticated pages can contain secrets that end up in an agent's context. The project is pre-1.0 and its CLI changes frequently, so pin the version in _package.json_.

# HISTORY

Libretto is published by **Saffron Health** as an open-source toolkit to make browser-based integrations agent-friendly, combining Playwright with a token-efficient CLI and an agent skill for coding assistants. The repository later moved from the saffron-health to the cashew-labs GitHub organization.

# SEE ALSO

[playwright](/man/playwright)(1), [npx](/man/npx)(1), [curl](/man/curl)(1), [puppeteer](/man/puppeteer)(1)

# RESOURCES

```[Source code](https://github.com/cashew-labs/libretto)```

```[Homepage](https://libretto.sh)```

```[Documentation](https://libretto.sh/docs)```

<!-- verified: 2026-11-23 -->
