# TAGLINE

Rust-based internet speed test tool

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

**speedtest-rs** is a Rust implementation of an internet speed test client compatible with Speedtest.net servers. It measures download speed, upload speed, and ping latency using the same server infrastructure as the original speedtest-cli.

As a compiled Rust binary, it offers fast startup and low resource usage compared to Python-based alternatives. The tool provides the same core functionality including server listing, server selection by ID, simple output mode, and the ability to skip download or upload tests independently.

# CAVEATS

Network dependent. Server selection matters. Uses Speedtest.net.

# HISTORY

**speedtest-rs** is a Rust implementation of the Speedtest.net CLI, providing internet speed measurements.

# SEE ALSO

[speedtest-cli](/man/speedtest-cli)(1), [iperf](/man/iperf)(1), [curl](/man/curl)(1)
