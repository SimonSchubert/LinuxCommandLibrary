# TLDR

**Start Gqrx**

```gqrx```

**Start with specific config**

```gqrx -c [config.conf]```

**Reset settings**

```gqrx -r```

**Edit settings before start**

```gqrx -e```

# SYNOPSIS

**gqrx** [_options_]

# PARAMETERS

**-c** _file_
> Configuration file.

**-r**, **--reset**
> Reset settings to defaults.

**-e**, **--edit**
> Edit configuration before start.

**-s** _style_
> Qt style.

# DESCRIPTION

**Gqrx** is an open-source software defined radio (SDR) receiver. It provides a graphical interface for receiving radio signals using RTL-SDR, HackRF, Airspy, and other SDR hardware.

The application features a waterfall display, spectrum analyzer, and various demodulation modes including AM, FM, SSB, and CW. It can record audio and I/Q data.

# SUPPORTED HARDWARE

- RTL-SDR dongles
- HackRF
- Airspy
- SDRplay
- USRP
- FunCube Dongle
- Any GNU Radio source

# FEATURES

- Waterfall and spectrum displays
- AM, FM, WFM, SSB, CW demodulation
- Adjustable filters and squelch
- Audio recording
- Remote control via TCP

# CAVEATS

Requires SDR hardware. CPU usage increases with bandwidth. Some modes need specific hardware. RTL-SDR has frequency limitations.

# HISTORY

Gqrx was created by **Alexandru Csete** (OZ9AEC) around **2011** as a user-friendly SDR application built on GNU Radio. It became the go-to GUI application for Linux SDR users.

# SEE ALSO

[rtl_sdr](/man/rtl_sdr)(1), [gnuradio](/man/gnuradio)(1), [cubicsdr](/man/cubicsdr)(1)
