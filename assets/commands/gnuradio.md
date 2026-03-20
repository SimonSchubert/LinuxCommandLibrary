# TAGLINE

software-defined radio signal processing toolkit

# TLDR

**Start GNU Radio Companion**

```gnuradio-companion```

**Run flowgraph**

```python3 [flowgraph.py]```

**Check version**

```gnuradio-config-info --version```

**Compile a flowgraph** without launching the GUI

```gnuradio-companion -c [flowgraph.grc]```

**Compile a flowgraph** to a specific output directory

```gnuradio-companion -c -d [output_dir] [flowgraph.grc]```

**Create OOT module**

```gr_modtool newmod [mymodule]```

# SYNOPSIS

**gnuradio-companion** [_options_] [_file.grc_...]

# PARAMETERS

_file.grc_
> GNU Radio Companion flowgraph file.

**-c**, **--compile**
> Only compile the GRC file to Python without launching the GUI.

**-d**, **--output-dir** _DIR_
> Output path for the generated Python file.

**-v**, **--version**
> Show program version number and exit.

**-h**, **--help**
> Show help message and exit.

# DESCRIPTION

**GNU Radio** is a free software toolkit for signal processing. It provides blocks for building software-defined radios (SDRs) and signal processing systems.

GNU Radio Companion (GRC) is the graphical flowgraph editor. Flowgraphs connect processing blocks to create radio receivers, transmitters, and signal analyzers. Flowgraphs compile to Python code.

# COMPONENTS

```
gnuradio-companion     Graphical flowgraph editor
gr_modtool             Out-of-tree module management
gnuradio-config-info   Show installed GNU Radio details
uhd_fft                Spectrum analyzer (for USRP)
```

# COMMON BLOCKS

- **Signal Sources**: Noise, oscillators, file sources
- **Filters**: Low/high/band pass, FFT
- **Modulation**: AM, FM, PSK, QAM
- **Hardware**: RTL-SDR, USRP, HackRF

# CONFIGURATION

**~/.gnuradio/config.conf**
> User configuration file for GNU Radio preferences and block paths.

# CAVEATS

Requires compatible SDR hardware for RF work. Complex signal processing needs understanding of DSP. High sample rates need fast CPU. Python knowledge helpful.

# HISTORY

GNU Radio was started by **Eric Blossom** in **2001**. It became the leading open-source SDR framework, used in academia, amateur radio, and commercial applications. The project is now community-maintained.

# SEE ALSO

[rtl_sdr](/man/rtl_sdr)(1), [gqrx](/man/gqrx)(1), [python3](/man/python3)(1)
