# TAGLINE

Modern iperf3 alternative with live TUI and QUIC

# TLDR

**Start a test server**

```xfr server```

**Run a client test against a server**

```xfr client -c [192.168.1.1]```

**Test with QUIC transport**

```xfr client -c [host] --quic```

# SYNOPSIS

**xfr** _server_|_client_ [_options_]

# DESCRIPTION

**xfr** is a network performance testing tool with a live TUI featuring real-time throughput graphs, per-stream stats, and a multi-client server dashboard. It supports TCP, UDP, and QUIC protocols with configurable bitrate pacing and multiple output formats (plain text, JSON, CSV).

# HISTORY

**xfr** was created by **lance0** and is written in **Rust**.

# SEE ALSO

[iperf3](/man/iperf3)(1), [nuttcp](/man/nuttcp)(1)
