# TAGLINE

wideband spectrum scanner for RTL-SDR USB dongles

# TLDR

**Scan the FM broadcast band** with 125 kHz bins, 10 s per row

```rtl_power -f [88M:108M:125k] -g [50] -i [10] [fm_band.csv]```

**Single sweep** of the aviation band (no integration)

```rtl_power -f [118M:137M:25k] -1 [airband.csv]```

**Continuously integrate** with 60 s rows

```rtl_power -f [144M:148M:10k] -i [60] [ham2m.csv]```

**Run for one hour then exit**

```rtl_power -f [88M:108M:125k] -e [1h] [fm.csv]```

**Pick a specific device** (multiple dongles)

```rtl_power -d [1] -f [400M:410M:10k] [out.csv]```

**Apply a PPM frequency correction**

```rtl_power -p [58] -f [400M:410M:10k] [out.csv]```

# SYNOPSIS

**rtl_power** [_options_] _filename_

# PARAMETERS

**-f** _lower:upper:bin-size_
> Frequency range and bin size (e.g. `88M:108M:125k`). Bin size sets FFT resolution.

**-i** _seconds_
> Integration interval per row. Longer values reduce noise but increase row period. Default: 10.

**-g** _gain_
> Tuner gain in dB (usable range depends on tuner). `0` selects automatic gain.

**-p** _ppm_
> Frequency correction in parts-per-million.

**-c** _crop_
> Crop percentage (0–1) to discard from each tuning's edges (to avoid filter roll-off).

**-s** _sample-rate_
> Hardware sample rate (default 2048000).

**-w** _window_
> FFT window function: `rectangle`, `hamming`, `blackman`, `blackman-harris`, `hann-poisson`, `youssef` (default).

**-F** _n_
> Enable extra integration by averaging _n_ FFT buffers (`-F 9` is typical for very wide scans).

**-O**
> Enable offset tuning (useful with some tuners to push away DC spike).

**-d** _index_
> Device index for systems with multiple dongles.

**-e** _duration_
> Exit after the given time (e.g. `30s`, `15m`, `1h`, `1d`).

**-1**
> Perform a single measurement pass and exit.

**-h**
> Hold the currently tuned frequency (debug).

**-**
> Write CSV to stdout instead of a file.

# OUTPUT

Tab- or comma-separated rows of:

```
date, time, freq_low, freq_high, step, samples, dB_bin_0, dB_bin_1, ...
```

Pipe to **heatmap.py** (ships with rtl-sdr) for a waterfall image.

# DESCRIPTION

**rtl_power** turns an RTL-SDR USB dongle into a wideband spectrum analyzer by repeatedly retuning across the requested range, taking short FFT captures per tuning, and logging averaged power per frequency bin. It is the standard tool for long-running band surveys, RFI hunting, and unattended spectrum recording.

Ranges wider than the dongle's instantaneous bandwidth (~2–3 MHz usable) are stitched together by fast retuning; expect small seams where tunings meet.

# CAVEATS

Requires an RTL-SDR-compatible DVB-T dongle and the `rtl-sdr` tools. Wider ranges and smaller bin sizes dramatically increase CPU and scan time. Temperature drift affects PPM accuracy; calibrate with `rtl_test -p` on a known beacon.

# HISTORY

**rtl_power** ships with the **rtl-sdr** tools, originally written by **Kyle Keen** and maintained by Osmocom. The project was born from the discovery (circa 2012) that Realtek RTL2832U DVB-T demod chips could be switched into I/Q SDR mode.

# SEE ALSO

[rtl_fm](/man/rtl_fm)(1), [rtl_sdr](/man/rtl_sdr)(1), [rtl_test](/man/rtl_test)(1)
