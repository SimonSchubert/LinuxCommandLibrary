# TAGLINE

Record W1700K IQ samples from the host stream ring

# TLDR

Record **10 seconds** of complex int16 IQ

```sdr-recv --seconds [10] --out [stream.ci16]```

**Count only** for a longer run (no file)

```sdr-recv --seconds [600]```

Give up if **no stream** appears

```sdr-recv --wait [120] --out [stream.ci16]```

Attach to a **named** stream object

```sdr-recv --stream [/w1700k-stream] --out [stream.ci16]```

# SYNOPSIS

**sdr-recv** [**--seconds** _S_] [**--out** _PATH_] [_options_]

# DESCRIPTION

**sdr-recv** records the W1700K IQ stream as **w1700k-stream** serves it: complex int16 on the radio's 14-bit scale (full scale 8192), I then Q, corrected for decimation roll-off where the service applies flatten. It follows one run in slot order and stops when **--seconds** elapse after the first slice, after **--idle-ms** without a new slice, when the run ends, or when **--wait** expires with no stream.

With **--out**, _PATH_ holds every slice of 2048 samples. A lost slice is written as zeros so sample time stays true; firmware events (no samples) are omitted. _PATH_.json and the last stdout line report the run, first slice, slice/sample/event/loss/overrun counts, which slices the correction produced, and why it stopped.

Build with a C11 compiler (`make` in `host/recv` writes `build/sdr-recv`). Licensed GPL-2.0-only.

# PARAMETERS

**--stream** _NAME_
> **w1700k-stream** shared-memory object (default `/w1700k-stream`).

**--seconds** _S_
> Stop _S_ seconds after the first slice (default **10**).

**--idle-ms** _I_
> Stop after _I_ ms without a new slice (default **1000**).

**--wait** _S_
> Give up if no stream comes within _S_ seconds (default **120**).

**--out** _PATH_
> Write samples to _PATH_. Without it, count only.

**--capacity-mib** _M_
> With **--out**: memory for the recording, allocated up front (default **4096**).

**--report** _S_
> Progress line every _S_ seconds (default **10**).

# CAVEATS

Needs **w1700k-stream** running. Overruns are slots the ring overwrote before they were read (also zeros in the file). Export integrity (spare bits, stale slices) is checked by the stream service, which counts it. A long recording at 320 Msps is large; **--capacity-mib** is allocated up front.

The binary is built from the W1700K SDR tree; it is not a typical distro package.

# HISTORY

Part of **W1700K SDR** (host recorder under `host/recv`). It is the file-oriented consumer of the shared IQ ring, alongside the spectrum server.

# SEE ALSO

[w1700k](/man/w1700k)(1), [w1700k-stream](/man/w1700k-stream)(1), [w1700k-spectrum](/man/w1700k-spectrum)(1), [rtl_sdr](/man/rtl_sdr)(1)

# RESOURCES

```[Source code](https://github.com/h0m3us3r/w1700k-sdr)```

```[Documentation](https://github.com/h0m3us3r/w1700k-sdr/blob/main/host/recv/README.md)```

<!-- verified: 2026-10-12 -->
