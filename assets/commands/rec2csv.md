# TAGLINE

Export GNU recutils records to CSV format

# TLDR

**Convert recfile to CSV**

```rec2csv [file.rec] > [output.csv]```

**Select specific fields**

```rec2csv -f [field1,field2] [file.rec]```

**Select record type**

```rec2csv -t [Type] [file.rec]```

**Include header**

```rec2csv -H [file.rec]```

# SYNOPSIS

**rec2csv** [_options_] [_file_]

# PARAMETERS

**-t**, **--type** _type_
> Select record type.

**-f**, **--fields** _fields_
> Fields to output (comma-separated).

**-H**, **--headers**
> Include column headers.

**-s**, **--sort** _field_
> Sort by field.

**-n**, **--num** _n_
> Limit number of records.

# DESCRIPTION

**rec2csv** converts GNU recutils plain-text database files into CSV format for import into spreadsheets, databases, or other tools that consume tabular data. It reads recfile records (structured as key-value pairs separated by blank lines) and outputs them as comma-separated rows with optional column headers via the **-H** flag.

The **-t** flag selects a specific record type when a recfile contains multiple types, and **-f** limits output to specified fields. It can be combined with **recsel** in a pipeline to first filter records before converting to CSV. Part of the GNU recutils toolkit.

# EXAMPLES

```bash
# Basic conversion
rec2csv contacts.rec > contacts.csv

# With headers
rec2csv -H books.rec > books.csv

# Select fields
rec2csv -f Name,Email,Phone contacts.rec

# Specific type
rec2csv -t Book -f Title,Author library.rec

# With selection
recsel -e "Price > 10" items.rec | rec2csv -H
```

# RECFILE FORMAT

```
Name: John Doe
Email: john@example.com
Phone: 555-1234

Name: Jane Smith
Email: jane@example.com
Phone: 555-5678
```

# CAVEATS

Multi-line field values may need special handling. Part of GNU recutils package.

# HISTORY

rec2csv is part of **GNU recutils** by **Jose E. Marchesi** for managing plain text databases.

# SEE ALSO

[recsel](/man/recsel)(1), [recins](/man/recins)(1), [recdel](/man/recdel)(1), [csv2rec](/man/csv2rec)(1)
