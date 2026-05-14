# TAGLINE

Agent-first web browser driven from the command line

# TLDR

**Download** the bundled browser build

```uvx rotunda agent fetch```

Create a **named browser profile**

```uvx rotunda agent new-profile --name [agent-demo]```

Open a new **context** inside an existing profile

```uvx rotunda agent new-context [agent-demo]```

**Navigate** the context to a URL

```uvx rotunda agent navigate [3] [https://example.com]```

**Describe** the current page to get element references

```uvx rotunda agent describe [3]```

**Click** an element by reference

```uvx rotunda agent click [3] [ref_id]```

Save a **screenshot** of the viewport

```uvx rotunda agent screenshot [3] --path [page.png]```

# SYNOPSIS

**rotunda agent** _subcommand_ [_context-id_] [_options_]

# DESCRIPTION

**Rotunda** is a browser purpose-built for AI agents. It bundles a stealthy Chromium build, exposes high-level primitives for navigation, inspection, and form interaction, and persists profiles, daemon sessions, and short resource indexes under **~/.rotunda** so that later **uvx rotunda** calls can attach to the same profile without rebooting it.

The agent CLI is grouped into a few families of subcommands: profile and session management (**fetch**, **new-profile**, **new-context**, **stop**), navigation primitives (**navigate**, **back**, **forward**, **reload**, **wait**), inspection (**describe**, **screenshot**, **extract**), and interaction (**click**, **hover**, **fill**, **type**, **select**, **check**, **press**, **upload**, **dialog**). Each element-targeted command refers to a numeric context id and an element reference returned by **describe**.

Rotunda is also importable as a Python library on top of **Playwright**, but the CLI is the recommended entry point for shell-based agents.

# PARAMETERS

**fetch**
> Download the bundled browser build to ~/.rotunda.

**new-profile** **--name** _name_
> Create a persistent browser profile.

**new-context** _profile_
> Open a fresh browser context in the named profile; prints a numeric context id.

**navigate** _ctx_ _url_
> Load _url_ in the given context.

**describe** _ctx_
> Print page structure and reference ids that other commands consume.

**click** _ctx_ _ref_, **hover** _ctx_ _ref_
> Mouse interaction with a referenced element.

**fill** _ctx_ _ref_ _text_
> Replace the value of an input field.

**type** _ctx_ _text_
> Type text at the current focus position.

**select** _ctx_ _ref_ _value_
> Choose a dropdown option by value.

**check** _ctx_ _ref_, **press** _ctx_ _key_
> Toggle a checkbox / send a keyboard key.

**extract** _ctx_ [_--format_ _text|html|markdown|links_]
> Pull text, raw HTML, markdown, or link lists out of the page.

**screenshot** _ctx_ [_--full-page_] [_--path_ _file_]
> Capture the viewport or the entire page.

**upload** _ctx_ _ref_ _file_
> Attach _file_ to a file-input element.

**dialog** _ctx_ _action_
> Accept or dismiss browser dialogs (alert/confirm/prompt).

**wait** _ctx_ _condition_
> Block until a page condition is met (load state, selector, timeout).

**back**, **forward**, **reload** _ctx_
> Standard navigation primitives.

**stop**
> Shut down the profile daemon.

# CONFIGURATION

**~/.rotunda/**
> Persistent profiles, daemon sockets, and short resource indexes shared between **uvx rotunda** invocations.

**~/.rotunda/profiles/**_name_
> One subdirectory per named profile created via **new-profile**.

# CAVEATS

Requires **uv / uvx** to be installed; **uvx rotunda** downloads and runs the project on demand. Contexts are addressed by numeric ids that are only valid for the lifetime of the daemon — calling **stop** invalidates them. Bot-detection avoidance is best-effort; some sites will still block automated traffic.

# HISTORY

**Rotunda** was published by **MonkeySee AI** in **2026** as an agent-friendly browser layer that fills the gap between raw Playwright scripting and full-featured commercial browser-automation services. Its CLI surface is intentionally narrow and stable so that LLM-driven agents can call it without a tool-specific SDK.

# SEE ALSO

[playwright](/man/playwright)(1), [chromium](/man/chromium)(1), [puppeteer](/man/puppeteer)(1), [uv](/man/uv)(1)
