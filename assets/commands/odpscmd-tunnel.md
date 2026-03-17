# TAGLINE

Bulk data transfer for MaxCompute tables

# TLDR

**Upload a file to a table**

```odpscmd tunnel upload [file.csv] [project.table]```

**Download a table to a file**

```odpscmd tunnel download [project.table] [output.csv]```

**Upload to a specific partition**

```odpscmd tunnel upload [file.csv] [table/pt=value]```

**Resume a failed upload session**

```odpscmd tunnel resume [session_id]```

**Upload with custom delimiters and multiple threads**

```odpscmd tunnel upload [file.csv] [table] -fd [,] -rd [\n] -t [4]```

**Download a limited number of records**

```odpscmd tunnel download [project.table] [output.csv] -limit [1000]```

# SYNOPSIS

**odpscmd** **tunnel** [_command_] [_options_]

# PARAMETERS

**upload** _FILE_ _TABLE_
> Upload local file data to a MaxCompute table.

**download** _TABLE_ _FILE_
> Download table data to a local file.

**resume** _ID_
> Resume an interrupted upload session.

**-fd** _CHAR_
> Field delimiter (default: comma).

**-rd** _CHAR_
> Record delimiter (default: newline).

**-t** _NUM_
> Number of threads for parallel transfer (default: 1).

**-bs** _SIZE_
> Block size in MiB (default: 100).

**-cp** _BOOL_
> Enable compression (default: true).

**-cf** _BOOL_
> Treat the file as CSV format.

**-h** _BOOL_
> Include a header row in output.

**-limit** _NUM_
> Limit the number of records to download.

**-dbr** _BOOL_
> Discard bad records instead of failing.

**-mbr** _NUM_
> Maximum number of bad records allowed (default: 1000).

**-acp** _BOOL_
> Auto-create partition if it does not exist.

**-te** _ENDPOINT_
> Specify a custom Tunnel endpoint.

# DESCRIPTION

**odpscmd tunnel** provides high-speed bulk data transfer between local files and MaxCompute (formerly ODPS) tables. It supports uploading and downloading large datasets with configurable parallelism, compression, and delimiters.

Each block of data corresponds to an HTTP request. Multiple blocks can be uploaded in parallel and atomically -- success or failure of one block does not affect others. Transfer speeds typically range from 1 MB/s to 20 MB/s depending on network conditions.

# CAVEATS

Resumable uploads require the session ID from the original upload. Bandwidth limits may apply based on the MaxCompute project configuration. The tool is part of the MaxCompute Console (odpscmd) suite.

# HISTORY

**odpscmd tunnel** is part of the MaxCompute Console provided by **Alibaba Cloud** for bulk data operations on MaxCompute (originally known as ODPS).

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odps-tunnel](/man/odps-tunnel)(1)
