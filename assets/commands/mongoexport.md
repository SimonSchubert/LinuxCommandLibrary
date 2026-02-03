# TLDR

**Export collection to JSON**

```mongoexport --db=[database] --collection=[collection] --out=[output.json]```

**Export to CSV**

```mongoexport --db=[database] --collection=[collection] --type=csv --fields=[field1,field2] --out=[output.csv]```

**Export with query filter**

```mongoexport --db=[database] --collection=[collection] --query='{"field":"value"}'```

**Export from remote host**

```mongoexport --host=[hostname] --port=[27017] --db=[database] --collection=[collection]```

# SYNOPSIS

**mongoexport** [_options_]

# PARAMETERS

**--db** _name_
> Database name.

**--collection** _name_
> Collection to export.

**--out** _file_
> Output file path.

**--type** _type_
> Output type (json, csv).

**--fields** _fields_
> Fields for CSV export.

**--query** _json_
> Filter query.

**--host** _host_
> MongoDB host.

# DESCRIPTION

**mongoexport** exports data from MongoDB collections to JSON or CSV files. Part of MongoDB Database Tools. Useful for backups, data migration, and reporting.

# SEE ALSO

[mongoimport](/man/mongoimport)(1), [mongodump](/man/mongodump)(1)

