# TAGLINE

YAML corpus and CLI for agent web-app context

# TLDR

**Install** the CLI globally

```npm install -g @sightmap/sightmap```

**Install** agent skills into the local harness

```sightmap skills install```

**Start** a Chrome session for the project corpus

```sightmap browser start```

**Snapshot** a URL with coverage of unlabeled nodes

```sightmap snapshot --coverage --url '[https://example.com/path]'```

**Validate** and **lint** the **.sightmap/** corpus

```sightmap validate```

```sightmap lint --warn-only```

**Report** per-view coverage health

```sightmap report```

# SYNOPSIS

**sightmap** _command_ [_options_]

# DESCRIPTION

**sightmap** is the reference CLI for the Sightmap open format: a **.sightmap/** directory of YAML that names a web app's views, components, and API requests, with optional freeform **memory** notes for runtime quirks that source code does not record.

The CLI drives a live browser via the Chrome DevTools Protocol to produce annotated accessibility snapshots (component names layered onto the tree) and structured interaction events. Agents author and maintain the corpus in an edit-verify loop: snapshot, fix orphaned interactive nodes, re-snapshot until coverage is complete.

Install via npm (**@sightmap/sightmap**) or build from the Go sources in the monorepo. Skills for coding agents can be installed with **sightmap skills install**.

# COMMANDS

**browser start** / **status**

> Launch Chrome plus a local corpus server (default port 7891) that hot-reloads YAML, or show session status.

**snapshot** [**--coverage**] [**--url** _url_]

> Capture an annotated ARIA snapshot; with **--coverage**, print T1/T2/T3 labeling stats and unlabeled clusters.

**sel-probe** _selector_

> Verify a CSS selector candidate against the live page.

**validate**

> Structural YAML correctness for the corpus (non-zero exit on error).

**lint** [**--warn-only**]

> Advisory style checks on the corpus.

**capture** [**--all**]

> Refresh saved captures for view URLs.

**report**

> Per-view T1/T2/T3 health table.

**skills install**

> Extract embedded authoring/browser skills into **~/.agents/skills/** (or equivalent).

**version**

> Print the CLI version.

# CAVEATS

Requires a graphical Chrome/Chromium session for browser commands. Coverage quality depends on stable selectors and a maintained corpus. Sightmap enriches agent context; it does not replace application tests or accessibility audits.

# SEE ALSO

[chromium](/man/chromium)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/sightmap/sightmap)```

```[Homepage](https://sightmap.org)```

```[Documentation](https://docs.sightmap.org)```

<!-- verified: 2026-07-30 -->
