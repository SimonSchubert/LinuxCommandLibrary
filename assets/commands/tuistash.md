# TAGLINE

Terminal user interface for Logstash monitoring

# TLDR

**Connect to local Logstash instance**

```tuistash```

**Connect to a specific Logstash API**

```tuistash --api [http://localhost:9600]```

**Set custom refresh interval**

```tuistash --refresh-interval [5]```

# SYNOPSIS

**tuistash** [_options_]

# DESCRIPTION

**tuistash** provides a TUI for monitoring Logstash nodes, pipelines, threads, flows, and more. It connects to the Logstash monitoring API and displays real-time statistics including CPU usage, JVM heap, throughput, and queue data as graphs.

# HISTORY

**tuistash** was created by **Edmo Vamerlatti Costa** (edmocosta) and is written in **Rust**.

# SEE ALSO

[logstash](/man/logstash)(1), [kibana](/man/kibana)(1), [elasticvue](/man/elasticvue)(1)
