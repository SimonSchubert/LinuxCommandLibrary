# TAGLINE

Capture raw radio samples with RTL-SDR dongle

# TLDR

**Capture to file**

```rtl_sdr -f [100M] [capture.bin]```

**Set sample rate**

```rtl_sdr -f [100M] -s [2.4M] [capture.bin]```

**Set gain**

```rtl_sdr -f [100M] -g [40] [capture.bin]```

**Capture duration**

```rtl_sdr -f [100M] -n [1000000] [capture.bin]```

**Frequency offset correction**

```rtl_sdr -f [100M] -p [55] [capture.bin]```

**Select device**

```rtl_sdr -d [0] -f [100M] [capture.bin]```

**Direct sampling mode**

```rtl_sdr -f [3M] -D [2] [capture.bin]```

# SYNOPSIS

**rtl_sdr** [_-f freq_] [_-s rate_] [_-g gain_] [_options_] _output_

# PARAMETERS

**-f** _FREQ_
> Center frequency (Hz).

**-s** _RATE_
> Sample rate (Hz).

**-g** _GAIN_
> Gain (0 for auto).

**-n** _SAMPLES_
> Number of samples.

**-p** _PPM_
> Frequency correction.

**-d** _INDEX_
> Device index.

**-D** _MODE_
> Direct sampling mode.

**-S**
> Enable synchronous mode.

# DESCRIPTION

**rtl_sdr** captures raw radio signals using RTL-SDR dongles, which are inexpensive USB devices based on the RTL2832U chipset originally designed for DVB-T television reception. By reading raw I/Q (in-phase/quadrature) samples from the device, it enables software-defined radio experimentation across a wide frequency range, typically 24 MHz to 1766 MHz depending on the tuner chip.

The tool writes raw 8-bit I/Q sample data to a file or stdout, which can then be processed by other applications to decode various signal types including FM radio, ADS-B aircraft tracking, weather satellites, and pager systems. The sample rate parameter controls the bandwidth captured, with higher rates covering more spectrum but requiring more USB bandwidth and storage.

Gain and frequency correction parameters help optimize reception quality. Setting gain to zero enables automatic gain control, while manual values allow fine-tuning for specific signals. The PPM correction compensates for the oscillator frequency error inherent in low-cost dongles, which can be calibrated against a known reference signal.

# CAVEATS

Requires RTL-SDR compatible device. USB bandwidth limits sample rate. Heat affects frequency stability.

# HISTORY

**rtl_sdr** is part of **librtlsdr**, enabling RTL2832U-based DVB-T dongles for SDR. Created by **Steve Markgraf** and others, it revolutionized accessible software-defined radio.

# SEE ALSO

[rtl_fm](/man/rtl_fm)(1), [rtl_power](/man/rtl_power)(1), [gqrx](/man/gqrx)(1), [gnuradio](/man/gnuradio)(1)
