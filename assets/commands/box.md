# TLDR

**Login to Box**

```box login```

**List files** in a folder

```box folders:items [folder_id]```

**Upload a file**

```box files:upload [file.txt] --parent-id [folder_id]```

**Download a file**

```box files:download [file_id]```

**Create a folder**

```box folders:create [parent_id] --name "[folder_name]"```

**Search for files**

```box search "[query]"```

**Get file information**

```box files:get [file_id]```

**Share a file** with a link

```box shared-links:create [file_id] --type file```

**Execute bulk operations** from CSV

```box bulk [commands.csv]```

# SYNOPSIS

**box** _command_ [_options_]

# DESCRIPTION

**box** is the official command-line interface for Box cloud storage. It allows users to interact with Box APIs from the terminal, performing file operations, managing users, and automating workflows without writing code.

The CLI supports bulk operations using CSV files, making it useful for batch processing and administrative tasks.

# SUBCOMMANDS

**Files**
> files:upload, files:download, files:get, files:delete, files:copy, files:move

**Folders**
> folders:create, folders:items, folders:get, folders:delete, folders:copy

**Users**
> users:list, users:get, users:create, users:update

**Search**
> search

**Shared Links**
> shared-links:create, shared-links:get, shared-links:delete

**Collaboration**
> collaborations:add, collaborations:list

**Bulk**
> bulk (execute commands from CSV)

# PARAMETERS

**--parent-id** _id_
> Parent folder ID for upload/create operations

**--name** _name_
> Name for new items

**--as-user** _id_
> Execute as another user (admin)

**--csv**
> Output in CSV format

**--json**
> Output in JSON format

**--save**
> Save output to file

**--fields** _list_
> Specify fields to return

# CAVEATS

Requires a Box Developer account and application configuration. OAuth 2.0 authentication is needed for user-level access. Some operations require admin privileges. Rate limits apply to API calls.

# HISTORY

The Box CLI was released as an open-source project to provide command-line access to Box's cloud storage platform. It is built on Node.js and uses the Box API for all operations.

# SEE ALSO

[rclone](/man/rclone)(1), [aws-s3](/man/aws-s3)(1), [gsutil](/man/gsutil)(1)
