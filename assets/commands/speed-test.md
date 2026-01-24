# TLDR

**Run speed test**

```speed-test```

**JSON output**

```speed-test --json```

**Output in bytes**

```speed-test --bytes```

**Verbose output**

```speed-test --verbose```

# SYNOPSIS

**speed-test** [_--json_] [_--bytes_] [_--verbose_]

# PARAMETERS

**--json**
> JSON output format.

**--bytes**
> Show in bytes/second.

**--verbose**
> Detailed output.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**speed-test** measures internet connection speed. It tests download and upload throughput.

Download speed shows incoming bandwidth. Measured against speed test servers.

Upload speed shows outgoing bandwidth. Important for video calls and uploads.

Ping shows network latency. Lower is better for real-time applications.

Server selection is automatic. Nearest server typically chosen.

# OUTPUT

Results show:
- Ping (latency in ms)
- Download speed (Mbps)
- Upload speed (Mbps)
- Server location

# CAVEATS

Results vary by server. Network conditions affect measurements. ISP throttling possible.

# HISTORY

**speed-test** is an npm package for command-line speed testing. It uses the same methodology as speedtest.net.

# SEE ALSO

[speedtest-cli](/man/speedtest-cli)(1), [fast](/man/fast)(1), [iperf](/man/iperf)(1)
