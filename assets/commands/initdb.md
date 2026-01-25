# TLDR

**Initialize PostgreSQL database cluster**

```initdb -D [/var/lib/postgresql/data]```

**Initialize with specific encoding**

```initdb -D [/var/lib/postgresql/data] -E UTF8```

**Initialize with specific locale**

```initdb -D [/var/lib/postgresql/data] --locale=[en_US.UTF-8]```

**Initialize with authentication**

```initdb -D [/var/lib/postgresql/data] -A [scram-sha-256] -W```

**Initialize with specific user**

```initdb -D [/var/lib/postgresql/data] -U [postgres]```

# SYNOPSIS

**initdb** [_options_] **-D** _directory_

# PARAMETERS

**-D**, **--pgdata** _dir_
> Data directory location.

**-E**, **--encoding** _encoding_
> Default database encoding.

**--locale** _locale_
> Default locale.

**-U**, **--username** _user_
> Database superuser name.

**-W**, **--pwprompt**
> Prompt for superuser password.

**-A**, **--auth** _method_
> Authentication method.

**--auth-local** _method_
> Local connection auth method.

**--auth-host** _method_
> Host connection auth method.

**-k**, **--data-checksums**
> Enable data checksums.

**--wal-segsize** _size_
> WAL segment size.

# DESCRIPTION

**initdb** creates a new PostgreSQL database cluster. A cluster is a collection of databases managed by a single PostgreSQL server instance, stored in a data directory.

This command must be run before starting PostgreSQL for the first time. It creates the template databases, configuration files, and directory structure.

# CAVEATS

Must run as the PostgreSQL user. Directory must be empty or non-existent. Encoding and locale affect all databases. Data checksums cannot be changed later.

# HISTORY

initdb is part of PostgreSQL, developed since **1996** by the PostgreSQL Global Development Group. It originated from the POSTGRES project at UC Berkeley.

# SEE ALSO

[pg_ctl](/man/pg_ctl)(1), [postgres](/man/postgres)(1), [createdb](/man/createdb)(1)
