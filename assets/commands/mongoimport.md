# TAGLINE

imports data into MongoDB

# TLDR

**Import JSON file**

```mongoimport --db [dbname] --collection [coll] --file [data.json]```

**Import CSV file**

```mongoimport --db [dbname] --collection [coll] --type csv --headerline --file [data.csv]```

**Import with authentication**

```mongoimport -u [user] -p [pass] --db [dbname] --collection [coll] --file [data.json]```

**Import from URI**

```mongoimport --uri "[mongodb://host/db]" --collection [coll] --file [data.json]```

**Import with drop**

```mongoimport --db [dbname] --collection [coll] --drop --file [data.json]```

**Import JSON array**

```mongoimport --db [dbname] --collection [coll] --jsonArray --file [array.json]```

# SYNOPSIS

**mongoimport** [_options_] [_file_]

# PARAMETERS

**--db** _NAME_
> Database name.

**--collection** _NAME_
> Collection name.

**--file** _FILE_
> Input file path.

**--type** _TYPE_
> File type (json, csv, tsv).

**--headerline**
> Use first line as field names.

**--drop**
> Drop collection before import.

**--help**
> Display help information.

# DESCRIPTION

**mongoimport** imports data into MongoDB. It supports JSON, CSV, and TSV formats.

The tool bulk loads documents. Useful for data migration and seeding databases.

# CAVEATS

Not for large datasets. Use mongorestore for BSON. May be slow on big imports.

# HISTORY

mongoimport is part of **MongoDB Database Tools**, providing data import capabilities since MongoDB's early versions.

# SEE ALSO

[mongoexport](/man/mongoexport)(1), [mongorestore](/man/mongorestore)(1), [mongosh](/man/mongosh)(1)

