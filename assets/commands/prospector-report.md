# TAGLINE

Render a Plimsoll audit stream as one self-contained HTML report

# TLDR

**Render** an audit file to HTML

```prospector-report -o [report.html] [audit.jsonl]```

Read a **daemon stream** from a pipe

```plimsolld | prospector-report -o [report.html]```

Attach **API-design prompts** from the grants the daemon ran with

```prospector-report -grants [grants.json] -o [report.html] [audit.jsonl]```

Set a **title** and a provenance note

```prospector-report -title [staging] -source [ci-nightly] -o [report.html] [audit.jsonl]```

**Install** the report tool from the module

```go install github.com/plimsollmark/plimsoll/cmd/prospector-report@latest```

# SYNOPSIS

**prospector-report** [**-o** _file_] [**-grants** _file_] [**-title** _text_] [**-source** _text_] [_audit.jsonl_]

# DESCRIPTION

**prospector-report** reads newline-delimited JSON "code run" audit lines and writes one static HTML page with no extra assets. It is the no-dashboard companion to Plimsoll's Prospector view: route templates, verbs, counts, and timings. It does not embed a path, a body, or a credential.

With no file argument it reads stdin, so a pipe from **plimsolld** works. **-o** names the HTML file; without it the page goes to stdout. **-title** sets the report title. **-source** is the provenance note in the header and defaults to the input file name.

**-grants** points at the same grants file the daemon ran with. The report then embeds a paste-ready API-design prompt under each API-change finding, using the profile's declared routes. Agent-fixable findings are left alone: their fix is switching to a route that already exists, not adding an endpoint.

Build from **cmd/prospector-report** (**go install github.com/plimsollmark/plimsoll/cmd/prospector-report@latest**).

# PARAMETERS

**-o** _file_
> HTML output path. Default is stdout

**-grants** _file_
> Grants JSON. Enables API-design prompts for API-change findings

**-title** _text_
> Report title

**-source** _text_
> Provenance note in the header. Default is the input file name

_audit.jsonl_
> Newline-delimited audit records. Omit to read stdin

# CAVEATS

The page is only as complete as the audit lines it is given. **-grants** must be the file the daemon actually ran with, or the prompts describe a different profile. The report stays metadata-only: it will not show request paths, bodies, or credentials even if a line carried them.

# HISTORY

Part of **Plimsoll** (**plimsollmark/plimsoll**), Apache-2.0. The binary lives at **cmd/prospector-report**.

# SEE ALSO

[plimsolld](/man/plimsolld)(1), [plimsoll-mcp](/man/plimsoll-mcp)(1), [plimsoll-clients](/man/plimsoll-clients)(1), [plimsoll-attest](/man/plimsoll-attest)(1), [plimsoll-specgen](/man/plimsoll-specgen)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/plimsollmark/plimsoll)```

<!-- verified: 2026-10-27 -->
