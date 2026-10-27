# TAGLINE

Generate a Plimsoll grant profile from an OpenAPI document

# TLDR

**Generate** every artifact from a spec on disk

```plimsoll-specgen -global [home] -outdir [out] [smart-home.openapi.json]```

Emit only the **model-facing description** from stdin

```cat [spec.json] | plimsoll-specgen -emit description```

Write the **full route catalog** as JSON on stdout

```plimsoll-specgen -emit json [spec.json]```

**Install** the generator from the module

```go install github.com/plimsollmark/plimsoll/cmd/plimsoll-specgen@latest```

# SYNOPSIS

**plimsoll-specgen** [**-global** _name_] [**-emit** _all_|_allow_|_catalog_|_preamble_|_description_|_health_|_batch_|_json_] [**-outdir** _dir_] [_spec.json_]

# DESCRIPTION

**plimsoll-specgen** turns one OpenAPI 3.x document into the pieces of a Plimsoll grant that otherwise have to be kept in sync by hand: the **allow** route list, a typed JavaScript **preamble** SDK, and the model-facing tool **description** a gateway shows an agent. When the spec marks one concrete GET with `x-plimsoll-health-check`, it also emits the optional health-check probe. When collection operations carry `x-plimsoll-batch-of`, it emits the profile's batch-of map.

It is offline and metadata-only. It never fetches the spec's servers, embeds no credential, and is byte-deterministic, so a build can commit the output and diff it. With no file argument it reads stdin. **-emit** defaults to **all** and writes that bundle to stdout unless **-outdir** is set.

**catalog** is the full route list for a profile's catalog field. **allow** is the same list, meant as the starting point an operator trims to the routes it actually grants. **health** is the `GET /path` line for the backpressure probe, and only an operation marked `x-plimsoll-health-check` designates one. **batch** is the JSON object that says which collection route stands in for which per-item routes. With no marker, **health** and **batch** are empty and the reason goes to stderr.

Operations the grant model cannot express (an unenforceable verb, a required query or header) are reported on stderr as skips. Generated-but-narrowed ones are warnings. Neither is fatal, and both print before any artifact.

Build from `cmd/plimsoll-specgen` (`go install github.com/plimsollmark/plimsoll/cmd/plimsoll-specgen@latest`).

# PARAMETERS

**-global** _name_
> JavaScript global the typed SDK attaches to. Default **host**

**-emit** _mode_
> **all** (default), **allow**, **catalog**, **preamble**, **description**, **health**, **batch**, or **json**. Default destination is stdout

**-outdir** _dir_
> Write `allow.json`, `preamble.js`, and `description.txt` into _dir_, plus the health-check and batch-of files when the spec declares them

_spec.json_
> OpenAPI document. Omit to read stdin

# CAVEATS

The spec does not carry operator policy such as base URL, token, or allowed callers. **allow** is a starting list, not a decision about which routes to grant. A missing health or batch marker yields an empty emit, not a guess from the path name. Skips and warnings are printed and are not fatal.

# HISTORY

Part of **Plimsoll** (`plimsollmark/plimsoll`), Apache-2.0. The binary lives at `cmd/plimsoll-specgen`.

# SEE ALSO

[plimsolld](/man/plimsolld)(1), [plimsoll-clients](/man/plimsoll-clients)(1), [plimsoll-attest](/man/plimsoll-attest)(1), [prospector-report](/man/prospector-report)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/plimsollmark/plimsoll)```

```[Documentation](https://github.com/plimsollmark/plimsoll/blob/main/docs/examples/specgen/README.md)```

<!-- verified: 2026-10-27 -->
