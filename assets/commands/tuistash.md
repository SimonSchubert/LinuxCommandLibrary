# TAGLINE

Terminal user interface for Logstash monitoring

# TLDR

**Connect to local Logstash instance**

```tuistash```

**Connect to a specific Logstash API**

```tuistash --api [http://localhost:9600]```

**Set custom refresh interval** in seconds

```tuistash --refresh-interval [5]```

**Connect with API authentication**

```tuistash --api [http://localhost:9600] --username [admin] --password [secret]```

# SYNOPSIS

**tuistash** [_options_]

# PARAMETERS

**--api** _URL_
> Logstash monitoring API URL (default: http://localhost:9600).

**--refresh-interval** _SECONDS_
> Data refresh interval in seconds (default: 5).

**--username** _USER_
> Username for API authentication.

**--password** _PASS_
> Password for API authentication.

# DESCRIPTION

**tuistash** provides a TUI for monitoring Logstash nodes, pipelines, threads, flows, and more. It connects to the Logstash monitoring API and displays real-time statistics including CPU usage, JVM heap, throughput, and queue data as graphs.

The interface supports keyboard navigation with Tab to switch between panels and q to quit.

# CAVEATS

Requires a running Logstash instance with the monitoring API enabled (enabled by default on port 9600). The API must be reachable from the machine running tuistash.

# HISTORY

**tuistash** was created by **Edmo Vamerlatti Costa** (edmocosta) and is written in **Rust**.

# SEE ALSO

[logstash](/man/logstash)(1), [elasticsearch](/man/elasticsearch)(1)
