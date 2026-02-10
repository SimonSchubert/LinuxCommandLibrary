# TAGLINE

lists available printers and printer drivers known to CUPS

# TLDR

**List available printers**

```lpinfo -v```

**List available printer drivers**

```lpinfo -m```

**List drivers matching keyword**

```lpinfo -m | grep -i [keyword]```

**Show long printer names**

```lpinfo -l -v```

**List drivers for specific make**

```lpinfo --make-and-model "[HP LaserJet]" -m```

**Exclude specific schemes**

```lpinfo -v --exclude-schemes [dnssd]```

**Include only specific schemes**

```lpinfo -v --include-schemes [usb,parallel]```

# SYNOPSIS

**lpinfo** [_-l_] [_-m_] [_-v_] [_--make-and-model pattern_] [_options_]

# PARAMETERS

**-l**
> Show long listing with device details.

**-m**
> List available printer drivers (PPD files).

**-v**
> List available printer devices.

**--device-id** _ID_
> Show only devices matching IEEE-1284 device ID.

**--make-and-model** _PATTERN_
> Filter by make and model string.

**--exclude-schemes** _SCHEMES_
> Exclude device URIs matching schemes.

**--include-schemes** _SCHEMES_
> Include only device URIs matching schemes.

**-h** _SERVER_
> Connect to CUPS server.

**--timeout** _SECONDS_
> Timeout for device discovery.

# DESCRIPTION

**lpinfo** lists available printers and printer drivers known to CUPS. It queries the CUPS server for devices and PPD (PostScript Printer Description) files.

Device listing (-v) shows all detected printer connections including USB, network, and parallel ports. Each entry includes a device URI that can be used when adding printers with lpadmin.

Driver listing (-m) shows PPD files that describe printer capabilities. PPDs define paper sizes, resolutions, color options, and other features. Driverless printing uses generic IPP Everywhere or AirPrint drivers.

The make-and-model filter helps find drivers for specific printers. Combined with grep, you can search for compatible drivers for your hardware.

Network printer discovery may include DNS-SD (Bonjour/Avahi) discovered printers. Use scheme filters to focus on specific connection types.

# CAVEATS

Requires CUPS to be running. Network discovery can be slow. Some printers need proprietary drivers not included with CUPS. Driverless printing requires modern printers with IPP Everywhere or AirPrint support.

# HISTORY

**lpinfo** is part of the **CUPS** (Common UNIX Printing System) suite, originally developed by **Michael Sweet** at Easy Software Products. CUPS was released in **1999** and acquired by **Apple** in **2007**. lpinfo provides the discovery mechanism used by print configuration tools.

# SEE ALSO

[lpadmin](/man/lpadmin)(1), [lpstat](/man/lpstat)(1), [lp](/man/lp)(1), [lpr](/man/lpr)(1), [cupsd](/man/cupsd)(8)
