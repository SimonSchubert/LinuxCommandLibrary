# TLDR

**Load data into a Berkeley DB database**

```db_load -T -t hash [database.db] < [data.txt]```

**Load key-value pairs** (one per line: key, value, key, value...)

```db_load -T -t btree [database.db] < [pairs.txt]```

**Create database with specific page size**

```db_load -T -t btree -c pagesize=[4096] [database.db] < [data.txt]```

**Load with duplicate key support**

```db_load -T -t btree -c duplicates=1 [database.db] < [data.txt]```

**Load from dump file format**

```db_load [database.db] < [dump.txt]```

# SYNOPSIS

**db_load** [_options_] _database.db_

# PARAMETERS

**-T**
> Input is flat text (key/value pairs, alternating lines).

**-t** _type_
> Database type: btree, hash, queue, recno.

**-c** _name=value_
> Set database configuration option.

**-f** _file_
> Input file (default: stdin).

**-n**
> Don't overwrite existing database.

**-r** _lsn_
> Reset log sequence numbers.

**-V**
> Display version.

# INPUT FORMAT

**With -T flag** (flat text):
```
key1
value1
key2
value2
```

**Without -T** (db_dump format):
```
VERSION=3
format=bytevalue
type=btree
HEADER=END
 6b657931
 76616c756531
DATA=END
```

# DESCRIPTION

**db_load** imports data into a Berkeley DB database. It reads key-value pairs from standard input or a file and creates or populates a BDB database file.

The tool supports different database types: **btree** for sorted access, **hash** for fast lookups, **queue** for FIFO operations, and **recno** for record number access. Configuration options control page size, caching, and duplicate handling.

Input can be flat text (with **-T**) where alternating lines are keys and values, or the binary-safe format produced by **db_dump**. The dump format handles binary data and preserves database metadata.

# CAVEATS

Berkeley DB is being phased out in favor of newer solutions (SQLite, LMDB). License changed to AGPL in version 6.x, affecting commercial use. Large imports may require tuning cache size. Database type must match existing database if not creating new.

# HISTORY

Berkeley DB was developed at **UC Berkeley** starting in **1991** as a replacement for older Unix dbm libraries. The db_load utility has been part of BDB since early versions. Oracle acquired Sleepycat Software (BDB's commercial maintainer) in **2006**. Despite being legacy technology, BDB remains in use in many systems including OpenLDAP and older versions of package managers.

# SEE ALSO

[db_dump](/man/db_dump)(1), [sqlite3](/man/sqlite3)(1), [mdb_load](/man/mdb_load)(1)
