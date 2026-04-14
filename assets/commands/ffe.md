# TAGLINE

flat file extractor

# TLDR

**Extract fields from** a flat file using a configuration

```ffe -c [config.ffe] [data.txt]```

**Output as a named print format**

```ffe -c [config.ffe] -p [csv] [data.txt]```

**Filter records matching an expression**

```ffe -c [config.ffe] -e [field=value] [data.txt]```

**Show structure information** from the configuration and exit

```ffe -c [config.ffe] -I```

# SYNOPSIS

**ffe** [_options_] [_files_]

# DESCRIPTION

**ffe** (Flat File Extractor) parses fixed-width and delimited flat files according to a structure definition provided in a configuration file. It extracts fields and can convert data to formats such as CSV or XML.

Configuration files define record layouts with field names, widths, and types. The tool handles multiple record types in a single file, common in mainframe and batch-processing data formats.

# PARAMETERS

**-c**, **--configuration** _file_
> Configuration file defining record structures and print formats.

**-p**, **--print** _format_
> Select a named print format defined in the configuration file.

**-o**, **--output** _file_
> Write output to the specified file instead of stdout.

**-f**, **--field-list** _fields_
> Print only the listed fields (comma-separated).

**-e**, **--expression** _expr_
> Print only records where the expression matches.

**-a**, **--and**
> Combine multiple expressions with logical AND (default is OR).

**-X**, **--casecmp**
> Use case-insensitive expression evaluation.

**-v**, **--invert-match**
> Print only records that do not match the expression.

**-r**, **--replace** _field=value_
> Replace field contents with the given value in output.

**-l**, **--loose**
> Do not abort on invalid input lines.

**-d**, **--debug**
> Write invalid input lines to `ffe_error_<pid>.log`.

**-I**, **--info**
> Show structure information from the configuration file and exit.

# CAVEATS

Requires a configuration file. Complex record structures need careful definition. The `-p` flag selects a named print format from the config, not a generic format name.

# SEE ALSO

[awk](/man/awk)(1), [cut](/man/cut)(1), [csvtool](/man/csvtool)(1)
