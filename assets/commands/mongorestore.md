# TAGLINE

restores MongoDB data from mongodump output

# TLDR

**Restore from dump directory**

```mongorestore [dump/]```

**Restore specific database**

```mongorestore --db=[database] [dump/database/]```

**Restore to remote host**

```mongorestore --host=[hostname] --port=[27017] [dump/]```

**Restore with drop**

```mongorestore --drop [dump/]```

**Restore from archive**

```mongorestore --archive=[backup.archive]```

# SYNOPSIS

**mongorestore** [_options_] [_directory_]

# PARAMETERS

**--db** _name_
> Target database name.

**--collection** _name_
> Target collection.

**--drop**
> Drop collections before restore.

**--host** _host_
> MongoDB host.

**--archive** _file_
> Restore from archive file.

**--gzip**
> Decompress gzipped input.

# DESCRIPTION

**mongorestore** restores MongoDB data from mongodump output. Part of MongoDB Database Tools. Restores BSON files to MongoDB collections. Supports full and selective restoration.

# SEE ALSO

[mongodump](/man/mongodump)(1), [mongoexport](/man/mongoexport)(1)

