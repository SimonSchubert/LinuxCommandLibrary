# TAGLINE

Measure internet connection speed

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

**speed-test** measures internet connection performance by testing download speed, upload speed, and ping latency against speedtest.net servers. It automatically selects the nearest server to provide representative results.

The tool displays results in megabits per second (Mbps) by default, with an option to show bytes per second instead. JSON output mode is available for integration with monitoring scripts and dashboards.

Results reflect the connection speed between your device and the selected test server, which may differ from speeds to other destinations due to network routing, congestion, and ISP peering arrangements.

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
