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

**rtl_sdr** captures radio signals using RTL-SDR dongles. These are low-cost software-defined radio receivers.

Frequency range typically 24-1766 MHz. The actual range depends on the tuner chip.

Sample rate determines bandwidth captured. Higher rates capture more spectrum.

Gain adjustment controls receiver sensitivity. Auto-gain or manual values.

Output is raw I/Q samples. Post-processing decodes various signals.

PPM correction compensates for oscillator error. Calibrate using known signal.

# CAVEATS

Requires RTL-SDR compatible device. USB bandwidth limits sample rate. Heat affects frequency stability.

# HISTORY

**rtl_sdr** is part of **librtlsdr**, enabling RTL2832U-based DVB-T dongles for SDR. Created by **Steve Markgraf** and others, it revolutionized accessible software-defined radio.

# SEE ALSO

[rtl_fm](/man/rtl_fm)(1), [rtl_power](/man/rtl_power)(1), [gqrx](/man/gqrx)(1), [gnuradio](/man/gnuradio)(1)
