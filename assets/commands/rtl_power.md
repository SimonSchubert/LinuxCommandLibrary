# TLDR

**Scan frequency range**

```rtl_power -f [88M:108M:125k] -g 50 -i 10 [output.csv]```

**Single measurement**

```rtl_power -f [400M:410M:10k] -1 [output.csv]```

**Continuous scan**

```rtl_power -f [118M:137M:25k] -i 60 [output.csv]```

**With exit time**

```rtl_power -f [88M:108M:125k] -e [1h] [output.csv]```

# SYNOPSIS

**rtl_power** [_options_] _filename_

# PARAMETERS

**-f** _freq_range_
> Frequency range (start:stop:step).

**-g** _gain_
> Gain (0=auto).

**-i** _interval_
> Integration time in seconds.

**-1**
> Single measurement.

**-e** _duration_
> Exit after duration.

**-d** _index_
> Device index.

**-p** _ppm_
> PPM error.

# DESCRIPTION

**rtl_power** is a spectrum analyzer using RTL-SDR. It scans frequency ranges and outputs power levels to CSV, useful for finding active frequencies and spectrum analysis.

# EXAMPLES

```bash
# FM broadcast band scan
rtl_power -f 88M:108M:125k -g 50 -i 10 fm_band.csv

# Airband scan
rtl_power -f 118M:137M:25k -i 30 airband.csv

# Single sweep
rtl_power -f 400M:500M:100k -1 sweep.csv

# Run for 1 hour
rtl_power -f 144M:148M:10k -e 1h -i 60 ham2m.csv

# Visualize with heatmap
rtl_power -f 88M:108M:125k -i 10 -e 1h output.csv
# Then use heatmap.py
```

# OUTPUT FORMAT

CSV with: date, time, freq_low, freq_high, step, samples, dB values...

# CAVEATS

Requires RTL-SDR dongle. Large frequency ranges take time. Use heatmap.py for visualization.

# HISTORY

rtl_power is part of **rtl-sdr** tools by **osmocom** for spectrum analysis with low-cost SDR dongles.

# SEE ALSO

[rtl_fm](/man/rtl_fm)(1), [rtl_sdr](/man/rtl_sdr)(1), [rtl_test](/man/rtl_test)(1)
