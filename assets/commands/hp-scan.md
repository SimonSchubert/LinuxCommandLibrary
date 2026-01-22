# TLDR

**Scan document**

```hp-scan```

**Specify output file**

```hp-scan -o [output.pdf]```

**Scan to JPEG**

```hp-scan -t jpeg -o [output.jpg]```

**Specify resolution**

```hp-scan -r [300]```

**Use ADF**

```hp-scan --adf```

# SYNOPSIS

**hp-scan** [_options_]

# PARAMETERS

**-o**, **--output** _FILE_
> Output filename.

**-t**, **--type** _TYPE_
> Output format (pdf, jpeg, png).

**-r**, **--resolution** _DPI_
> Scan resolution.

**--adf**
> Use automatic document feeder.

**-p** _PRINTER_
> Printer/scanner name.

**-d** _DEVICE_
> Device URI.

**--help**
> Display help information.

# DESCRIPTION

**hp-scan** scans documents from HP all-in-one devices. It supports various output formats and resolutions.

The tool can use the flatbed or automatic document feeder. It provides a command-line alternative to the graphical scanning interface.

hp-scan captures documents from HP scanners.

# CAVEATS

Part of HPLIP package. Some models need plugin. Requires scanner-capable device.

# HISTORY

hp-scan is part of **HPLIP** (HP Linux Imaging and Printing) for scanning on HP multifunction devices.

# SEE ALSO

[hp-setup](/man/hp-setup)(1), [scanimage](/man/scanimage)(1), [simple-scan](/man/simple-scan)(1)
