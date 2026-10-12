# TAGLINE

Host IQ-stream receiver for a W1700K software-defined radio

# TLDR

Receive the export and **serve IQ** in shared memory (until Ctrl-C)

```w1700k-stream```

Bind a **different address** on the 10 GbE link

```w1700k-stream --bind [10.77.0.10] --port [7700]```

Larger **shared ring** (MiB, power of two)

```w1700k-stream --ring-mib [512]```

JSON **status line** every few seconds

```w1700k-stream --report [1]```

# SYNOPSIS

**w1700k-stream** [**--bind** _IP_] [**--port** _N_] [_options_]

# DESCRIPTION

**w1700k-stream** is the host's one receiver of the W1700K's UDP IQ export. It puts datagrams in order, unpacks them, and serves complex int16 IQ to every consumer on the host through a POSIX shared-memory object (default `/w1700k-stream`, visible as `/dev/shm/w1700k-stream`). **w1700k-spectrum**, **sdr-recv**, or any program that maps the ring attaches as a consumer. A second process bound to the same UDP port would steal half the datagrams, so consumers read the ring instead of opening another socket.

Each export datagram is one 8 KiB DMA completion: a 16-byte header (magic `0x31524453` "SDR1", offset, slice bytes, sequence) plus a slice of 2048 complex samples. Raw slices are 8192 bytes (14-bit I/Q packed in 32-bit words); at 320 Msps half the slices are packed to 7168 bytes (lossless). Completions are filed by sequence into a reorder ring and published in order. A missing completion becomes a loss after 1024 newer ones arrive without it.

On request it also **flattens** the stream: a 129-tap linear-phase FIR that inverts the radio's decimation roll-off in the samples themselves, so every consumer sees the corrected stream. Flatten applies when a consumer sets the control word and the analog filter is as wide as the sample rate (not **640/2**, which is already flat).

Build with a C++17 compiler and single-precision FFTW3 (`make` in `host/stream`). The published interface is `include/w1700k_stream.h`.

# PARAMETERS

**--bind** _IP_
> Stream destination address on this host (default **10.77.0.10**).

**--port** _N_
> UDP port (default **7700**).

**--rx-threads** _N_
> UDP sockets and receive threads with `SO_REUSEPORT` (default **8**). The unit spreads its source ports across them.

**--workers** _N_
> Threads that unpack and correct (default **6**).

**--ring-mib** _N_
> Shared ring size in MiB, a power of two (default **512**; about 0.42 s at 320 Msps).

**--name** _NAME_
> Shared-memory object (default `/w1700k-stream`).

**--report** _S_
> Print a JSON status line on stdout every _S_ seconds (default **0**, off).

# CAVEATS

The 10 GbE destination needs an MTU of at least 8236 and room for 48 MiB socket buffers (`sysctl -w net.core.rmem_max=67108864`); otherwise the kernel caps buffers silently and drops datagrams (`socket_drops`). One service owns the port. A second service under the same shared-memory name refuses to start; at exit the object is unlinked.

The service is built from the W1700K SDR tree; it is not a typical distro package. It does nothing useful without **w1700k** starting a stream on a provisioned unit.

# HISTORY

Part of **W1700K SDR** (host stream service under `host/stream`). It replaced per-consumer UDP receivers so one process owns the 10 GbE import and every tool on the host shares the same ordered, optionally flattened IQ ring.

# SEE ALSO

[w1700k](/man/w1700k)(1), [w1700k-spectrum](/man/w1700k-spectrum)(1), [sdr-recv](/man/sdr-recv)(1), [rtl_sdr](/man/rtl_sdr)(1), [gqrx](/man/gqrx)(1)

# RESOURCES

```[Source code](https://github.com/h0m3us3r/w1700k-sdr)```

```[Documentation](https://github.com/h0m3us3r/w1700k-sdr/blob/main/host/stream/README.md)```

<!-- verified: 2026-10-12 -->
