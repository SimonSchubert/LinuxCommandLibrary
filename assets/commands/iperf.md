# TAGLINE

measures network bandwidth between two endpoints

# TLDR

**Start server** mode

```iperf -s```

**Connect to server** and run test

```iperf -c [server_ip]```

**Run test for specific** duration

```iperf -c [server_ip] -t [30]```

**Run UDP test** instead of TCP

```iperf -c [server_ip] -u```

**Test with multiple** parallel streams

```iperf -c [server_ip] -P [4]```

**Run bidirectional** test

```iperf -c [server_ip] -d```

**Set target bandwidth** for UDP

```iperf -c [server_ip] -u -b [100M]```

**Specify port**

```iperf -c [server_ip] -p [5001]```

**Report at intervals**

```iperf -c [server_ip] -i [1]```

# SYNOPSIS

**iperf** **-s** [_OPTIONS_]

**iperf** **-c** _HOST_ [_OPTIONS_]

# PARAMETERS

**-s**
> Run in server mode.

**-c** _HOST_
> Run in client mode, connecting to server at HOST.

**-p** _PORT_
> Server port to listen on or connect to (default: 5001).

**-u**
> Use UDP instead of TCP.

**-b** _BANDWIDTH_
> Target bandwidth for UDP (e.g., 10M, 1G). Unlimited for TCP.

**-t** _TIME_
> Test duration in seconds (default: 10).

**-i** _INTERVAL_
> Report interval in seconds.

**-P** _STREAMS_
> Number of parallel client streams.

**-d**
> Bidirectional test (simultaneous send and receive).

**-r**
> Bidirectional test (sequential).

**-f** _FORMAT_
> Report format: k/m/g/K/M/G (bits or bytes).

**-w** _SIZE_
> Socket buffer size (window size).

**-l** _LENGTH_
> Buffer length to read or write.

# DESCRIPTION

**iperf** measures network bandwidth between two endpoints. One host runs in server mode (-s), and another connects as a client (-c) to perform the test. By default, iperf measures TCP throughput.

UDP mode (-u) tests UDP performance with configurable target bandwidth. This is useful for measuring packet loss and jitter at specific rates. Parallel streams (-P) can saturate high-bandwidth links that a single stream cannot fill.

Results show bandwidth achieved, along with additional metrics depending on protocol (retransmits for TCP, packet loss and jitter for UDP).

# CAVEATS

iperf (version 2) and iperf3 are separate projects with incompatible protocols. This page covers iperf2. Firewall rules may need to allow the iperf port (default 5001). Results can be affected by CPU limitations on either end, especially at high bandwidths.

# HISTORY

iperf was developed by NLANR/DAST as an open-source network testing tool. The original iperf (version 2) became widely used for network diagnostics. **iperf3** is a complete rewrite by ESnet with enhanced features but uses an incompatible protocol, requiring both endpoints to use the same version.

# SEE ALSO

[iperf3](/man/iperf3)(1), [netcat](/man/netcat)(1), [speedtest-cli](/man/speedtest-cli)(1), [ping](/man/ping)(8)
