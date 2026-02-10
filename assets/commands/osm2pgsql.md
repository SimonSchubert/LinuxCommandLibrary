# TAGLINE

imports OpenStreetMap data into a PostgreSQL/PostGIS database

# TLDR

**Import OSM data**

```osm2pgsql -d [database] [file.osm.pbf]```

**Import with slim mode**

```osm2pgsql -d [database] -s [file.osm.pbf]```

**Import with custom style**

```osm2pgsql -d [database] -S [style.lua] [file.osm.pbf]```

**Append new data**

```osm2pgsql -d [database] -a [updates.osc]```

**Set number of processes**

```osm2pgsql -d [database] -j [4] [file.osm.pbf]```

# SYNOPSIS

**osm2pgsql** [_options_] _file_...

# PARAMETERS

**-d** _database_
> Database name.

**-s**, **--slim**
> Store temp data in database.

**-S** _file_
> Style file.

**-a**, **--append**
> Append mode.

**-c**, **--create**
> Create tables (default).

**-j** _num_
> Number of processes.

**-C** _MB_
> Cache size.

**-H** _host_
> Database host.

**-U** _user_
> Database user.

# DESCRIPTION

**osm2pgsql** imports OpenStreetMap data into a PostgreSQL/PostGIS database. It's commonly used to create databases for rendering map tiles with Mapnik.

The tool can handle full planet imports and incremental updates.

# TYPICAL WORKFLOW

```bash
# Create database
createdb gis
psql -d gis -c "CREATE EXTENSION postgis;"

# Import data
osm2pgsql -d gis -s -C 2000 planet.osm.pbf
```

# CAVEATS

Requires PostGIS. Planet imports need substantial resources. Use slim mode for updates.

# HISTORY

osm2pgsql was developed for the **OpenStreetMap** project to enable map rendering from OSM data using PostgreSQL.

# SEE ALSO

[imposm](/man/imposm)(1), [osmosis](/man/osmosis)(1), [postgresql](/man/postgresql)(1), [postgis](/man/postgis)(1)
