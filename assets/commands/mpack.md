# TAGLINE

encodes files into MIME format for email transmission

# TLDR

**Encode file as MIME**

```mpack -o [output.mime] [file]```

**Encode and mail**

```mpack -s "[Subject]" [file] [user@example.com]```

**Encode to stdout**

```mpack -o - [file]```

**Split large file**

```mpack -s "[Subject]" -c [100000] [large_file] [user@example.com]```

# SYNOPSIS

**mpack** [_options_] _file_ [_address_...]

# PARAMETERS

**-s** _subject_
> Email subject.

**-d** _description_
> Content description.

**-c** _size_
> Split size in bytes.

**-o** _file_
> Output file (or - for stdout).

**-m** _type_
> MIME content type.

# DESCRIPTION

**mpack** encodes files into MIME format for email transmission. It handles binary files by encoding them as base64 and generating proper MIME headers.

mpack can send encoded files directly via email or save them to files for later transmission.

# EXAMPLE

```bash
# Encode and email PDF
mpack -s "Report" report.pdf user@example.com

# Encode to file
mpack -o report.mime report.pdf

# Split large file
mpack -s "Large File" -c 1000000 bigfile.zip user@example.com
```

# CAVEATS

Companion to munpack. May require configured mail system. Large files should be split. Some encodings deprecated.

# HISTORY

mpack was written by **John G. Myers** at Carnegie Mellon as part of the MIME tools for handling binary email attachments.

# SEE ALSO

[munpack](/man/munpack)(1), [uuencode](/man/uuencode)(1), [base64](/man/base64)(1), [sendmail](/man/sendmail)(1)
