# TAGLINE

Overclock NVIDIA GPUs on Linux (X11 and Wayland)

# TLDR

**Apply** power limit and clock offsets

```nvidia_oc set --index [0] --power-limit [200000] --freq-offset [160] --mem-offset [850] --min-clock [0] --max-clock [2000]```

**Show help**

```nvidia_oc --help```

# SYNOPSIS

**nvidia_oc** **set** [*options*]

# DESCRIPTION

**nvidia_oc** is a Rust command-line tool to overclock NVIDIA GPUs on Linux using NVML. It targets both X11 and Wayland, where many older overclocking tools only support X11.

Typical workflow: download a release binary, run **set** with GPU index and power/clock parameters, optionally install a systemd unit so settings re-apply at boot.

# PARAMETERS

**set**

> Apply overclock / power settings.

**--index** *n*

> GPU index (0 for the first device).

**--power-limit** *milliwatts*

> Power limit in milliwatts (example: **200000** for 200 W; confirm units for your build).

**--freq-offset** *mhz*

> GPU core frequency offset.

**--mem-offset** *mhz*

> Memory frequency offset.

**--min-clock** / **--max-clock** *mhz*

> Clock range bounds.

See **nvidia_oc --help** and **nvidia_oc set --help** for the full flag set of your binary.

# CAVEATS

Requires NVIDIA drivers and permissions to change device clocks (often root). Incorrect settings can crash the GPU/driver or reduce stability; raise values carefully. Manufacturer and OEM power limits may clamp your settings. Overclocking can void warranties and increase heat/power draw. Wayland/X11 session details still depend on driver support.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvidia-settings](/man/nvidia-settings)(1)

# RESOURCES

```[Source code](https://github.com/Dreaming-Codes/nvidia_oc)```

<!-- verified: 2026-07-19 -->
