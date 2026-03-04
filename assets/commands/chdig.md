# TAGLINE

TUI for ClickHouse monitoring and debugging

# TLDR

**Connect** to a local ClickHouse instance and show running queries

```chdig```

**Connect** to a remote ClickHouse host

```chdig -u 'user:password@clickhouse-host.com/?secure=true'```

**Connect** using a named connection from a config file

```chdig --config [/path/to/config.yaml] --connection [prod]```

**Monitor** a ClickHouse cluster across all shards

```chdig -u '[host]' --cluster [my_cluster]```

**Show** slow queries over 1 second from query log

```chdig slowqueries```

**Show** server logs

```chdig serverlogs```

**View** MergeTree merges

```chdig merges```

# SYNOPSIS

**chdig** [_OPTIONS_] [_SUBCOMMAND_]

# PARAMETERS

**-u**, **--url** _URL_
> Connection URL. Also reads **CHDIG_URL** environment variable.

**--host** _HOST_
> Override host (clickhouse-client compatible).

**--port** _PORT_
> Override port.

**--user** _USER_
> Override user. Also reads **CLICKHOUSE_USER**.

**--password** _PASS_
> Override password. Also reads **CLICKHOUSE_PASSWORD**.

**--secure**
> Use TLS/SSL.

**--config** _FILE_
> ClickHouse-like config file (YAML).

**-C**, **--connection** _NAME_
> Named connection profile from config file.

**-c**, **--cluster** _NAME_
> Cluster name; enables distributed queries across shards.

**--history**
> Aggregate historical system log data using merge().

**-d**, **--delay-interval** _MS_
> Refresh interval in milliseconds (default: 30000).

**-g**, **--group-by**
> Group distributed queries (default in cluster mode).

**-b**, **--start** _TIME_
> Begin of time interval (default: 1 hour ago).

**-e**, **--end** _TIME_
> End of time interval.

**--completion** _SHELL_
> Generate shell completion script.

# VIEWS

**queries** (default), **lastqueries**, **slowqueries**, **merges**, **mutations**, **replicationqueue**, **replicatedfetches**, **replicas**, **tables**, **tableparts**, **errors**, **backups**, **dictionaries**, **serverlogs**, **loggers**, **partlog**, **asynchronousinserts**, **s3queue**, **azurequeue**, **client**

# DESCRIPTION

**chdig** provides an interactive terminal dashboard for ClickHouse, similar to how **top** or **htop** work for Linux system processes. It consolidates ClickHouse's extensive system introspection tables into a navigable TUI with flamegraph visualization directly in the terminal (CPU, real-time, memory), EXPLAIN integration for analyzing query plans and pipelines, cluster mode for aggregating queries across all shards, and historical mode for examining rotated system log tables.

# KEY BINDINGS

```
F1     Help               F2     Switch views
F8     Show actions        /     Filter
j/k    Navigate            r     Refresh
p      Pause/resume        C     CPU flamegraph
R      Real-time flamegraph M     Memory flamegraph
S      Display query       y     Copy query
K      Kill query          l     Show query logs
q/Esc  Back/quit           Q     Force quit
```

# CAVEATS

The project is self-described as **pre-alpha**; keyboard shortcuts, views, and features may change without notice. Requires ClickHouse 21.2 or newer. Mouse mode is enabled by default, which interferes with standard terminal text selection; use Alt/Shift/Ctrl modifiers to select text.

# HISTORY

**chdig** was created by **Azat Khuzhin**, a Principal Software Engineer at ClickHouse. Written in Rust under the MIT license. The latest version is v26.2.3. There is an ongoing effort to bundle chdig as part of ClickHouse itself.

# SEE ALSO

[clickhouse-client](/man/clickhouse-client)(1), [htop](/man/htop)(1), [top](/man/top)(1)
