# TAGLINE

Browser spectrum and waterfall for a W1700K software-defined radio

# TLDR

Serve the **spectrum page** (default `127.0.0.1:8073`)

```w1700k-spectrum```

Listen on **every address**

```w1700k-spectrum --listen [0.0.0.0:8073]```

Name the **controller** that drives the radio

```w1700k-spectrum --controller "[host/bin/w1700k serve]"```

**Passive viewer** (no receiver controls)

```w1700k-spectrum --no-controller```

Use a **non-default** stream object

```w1700k-spectrum --stream [/w1700k-stream]```

# SYNOPSIS

**w1700k-spectrum** [**--listen** _ADDR:PORT_] [_options_]

# DESCRIPTION

**w1700k-spectrum** is a live spectrum and waterfall of the W1700K IQ stream, shown in a web browser, with the receiver's controls beside it: run/stop, LO, band and sample rate, analog filter, gain, and the stream's roll-off correction. One process reads the ring that **w1700k-stream** publishes, computes a 262,144-point FFT (FFTW, several threads, 100 spectra a second over every sample), and serves the page. Receiver settings go to a controller child, by default `w1700k serve`.

HTTP serves the page; everything else is a WebSocket at `/ws`. One browser is served at a time: opening the page elsewhere takes over. `kill -USR1` dumps the newest samples to `--dump-dir` as complex int16 plus a JSON sidecar.

**w1700k** must be on `PATH`, or name the controller with **--controller**. The stream service may start before or after the server; the server follows it.

Build with a C++17 compiler, zlib, and single-precision FFTW3 (`make` in `host/spectrum`). `make install PREFIX=/usr/local` installs the binary.

# PARAMETERS

**--listen** _ADDR:PORT_
> Bind address (default **127.0.0.1:8073**). A port alone listens on every address.

**--web** _DIR_
> Serve the page from _DIR_, reread on every request (development). Default is the page compiled into the binary.

**--stream** _NAME_
> **w1700k-stream** shared-memory object (default `/w1700k-stream`).

**--fft-threads** _N_
> FFT worker threads (default **4**).

**--controller** _CMD_
> Receiver controller, run with `sh -c` (default `w1700k serve`).

**--no-controller**
> Passive viewer: no receiver controls.

**--center** _MHZ_
> Stream centre frequency until the controller reports it (default **5250**).

**--rate** _MSPS_
> Sample rate until the controller reports it (default **320**).

**--dump-dir** _DIR_
> Directory for SIGUSR1 snapshots (default `/tmp`).

**--dump-seconds** _S_
> Snapshot length in seconds (default **0.3**).

# CAVEATS

Needs **w1700k-stream** running and, unless **--no-controller**, a working **w1700k serve**. The page is a local web UI, not a headless FFT dump. A controller that exits or misses its deadline (configure 600 s, start/stop 120 s, others 30 s) is restarted with backoff; queued requests are dropped while it is down.

The tools are built from the W1700K SDR tree and need the matching hardware path (unit, 10 GbE import, jumbo MTU).

# HISTORY

Part of **W1700K SDR** (host spectrum server under `host/spectrum`). It is the browser front end for the same host control protocol **w1700k serve** exposes on stdin/stdout.

# SEE ALSO

[w1700k](/man/w1700k)(1), [w1700k-stream](/man/w1700k-stream)(1), [sdr-recv](/man/sdr-recv)(1), [gqrx](/man/gqrx)(1), [gnuradio](/man/gnuradio)(1)

# RESOURCES

```[Source code](https://github.com/h0m3us3r/w1700k-sdr)```

```[Documentation](https://github.com/h0m3us3r/w1700k-sdr/blob/main/host/spectrum/README.md)```

<!-- verified: 2026-10-12 -->
