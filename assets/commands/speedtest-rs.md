# TLDR

**Run speed test**

```speedtest-rs```

**List servers**

```speedtest-rs --list```

**Use specific server**

```speedtest-rs --server [server-id]```

**Simple output**

```speedtest-rs --simple```

**No download test**

```speedtest-rs --no-download```

**No upload test**

```speedtest-rs --no-upload```

# SYNOPSIS

**speedtest-rs** [_--server id_] [_--simple_] [_options_]

# PARAMETERS

**--list**
> List servers.

**--server** _ID_
> Server ID.

**--simple**
> Minimal output.

**--no-download**
> Skip download test.

**--no-upload**
> Skip upload test.

**--bytes**
> Show bytes/sec.

# DESCRIPTION

**speedtest-rs** tests internet speed. It's written in Rust.

Uses Speedtest.net servers. Standard methodology.

Download and upload tests. Measure bandwidth.

Latency measurement. Ping to server.

Fast and efficient. Rust implementation.

# CAVEATS

Network dependent. Server selection matters. Uses Speedtest.net.

# HISTORY

**speedtest-rs** is a Rust implementation of the Speedtest.net CLI, providing internet speed measurements.

# SEE ALSO

[speedtest-cli](/man/speedtest-cli)(1), [iperf](/man/iperf)(1), [curl](/man/curl)(1)
