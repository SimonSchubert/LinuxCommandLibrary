# TLDR

**Listen to FM radio**

```rtl_fm -f [100.1M] -M wbfm -s 200000 -r 48000 | aplay -f S16_LE -r 48000```

**Narrow FM (ham radio)**

```rtl_fm -f [145.5M] -M fm -s 12000 | aplay -f S16_LE -r 12000```

**AM mode**

```rtl_fm -f [1000k] -M am -s 12000 | aplay -f S16_LE -r 12000```

**Save to file**

```rtl_fm -f [100.1M] -M wbfm -s 200000 > [radio.raw]```

# SYNOPSIS

**rtl_fm** [_options_]

# PARAMETERS

**-f** _freq_
> Center frequency.

**-M** _mode_
> Demodulation (fm, wbfm, am, usb, lsb).

**-s** _rate_
> Sample rate.

**-r** _rate_
> Output sample rate.

**-g** _gain_
> Gain (0=auto).

**-d** _index_
> Device index.

**-p** _ppm_
> PPM error correction.

# DESCRIPTION

**rtl_fm** is an FM demodulator for RTL-SDR dongles. It receives and demodulates radio signals using cheap DVB-T USB receivers as software-defined radios.

# EXAMPLES

```bash
# FM broadcast
rtl_fm -f 100.1M -M wbfm -s 200000 -r 48000 | aplay -r 48000 -f S16_LE

# With squelch
rtl_fm -f 145.5M -M fm -s 12000 -l 50 | aplay -r 12000 -f S16_LE

# Scan frequencies
rtl_fm -f 145.0M:148.0M:25k -M fm -s 12000 | aplay -r 12000 -f S16_LE

# Record to WAV
rtl_fm -f 100.1M -M wbfm -s 200000 | sox -r 200000 -e s -b 16 -c 1 -t raw - radio.wav rate 48000
```

# MODES

```
wbfm - Wideband FM (broadcast)
fm   - Narrow FM
am   - Amplitude modulation
usb  - Upper sideband
lsb  - Lower sideband
```

# CAVEATS

Requires RTL-SDR dongle. May need PPM correction. Audio player needed for output.

# HISTORY

rtl_fm is part of **rtl-sdr** tools by **osmocom**, enabling software-defined radio with RTL2832U dongles.

# SEE ALSO

[rtl_sdr](/man/rtl_sdr)(1), [rtl_power](/man/rtl_power)(1), [gqrx](/man/gqrx)(1)
