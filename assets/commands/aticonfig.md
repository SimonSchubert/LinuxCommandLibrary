# TAGLINE

Configure AMD/ATI proprietary graphics drivers

# TLDR

**Display current GPU configuration**

```aticonfig --query-monitor```

**Set up initial X configuration**

```sudo aticonfig --initial```

**Enable dual monitors in extended mode**

```sudo aticonfig --initial=dual-head --screen-layout=right```

**Set resolution for display**

```aticonfig --resolution=0,1920x1080```

**Enable or disable Vsync**

```aticonfig --set-pcs-str="DDX,EnableVSync,1"```

**Show GPU temperature and fan speed**

```aticonfig --odgt```

**List all displays**

```aticonfig --list-adapters```

**Set GPU clock speeds** (overclocking)

```aticonfig --odsc=950,1200```

# SYNOPSIS

**aticonfig** [_options_]

# PARAMETERS

**--initial**
> Generate a basic X configuration for the AMD GPU.

**--initial=dual-head**
> Configure for dual monitor setup.

**--query-monitor**
> Display connected monitors and their status.

**--list-adapters**
> List all detected graphics adapters.

**--resolution** _adapter,resolution_
> Set screen resolution for an adapter.

**--screen-layout** _position_
> Set layout for dual monitors (left, right, above, below).

**--odgt**
> Display GPU temperature (OverDrive Get Temperature).

**--odgc**
> Display GPU clock information.

**--odsc** _core,memory_
> Set GPU core and memory clock speeds.

**--od-enable**
> Enable OverDrive (overclocking features).

**--set-pcs-str** _path,value_
> Set a persistent configuration string.

**--lsa**
> List adapters with detailed information.

# DESCRIPTION

**aticonfig** is a configuration utility for AMD/ATI proprietary graphics drivers (Catalyst/fglrx). It provides command-line control over display settings, GPU parameters, and X.org configuration for AMD Radeon graphics cards.

The tool generates and modifies X configuration files, manages multi-monitor setups, and provides access to OverDrive features for monitoring temperatures and adjusting clock speeds. It serves as the CLI counterpart to the AMD Catalyst Control Center graphical tool.

Configuration changes for X.org typically require restart of the X server to take effect. OverDrive settings for clocks and fan control can be applied at runtime.

# CONFIGURATION

**/etc/X11/xorg.conf**
> X.org server configuration file generated and modified by aticonfig for display settings, multi-monitor layout, and GPU parameters.

# CAVEATS

**aticonfig** is only for the legacy proprietary fglrx/Catalyst driver, which is discontinued and incompatible with modern Linux kernels (4.2+) and X.org versions. Modern AMD GPUs should use the open-source amdgpu driver with radeon-profile or corectrl for similar functionality. The tool is documented here for legacy systems only.

# HISTORY

The **aticonfig** utility was part of AMD's proprietary Catalyst driver package for Linux, supporting Radeon HD series and earlier GPUs. AMD discontinued the Catalyst driver in **2015**, pivoting to the open-source AMDGPU driver for newer hardware. The tool remains relevant only for users maintaining older systems with legacy hardware that cannot use the open-source stack.

# SEE ALSO

[radeon-profile](/man/radeon-profile)(1), [corectrl](/man/corectrl)(1), [xrandr](/man/xrandr)(1), [nvidia-settings](/man/nvidia-settings)(1)
