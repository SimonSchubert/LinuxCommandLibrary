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

**speedtest** measures internet speed. It's official Ookla CLI.

Download and upload. Bandwidth measurement.

Latency and jitter. Connection quality.

Server selection. Choose test location.

Structured output. JSON for automation.

# CAVEATS

Requires license acceptance. Network dependent. Ookla servers only.

# HISTORY

**speedtest** is the official CLI from **Ookla**, the company behind Speedtest.net internet speed testing.

# SEE ALSO

[speedtest-cli](/man/speedtest-cli)(1), [iperf3](/man/iperf3)(1), [ping](/man/ping)(1)
