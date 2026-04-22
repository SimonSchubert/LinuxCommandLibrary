# TAGLINE

wrap an ARM ELF printer firmware image with HP download header/trailer

# TLDR

**Convert an ARM firmware image** to an HP `.dl` download file

```arm2hpdl [sihp1005.img] > [sihp1005.dl]```

**Enable debug output**

```arm2hpdl -D [1] [firmware.img] > [firmware.dl]```

**Pipe the result straight to the printer device**

```arm2hpdl [firmware.img] | lp -d [printer]```

# SYNOPSIS

**arm2hpdl** [**-D** _level_] _arm-binary.img_ > _hpdl.dl_

# DESCRIPTION

**arm2hpdl** reads an ARM ELF binary firmware image for an HP laser printer (typically files named `sihpXXXX.img` distributed by HP) and writes to stdout the same image framed with the HP download header and trailer expected by the printer's firmware-loader. If the input already carries an HP header the file is copied through unchanged.

The resulting `.dl` file can be sent to the printer over USB, parallel, or network as a normal print job to flash the firmware.

# PARAMETERS

_arm-binary.img_
> Input ARM ELF firmware image.

**-D** _level_
> Set debug level (default `0`). Higher levels print parsing details to stderr.

# CAVEATS

Specific to HP laser printers driven by the **foo2zjs**/QPDL family of tools. Flashing incorrect or mismatched firmware can brick the printer — verify the model and revision before sending the `.dl` file. Output is binary; always redirect to a file (or pipe directly to the printer device), never to a terminal.

# HISTORY

**arm2hpdl** was written by **Rick Richardson** as part of the **foo2zjs** printer driver project, which reverse-engineered HP/Samsung QPDL and ZjStream protocols for Linux.

# SEE ALSO

[foo2zjs](/man/foo2zjs)(1), [foo2zjs-wrapper](/man/foo2zjs-wrapper)(1), [lp](/man/lp)(1), [lpr](/man/lpr)(1)
