# TAGLINE

creates binary exports of MongoDB databases

# TLDR

**Dump entire database**

```mongodump --db [database]```

**Dump specific collection**

```mongodump --db [database] --collection [collection]```

**Dump with authentication**

```mongodump --uri "mongodb://[user]:[pass]@[host]/[db]"```

**Dump to specific directory**

```mongodump --out [/path/to/backup]```

**Dump as archive file**

```mongodump --archive=[backup.archive]```

**Dump compressed**

```mongodump --gzip --out [backup/]```

**Dump with query filter**

```mongodump --db [db] --collection [coll] --query '{"status": "active"}'```

**Dump from remote host**

```mongodump --host [hostname] --port [27017]```

# SYNOPSIS

**mongodump** [_--uri uri_] [_--db database_] [_--collection coll_] [_--out dir_] [_--archive file_] [_options_]

# PARAMETERS

**--uri** _URI_
> MongoDB connection URI.

**--host** _HOST_
> Server hostname.

**--port** _PORT_
> Server port.

**--db**, **-d** _DATABASE_
> Database to dump.

**--collection**, **-c** _COLL_
> Collection to dump.

**--out**, **-o** _DIR_
> Output directory.

**--archive**[=_FILE_]
> Output as archive file.

**--gzip**
> Compress output.

**--query**, **-q** _JSON_
> Filter documents.

**--queryFile** _FILE_
> Query filter from file.

**--username**, **-u** _USER_
> Authentication username.

**--password**, **-p** _PASS_
> Authentication password.

**--authenticationDatabase** _DB_
> Authentication database.

**--oplog**
> Include oplog for point-in-time backup.

**--dumpDbUsersAndRoles**
> Include users and roles.

**--numParallelCollections** _N_
> Parallel collection dumps.

**-j** _N_
> Parallel document dumps.

# DESCRIPTION

**mongodump** creates binary exports of MongoDB databases. It reads data directly from MongoDB and writes BSON files, preserving document structure and types.

Output format is a directory structure with one folder per database containing BSON and metadata JSON files for each collection. The archive format combines everything into a single file.

The --oplog option captures operations during the dump, enabling point-in-time restore. This is essential for consistent backups of active databases.

Query filtering exports only matching documents. This enables partial backups, test data extraction, or archiving specific records.

Compression (--gzip) significantly reduces backup size. Combined with archive format, it produces a single compressed file suitable for storage or transfer.

Parallelism options speed up large backups. Multiple collections can dump simultaneously, and documents within collections can be processed in parallel.

# CAVEATS

Not recommended for large production databases - use filesystem snapshots instead. Backup is not atomic without --oplog. Indexes are saved as metadata, rebuilt on restore. Requires read access to all databases being dumped.

# HISTORY

**mongodump** has been part of **MongoDB** since early versions, developed by MongoDB, Inc. (formerly 10gen). It provides the standard method for exporting MongoDB data, complemented by mongorestore for imports. It's part of the MongoDB Database Tools package.

# SEE ALSO

[mongorestore](/man/mongorestore)(1), [mongoexport](/man/mongoexport)(1), [mongoimport](/man/mongoimport)(1), [mongo](/man/mongo)(1)
