# TAGLINE

Convert ARM firmware to HP printer download format.

# TLDR

**Convert** ARM firmware to HPDL format

```arm2hpdl [input.bin] > [output.hpdl]```

# SYNOPSIS

**arm2hpdl** _input_file_

# DESCRIPTION

**arm2hpdl** converts ARM binary firmware files to HP Download (HPDL) format used by HP printers. This tool is used when updating firmware on HP laser printers that require HPDL format.

The HPDL format wraps the binary with headers and checksums required for the printer's firmware update process.

# CAVEATS

Specific to HP printers using HPDL format. Incorrect firmware can damage printers. Verify printer model compatibility before flashing.

# HISTORY

**arm2hpdl** was created as part of the foo2zjs printer driver project to support firmware updating on HP printers.

# SEE ALSO

[foo2zjs](/man/foo2zjs)(1), [foo2zjs-wrapper](/man/foo2zjs-wrapper)(1)
