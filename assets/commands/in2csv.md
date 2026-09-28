# TAGLINE

converts tabular data from various formats to CSV

# TLDR

**Convert Excel to CSV**

```in2csv [data.xlsx] > [output.csv]```

**List sheet names** in an Excel file

```in2csv -n [data.xlsx]```

**Convert a specific sheet**

```in2csv --sheet [Sheet1] [data.xlsx] > [output.csv]```

**Write every sheet** to its own CSV file

```in2csv --write-sheets - --use-sheet-names [data.xlsx]```

**Convert JSON** from stdin (format must be given for piped input)

```curl [https://api.example.com/items] | in2csv -f json > [output.csv]```

Convert JSON nested under a **top-level key**

```in2csv -k [results] [data.json]```

**Convert fixed-width** data using a schema file

```in2csv -f fixed -s [schema.csv] [data.txt]```

**Convert a DBF** file

```in2csv [data.dbf] > [output.csv]```

# SYNOPSIS

**in2csv** [_options_] [_file_]

# PARAMETERS

**-f**, **--format** _FORMAT_
> Input format: csv, dbf, fixed, geojson, json, ndjson, xls, xlsx. Inferred from the file extension if omitted.

**-s**, **--schema** _SCHEMA_
> CSV schema file (**column,start,length**) for fixed-width input.

**-k**, **--key** _KEY_
> Top-level JSON key containing the list of objects to convert.

**-n**, **--names**
> Display sheet names from the Excel file.

**--sheet** _NAME_
> Excel sheet to convert.

**--write-sheets** _NAMES_
> Comma-separated sheet names (or **-** for all) to write to separate files.

**--use-sheet-names**
> Name files after sheets when using **--write-sheets**.

**--encoding-xls** _ENCODING_
> Encoding of the input XLS file.

**-e**, **--encoding** _ENCODING_
> Encoding of the input file.

**-H**, **--no-header-row**
> Input has no header row; columns are named a, b, c...

**-K**, **--skip-lines** _N_
> Skip N lines at the start of the input.

**-I**, **--no-inference**
> Disable type inference when parsing CSV input.

**-y**, **--snifflimit** _BYTES_
> Limit CSV dialect sniffing; **0** disables it, **-1** sniffs the whole file.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**in2csv** converts tabular data from various formats to CSV. It's part of the csvkit toolkit for working with CSV files.

The tool handles Excel (XLS, XLSX), JSON, newline-delimited JSON, GeoJSON, DBF, fixed-width and CSV input. Run on a CSV file, it standardizes quoting and line endings. The output can be piped to other csvkit tools for analysis.

# CAVEATS

Part of csvkit (Python). Large files may be slow. When reading from stdin, **-f** is required. Numbers from XLS files may gain decimals that the equivalent XLSX would not have. Unnamed header columns are given generated names.

# HISTORY

in2csv is part of **csvkit**, created by **Christopher Groskopf** in 2011 for journalists and data analysts, and now maintained by the wireservice organization.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [csvstat](/man/csvstat)(1), [csvsql](/man/csvsql)(1), [csvjson](/man/csvjson)(1)

# RESOURCES

```[Source code](https://github.com/wireservice/csvkit)```

```[Documentation](https://csvkit.readthedocs.io/en/latest/scripts/in2csv.html)```

<!-- verified: 2026-09-29 -->
