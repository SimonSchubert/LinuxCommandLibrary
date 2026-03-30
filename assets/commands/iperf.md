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
> Target bandwidth (e.g., 10M, 1G). Limits UDP and TCP rates.

**-t** _TIME_
> Test duration in seconds (default: 10).

**-n** _BYTES_
> Transmit specified number of bytes instead of using a time duration (e.g., 100M, 1G).

**-i** _INTERVAL_
> Report interval in seconds.

**-P** _STREAMS_
> Number of parallel client streams.

**-d**
> Bidirectional test using separate unidirectional sockets.

**-r**
> Bidirectional test (sequential: client-to-server, then reverse).

**--full-duplex**
> Full duplex test using a single socket for both directions.

**-R**
> Reverse traffic flow (server sends, client receives).

**-f** _FORMAT_
> Report format: a (adaptive), k/m/g (bits), K/M/G (bytes).

**-w** _SIZE_
> Socket buffer size (TCP window size).

**-l** _LENGTH_
> Read/write buffer length (TCP default 128K, UDP default 1470).

**-M** _MSS_
> Set TCP maximum segment size via TCP_MAXSEG.

**-N**
> Disable Nagle's algorithm (set TCP_NODELAY).

**-B** _HOST_
> Bind to a specific host, interface, or multicast address.

**-D**
> Run the server as a daemon.

**-e**
> Display enhanced output in reports.

**-o** _FILE_
> Write report output to specified file.

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
