# TAGLINE

file carving and data recovery tool

# TLDR

**Recover files from disk image**

```foremost -i [disk.img] -o [output_dir]```

**Recover specific file types**

```foremost -t [jpg,png,pdf] -i [disk.img]```

**Recover from device**

```sudo foremost -i [/dev/sda1] -o [output_dir]```

**Show all recoverable types**

```foremost -h```

**Verbose output**

```foremost -v -i [disk.img] -o [output_dir]```

**Use custom config**

```foremost -c [foremost.conf] -i [disk.img]```

# SYNOPSIS

**foremost** [_options_] -i _input_ -o _output_dir_

# DESCRIPTION

**foremost** is a file carving tool for recovering files from disk images or devices. It searches for file headers and footers, extracting data between them regardless of filesystem state.

The tool is useful for data recovery and forensic analysis, recovering files even from corrupted or partially overwritten media.

# PARAMETERS

**-i** _input_
> Input file or device.

**-o** _directory_
> Output directory.

**-t** _types_
> File types to extract.

**-c** _file_
> Configuration file.

**-v**
> Verbose output.

**-V**
> Display version.

**-q**
> Quick mode.

**-a**
> Write all headers.

**-w**
> Only write audit file.

# CONFIGURATION

**/etc/foremost.conf**
> Configuration file defining file signatures, headers, and footers for recovery.

# FILE TYPES

Common types: jpg, gif, png, bmp, avi, exe, mpg, wav, riff, wmv, mov, pdf, ole, doc, zip, rar, htm, cpp

# CAVEATS

Fragmented files may not recover correctly. Output directory must be empty. Large media requires significant space. Some file types need configuration.

# HISTORY

**foremost** was developed by the **US Air Force Office of Special Investigations** and **The Center for Information Systems Security Studies and Research** around **2001**. It was designed for forensic file recovery and released as open source.

# SEE ALSO

[scalpel](/man/scalpel)(1), [photorec](/man/photorec)(1), [testdisk](/man/testdisk)(1), [dd](/man/dd)(1)
