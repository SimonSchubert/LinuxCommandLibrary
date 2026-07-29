# TAGLINE

Fast headless verification browser for AI coding agents

# TLDR

**Install** then run setup to detect agent workflows

```hwatu setup```

Open a site **headlessly** and run a one-call verify pass

```hwatu check localhost:5173 --eval 'document.title' --shot=/tmp/after.png```

Open a URL like a terminal browser (headless by default)

```hwatu localhost:3000```

**Pixel-diff** two open windows and print match percent

```hwatu diff --id 2 --other 1 --heatmap /tmp/heat.png```

**Render** HTML from stdin and screenshot

```echo '<h1>hi</h1>' | hwatu render --stdin --shot=/tmp/gen.png```

Hand a live session to a **human** in the tiling WM

```hwatu focus [window_id]```

Start the **MCP** server for agent clients

```hwatu mcp```

# SYNOPSIS

**hwatu** [_options_] [_url_]

**hwatu** **check**|_diff_|_motion_|_snapshot_|_focus_|_render_|_setup_|_doctor_|_mcp_ ...

# PARAMETERS

**check** _url_
> One-call verify: load, optional eval/screenshot, return JSON metrics

**diff** **--id** _n_ **--other** _m_
> Pixel-diff two windows; optional **--heatmap** path

**motion** **--id** _n_
> Report animations as numbers (duration, easing, velocity)

**snapshot**
> Page state as structured JSON (tokens, not pixels)

**render** **--stdin**
> Render markup from stdin without a local HTTP server

**focus** _id_
> Materialize a headless window into a visible session for human hand-off

**setup** [**--client** _name_] [**--scope** project|user] [**--dry-run**] [**--undo**]
> Detect coding agents and configure MCP/socket connections

**doctor**
> Environment and readiness checks

**mcp**
> Run as an MCP server (`command: hwatu`, `args: ["mcp"]`)

**demo**
> Run a built-in demo verification pass

**--headless**
> Headless window mode (default for agent use; per-window property)

# DESCRIPTION

**hwatu** is a Linux verification browser built for AI agent loops: a warm WebKitGTK daemon that keeps the engine hot so page checks stay cheap (~tens of milliseconds), returns measurement primitives (pixel match scores, animation metrics, console/network errors) instead of only raw screenshots, and can hand the **same live session** to a human mid-task without losing cookies or state.

It ships as a static binary plus the distro's webkitgtk, exposes a plain CLI, an MCP server, and a newline-delimited JSON Unix socket protocol. Typical agent flow: open headless windows, `check` or `diff` until the match percent climbs, then `focus` only when a CAPTCHA or judgment call needs a person.

Linux-only; renders WebKit, not Chromium — keep a Chromium matrix in CI for engine-specific bugs.

# CAVEATS

Requires WebKitGTK 6.x on the host. Headless is a per-window property switchable live, not a launch-only mode. AGPL-3.0 licensed. Not a full replacement for Playwright multi-browser CI matrices.

# HISTORY

Open-source Rust project aimed at making agent browser verification one tool call instead of multi-step Playwright/devtools sessions, with interruptible human hand-off as a first-class feature.

# INSTALL

```aur: yay -S hwatu```

<!-- packages: 2026-07-29 -->

# SEE ALSO

[playwright](/man/playwright)(1), [chromium](/man/chromium)(1)

# RESOURCES

```[Source code](https://github.com/hongnoul/hwatu)```

```[Documentation](https://github.com/hongnoul/hwatu/tree/main/docs)```

<!-- verified: 2026-07-29 -->
