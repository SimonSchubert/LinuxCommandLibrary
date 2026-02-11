# TAGLINE

Official Ookla internet speed test CLI

# TLDR

**Run speed test**

```speedtest```

**List servers**

```speedtest --servers```

**Use specific server**

```speedtest --server-id [12345]```

**Output as JSON**

```speedtest --format json```

**Accept license**

```speedtest --accept-license```

**Show progress**

```speedtest --progress yes```

# SYNOPSIS

**speedtest** [_--server-id id_] [_--format fmt_] [_options_]

# PARAMETERS

**--servers**
> List nearby servers.

**--server-id** _ID_
> Select server.

**--format** _FMT_
> Output format (json, csv).

**--progress** _BOOL_
> Show progress.

**--accept-license**
> Accept EULA.

**--accept-gdpr**
> Accept privacy terms.

# DESCRIPTION

**speedtest** is the official command-line interface from Ookla for measuring internet connection performance. It tests download speed, upload speed, latency (ping), and jitter by connecting to Ookla's global network of test servers.

The tool automatically selects the nearest server for testing, though specific servers can be chosen by ID. Results include detailed metrics about connection quality, and structured output formats (JSON, CSV) enable integration with monitoring scripts and dashboards.

First-run usage requires accepting the Ookla license agreement and GDPR terms. The CLI is a compiled binary distributed separately from the Python-based speedtest-cli, and uses Ookla's native testing methodology for more accurate results.

# CAVEATS

Requires license acceptance. Network dependent. Ookla servers only.

# HISTORY

**speedtest** is the official CLI from **Ookla**, the company behind Speedtest.net internet speed testing.

# SEE ALSO

[speedtest-cli](/man/speedtest-cli)(1), [iperf3](/man/iperf3)(1), [ping](/man/ping)(1)
