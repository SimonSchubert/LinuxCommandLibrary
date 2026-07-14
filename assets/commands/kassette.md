# TAGLINE

inspect and fork durable agent workflow journals

# TLDR

**List** runs in a journal storage directory

```kassette list --storage file:[.kassette]```

Show **status** of a run

```kassette status [runId] --storage file:[.kassette]```

**Dump** journal entries (optionally from an offset)

```kassette dump [runId] --storage file:[.kassette]
kassette dump [runId] --offset [N] --storage file:[.kassette]```

**Fork** a new run from a journal prefix

```kassette fork [srcRunId] --from-offset [N] --storage file:[.kassette]```

Use **S3-compatible** storage

```kassette list --storage s3://[bucket]/[prefix]]```

# SYNOPSIS

**kassette** _command_ [_options_] [_args_]

# DESCRIPTION

**kassette** is the CLI from **@usekassette/cli** for operating on journals written by the kassette durability library. Kassette records agent workflow steps in append-only JSONL journals so retries can replay completed work instead of re-running expensive LLM calls and side effects.

The library embeds in your process (no separate server). The CLI helps humans and agents **list**, **status**, **dump**, and **fork** runs against filesystem or S3-backed storage. Journals are plain text suitable for **jq** and offline inspection.

# PARAMETERS

**list**
> List runs in the selected storage

**status** _runId_
> Summarize run state (success, suspended, error, …)

**dump** _runId_ [**--offset** _N_]
> Print journal entries

**fork** _srcRunId_ **--from-offset** _N_
> Create a new run replaying a journal prefix then continuing live

**--storage** _file:path_|_s3://bucket[/prefix]_
> Backend selection; install **@usekassette/s3** for **s3://**

# CAVEATS

The primary product is an embeddable library; the CLI is for inspection and forking, not for running workflows by itself. **s3://** requires the optional S3 package. Replay assumes workflow code still matches journal shape—use versioning and step renames carefully.

# SEE ALSO

[jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/lostinpatterns/kassette)```

```[Homepage](https://lostinpatterns.github.io/kassette/)```

```[Documentation](https://lostinpatterns.github.io/kassette/docs/quickstart)```

<!-- verified: 2026-07-14 -->
