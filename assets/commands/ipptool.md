# TLDR

**Get printer attributes** from an IPP printer

```ipptool -tv [ipp://printer.local/ipp/print] get-printer-attributes.test```

**Run a test file** against a printer

```ipptool [ipp://printer.local/ipp/print] [test.ipp]```

**Submit a print job** for testing

```ipptool -f [document.pdf] [ipp://printer.local/ipp/print] print-job.test```

**Test with verbose output**

```ipptool -tv [ipp://printer.local/ipp/print] [test.ipp]```

**Run conformance tests**

```ipptool -tIv [ipp://printer.local/ipp/print] ipp-everywhere.test```

# SYNOPSIS

**ipptool** [_-tv_] [_-f filename_] [_-d name=value_] _printer-uri_ _testfile_ [_... testfile_]

# PARAMETERS

**-t**
> Generate test report output

**-v**
> Verbose mode; show all attributes

**-f** _filename_
> File to use as document data for print tests

**-d** _name=value_
> Define a variable for use in test files

**-I**
> Ignore errors and continue testing

**-S**
> Test with TLS/SSL encryption

**-T** _seconds_
> Timeout for each request

**-V** _version_
> IPP version to use (1.0, 1.1, 2.0, 2.1, 2.2)

**--help**
> Display help information

# DESCRIPTION

**ipptool** is a versatile testing tool for IPP (Internet Printing Protocol) printers and servers. It sends IPP requests based on test files and validates responses, making it essential for printer conformance testing and debugging.

Test files define IPP operations and expected responses using a simple text format. The tool comes with standard test files for common operations like getting printer attributes, submitting jobs, and IPP Everywhere conformance testing.

# CAVEATS

Requires knowledge of IPP protocol for creating custom test files. Some tests may modify printer state or produce actual printed output. The printer URI format varies by printer model and manufacturer.

# HISTORY

**ipptool** is part of **CUPS**, developed by Michael Sweet. It evolved from earlier IPP testing tools to become the reference implementation for IPP conformance testing, used by printer manufacturers to validate IPP Everywhere compliance.

# SEE ALSO

[ippfind](/man/ippfind)(1), [ippeveprinter](/man/ippeveprinter)(1), [lpstat](/man/lpstat)(1), [lp](/man/lp)(1)
