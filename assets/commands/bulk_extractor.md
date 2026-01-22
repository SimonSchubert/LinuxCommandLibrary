# TLDR

**Extract data from disk image**

```bulk_extractor -o [output_dir] [image.dd]```

**Scan with multiple threads**

```bulk_extractor -o [output_dir] -j [8] [image.dd]```

**Enable specific scanner**

```bulk_extractor -o [output_dir] -e [exif] [image.dd]```

**Disable specific scanner**

```bulk_extractor -o [output_dir] -x [email] [image.dd]```

**Scan specific byte range**

```bulk_extractor -o [output_dir] -Y [0-1000000000] [image.dd]```

**Recursively scan directory**

```bulk_extractor -o [output_dir] -R [directory]```

**Search for specific pattern**

```bulk_extractor -o [output_dir] -f "[pattern]" [image.dd]```

**List available scanners**

```bulk_extractor -H```

# SYNOPSIS

**bulk_extractor** [_options_] _image_

# DESCRIPTION

**bulk_extractor** is a high-performance digital forensics tool that scans disk images, files, or directories and extracts structured information without parsing file system structures. It extracts email addresses, credit card numbers, URLs, and other artifacts.

The tool processes data in parallel across multiple CPU cores, making it significantly faster than traditional forensic tools.

# PARAMETERS

**-o** _directory_
> Output directory (required)

**-e** _scanner_
> Enable specific scanner

**-x** _scanner_
> Disable specific scanner

**-j** _threads_
> Number of threads to use

**-G** _bytes_
> Page size (default: 16777216)

**-M** _depth_
> Maximum recursion depth (default: 12)

**-R**
> Recursively scan directory

**-f** _pattern_
> Search for specific pattern

**-F** _file_
> Read patterns from file

**-Y** _start-end_
> Scan specific byte range

**-Z**
> Wipe output directory before starting

**-q**
> Quiet mode (no status output)

**-H**
> List available scanners with info

# OUTPUT

Creates **report.xml** with Digital Forensics XML metadata about the run. Individual feature files contain extracted data types (emails.txt, ccn.txt, urls.txt, etc.).

# CAVEATS

Output directory must not exist or use -Z to wipe. Processing large images requires significant disk space for output. Some scanners may produce false positives requiring manual review.

# SEE ALSO

[foremost](/man/foremost)(1), [scalpel](/man/scalpel)(1), [strings](/man/strings)(1), [photorec](/man/photorec)(1)
