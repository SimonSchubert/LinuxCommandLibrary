# TAGLINE

Compress log lines into structural patterns for humans and LLMs

# TLDR

Pipe a log file through **stdin**

```cat /var/log/syslog | ctrlb-decompose```

Analyze a **log file**

```ctrlb-decompose [server.log]```

**LLM-optimized** compact markdown output

```ctrlb-decompose --llm [app.log]```

**JSON** output

```ctrlb-decompose --json [app.log]```

Show **top** patterns with example lines

```ctrlb-decompose --top 10 --context 3 [app.log]```

# SYNOPSIS

**ctrlb-decompose** [_OPTIONS_] [_FILE_]

# PARAMETERS

**FILE**
> Log file path; reads stdin if omitted or `-`

**--human**
> Human-readable colored terminal output (default)

**--llm**
> Compact markdown optimized for feeding into LLMs

**--json**
> Structured JSON output

**--top** _N_
> Show top N patterns (default: 20)

**--context** _N_
> Example lines per pattern (default: 0)

**--no-color**
> Disable ANSI colors

**--no-banner**
> Suppress header/footer

**-q**, **--quiet**
> Suppress progress messages

**-h**, **--help**
> Show help

**-V**, **--version**
> Show version

# DESCRIPTION

**ctrlb-decompose** compresses raw log lines into structural patterns with statistics, anomalies, and correlations. It streams logs in a single pass using CLP-style encoding and Drain3 clustering, classifies variables (IPs, UUIDs, durations, enums, etc.), and reports quantiles, cardinality, and anomaly signals.

Typical reduction is orders of magnitude (millions of lines to dozens of patterns), making logs practical to inspect or send to an LLM without drowning the context window.

# CAVEATS

Best on textual application/system logs with repeating structure; free-form prose clusters poorly. Memory bounds grow with unique pattern count (Drain3 has a configurable max). Output formats differ in token density and machine-readability.

# HISTORY

Written in **Rust** by ctrlb-hq; also available as a WASM library and Claude Code plugin.

# SEE ALSO

[grep](/man/grep)(1), [jq](/man/jq)(1), [lnav](/man/lnav)(1)

# RESOURCES

```[Source code](https://github.com/ctrlb-hq/ctrlb-decompose)```

<!-- verified: 2026-07-28 -->
