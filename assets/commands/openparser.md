# TAGLINE

Parse PDFs and images via the OpenParser API

# TLDR

**Install** the CLI and log in

```npm install -g @openparser/cli && openparser auth login```

**Parse** a document synchronously as JSON

```openparser parse sync [path/to/file.pdf] --json```

**Extract** structured fields with a JSON schema

```openparser extract sync [path/to/file.pdf] --schema [path/to/schema.json]```

**Check** API connectivity and active profile

```openparser status --json```

**List** recent jobs

```openparser jobs list --status succeeded --limit 10```

**Upload** a file for reuse across jobs

```openparser files upload [path/to/file.pdf]```

# SYNOPSIS

**openparser** _command_ [_subcommand_] [_options_] [_args_]

# DESCRIPTION

**openparser** is the terminal client for OpenParser, a document intelligence API that turns PDFs and images into text, layout, and schema-constrained structured data. The CLI is aimed at interactive use, CI jobs, and agent tooling.

Stdout carries data payloads (JSON, tables, file bytes); stderr carries status lines. Prefer **--json** when scripting, and **--quiet** / **-q** to silence non-error status on stderr.

Authentication uses saved profiles (**openparser auth login**) or **OPENPARSER_API_KEY** (and optional **OPENPARSER_BASE_URL**, **OPENPARSER_PROFILE**) for headless environments. Flag options override environment variables, which override the active profile.

# COMMANDS

**status**

> Verify API connectivity and profile context.

**auth**

> Profile management (**login**, **use**, named profiles for staging/production).

**models**

> List OCR and LLM model catalogs.

**parse**

> Synchronous, async, and batch parse admission (**parse sync**, **parse batch**, ...).

**extract**

> Schema-constrained extraction, batch extract, and schema suggestion.

**jobs**

> List jobs and fetch status, results, and source bytes.

**files**

> Upload and reuse pooled files.

**pipelines**

> Manage saved extraction pipelines.

# CAVEATS

Requires network access to the OpenParser API (default **https://api.openparser.dev**) and a valid API key or login. This CLI is a cloud client, not an offline local OCR engine.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1), [pdftotext](/man/pdftotext)(1)

# RESOURCES

```[Source code](https://github.com/eigenpal/openparser)```

```[Homepage](https://openparser.dev)```

```[Documentation](https://docs.openparser.dev)```

<!-- verified: 2026-07-30 -->
