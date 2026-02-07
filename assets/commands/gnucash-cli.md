# TAGLINE

command-line interface for GnuCash reports and quotes

# TLDR

**Update quotes for all securities**

```gnucash-cli --quotes get [file.gnucash]```

**Show Finance::Quote version and sources**

```gnucash-cli --quotes info```

**Dump quotes for specific securities**

```gnucash-cli --quotes dump [namespace] [symbol1] [symbol2]```

**List available reports**

```gnucash-cli --report list```

**Run a report**

```gnucash-cli --report run --name "[Balance Sheet]" [file.gnucash]```

**Export report to file**

```gnucash-cli --report run --name "[report]" --output-file [output.html] [file.gnucash]```

# SYNOPSIS

**gnucash-cli** [_options_] [_datafile_]

# PARAMETERS

**-h**, **--help**
> Show help message.

**-v**, **--version**
> Show GnuCash version.

**--quotes** _command_
> Quotes mode: info, get, dump.

**-R**, **--report** _command_
> Report mode: list, show, run.

**--name** _name_
> Report name for run command.

**--output-file** _file_
> Output file for report.

**--export-type** _type_
> Export format type.

**--debug**
> Enable debugging mode.

**--log** _arg_
> Log level overrides.

**--logto** _file_
> File to log into.

# DESCRIPTION

**gnucash-cli** is the command-line interface for GnuCash, a personal and small business financial accounting application. It operates in two modes: quotes mode for fetching and updating security prices, and report mode for generating financial reports. This allows automation of price updates and report generation without opening the GUI.

# CAVEATS

Quotes functionality requires Finance::Quote to be properly configured. Database URIs are supported for MySQL and PostgreSQL backends.

# SEE ALSO

[gnucash](/man/gnucash)(1), [ledger](/man/ledger)(1)
