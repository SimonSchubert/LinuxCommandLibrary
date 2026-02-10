# TAGLINE

network throughput testing tool that measures maximum TCP and UDP bandwidth

# TLDR

**Start a server**

```iperf3 -s```

**Connect to a server** and run a test

```iperf3 -c [server_ip]```

**Run for a specific duration**

```iperf3 -c [server_ip] -t [30]```

**Test upload speed** (reverse mode)

```iperf3 -c [server_ip] -R```

**Test UDP** instead of TCP

```iperf3 -c [server_ip] -u```

**Use multiple parallel streams**

```iperf3 -c [server_ip] -P [4]```

**Set target bandwidth** (for UDP)

```iperf3 -c [server_ip] -u -b [100M]```

**Output results in JSON**

```iperf3 -c [server_ip] -J```

# SYNOPSIS

**iperf3** [_-s|-c host_] [_-p port_] [_-t time_] [_-P parallel_] [_-u_] [_-b bandwidth_] [_-R_] [_options_]

# PARAMETERS

**-s**, **--server**
> Run in server mode.

**-c**, **--client** _host_
> Run as client, connect to server.

**-p**, **--port** _port_
> Server port (default: 5201).

**-t**, **--time** _n_
> Test duration in seconds (default: 10).

**-P**, **--parallel** _n_
> Number of parallel streams.

**-u**, **--udp**
> Use UDP instead of TCP.

**-b**, **--bandwidth** _n[KMG]_
> Target bandwidth (UDP default: 1 Mbit/s).

**-R**, **--reverse**
> Run in reverse mode (server sends, client receives).

**--bidir**
> Bidirectional test simultaneously.

**-i**, **--interval** _n_
> Seconds between periodic reports.

**-n**, **--bytes** _n[KMG]_
> Number of bytes to transmit.

**-J**, **--json**
> Output in JSON format.

**-l**, **--length** _n[KMG]_
> Buffer/packet size.

**-w**, **--window** _n[KMG]_
> Socket buffer size.

**-B**, **--bind** _addr_
> Bind to specific address.

**-4**, **-6**
> Use IPv4/IPv6 only.

**-D**, **--daemon**
> Run server as daemon.

**--logfile** _file_
> Write output to file.

# DESCRIPTION

**iperf3** is a network throughput testing tool that measures maximum TCP and UDP bandwidth performance. It creates data streams between a server and client to measure achievable network speed, useful for troubleshooting, benchmarking, and capacity planning.

A typical test requires running iperf3 in server mode on one machine and client mode on another. The client initiates the test, and both sides report the measured throughput. By default, tests run for 10 seconds with TCP.

TCP mode measures bulk transfer speed, limited by congestion control, RTT, and link capacity. UDP mode with -b sets a target send rate, useful for testing whether a network can sustain specific bandwidth without packet loss.

Parallel streams (-P) can reveal aggregation limits and help saturate high-bandwidth links where a single stream can't achieve full capacity. The reverse mode (-R) tests upload by having the server send to the client.

JSON output enables automated testing and integration with monitoring systems. Server can run as a daemon for ongoing availability.

# CAVEATS

Not compatible with iperf2 protocol. Server port (5201) must be accessible through firewalls. Tests consume significant bandwidth - don't run on production networks unexpectedly. Single server handles one client at a time. Results affected by CPU, memory, and network interface capabilities.

# HISTORY

**iperf3** was developed by ESnet (Energy Sciences Network) at Lawrence Berkeley National Laboratory, released around **2014** as a rewrite of the original iperf. The rewrite improved the codebase, added features like JSON output and bidirectional testing, and fixed protocol limitations. It has become the standard network throughput testing tool.

# SEE ALSO

[iperf](/man/iperf)(1), [netperf](/man/netperf)(1), [nuttcp](/man/nuttcp)(8), [speedtest-cli](/man/speedtest-cli)(1)
